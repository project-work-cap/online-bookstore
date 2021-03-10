package com.capgemini.onlinebookstore.exception;

/**
 * DuplicateDataException class to provide the error messages where ever
 * required. Extends default Exception class.
 * 
 * @author arivazs
 *
 */
public class DuplicateDataException extends Exception
{

	private static final long serialVersionUID = 1L;

	/**
	 * Parameterized constructor.
	 * 
	 * @param message of type String to display the error message.
	 */
	public DuplicateDataException(String message)
	{
		super(message);
	}

}
