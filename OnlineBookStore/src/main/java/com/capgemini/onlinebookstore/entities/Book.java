package com.capgemini.onlinebookstore.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookId;
	private double bookPrice;
	private String bookTitle;
	private String bookAuthor;
	private String bookLanguage;
	private LocalDateTime publicationDate = LocalDateTime.now();
	private String publisher;
	private byte[] bookImage;
	private long isbn;
	private int bookQuantity;
//	private Category catagory;

	public long getBookId()
	{
		return bookId;
	}

	public int getBookQuantity()
	{
		return bookQuantity;
	}

	public void setBookQuantity(int bookQuantity)
	{
		this.bookQuantity = bookQuantity;
	}

	public void setBookId(long bookId)
	{
		this.bookId = bookId;
	}

	public byte[] getBookImage()
	{
		return bookImage;
	}

	public void setBookImage(byte[] bookImage)
	{
		this.bookImage = bookImage;
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
//	public Category getCatagory() {
//		return catagory;
//	}
//	public void setCatagory(Category catagory) {
//		this.catagory = catagory;
//	}

}
