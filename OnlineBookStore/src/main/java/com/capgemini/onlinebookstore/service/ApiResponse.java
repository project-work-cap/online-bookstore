package com.capgemini.onlinebookstore.service;

public class ApiResponse
{

	public ApiResponse()
	{
		super();
	}

	private int status;
	private String message;
	private Object result;

	public ApiResponse(int status, String message, Object result)
	{
		super();
		this.status = status;
		this.message = message;
		this.result = result;
	}

}
