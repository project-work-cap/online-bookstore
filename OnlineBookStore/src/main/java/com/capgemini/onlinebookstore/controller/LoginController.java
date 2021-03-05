package com.capgemini.onlinebookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.UserNotFoundException;
import com.capgemini.onlinebookstore.service.UserService;
import com.capgemini.onlinebookstore.validator.LoginValidator;

@RestController
@RequestMapping("/home")
public class LoginController
{
	@Autowired
	UserService userService;
	@Autowired
	UserBookStore user;
	@Autowired
	LoginValidator validate;

	public LoginController()
	{
		super();
	}

	@RequestMapping("/login")
	public ResponseEntity<UserBookStore> login(@RequestBody UserBookStore user) throws UserNotFoundException
	{
<<<<<<< HEAD
		UserBookStore userBookStore = userService.loginUser(user);
		return ResponseEntity.ok().body(userBookStore);
=======
		return null;

>>>>>>> 456a72488527a3f3aa3c996b5c77e07d9d54db3b
	}

}
