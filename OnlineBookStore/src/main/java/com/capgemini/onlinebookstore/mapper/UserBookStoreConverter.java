package com.capgemini.onlinebookstore.mapper;

import org.springframework.stereotype.Component;

import com.capgemini.onlinebookstore.domain.UserBookStoreDto;
import com.capgemini.onlinebookstore.entities.UserBookStore;

@Component
public class UserBookStoreConverter
{

	public UserBookStoreConverter()
	{
		super();
	}

	public UserBookStoreDto modelToDto(UserBookStore user)
	{
		UserBookStoreDto userDto = new UserBookStoreDto();
		userDto.setFirstName(user.getFirstName());
		userDto.setLastName(user.getLastName());
		userDto.setUserName(user.getUserName());
		userDto.setEmailId(user.getEmailId());
		userDto.setMobileNumber(user.getMobileNumber());
		userDto.setPassword(user.getPassword());
		userDto.setUserGender(user.getUserGender());
		return userDto;
	}

	public UserBookStore dtoToModel(UserBookStoreDto userDto)
	{
		UserBookStore user = new UserBookStore();
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setUserName(userDto.getUserName());
		user.setEmailId(userDto.getEmailId());
		user.setMobileNumber(userDto.getMobileNumber());
		user.setPassword(userDto.getPassword());
		user.setUserGender(userDto.getUserGender());
		return user;
	}
}
