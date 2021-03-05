package com.capgemini.onlinebookstore.service;

import com.capgemini.onlinebookstore.entities.UserBookStore;

public interface IRegistrationService
{

	UserBookStore registerUser(UserBookStore user);

	UserBookStore findByEmailId(String emailId);
}
