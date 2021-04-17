package com.capgemini.onlinebookstore.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.capgemini.onlinebookstore.dao.AdminDao;
import com.capgemini.onlinebookstore.domain.CategoryDto;
import com.capgemini.onlinebookstore.entities.Category;
import com.capgemini.onlinebookstore.exception.CategoryExistException;
import com.capgemini.onlinebookstore.exception.InvalidDataException;
import com.capgemini.onlinebookstore.mapper.CategoryBookConverter;

/**
 * This is the AdminServiceImp class that implements the AdminService
 * interface to perform bookCategory operation.
 * 
 * @author Harshita
 * @see AdminService interface.
 *      {@link com.capgemini.onlinebookstore.service.AdminService}
 *      {@link com.capgemini.onlinebookstore.domain.CategoryDto}
 *      {@link com.capgemini.onlinebookstore.entities.Category}
 *      {@link com.capgemini.onlinebookstore.dao.AdminDao}
 *      {@link com.capgemini.onlinebookstore.mapper.CategoryBookConverter}
 * 
 */


@Service
public class AdminServiceImp implements AdminService {

	
	@Autowired
	AdminValidation validation;
	
	@Autowired
	AdminDao dao;
	
	@Autowired
	CategoryBookConverter converter;
	
	/**
	 * The method add category of the book and provides CategoryDto response of the
	 * operation.
	 * 
	 * @param dto of CategoryDto type.
	 * @return CategoryDto if credentials are correct and if not
	 * @throws InvalidDataException 
	 * @throws CategoryExistException
	 */
	
	@Override
	public CategoryDto addCategory(CategoryDto dto, BindingResult result) throws InvalidDataException  {
		validation.validate(dto, result);
		if(result.hasErrors())
			throw new InvalidDataException(result.getFieldError().getDefaultMessage());
		Category category=converter.dtoToModel(dto);
		if(checkCategoryNameExist(category.getCategoryName()))
			throw new CategoryExistException(category.getCategoryName()+" exist in the database.");
		category=dao.save(category);
		return dto;
	}
	
	
	/**
	 * The method checks if the category Name present in the database or not.
	 * 
	 * @param name of String type.
	 * @return boolean
	 */
	
	private boolean checkCategoryNameExist(String name) {
		Optional<Category>optional=dao.findByCategoryName(name);
	     if(optional.isPresent())
	         return true;
	   return false;
	}

	/**
	 * The method fetches all the category details present in the databse.
	 * 
	 * @param -
	 * @return List<CategoryDto>
	 */
	
	@Override
	public List<CategoryDto> fetchAllCategory() {
		List<Category> categories = dao.findAll();
		List<CategoryDto> dtos = new ArrayList<CategoryDto>();
		for (Category category : categories) {
			dtos.add(converter.modelToDto(category));
		}
		return dtos;
	}
	
	
	/**
	 * The method find the bookCategory by its name and provides CategoryDto response of the
	 * operation.
	 * 
	 * @param name of String type.
	 * @return CategoryDto if it is present in the database and if not
	 * @throws CategoryExistException
	 */

	@Override
	public CategoryDto findByCategoryName(String name) {
		if(!checkCategoryNameExist(name))
			throw new CategoryExistException(name+" does not exist in the database.");
		Optional<Category>optional=dao.findByCategoryName(name);
	    Category category=optional.get();
	    return converter.modelToDto(category);

	}

	/**
	 * The method update the description of the category and provides CategoryDto response of the
	 * operation.
	 * 
	 * @param name of String type.
	 * @param description of String type
	 * @return CategoryDto if it is present in the database and if not
	 * @throws CategoryExistException
	 */
	@Override
	public CategoryDto updateDescription(String name, String description) {
		if(!checkCategoryNameExist(name))
			throw new CategoryExistException(name+" does not exist in the database.");
		Optional<Category>optional=dao.findByCategoryName(name);
	    Category category=optional.get();
	    category.setDescription(description);
	    dao.save(category);
	    return converter.modelToDto(category);
	}

}
