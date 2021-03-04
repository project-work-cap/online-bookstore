package com.capgemini.onlinebookstore.service;

import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinebookstore.dao.RegistrationDao;
import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.EmailIdExistException;
import com.capgemini.onlinebookstore.exception.EmptyDataException;
import com.capgemini.onlinebookstore.exception.InvalidDataException;
@Service
public class RegisterServiceImp implements IRegistrationService {

	CheckValidation check=new CheckValidation();
		
	@Autowired
	private RegistrationDao registrationDao;
	
	
	@Override
	public UserBookStore registerUser(UserBookStore user) throws EmptyDataException {
		if(user.getFirstName().equals(null) || user.getLastName().equals(null) ||
				user.getEmailId().equals(null) || user.getPassword().equals(null) ||
				user.getPhoneNumber().equals(null) || user.getUserGender().equals(null) ||
				user.getUserRole().equals(null))
			throw new EmptyDataException("Data is missing");
		boolean checkRegisterData;
		try {
			checkRegisterData = check.registerData(user);
			if(findByEmailId(user.getEmailId()))
				throw new EmailIdExistException("Email id exist. Use another account");
			user=registrationDao.save(user);
			return user;
		} catch (InvalidDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public boolean findByEmailId(String emailId) {
		Optional<UserBookStore>optional=registrationDao.findByEmailId(emailId);
	     if(optional.isPresent())
	         return true;
	   return false;
	}

}
