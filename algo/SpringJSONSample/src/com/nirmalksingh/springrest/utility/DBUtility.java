package com.nirmalksingh.springrest.utility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtility {

	private static Connection connection = null;

	public static Connection getConnection() {
		if (connection != null)
			return connection;
		else {
			try {
				Properties props = new Properties();
				InputStream inputStream = DBUtility.class.getResourceAsStream("/config.properties");
				props.load(inputStream);
				String driver = props.getProperty("driver");
				String url = props.getProperty("url");
				String user = props.getProperty("user");
				String password = props.getProperty("password");
				Class.forName(driver);
				connection = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return connection;
		}
	}

}