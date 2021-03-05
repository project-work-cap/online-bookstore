package com.capgemini.onlinebookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.UserNotFoundException;
import com.capgemini.onlinebookstore.service.ApiResponse;
import com.capgemini.onlinebookstore.service.UserService;

@RestController
@RequestMapping("/v1/")
public class LoginController
{
	@Autowired
	UserService userService;
	@Autowired
	UserBookStore user;

	public LoginController()
	{
		super();
	}

	@RequestMapping("/login")
	public ResponseEntity<ApiResponse> login(@RequestBody UserBookStore user) throws UserNotFoundException
	{

		return ResponseEntity.ok(userService.loginUser(user));
	}

}
