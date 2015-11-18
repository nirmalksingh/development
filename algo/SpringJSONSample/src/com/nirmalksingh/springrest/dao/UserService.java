package com.nirmalksingh.springrest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.nirmalksingh.springrest.domain.User;
import com.nirmalksingh.springrest.utility.DBUtility;

public class UserService {

	private Connection connection = null;

	public UserService() {
		connection = DBUtility.getConnection();

	}

	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from tbluser");
			while (rs.next()) {
				User user = new User();
				user.setUserid(rs.getInt("userid"));
				user.setFirstName(rs.getString("firstname"));
				user.setLastName(rs.getString("lastname"));
				user.setEmail(rs.getString("email"));
				users.add(user);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	public User getUserById(int userid) {
		User user = new User();
		try {
			PreparedStatement psmt = connection.prepareStatement("select * from tbluser where userid=?");
			psmt.setInt(1, userid);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				user.setUserid(rs.getInt("userid"));
				user.setFirstName(rs.getString("firstname"));
				user.setLastName(rs.getString("lastname"));
				user.setEmail(rs.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	public void addOneUser() {
		try {
			Statement stmt = connection.createStatement();
			stmt.executeUpdate(
								"INSERT INTO tbluser (firstname, lastname, email) VALUES ('Coffee', 'Tea','coffee.tea@email.com')"
							  );
			getAllUsers();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	
	/**
	 * Precondition: Table exists with the name 'tbluser'
	 * Postcondition: All rows of the table is deleted, count is reset.
	 * In effect, a new table with the same name is re-created.
	 */
	public void truncateTable() {
		try {
			Statement stmt = connection.createStatement();
			stmt.executeUpdate(
								"TRUNCATE TABLE tbluser"
							  );
			getAllUsers();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<User> bulkAddUsers() {
		try {
			Statement stmt = connection.createStatement();
			stmt.executeUpdate(
								"INSERT INTO tbluser (firstname, lastname, email) "
								+ "VALUES "
								+ "('Coffee', 'Tea','coffee.tea@email.com'), "
								+ "('Mango', 'juice','mango.juice@email.com'), "
								+ "('Milk', 'Drink','milk.drink@email.com'), "
								+ "('Water', 'Bottle','Water.bottle@email.com'), "
								+ "('Super', 'Mario','Super.mario@email.com'), "
								+ "('Strange', 'Moon','strange.moon@email.com'), "
								+ "('Stuff', 'Cool','stuff.cool@email.com'), "
								+ "('Java', 'Code','Java.Code@email.com'), "
								+ "('Sun', 'Evening','evening.Sun@email.com'), "
								+ "('Sita', 'Ram','sita.ram@email.com') "
							  );
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return getAllUsers();
	}

	public List<User> addUrlUser(String firstname, String lastname, String email) {

		if (rowExists(firstname, lastname, email)) {
			try {
				PreparedStatement psmt = connection
						.prepareStatement("INSERT INTO tbluser (firstname, lastname, email) VALUES (?, ?, ?)");
				psmt.setString(1, firstname);
				psmt.setString(2, lastname);
				psmt.setString(3, email);
				
				psmt.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else{
			System.out.println("The row with "+firstname+" "+lastname+" and "+email+" exists!" );
		}
		return getAllUsers();
	}
	
	public boolean rowExists(String firstname, String lastname, String email){
		try {
			PreparedStatement psmt = connection.prepareStatement("select firstname, lastname, email from tbluser where firstname=? and lastname=? and email=?");
			psmt.setString(1, firstname);
			psmt.setString(2, lastname);
			psmt.setString(3, email);
			ResultSet rs = psmt.executeQuery();
			if(!rs.first() && !rs.next()){
				return false;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

}