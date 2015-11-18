package com.nirmalksingh.springrest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nirmalksingh.springrest.dao.UserService;
import com.nirmalksingh.springrest.domain.User;

@RestController
@RequestMapping("/service/user")
public class SpringServiceController {

	UserService userService = new UserService();

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public User getUser(@PathVariable int id) {
		User user = userService.getUserById(id);
		return user;
	}

	@RequestMapping(method = RequestMethod.GET, headers = "Accept=application/json")
	public List<User> getAllUsers() {
		List<User> users = userService.getAllUsers();
		return users;
	}
	
	@RequestMapping("/addOneUser")
	public void addOneUser(){
		userService.addOneUser();
	}
	
	@RequestMapping("/bulkAddUsers")
	public List<User> bulkAddUsers(){
		userService.bulkAddUsers();
		return userService.getAllUsers();
	}
	
	@RequestMapping("/truncateTable")
	public void truncateTable(){
		userService.truncateTable();
	}
	
	
	@RequestMapping("/truncateTableThenDisplay")
	public List<User> truncateTableDisplay(){
		userService.truncateTable();
		List<User> users = userService.getAllUsers();
		return users;
	}
	
	@RequestMapping(value = "/addUrlUser")
	public List<User> addUrlUser(@RequestParam String firstname,
			@RequestParam String lastname, @RequestParam String email) {
		return userService.addUrlUser(firstname, lastname, email);
	}

}