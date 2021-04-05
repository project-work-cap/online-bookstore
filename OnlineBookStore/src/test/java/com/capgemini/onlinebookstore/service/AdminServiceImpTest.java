package com.capgemini.onlinebookstore.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;

import com.capgemini.onlinebookstore.dao.AdminDao;
import com.capgemini.onlinebookstore.domain.CategoryDto;
import com.capgemini.onlinebookstore.entities.Category;
import com.capgemini.onlinebookstore.exception.InvalidDataException;
import com.capgemini.onlinebookstore.mapper.CategoryBookConverter;

@ExtendWith(SpringExtension.class)
class AdminServiceImpTest {

	@Mock
	AdminValidation validation;
	
	@Mock
	AdminDao dao;
	
	@Mock
	CategoryBookConverter converter;
	
	@InjectMocks
	AdminServiceImp service=new AdminServiceImp();
	
	
	@Test
	public void addCategoryTest() throws InvalidDataException {
		CategoryDto dto=new CategoryDto();
		dto.setCategoryName("Thriller");
		dto.setDescription("Regarding thriller");
		dto.setRating("good");
		
		Errors errors = new BeanPropertyBindingResult(dto, "dto");
		Category category=new Category();
		
		doNothing().when(validation).validate(dto, errors);
		when(converter.dtoToModel(dto)).thenReturn(category);
		when(dao.findByCategoryName(dto.getCategoryName())).thenReturn(null);
		when(dao.save(category)).thenReturn(category);
		
		CategoryDto result=service.addCategory(dto, (BindingResult) errors);
		assertEquals(dto, result);
	}
}
