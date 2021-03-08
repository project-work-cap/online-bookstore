package com.capgemini.onlinebookstore.service;

import java.util.Optional;

import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.EmptyDataException;

public interface RegistrationService {

	UserBookStore registerUser(UserBookStore user) ;
	UserBookStore findByEmailId(String emailId);
}
