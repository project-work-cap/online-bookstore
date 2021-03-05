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

//	@Autowired
//	private UserBookStore user;

	@Override
	public ApiResponse loginUser(UserBookStore user) throws UserNotFoundException
	{

//		UserBookStore user = userRepository.findById(userId)
//				.orElseThrow(() -> new UserNotFoundException(EXCEPTION_MESSAGE + userId));
//		return userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(EXCEPTION_MESSAGE + userId));
		UserBookStore userBookStore = userRepository.findById(user.getUserId())
				.orElseThrow(() -> new UserNotFoundException(EXCEPTION_MESSAGE + user.getUserId()));
		
		
		return new Apiresponse(200,"Login")
	}
//	@Override
//	public UserBookStore getUserId(UserBookStore user)
//	{
//		user = userRepository.findById(null);
//		return user;
//	}

//	@Override
//	public String getEmailId() throws UserNotFoundException
//	{
//		if (userRepository.findByEmailId(user.getEmailId()).isEmpty())
//		{
//			throw new UserNotFoundException(EXCEPTION_MESSAGE + user.getEmailId());
//		}
//		else
//		{
//			return userRepository.findByEmailId(user.getEmailId());
//		}
//	}
//
//	@Override
//	public String getPassword() throws UserNotFoundException
//	{
//		if (userRepository.findByPassword(user.getPassword()).isEmpty())
//		{
//			throw new UserNotFoundException(EXCEPTION_MESSAGE + user.getPassword());
//		}
//		else
//		{
//			return userRepository.findByPassword(user.getPassword());
//		}
//	}
//
//	@Override
//	public long getUserById() throws UserNotFoundException
//	{
//		if (userRepository.findByUserId(user.getUserId()) == 0)
//		{
//			throw new UserNotFoundException(EXCEPTION_MESSAGE + user.getUserId());
//		}
//		else
//		{
//			return userRepository.findByUserId(user.getUserId());
//		}
//
//	}
}
