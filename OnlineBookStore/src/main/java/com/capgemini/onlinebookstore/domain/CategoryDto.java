package com.capgemini.onlinebookstore.domain;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

public class CategoryDto {

	@NotNull(message = "category name must not be empty")
	private String categoryName;
	
	@NotNull(message = "Must enter the ratings")
	private String rating;
	
	@NotNull(message = "Description not be empty")
	private String description;
	
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
}
