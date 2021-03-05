package com.capgemini.onlinebookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.ExceptionHandler;
=======
>>>>>>> 456a72488527a3f3aa3c996b5c77e07d9d54db3b
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.EmailIdExistException;
import com.capgemini.onlinebookstore.exception.EmptyDataException;
import com.capgemini.onlinebookstore.service.IRegistrationService;

@RestController
@RequestMapping("/registration")
public class RegistrationController
{

	@Autowired
	private IRegistrationService service;
<<<<<<< HEAD

	@PostMapping
	public ResponseEntity<UserBookStore> addDistributor(@RequestBody UserBookStore user)
	{
		UserBookStore existing = service.findByEmailId(user.getEmailId());
		user = service.registerUser(user);
		ResponseEntity<UserBookStore> response = new ResponseEntity<>(user, HttpStatus.OK);
		return response;
	}

	@ExceptionHandler(EmailIdExistException.class)
	public ResponseEntity<String> handleEmailIdExistException(EmailIdExistException ex)
	{
		String msg = ex.getMessage();
		ResponseEntity<String> response = new ResponseEntity<>(msg, HttpStatus.BAD_REQUEST);
		return response;
	}
=======
	
	@PostMapping("/details")
	public ResponseEntity<UserBookStore>addDistributor(@RequestBody UserBookStore user) throws EmptyDataException{
    	user=service.registerUser(user);
    	ResponseEntity<UserBookStore>response=new ResponseEntity<>(user,HttpStatus.OK);
    	return response;
    }

>>>>>>> 456a72488527a3f3aa3c996b5c77e07d9d54db3b
}
