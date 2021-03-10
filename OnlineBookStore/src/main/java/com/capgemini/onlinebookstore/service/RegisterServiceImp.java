package com.capgemini.onlinebookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinebookstore.dao.RegistrationDao;
import com.capgemini.onlinebookstore.domain.UserBookStoreDto;
import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.EmailIdExistException;
import com.capgemini.onlinebookstore.exception.EmptyDataException;
import com.capgemini.onlinebookstore.exception.InvalidDataException;
import com.capgemini.onlinebookstore.mapper.UserBookStoreConverter;

@Service
public class RegisterServiceImp implements RegistrationService
{
	@Autowired
	UserBookStoreConverter converter;
	
	@Autowired
	UserValidator validator;

	@Autowired
	private RegistrationDao registrationDao;
	
	@Override
	public UserBookStoreDto registerUser(UserBookStoreDto dto)  {
		UserBookStore user=converter.dtoToModel(dto);
		if(findByEmailId(user.getEmailId())) {
			throw new EmailIdExistException("Try another email Id. This id exist");
		}
		user=registrationDao.save(user);
		return dto;
		
	}
	
	@Override
	public boolean findByEmailId(String emailId) {
		Optional<UserBookStore>optional=registrationDao.findByEmailId(emailId);
	     if(optional.isPresent())
	    	 return true;
	     return false;
	}
}
