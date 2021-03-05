package com.capgemini.onlinebookstore.service;

import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.EmptyDataException;

public interface IRegistrationService
{

	UserBookStore registerUser(UserBookStore user) throws EmptyDataException;

	boolean findByEmailId(String emailId);
}
