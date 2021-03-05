package com.capgemini.onlinebookstore.service;

import com.capgemini.onlinebookstore.entities.UserBookStore;
<<<<<<< HEAD
=======
import com.capgemini.onlinebookstore.exception.EmptyDataException;
>>>>>>> 456a72488527a3f3aa3c996b5c77e07d9d54db3b

public interface IRegistrationService
{

<<<<<<< HEAD
	UserBookStore registerUser(UserBookStore user);

	UserBookStore findByEmailId(String emailId);
=======
	UserBookStore registerUser(UserBookStore user) throws EmptyDataException;
	boolean findByEmailId(String emailId);
>>>>>>> 456a72488527a3f3aa3c996b5c77e07d9d54db3b
}
