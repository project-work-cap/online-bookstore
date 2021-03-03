package com.capgemini.onlinebookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinebookstore.dao.RegistrationDao;
import com.capgemini.onlinebookstore.dto.UserBookStore;

@Service
public class RegisterServiceImp implements IRegistrationService {

	@Autowired
	private RegistrationDao registrationDao;
	@Override
	public UserBookStore registerUser(UserBookStore user) {
		user=registrationDao.save(user);
		return user;
	}
	@Override
	public UserBookStore findByEmailId(String emailId) {
		return null;
	}

}
