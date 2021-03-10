package com.capgemini.onlinebookstore.mapper;

import org.springframework.stereotype.Component;

import com.capgemini.onlinebookstore.domain.UserBookStoreDto;
import com.capgemini.onlinebookstore.entities.UserBookStore;

/**
 * This is the UserBookStoreMapper class that implements the OisMapper interface
 * to perform mapping between Entity to DTO.
 * 
 * @author arivazs
 * @see OisMapper interface.
 *      {@link com.capgemini.onlinebookstore.entities.UserBookStore}
 *      {@link com.capgemini.onlinebookstore.domain.UserBookStoreDto}
 */
@Component
public class UserBookStoreMapper implements OisMapper<UserBookStore, UserBookStoreDto>
{

	/**
	 * Default constructor.
	 */
	public UserBookStoreMapper()
	{
		super();
	}

	/**
	 * This method maps UserBookStoreDto to UserBookStore entity class.
	 * 
	 * @return mapped UserBookStore entity class.
	 * @param userEntity of type UserBookStore entity class.
	 * @param userDto    of UserBookStoreDto class.
	 */
	@Override
	public UserBookStore copyDtoToEntity(UserBookStoreDto userDto, UserBookStore userEntity)
	{
		userEntity.setFirstName(userDto.getFirstName());
		userEntity.setLastName(userDto.getLastName());
		userEntity.setUserName(userDto.getUserName());
		userEntity.setEmailId(userDto.getEmailId());
		userEntity.setMobileNumber(userDto.getMobileNumber());
		userEntity.setUserPassword(userDto.getUserPassword());
		userEntity.setConfirmPassword(userDto.getConfirmPassword());
		userEntity.setUserGender(userDto.getUserGender());
		userEntity.setProfilePicture(userDto.getProfilePicture());
		return userEntity;
	}

	/**
	 * This method maps UserBookStore entity class to UserBookStoreDto class.
	 * 
	 * @return mapped UserBookStoreDto class.
	 * @param userEntity of type UserBookStore entity class.
	 * @param userDto    of UserBookStoreDto class.
	 */
	@Override
	public UserBookStoreDto copyEntityToDto(UserBookStore userEntity, UserBookStoreDto userDto)
	{
		userDto.setFirstName(userEntity.getFirstName());
		userDto.setLastName(userEntity.getLastName());
		userDto.setUserName(userEntity.getUserName());
		userDto.setEmailId(userEntity.getEmailId());
		userDto.setMobileNumber(userEntity.getMobileNumber());
		userDto.setUserPassword(userEntity.getUserPassword());
		userDto.setConfirmPassword(userEntity.getConfirmPassword());
		userDto.setUserGender(userEntity.getUserGender());
		userDto.setProfilePicture(userEntity.getProfilePicture());
		return userDto;
	}
}
