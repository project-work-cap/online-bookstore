package com.capgemini.onlinebookstore.entities;

import java.time.LocalDateTime;
import java.util.List;

<<<<<<< HEAD
<<<<<<< HEAD
=======
import javax.persistence.Column;
>>>>>>> a1d7f734a4866afd404f8ed7cfc8857a3efcb63c
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@Column
=======
public class Book {
	
>>>>>>> parent of a1d7f73 (added entities)
	private long bookId;
	private double bookPrice;
	private String bookTitle;
	private String bookAuthor;
	private String bookLanguage;
	private LocalDateTime publicationDate;
	private List<Role> publisher;
	private long isbn;
	private Category catagory;
	
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookLanguage() {
		return bookLanguage;
	}
	public void setBookLanguage(String bookLanguage) {
		this.bookLanguage = bookLanguage;
	}
	public LocalDateTime getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(LocalDateTime publicationDate) {
		this.publicationDate = publicationDate;
	}
	public List<Role> getPublisher() {
		return publisher;
	}
	public void setPublisher(List<Role> publisher) {
		this.publisher = publisher;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public Category getCatagory() {
		return catagory;
	}
	public void setCatagory(Category catagory) {
		this.catagory = catagory;
	}
	
	
	

}
