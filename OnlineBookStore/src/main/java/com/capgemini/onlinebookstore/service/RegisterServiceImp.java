package com.capgemini.onlinebookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.onlinebookstore.dao.RegistrationDao;
import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.EmailIdExistException;

@Service
@Transactional
public class RegisterServiceImp implements RegistrationService {

		/*
	@Autowired
	private RegistrationDao registrationDao;
	*/
	
	@Override
	public UserBookStore registerUser(UserBookStore user)  {
		
		if(findByEmailId(user.getEmailId()).equals(null))
			throw new EmailIdExistException("Try another email Id. This id exist");
			
		//user=registrationDao.save(user);
		return user;
		
	}
	
	@Override
	public UserBookStore findByEmailId(String emailId) {
		return new UserBookStore();
		//return registrationDao.findByEmailId(emailId).orElse(null);
	}
	

}
