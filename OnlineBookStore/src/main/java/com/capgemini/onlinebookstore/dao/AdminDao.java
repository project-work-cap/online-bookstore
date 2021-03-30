package com.capgemini.onlinebookstore.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.onlinebookstore.entities.Category;

public interface AdminDao extends JpaRepository<Category, Long>
{

	@Query("SELECT category FROM Category category where category.categoryName = :categoryName")
	Optional<Category> findByCategoryName(String categoryName);

}
