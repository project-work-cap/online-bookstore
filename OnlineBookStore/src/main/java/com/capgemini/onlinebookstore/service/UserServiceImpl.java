package com.capgemini.onlinebookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.onlinebookstore.domain.UserBookStoreDto;
import com.capgemini.onlinebookstore.entities.UpdatePassword;
import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.PasswordException;
import com.capgemini.onlinebookstore.exception.UserNotFoundException;
import com.capgemini.onlinebookstore.mapper.UserBookStoreConverter;
import com.capgemini.onlinebookstore.repository.UserRepository;

@Component
public class UserServiceImpl implements UserService {

	public UserServiceImpl() {
		super();
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserBookStoreConverter converter;

	@Override
	public ApiResponse loginUser(UserBookStoreDto userDto) throws UserNotFoundException {
		
		UserBookStore userBookStore = userRepository.findById(userDto.getUserId()).orElseThrow(
				() -> new UserNotFoundException("No user found with this username " + userDto.getUserName()));
		if (!userBookStore.getPassword().equals(userDto.getPassword())) {
			throw new UserNotFoundException("No user found with this username " + userDto.getUserName());
		}
		
		return new ApiResponse(200, "Login successful", converter.modelToDto(userBookStore));
	}

	@Override
	public ApiResponse updatePassword(UpdatePassword updatePassword) throws PasswordException, UserNotFoundException {

		UserBookStore bookStore = userRepository.findById(updatePassword.getUserId()).orElseThrow(
				() -> new UserNotFoundException("No user found with this userId: " + updatePassword.getUserId()));

		if (bookStore.getPassword().equals(updatePassword.getOldPassword())) {
			bookStore.setPassword(updatePassword.getNewPassword());
			userRepository.saveAndFlush(bookStore);
			return new ApiResponse(200, "Password Updated sucessfully", converter.modelToDto(bookStore));
		} else {
			throw new PasswordException("Please enter correct password");
		}
	}

	@Override
	public ApiResponse forgotPassword(UpdatePassword forgotPassword) throws UserNotFoundException {

		UserBookStore bookStore = userRepository.findByUserIdAndEmailId(forgotPassword.getUserId(),
				forgotPassword.getEmailId());
		if (bookStore == null) {
			throw new UserNotFoundException("No userFound with this combination userId : "
					+ forgotPassword.getUserId() + "emailId : " + forgotPassword.getEmailId());
		} else {
			bookStore.setPassword(forgotPassword.getNewPassword());
			userRepository.saveAndFlush(bookStore);
			return new ApiResponse(200, "Password Resetted Sucessfully", converter.modelToDto(bookStore));

		}
	}
}
