package com.capgemini.onlinebookstore.entities;

import java.util.List;

<<<<<<< HEAD
<
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Category {
	
	@Id
	@Column
>>>>>>> a1d7f734a4866afd404f8ed7cfc8857a3efcb63c
=======
public class Category {
	
>>>>>>> parent of a1d7f73 (added entities)
	private long categoryId;
	private String categoryName;
	private String rating;
	private String description;
	private List<Book> book;
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	

}
