package com.capgemini.onlinebookstore.service;


import com.capgemini.onlinebookstore.domain.UserBookStoreDto;
import com.capgemini.onlinebookstore.exception.EmptyDataException;

public interface RegistrationService
{

	UserBookStoreDto registerUser(UserBookStoreDto user) throws EmptyDataException;

	boolean findByEmailId(String emailId);
}
 