package com.capgemini.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.onlinebookstore.entities.UserBookStore;

@Repository
public interface UserRepository extends JpaRepository<UserBookStore, Long>
{
//	@Query("select u.email_id from user_bookstore u where u.email_id = :email_id")
//	public String findByEmailId(String emailId);
//
//	@Query("select u.user_password from user_bookstore u where u.user_password = user_password")
//	public String findByPassword(String password);
//
//	@Query("select u.user_id from user_bookstore u where u.user_id = user_id")
//	public long findByUserId(long userId);

}
