package com.capgemini.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.onlinebookstore.entities.UserBookStore;

public interface UserRepository extends JpaRepository<UserBookStore, Long>
{
	public String findByEmailId();

	public String findByPassword();
}
