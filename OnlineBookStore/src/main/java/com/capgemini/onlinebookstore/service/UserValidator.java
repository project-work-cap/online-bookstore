package com.capgemini.onlinebookstore.service;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.capgemini.onlinebookstore.domain.UserBookStoreDto;

@Component
public class UserValidator implements Validator {


	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return UserBookStoreDto.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		UserBookStoreDto user= (UserBookStoreDto) target;
		String regex = "[A-Z][a-z]*";
		if(!user.getFirstName().matches(regex))
			errors.rejectValue("firstName", "firstName.invalid","First Name must cantain only Alphabets" );
		if(!user.getLastName().matches(regex))
			errors.rejectValue("lastName", "lastName.invalid","Last Name must cantain only Alphabets" );
		regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		if(!user.getEmailId().matches(regex))
			errors.rejectValue("emailId", "emailId.invalid","Wrong input for email Id");
		regex = "(0/91)?[7-9][0-9]{9}";
		if(!user.getPhoneNumber().matches(regex))
			errors.rejectValue("phoneNumber", "phoneNumber.invalid","Phone number is incorrect");
		if(!user.getPassword().equals(user.getConfirmPassword()))
			errors.rejectValue("password", "password.invalid","Password did not match");
		
	}
}
