package com.capgemini.onlinebookstore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.DataNotFoundException;

/**
 * UserRepository interface extends
 * {@link org.springframework.data.jpa.repository.JpaRepository} to perfom
 * database related operations.
 * 
 * @author arivazs
 * @param <UserBookStore> which is the type to be used.
 * @param <Long>          which is the ID to be used.
 */
@Repository
public interface UserRepository extends JpaRepository<UserBookStore, Long>
{
	Optional<UserBookStore> findByUserName(String userName) throws DataNotFoundException;

//	Optional<UserBookStore> findByUserName(String userName, byte[] pict) throws UserNotFoundException;

//	Optional<UserBookStore> findByEmailId(String emailId);
	@Query("SELECT user FROM UserBookStore user where user.emailId = :emailId")
	Optional<UserBookStore> findByEmailId(String emailId);
}
