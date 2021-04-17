package com.capgemini.onlinebookstore.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ControllerExceptionHandler
{

	public ControllerExceptionHandler()
	{
		super();
	}

	@ExceptionHandler(UserNotFoundException.class)
	public ErrorMessage userNotFoundException(UserNotFoundException e, WebRequest request)
	{
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setStatusCode(HttpStatus.NOT_FOUND.value());
		errorMessage.setMessage(e.getMessage());
		errorMessage.setTimestamp(new Date());
		errorMessage.setDescription(request.getDescription(false));
		return errorMessage;

	}

	@ExceptionHandler(Exception.class)
	public ErrorMessage globalExceptionHandler(Exception ex, WebRequest request)
	{
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		errorMessage.setTimestamp(new Date());
		errorMessage.setMessage(ex.getMessage());
		errorMessage.setDescription(request.getDescription(false));
		return errorMessage;
	}
}
