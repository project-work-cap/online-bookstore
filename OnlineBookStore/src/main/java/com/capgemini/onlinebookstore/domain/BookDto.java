package com.capgemini.onlinebookstore.domain;

import java.time.LocalDateTime;

public class BookDto
{

	public BookDto()
	{
		super();
	}

	private long bookId;
	private double bookPrice;
	private String bookTitle;
	private String bookAuthor;
	private String bookLanguage;
	private LocalDateTime publicationDate = LocalDateTime.now();
	private String publisher;
	private long isbn;
	private int bookQuantity;

	public long getBookId()
	{
		return bookId;
	}

	public void setBookId(long bookId)
	{
		this.bookId = bookId;
	}

	public int getBookQuantity()
	{
		return bookQuantity;
	}

	public void setBookQuantity(int bookQuantity)
	{
		this.bookQuantity = bookQuantity;
	}

	public double getBookPrice()
	{
		return bookPrice;
	}

	public void setBookPrice(double bookPrice)
	{
		this.bookPrice = bookPrice;
	}

	public String getBookTitle()
	{
		return bookTitle;
	}

	public void setBookTitle(String bookTitle)
	{
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor()
	{
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor)
	{
		this.bookAuthor = bookAuthor;
	}

	public String getBookLanguage()
	{
		return bookLanguage;
	}

	public void setBookLanguage(String bookLanguage)
	{
		this.bookLanguage = bookLanguage;
	}

	public LocalDateTime getPublicationDate()
	{
		return publicationDate;
	}

	public void setPublicationDate(LocalDateTime publicationDate)
	{
		this.publicationDate = publicationDate;
	}

	public String getPublisher()
	{
		return publisher;
	}

	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}

	public long getIsbn()
	{
		return isbn;
	}

	public void setIsbn(long isbn)
	{
		this.isbn = isbn;
	}

}
