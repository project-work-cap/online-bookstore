package com.capgemini.onlinebookstore.service;

/**
 * This is ApiResponse class to provide API Responses of the required controller
 * and service where ever required.
 * 
 * @author arivazs
 *
 */
public class ApiResponse
{

	/**
	 * Default constructor.
	 */
	public ApiResponse()
	{
		super();
	}

	private int status;
	private String message;
	private Object result;

	public ApiResponse(int status, String message, Object result)
	{
		this.status = status;
		this.message = message;
		this.result = result;
	}

	/**
	 * parameterized constructor.
	 * 
	 * @param status  to provide the status of the ApiResponse.
	 * @param message to provide the default message of the ApiResponse.
	 * @param result  to provide the details of the returned Object as a result of
	 *                the ApiResponse.
	 */
	public ApiResponse(int status, String message)
	{
		this.status = status;
		this.message = message;
	}

	public ApiResponse(String message)
	{
		this.message = message;
	}

	public int getStatus()
	{
		return status;
	}

	public void setStatus(int status)
	{
		this.status = status;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public Object getResult()
	{
		return result;
	}

	public void setResult(Object result)
	{
		this.result = result;
	}

}
