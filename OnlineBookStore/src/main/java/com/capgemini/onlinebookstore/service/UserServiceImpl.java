package com.capgemini.onlinebookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.UserNotFoundException;
import com.capgemini.onlinebookstore.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService
{

	public UserServiceImpl()
	{
		super();
	}

	public static final String EXCEPTION_MESSAGE = "No user found with this ";

	@Autowired
	private UserRepository userRepository;

	@Override
	public ApiResponse loginUser(UserBookStore user) throws UserNotFoundException
	{
		UserBookStore userBookStore = userRepository.findById(user.getUserId())
				.orElseThrow(() -> new UserNotFoundException(EXCEPTION_MESSAGE + user.getUserId()));
		if (!userBookStore.getPassword().equals(user.getPassword()))
		{ throw new UserNotFoundException(EXCEPTION_MESSAGE + user.getUserId()); }
		return new ApiResponse(200, "Login successful", null);
	}

}
