package com.capgemini.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.onlinebookstore.entities.UserBookStore;

@Repository
public interface UserRepository extends JpaRepository<UserBookStore, Long>
{
	public UserBookStore findByUserIdAndEmailId(Long userId,String emailId);

}
