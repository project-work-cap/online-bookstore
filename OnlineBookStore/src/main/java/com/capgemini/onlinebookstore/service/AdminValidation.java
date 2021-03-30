package com.capgemini.onlinebookstore.service;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.capgemini.onlinebookstore.domain.CategoryDto;

@Component
public class AdminValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		CategoryDto dto= (CategoryDto) target;
		String regex = "[A-Z][a-z]*";
		if(!dto.getCategoryName().matches(regex))
			errors.rejectValue("categoryName", "categoryName.invalid","Category Name must cantain only Alphabets" );
		
	}

}
