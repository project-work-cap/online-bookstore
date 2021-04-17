package com.capgemini.onlinebookstore.entities;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class BookOrder {
	@Id
	@Column
	private long orderId;
	@Column
	private LocalDateTime orderDate;
//	@Column
//	private UserBookStore user;
//	@Column
//	private Address address;
//	@Column
//	private Payment payment;
//	@Column
//	private List<Cart> cart;
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
//	public UserBookStore getUser() {
//		return user;
//	}
//	public void setUser(UserBookStore user) {
//		this.user = user;
//	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//	public Payment getPayment() {
//		return payment;
//	}
//	public void setPayment(Payment payment) {
//		this.payment = payment;
//	}
//	public List<Cart> getCart() {
//		return cart;
//	}
//	public void setCart(List<Cart> cart) {
//		this.cart = cart;
//	}
	
	

}
