package com.capgemini.onlinebookstore.service;

import org.springframework.stereotype.Service;

import com.capgemini.onlinebookstore.domain.UserBookStoreDto;
import com.capgemini.onlinebookstore.exception.DataNotFoundException;

/**
 * This is a service interface to be implemented by the User model to perform
 * user service operations.
 * {@link com.capgemini.onlinebookstore.domain.UserBookStoreDto}.
 * 
 * @author arivazs
 * @see UserServiceImpl
 * @see UserNotfoundException
 */
@Service
public interface UserService
{

	/**
	 * The method to be overridden by the implementing class.
	 * 
	 * @param userDto of UserBookStoreDto type.
	 * @return ApiResponse details of the logged in user if not
	 * @throws DataNotFoundException
	 */
	public ApiResponse loginUser(UserBookStoreDto userDto) throws DataNotFoundException;

}
