package com.capgemini.onlinebookstore.service;

import org.springframework.stereotype.Service;

import com.capgemini.onlinebookstore.domain.UserBookStoreDto;
import com.capgemini.onlinebookstore.exception.UserNotFoundException;

@Service
public interface UserService
{
	public ApiResponse loginUser(UserBookStoreDto userDto) throws UserNotFoundException;

}
