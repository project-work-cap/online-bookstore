package com.capgemini.onlinebookstore.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.onlinebookstore.entities.UserBookStore;

@Repository
<<<<<<< HEAD
public class RegistrationDao
{

	public UserBookStore findByEmailId(String emailId)
	{
		return null;
	}

	public UserBookStore save(UserBookStore user)
	{
		return user;
	}
=======
public interface RegistrationDao extends JpaRepository<UserBookStore, Long> {

	//UserBookStore save(UserBookStore user);
	@Query("SELECT user FROM UserBookStore user where user.emailId = :emailId") 
	Optional<UserBookStore> findByEmailId(String emailId);
	
>>>>>>> 456a72488527a3f3aa3c996b5c77e07d9d54db3b
}
