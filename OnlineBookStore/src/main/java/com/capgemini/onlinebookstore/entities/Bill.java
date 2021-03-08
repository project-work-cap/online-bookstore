package com.capgemini.onlinebookstore.entities;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bill {

import javax.persistence.Column;
import javax.persistence.Id;

public class Bill {

	@Id
	@Column
	private long billId;
//	@Column
//	private Order orderDetails;
//	@Column
//	private Cart productDetails;
//	@Column
//	private UserBookStore userDetails;
//	@Column
//	private Address address;
	
	public long getBillId() {
		return billId;
	}
	public void setBillId(long billId) {
		this.billId = billId;
	}
//	public Order getOrderDetails() {
//		return orderDetails;
//	}
//	public void setOrderDetails(Order orderDetails) {
//		this.orderDetails = orderDetails;
//	}
//	public Cart getProductDetails() {
//		return productDetails;
//	}
//	public void setProductDetails(Cart productDetails) {
//		this.productDetails = productDetails;
//	}
//	public UserBookStore getUserDetails() {
//		return userDetails;
//	}
//	public void setUserDetails(UserBookStore userDetails) {
//		this.userDetails = userDetails;
//	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//	
	
}
