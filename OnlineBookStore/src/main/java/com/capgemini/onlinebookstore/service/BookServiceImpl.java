package com.capgemini.onlinebookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.capgemini.onlinebookstore.domain.BookDto;
import com.capgemini.onlinebookstore.entities.Book;
import com.capgemini.onlinebookstore.exception.DataNotFoundException;
import com.capgemini.onlinebookstore.exception.DuplicateDataException;
import com.capgemini.onlinebookstore.mapper.BookMapper;
import com.capgemini.onlinebookstore.repository.BookRepository;

@Component
public class BookServiceImpl implements BookService
{

	public BookServiceImpl()
	{
		super();
	}

	@Autowired
	private BookMapper mapper;

	@Autowired
	private BookRepository bookRepository;

	@Override
	public BookDto addBook(BookDto bookDto)
	{
		Book book = new Book();
		book = mapper.copyDtoToEntity(bookDto, book);
		bookRepository.save(book);
		bookDto = mapper.copyEntityToDto(book, bookDto);
		return bookDto;
	}

	@Override
	public ApiResponse updateBook(BookDto bookDto) throws DataNotFoundException, DuplicateDataException
	{
		Book book = bookRepository.findById(bookDto.getBookId())
				.orElseThrow(() -> new DataNotFoundException("Book not found"));

		Optional<Book> bookIsbn = bookRepository.findByIsbn(bookDto.getIsbn());
		if (bookIsbn.isPresent())
		{
			throw new DataNotFoundException("Book already present check ISBN number once");
		}
		else
		{
			book.setBookAuthor(bookDto.getBookAuthor());
			book.setBookLanguage(bookDto.getBookLanguage());
			book.setBookPrice(bookDto.getBookPrice());
			book.setBookTitle(bookDto.getBookTitle());
			book.setIsbn(bookDto.getIsbn());
			book.setPublicationDate(bookDto.getPublicationDate());
			book.setPublisher(bookDto.getPublisher());
			bookRepository.save(book);
			return new ApiResponse(HttpStatus.OK.value(), "Updation successfully");
		}

	}

}
