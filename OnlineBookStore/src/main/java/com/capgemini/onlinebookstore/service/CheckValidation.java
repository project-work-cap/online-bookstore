package com.capgemini.onlinebookstore.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.InvalidDataException;

public class CheckValidation {

	public boolean registerData(UserBookStore user) throws InvalidDataException {
		String regex = "[A-Z][a-z]*";
		if(!user.getFirstName().matches(regex))
			throw new InvalidDataException("First Name must cantain only Alphabets");
		if(!user.getLastName().matches(regex))
				throw new InvalidDataException("Last name must contain only alphabets");
		regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		if(!user.getEmailId().matches(regex))
			throw new InvalidDataException("Wrong input for email Id");
		regex = "(0/91)?[7-9][0-9]{9}";
		if(!user.getPhoneNumber().matches(regex))
			throw new InvalidDataException("Phone Number must contain only digits");
		return true;
	}
}
