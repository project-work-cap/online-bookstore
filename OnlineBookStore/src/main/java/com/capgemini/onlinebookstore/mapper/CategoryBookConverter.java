package com.capgemini.onlinebookstore.mapper;

import org.springframework.stereotype.Component;

import com.capgemini.onlinebookstore.domain.CategoryDto;
import com.capgemini.onlinebookstore.entities.Category;

@Component
public class CategoryBookConverter {

	public CategoryBookConverter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CategoryDto modelToDto(Category category) {
		CategoryDto dto=new CategoryDto();
		dto.setCategoryName(category.getCategoryName());
		dto.setDescription(category.getDescription());
		return dto;
	}
	
	public Category dtoToModel(CategoryDto dto) {
		Category category=new Category();
		category.setCategoryName(dto.getCategoryName());
		category.setDescription(dto.getDescription());
		return category;
	}

}
