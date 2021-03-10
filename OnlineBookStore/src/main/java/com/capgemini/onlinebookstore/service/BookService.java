package com.capgemini.onlinebookstore.service;

import org.springframework.stereotype.Service;

import com.capgemini.onlinebookstore.domain.BookDto;
import com.capgemini.onlinebookstore.exception.DataNotFoundException;
import com.capgemini.onlinebookstore.exception.DuplicateDataException;

@Service
public interface BookService
{
	BookDto addBook(BookDto bookDto);

	ApiResponse updateBook(BookDto bookDto) throws DataNotFoundException, DuplicateDataException;

}
