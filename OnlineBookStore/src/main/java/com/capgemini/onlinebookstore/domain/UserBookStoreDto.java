package com.capgemini.onlinebookstore.domain;

public class UserBookStoreDto
{

	public UserBookStoreDto()
	{
		// TODO Auto-generated constructor stub
	}

	private long userId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String userName;
	private String mobileNumber;
	private String userGender;

	public long getUserId()
	{
		return userId;
	}

	public void setUserId(long userId)
	{
		this.userId = userId;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getEmailId()
	{
		return emailId;
	}

	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getMobileNumber()
	{
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber)
	{
		this.mobileNumber = mobileNumber;
	}

	public String getUserGender()
	{
		return userGender;
	}

	public void setUserGender(String userGender)
	{
		this.userGender = userGender;
	}

}
