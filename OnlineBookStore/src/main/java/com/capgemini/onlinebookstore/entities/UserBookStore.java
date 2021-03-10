package com.capgemini.onlinebookstore.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * Here is the main entity we will be using to deal with the database.
 * 
 * @author arivazs
 *
 */
@Entity
public class UserBookStore
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String firstName;
	private String lastName;
	private String userName;
	private String emailId;
	private String userPassword;
	private String mobileNumber;
	private String userGender;
	private String confirmPassword;
	@Lob
	private byte[] profilePicture;
//	private List<Role> userRole;
//	private Cart cart;
//	private List<Payment> paymentList;
//	private List<Order> orderList;

	public Long getUserId()
	{
		return userId;
	}

	public void setUserId(Long userId)
	{
		this.userId = userId;
	}

	public byte[] getProfilePicture()
	{
		return profilePicture;
	}

	public void setProfilePicture(byte[] profilePicture)
	{
		this.profilePicture = profilePicture;
	}

	public String getConfirmPassword()
	{
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword)
	{
		this.confirmPassword = confirmPassword;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
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

	public void setMobileNumber(String phoneNumber)
	{
		this.mobileNumber = phoneNumber;
	}

	public String getUserGender()
	{
		return userGender;
	}

	public void setUserGender(String userGender)
	{
		this.userGender = userGender;
	}

//	public List<Role> getUserRole()
//	{
//		return userRole;
//	}
//
//	public void setUserRole(List<Role> userRole)
//	{
//		this.userRole = userRole;
//	}
//
//	public Cart getCart()
//	{
//		return cart;
//	}
//
//	public void setCart(Cart cart)
//	{
//		this.cart = cart;
//	}
//
//	public List<Payment> getPaymentList()
//	{
//		return paymentList;
//	}
//
//	public void setPaymentList(List<Payment> paymentList)
//	{
//		this.paymentList = paymentList;
//	}
//
//	public List<Order> getOrderList()
//	{
//		return orderList;
//	}
//
//	public void setOrderList(List<Order> orderList)
//	{
//		this.orderList = orderList;
//	}

}
