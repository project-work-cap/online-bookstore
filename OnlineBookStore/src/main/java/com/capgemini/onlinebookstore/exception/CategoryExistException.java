package com.capgemini.onlinebookstore.exception;

public class CategoryExistException extends RuntimeException {
	public CategoryExistException(String msg) {
		super(msg);
	}
}
