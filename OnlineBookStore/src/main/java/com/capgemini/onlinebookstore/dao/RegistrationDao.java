package com.capgemini.onlinebookstore.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.onlinebookstore.entities.UserBookStore;

@Repository
public interface RegistrationDao extends JpaRepository<UserBookStore, Long> {

	/*
	//UserBookStore save(UserBookStore user);
	@Query("SELECT user FROM UserBookStore user where user.emailId = :emailId") 
	Optional<UserBookStore> findByEmailId(String emailId);
	*/
}
