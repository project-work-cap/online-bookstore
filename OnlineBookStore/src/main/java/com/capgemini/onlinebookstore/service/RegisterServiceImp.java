package com.capgemini.onlinebookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

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
	private EmailSending mailSender;
	
	@Autowired
	UserBookStoreConverter converter;
	
	@Autowired
	UserValidator validator;

	@Autowired
	private RegistrationDao registrationDao;
	
	@Override
	public UserBookStoreDto registerUser(UserBookStoreDto dto,BindingResult result) throws InvalidDataException  {
		validator.validate(dto, result);
		if(result.hasErrors()) 
			throw new InvalidDataException(result.getFieldError().getDefaultMessage());
		UserBookStore user=converter.dtoToModel(dto);
		if(findByEmailId(user.getEmailId()))
			throw new EmailIdExistException("Try another email Id. This id exist");
		user=registrationDao.save(user);
	    mailSender.emailConfirmation(dto.getEmailId(),"RegistrationSuccessfull","Your Account has been made");
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
