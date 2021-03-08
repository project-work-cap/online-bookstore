package com.capgemini.onlinebookstore.controller;

import javax.validation.Valid;
import javax.validation.Validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinebookstore.domain.UserBookStoreDto;
import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.EmptyDataException;
import com.capgemini.onlinebookstore.exception.InvalidDataException;
import com.capgemini.onlinebookstore.service.UserValidator;
import com.capgemini.onlinebookstore.service.RegistrationService;

@RestController
@RequestMapping("/v1/registration")
public class RegistrationController {
	
	@Autowired
	private UserValidator validator;
	@Autowired
	private RegistrationService service;
	
	@PostMapping("/register")
	public ResponseEntity<UserBookStoreDto>addUser(@Valid @RequestBody UserBookStoreDto dto){
		validator.validate(dto,null);
		UserBookStore user= contvertDomainToEntity(dto);
		service.registerUser(user);
		dto=convertEntityToDomain(user);
    	ResponseEntity<UserBookStoreDto>response=new ResponseEntity<>(dto,HttpStatus.OK);
    	return response;
    }
	
	
	public UserBookStore contvertDomainToEntity(UserBookStoreDto dto) {
		UserBookStore user=new UserBookStore();
		user.setFirstName(dto.getFirstName());
		user.setLastName(dto.getLastName());
		user.setEmailId(dto.getEmailId());
		user.setPassword(dto.getPassword());
		user.setPhoneNumber(dto.getPhoneNumber());
		user.setUserGender(dto.getUserGender());
		return user;
	}
	
	public UserBookStoreDto convertEntityToDomain(UserBookStore user) {
		UserBookStoreDto dto=new UserBookStoreDto();
		dto.setFirstName(user.getFirstName());
		dto.setLastName(user.getLastName());
		dto.setPhoneNumber(user.getPassword());
		dto.setConfirmPassword(user.getPassword());
		dto.setPassword(user.getPassword());
		dto.setUserGender(user.getUserGender());
		return dto;
	}

}
