package com.capgemini.onlinebookstore.service;

import java.util.Optional;

import com.capgemini.onlinebookstore.entities.UserBookStore;
import com.capgemini.onlinebookstore.exception.EmptyDataException;

<<<<<<< HEAD:OnlineBookStore/src/main/java/com/capgemini/onlinebookstore/service/RegistrationService.java
public interface RegistrationService {

	UserBookStore registerUser(UserBookStore user) ;
	UserBookStore findByEmailId(String emailId);
=======
public interface IRegistrationService
{

	UserBookStore registerUser(UserBookStore user) throws EmptyDataException;

	boolean findByEmailId(String emailId);
>>>>>>> a1d7f734a4866afd404f8ed7cfc8857a3efcb63c:OnlineBookStore/src/main/java/com/capgemini/onlinebookstore/service/IRegistrationService.java
}
 