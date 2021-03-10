package com.capgemini.onlinebookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.capgemini.onlinebookstore.domain.UserBookStoreDto;
import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.DataNotFoundException;
import com.capgemini.onlinebookstore.repository.UserRepository;

/**
 * This is the UserBookStoreServiceImpl class that implements the UserService
 * interface to perform login operation.
 * 
 * @author arivazs
 * @see UserService interface.
 *      {@link com.capgemini.onlinebookstore.service.UserService}
 *      {@link com.capgemini.onlinebookstore.domain.UserBookStoreDto}
 *      {@link com.capgemini.onlinebookstore.entities.UserBookStore}
 *      {@link com.capgemini.onlinebookstore.repository.UserRepository}
 *      {@link com.capgemini.onlinebookstore.mapper.UserBookStoreMapper}
 * 
 */
@Component
public class UserServiceImpl implements UserService
{

	public UserServiceImpl()
	{
		super();
	}

	@Autowired
	private UserRepository userRepository;

	/**
	 * The method checks login activity of the user and provides API response of the
	 * operation. And also checks for the user credentials.
	 * 
	 * @param userDto of UserBookStoreDto type.
	 * @return ApiResponse details of the logged in user if not
	 * @throws DataNotFoundException
	 */
	@Override
	public ApiResponse loginUser(UserBookStoreDto userDto) throws DataNotFoundException
	{
		UserBookStore userBookStore = userRepository.findByUserName(userDto.getUserName())
				.orElseThrow(() -> new DataNotFoundException("No user found with this username or password"));

		if (!userBookStore.getUserName().equals(userDto.getUserName())
				|| !userBookStore.getUserPassword().equals(userDto.getUserPassword()))
		{ throw new DataNotFoundException("No user found with this username  or password"); }

		return new ApiResponse(HttpStatus.OK.value(), "Login successful");
	}

}
