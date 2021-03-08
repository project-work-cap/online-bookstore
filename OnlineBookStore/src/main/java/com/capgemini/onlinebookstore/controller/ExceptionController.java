package com.capgemini.onlinebookstore.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.capgemini.onlinebookstore.exception.EmailIdExistException;
import com.capgemini.onlinebookstore.exception.EmptyDataException;
import com.capgemini.onlinebookstore.exception.InvalidDataException;

@RestControllerAdvice
public class ExceptionController extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(InvalidDataException.class)
	  public final ResponseEntity<InvalidDataException> handleUserNotFoundException(InvalidDataException ex, WebRequest request) {
		InvalidDataException errorDetails = new InvalidDataException( ex.getMessage());
	    return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	  }
	
	@ExceptionHandler(EmailIdExistException.class)
	public ResponseEntity<String>handleEmailIdExistException(EmailIdExistException ex){
	       String msg=ex.getMessage();
	       ResponseEntity<String>response=new ResponseEntity<>(msg,HttpStatus.BAD_REQUEST);
	       return response;
	   }

	@ExceptionHandler(EmptyDataException.class)
	public ResponseEntity<String>handleEmptyDataException(EmptyDataException ex){
	       String msg=ex.getMessage();
	       ResponseEntity<String>response=new ResponseEntity<>(msg,HttpStatus.BAD_REQUEST);
	       return response;
	   }
	
}
