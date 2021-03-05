package com.capgemini.onlinebookstore.service;

import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.UserNotFoundException;

public interface UserService
{
	public ApiResponse loginUser(UserBookStore user) throws UserNotFoundException;

}
