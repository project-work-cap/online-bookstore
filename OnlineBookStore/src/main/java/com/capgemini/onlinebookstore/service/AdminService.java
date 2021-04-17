package com.capgemini.onlinebookstore.service;

import java.util.List;

import org.springframework.validation.BindingResult;

import com.capgemini.onlinebookstore.domain.CategoryDto;
import com.capgemini.onlinebookstore.exception.InvalidDataException;


public interface AdminService {
	
	CategoryDto addCategory(CategoryDto user,BindingResult result) throws InvalidDataException ;
	List<CategoryDto> fetchAllCategory();
	CategoryDto findByCategoryName(String name);
	CategoryDto updateDescription(String name,String description);

}
