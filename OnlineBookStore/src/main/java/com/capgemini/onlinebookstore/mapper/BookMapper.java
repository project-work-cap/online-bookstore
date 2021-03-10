package com.capgemini.onlinebookstore.mapper;

import org.springframework.stereotype.Component;

import com.capgemini.onlinebookstore.domain.BookDto;
import com.capgemini.onlinebookstore.entities.Book;

@Component
public class BookMapper implements OisMapper<Book, BookDto>
{

	public BookMapper()
	{
		super();
	}

	@Override
	public Book copyDtoToEntity(BookDto bookDto, Book bookEntity)
	{
		bookEntity.setBookId(bookDto.getBookId());
		bookEntity.setBookAuthor(bookDto.getBookAuthor());
		bookEntity.setBookLanguage(bookDto.getBookLanguage());
		bookEntity.setBookPrice(bookDto.getBookPrice());
		bookEntity.setBookTitle(bookDto.getBookTitle());
		bookEntity.setIsbn(bookDto.getIsbn());
		bookEntity.setPublicationDate(bookDto.getPublicationDate());
		bookEntity.setPublisher(bookDto.getPublisher());
		bookEntity.setBookQuantity(bookDto.getBookQuantity());
		return bookEntity;
	}

	@Override
	public BookDto copyEntityToDto(Book bookEntity, BookDto bookDto)
	{
		bookDto.setBookId(bookEntity.getBookId());
		bookDto.setBookAuthor(bookEntity.getBookAuthor());
		bookDto.setBookLanguage(bookEntity.getBookLanguage());
		bookDto.setBookPrice(bookEntity.getBookPrice());
		bookDto.setBookTitle(bookEntity.getBookTitle());
		bookDto.setIsbn(bookEntity.getIsbn());
		bookDto.setPublicationDate(bookEntity.getPublicationDate());
		bookDto.setPublisher(bookEntity.getPublisher());
		bookDto.setBookQuantity(bookEntity.getBookQuantity());
		return bookDto;
	}

}
