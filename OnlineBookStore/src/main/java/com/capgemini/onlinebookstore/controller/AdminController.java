package com.capgemini.onlinebookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinebookstore.domain.BookDto;
import com.capgemini.onlinebookstore.exception.DataNotFoundException;
import com.capgemini.onlinebookstore.exception.DuplicateDataException;
import com.capgemini.onlinebookstore.service.ApiResponse;
import com.capgemini.onlinebookstore.service.BookService;

@RestController
@RequestMapping("v1/admin/book")
public class AdminController
{

	@Autowired
	private BookService bookService;

	public AdminController()
	{
		super();
	}

	@PostMapping("/addbooks")
	public ResponseEntity<BookDto> addBook(@RequestBody BookDto bookDto)
	{
		return ResponseEntity.ok(bookService.addBook(bookDto));
	}

	@PutMapping("/updatebooks")
	public ResponseEntity<ApiResponse> updateBook(@RequestBody BookDto bookDto)
			throws DataNotFoundException, DuplicateDataException
	{
		return ResponseEntity.ok(bookService.updateBook(bookDto));
	}

}
