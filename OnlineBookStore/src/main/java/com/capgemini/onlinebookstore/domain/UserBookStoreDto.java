package com.capgemini.onlinebookstore.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserBookStoreDto
{

	@NotNull(message = "first name must not be empty")
	private String firstName;
	@NotNull(message = "last name must not be empty")
	private String lastName;
	@NotNull(message = "emailId must not be empty")
	private String emailId;
	@NotNull(message = "password name must not be empty")
	//@Min(8)
	private String password;
	//@Min(8)
	@NotNull(message = "forget to enter confirm password")
	private String confirmPassword;
	@NotNull(message = "Phone Number name must not be empty")
	@Size(min = 10 , max = 10)
	private String phoneNumber;
	@NotNull(message = "password name must not be empty")
	private String userGender;
	private String userName;
	private long userId;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	
	
	
}