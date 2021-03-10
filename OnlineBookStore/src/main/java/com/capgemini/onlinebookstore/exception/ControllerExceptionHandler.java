package com.capgemini.onlinebookstore.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

/**
 * The Global exception handler class for the controllers contains all the
 * exceptions to handle all the controller exceptions.
 * 
 * @author arivazs
 * @see UserNotFoundexception
 *
 */
@RestControllerAdvice
public class ControllerExceptionHandler
{

	/**
	 * Default constructor.
	 */
	public ControllerExceptionHandler()
	{
		super();
	}

	/**
	 * This is the userNotFoundException method to handle the error status of
	 * UserNotFoundException class.
	 * 
	 * @param e       of UserNotFoundException type to provide default error
	 *                message.
	 * @param request of WebRequest type to get the default description.
	 * @return ErrorMessage containing statusCode, Message, Timestamp,Description
	 *         for the provided exception class.
	 */
	@ExceptionHandler(DataNotFoundException.class)
	public ErrorMessage dataNotFoundException(DataNotFoundException e, WebRequest request)
	{
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setStatusCode(HttpStatus.NOT_FOUND.value());
		errorMessage.setMessage(e.getMessage());
		errorMessage.setTimestamp(new Date());
		errorMessage.setDescription(request.getDescription(false));
		return errorMessage;

	}

	@ExceptionHandler(DuplicateDataException.class)
	public ErrorMessage duplicateDataException(DuplicateDataException e, WebRequest request)
	{
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setStatusCode(HttpStatus.NOT_FOUND.value());
		errorMessage.setMessage(e.getMessage());
		errorMessage.setTimestamp(new Date());
		errorMessage.setDescription(request.getDescription(false));
		return errorMessage;

	}

	/**
	 * The default exception handler method to return default error status.
	 * 
	 * @param ex      of default Exception class type to provide default error
	 *                message.
	 * @param request of WebRequest type to get the default description.
	 * @return ErrorMessage containing statusCode, Message, Timestamp,Description
	 *         for the provided exception class.
	 */
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
