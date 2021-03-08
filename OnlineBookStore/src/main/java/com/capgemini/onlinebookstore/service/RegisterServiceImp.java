package com.capgemini.onlinebookstore.service;

<<<<<<< HEAD
=======
import java.util.Optional;

>>>>>>> a1d7f734a4866afd404f8ed7cfc8857a3efcb63c
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.onlinebookstore.dao.RegistrationDao;
import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.EmailIdExistException;
<<<<<<< HEAD

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
=======
import com.capgemini.onlinebookstore.exception.EmptyDataException;
import com.capgemini.onlinebookstore.exception.InvalidDataException;

@Service
public class RegisterServiceImp implements IRegistrationService
{

	CheckValidation check = new CheckValidation();

	@Autowired
	private RegistrationDao registrationDao;

	@Override
	public UserBookStore registerUser(UserBookStore user) throws EmptyDataException
	{
		if (user.getFirstName().equals(null) || user.getLastName().equals(null) || user.getEmailId().equals(null)
				|| user.getPassword().equals(null) || user.getUserGender().equals(null)
//				||user.getPhoneNumber().equals(null)  || user.getUserRole().equals(null)
				)
			throw new EmptyDataException("Data is missing");
		boolean checkRegisterData;
		try
		{
			checkRegisterData = check.registerData(user);
			if (findByEmailId(user.getEmailId()))
				throw new EmailIdExistException("Email id exist. Use another account");
			user = registrationDao.save(user);
			return user;
		}
		catch (InvalidDataException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public boolean findByEmailId(String emailId)
	{
		Optional<UserBookStore> optional = registrationDao.findByEmailId(emailId);
		if (optional.isPresent()) return true;
		return false;
>>>>>>> a1d7f734a4866afd404f8ed7cfc8857a3efcb63c
	}
	

}
