package com.capgemini.onlinebookstore.exception;

import java.util.List;

public class EmptyDataException extends Exception {
	public EmptyDataException(String message, List<String> details) {
        super();
        this.message = message;
        this.details = details;
    }
 
    //General error message about nature of error
    private String message;
 
    //Specific errors in API request processing
    private List<String> details;
}