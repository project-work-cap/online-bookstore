package com.capgemini.onlinebookstore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.onlinebookstore.entities.UserBookStore;

@Repository
public interface PictureRepository extends JpaRepository<UserBookStore, Long>
{
	Optional<UserBookStore> findByUserName(String name);

}
