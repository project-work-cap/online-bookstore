package com.capgemini.onlinebookstore.service;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.capgemini.onlinebookstore.domain.UserBookStoreDto;
import com.capgemini.onlinebookstore.exception.EmptyDataException;
import com.capgemini.onlinebookstore.exception.DataNotFoundException;

@Service
public interface RegistrationService
{

	UserBookStoreDto registerUser(UserBookStoreDto user) throws EmptyDataException;

	boolean findByEmailId(String emailId);

	UserBookStoreDto uploadPicture(MultipartFile file) throws DataNotFoundException, IOException;
}
