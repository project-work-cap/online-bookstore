package com.capgemini.onlinebookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinebookstore.domain.UserBookStoreDto;
import com.capgemini.onlinebookstore.exception.DataNotFoundException;
import com.capgemini.onlinebookstore.service.ApiResponse;
import com.capgemini.onlinebookstore.service.UserService;

/**
 * LoginController api which is a rest controller provides login method to
 * login.
 * 
 * @author arivazs
 * 
 */
//@Slf4j
@RestController
@RequestMapping("/v1/registration")
public class LoginController
{

	/**
	 * Default constructor.
	 */
	public LoginController()
	{
		super();
	}

	@Autowired
	UserService userService;

	/**
	 * login method of ResponseEntity type takes UserBookDto as parameter to take
	 * user input perform login operation via service layer.
	 * 
	 * @param userDto object of UserBookDto class
	 * @return ResponseEntity<ApiResponse> of logged in user if not
	 * @throws DataNotFoundException
	 */
	@RequestMapping("/login")
	public ResponseEntity<ApiResponse> login(@RequestBody UserBookStoreDto userDto) throws DataNotFoundException
	{
		return ResponseEntity.ok(userService.loginUser(userDto));
	}

}
