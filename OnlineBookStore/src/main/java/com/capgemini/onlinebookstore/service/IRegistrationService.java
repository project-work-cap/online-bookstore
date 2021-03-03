package com.capgemini.onlinebookstore.service;

import com.capgemini.onlinebookstore.dto.UserBookStore;

public interface IRegistrationService {

	UserBookStore registerUser(UserBookStore user);
	UserBookStore findByEmailId(String emailId);
}
