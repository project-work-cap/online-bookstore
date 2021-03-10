package com.capgemini.onlinebookstore.service;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.capgemini.onlinebookstore.domain.UserBookStoreDto;
import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.DataNotFoundException;
import com.capgemini.onlinebookstore.exception.EmailIdExistException;
import com.capgemini.onlinebookstore.mapper.UserBookStoreMapper;
import com.capgemini.onlinebookstore.repository.UserRepository;

@Component
public class RegisterServiceImpl implements RegistrationService
{
	@Autowired
	private UserBookStoreMapper mapper;

	@Autowired
	UserRepository userRepository;

	@Override
	public UserBookStoreDto registerUser(UserBookStoreDto userDto)
	{
		UserBookStore userBookStore = userRepository.findByEmailId(userDto.getEmailId())
				.orElseThrow(() -> new EmailIdExistException("User already exists with the given Email Id"));
		userBookStore = userRepository.save(userBookStore);
		userDto = mapper.copyEntityToDto(userBookStore, userDto);
		return userDto;

	}

	@Override
	public boolean findByEmailId(String emailId)
	{
		Optional<UserBookStore> optional = userRepository.findByEmailId(emailId);
//		if (optional.isPresent()) return true;
		return optional.isPresent();

//		return false;
	}

	@Override
	public UserBookStoreDto uploadPicture(MultipartFile file) throws DataNotFoundException, IOException
	{
		UserBookStore userBookStore = new UserBookStore();
		UserBookStoreDto userDto = new UserBookStoreDto();
		userBookStore = mapper.copyDtoToEntity(userDto, userBookStore);
		userBookStore.setProfilePicture(file.getBytes());
		userBookStore = userRepository.save(userBookStore);
		userDto = mapper.copyEntityToDto(userBookStore, userDto);
		return userDto;
	}

}
