package com.capgemini.onlinebookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.EmptyDataException;
import com.capgemini.onlinebookstore.service.IRegistrationService;

@RestController
@RequestMapping("/v1/registration")
public class RegistrationController
{

	@Autowired
	private IRegistrationService service;

	@PostMapping("/details")
	public ResponseEntity<UserBookStore> addDistributor(@RequestBody UserBookStore user) throws EmptyDataException
	{
		user = service.registerUser(user);
		ResponseEntity<UserBookStore> response = new ResponseEntity<>(user, HttpStatus.OK);
		return response;
	}

}
