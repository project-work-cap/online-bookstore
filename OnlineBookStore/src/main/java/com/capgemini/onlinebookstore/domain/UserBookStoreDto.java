package com.capgemini.onlinebookstore.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.capgemini.onlinebookstore.entities.UserBookStore;

/**
 * This is the DTO class for the UserBookStore entity class.
 * 
 * @author arivazs
 * @see UserBookStore entity class for true identity
 *
 */
public class UserBookStoreDto
{

	/**
	 * Default constructor.
	 */
	public UserBookStoreDto()
	{
		super();
	}

	@NotNull
//	@NotBlank(message = "firstName is mandatory")
	private String firstName;

	@NotNull
	private String lastName;

	@NotNull
//	@NotBlank(message = "emailId is mandatory")
//	@Email
	private String emailId;

	@NotNull
//	@NotBlank(message = "Password is mandatory")
	private String userPassword;

//	@NotNull
//	@NotBlank(message = "userName is mandatory")
	private String userName;

	@Size(min = 10, max = 10)
//	@NotNull
//	@NotBlank(message = "Mobile number is mandatory")
//	@Size(min = 10, message = "Must be 10 digits")
//	@Pattern(regexp = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message = "Mobile number is invalid")
	private String mobileNumber;

	@NotNull
	private String userGender;

	private String confirmPassword;
	private byte[] profilePicture;

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public byte[] getProfilePicture()
	{
		return profilePicture;
	}

	public void setProfilePicture(byte[] profilePicture)
	{
		this.profilePicture = profilePicture;
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

	public String getUserPassword()
	{
		return userPassword;
	}

	public void setUserPassword(String userPassword)
	{
		this.userPassword = userPassword;
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

	public String getConfirmPassword()
	{
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword)
	{
		this.confirmPassword = confirmPassword;
	}

}
