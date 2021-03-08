package com.capgemini.onlinebookstore.entities;

<<<<<<< HEAD

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bill {

import javax.persistence.Column;
import javax.persistence.Id;

=======
>>>>>>> parent of a1d7f73 (added entities)
public class Bill {

	private long billId;
	private Order orderDetails;
	private Cart productDetails;
	private UserBookStore userDetails ;
	private Address address;
	
	public long getBillId() {
		return billId;
	}
	public void setBillId(long billId) {
		this.billId = billId;
	}
	public Order getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(Order orderDetails) {
		this.orderDetails = orderDetails;
	}
	public Cart getProductDetails() {
		return productDetails;
	}
	public void setProductDetails(Cart productDetails) {
		this.productDetails = productDetails;
	}
	public UserBookStore getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserBookStore userDetails) {
		this.userDetails = userDetails;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
