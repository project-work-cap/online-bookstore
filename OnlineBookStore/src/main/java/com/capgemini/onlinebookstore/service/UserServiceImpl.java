package com.capgemini.onlinebookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.onlinebookstore.domain.UserBookStoreDto;
import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.UserNotFoundException;
import com.capgemini.onlinebookstore.mapper.UserBookStoreConverter;
import com.capgemini.onlinebookstore.repository.UserRepository;

@Component
public class UserServiceImpl implements UserService
{

	public UserServiceImpl()
	{
		super();
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserBookStoreConverter converter;

	@Override
	public ApiResponse loginUser(UserBookStoreDto userDto) throws UserNotFoundException
	{
		UserBookStore userBookStore = userRepository.findById(userDto.getUserId()).orElseThrow(
				() -> new UserNotFoundException("No user found with this username " + userDto.getUserName()));
		if (!userBookStore.getPassword().equals(userDto.getPassword()))
		{ throw new UserNotFoundException("No user found with this username " + userDto.getUserName()); }
		return new ApiResponse(200, "Login successful", converter.modelToDto(userBookStore));
	}

}
