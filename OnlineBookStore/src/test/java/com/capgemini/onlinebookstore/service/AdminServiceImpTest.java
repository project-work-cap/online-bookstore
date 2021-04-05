package com.capgemini.onlinebookstore.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.capgemini.onlinebookstore.dao.AdminDao;
import com.capgemini.onlinebookstore.mapper.CategoryBookConverter;

@ExtendWith(SpringExtension.class)
class AdminServiceImpTest {

	@Mock
	AdminValidation validation;
	
	@Mock
	AdminDao dao;
	
	@Mock
	CategoryBookConverter converter;
	/*
	@Test
	void addCategorytest() {
		fail("Not yet implemented");
	}
	*/
	@Test 
	public void tempTest() {
		assertEquals(1,1);
	}
}
