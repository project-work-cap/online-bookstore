package com.capgemini.onlinebookstore.service;

import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.UserNotFoundException;

public interface UserService
{
//	public String getEmailId() throws UserNotFoundException;
//
//	public String getPassword() throws UserNotFoundException;
//
//	public long getUserById() throws UserNotFoundException;
//	public UserBookStore loginUser(UserBookStore user) throws UserNotFoundException;
	public UserBookStore loginUser(UserBookStore user) throws UserNotFoundException;

}
