package com.capgemini.onlinebookstore.service;


import org.springframework.validation.BindingResult;

import com.capgemini.onlinebookstore.domain.UserBookStoreDto;
import com.capgemini.onlinebookstore.exception.EmptyDataException;
import com.capgemini.onlinebookstore.exception.InvalidDataException;

public interface RegistrationService
{

	UserBookStoreDto registerUser(UserBookStoreDto user,BindingResult result) throws EmptyDataException, InvalidDataException;

	boolean findByEmailId(String emailId);
}
 