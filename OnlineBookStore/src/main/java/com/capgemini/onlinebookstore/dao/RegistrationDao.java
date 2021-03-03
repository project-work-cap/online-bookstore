package com.capgemini.onlinebookstore.dao;

import org.springframework.stereotype.Repository;

import com.capgemini.onlinebookstore.dto.UserBookStore;

@Repository
public class RegistrationDao {
	
	public UserBookStore findByEmailId(String emailId) {
		return null;
	}
	
	public UserBookStore save(UserBookStore user) {
		return user;
	}
}
