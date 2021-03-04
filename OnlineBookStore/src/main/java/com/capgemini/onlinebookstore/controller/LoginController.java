package com.capgemini.onlinebookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.service.UserServiceImpl;

@RestController
public class LoginController
{

	@Autowired
	UserServiceImpl userServiceImpl = new UserServiceImpl();
	@Autowired
	UserBookStore user = new UserBookStore();

	public LoginController()
	{
		super();
	}

	@RequestMapping("home/login/")
	public String login(@RequestBody UserBookStore user)
	{
		return null;

	}

}
