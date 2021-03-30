package com.capgemini.onlinebookstore.service;

import static org.hamcrest.CoreMatchers.any;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import javax.persistence.PersistenceException;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;

import com.capgemini.onlinebookstore.dao.RegistrationDao;
import com.capgemini.onlinebookstore.domain.UserBookStoreDto;
import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.EmptyDataException;
import com.capgemini.onlinebookstore.exception.InvalidDataException;
import com.capgemini.onlinebookstore.exception.UserNameExistException;
import com.capgemini.onlinebookstore.mapper.UserBookStoreConverter;

@ExtendWith(SpringExtension.class)
class RegistrationServiceTest {


	@Mock
	private EmailSending mailSender;
	
	@Mock
	UserBookStoreConverter converter;
	
	@Mock
	UserValidator validator;

	@Mock
	RegistrationDao registrationDao;
	
	@InjectMocks
	RegisterServiceImp service=new RegisterServiceImp();
	
	@Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
 
	
	@Test
	void registerUserTest() throws EmptyDataException, InvalidDataException, UserNameExistException {
		UserBookStoreDto dto=new UserBookStoreDto();
		dto.setFirstName("Harshita");
		dto.setLastName("Saxena");
		dto.setUserName("harshi");
		dto.setEmailId("harshita5@gmail.com");
		dto.setPassword("project@5");
		dto.setConfirmPassword("project@5");
		dto.setPhoneNumber("9876543210");
		dto.setUserGender("Female");
		
		Errors errors = new BeanPropertyBindingResult(dto, "dto");
		UserBookStore user=new UserBookStore();
		
		doNothing().when(validator).validate(user, errors);
		when(converter.dtoToModel(dto)).thenReturn(user);
		when(registrationDao.findByUserName(dto.getUserName())).thenReturn(null);
		when(registrationDao.findByEmailId(dto.getEmailId())).thenReturn(null);
		when(registrationDao.save(user)).thenReturn(user);
		when(converter.modelToDto(user)).thenReturn(dto);
	
		
		UserBookStoreDto result=service.registerUser(dto, (BindingResult) errors);
		
		assertEquals(dto, result);
	}

	

}
