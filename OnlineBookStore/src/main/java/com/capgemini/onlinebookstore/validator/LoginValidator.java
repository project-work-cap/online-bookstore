package com.capgemini.onlinebookstore.validator;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.UserNotFoundException;
import com.capgemini.onlinebookstore.service.UserService;

public class LoginValidator
{

	public LoginValidator()
	{
		super();
	}

	@Autowired
	UserService userService;

	@Autowired
	UserBookStore user;

	public UserBookStore verifyLogin(Long userId) throws UserNotFoundException
	{

		if(userId==user.getUserId())

		{
			return 
		}
	}
}
