package com.capgemini.onlinebookstore.entities;

import java.time.LocalDateTime;
import java.util.List;
<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
=======

>>>>>>> parent of a1d7f73 (added entities)
public class Order {
	
>>>>>>> a1d7f734a4866afd404f8ed7cfc8857a3efcb63c
	private long orderId;
	private LocalDateTime orderDate;
	private UserBookStore user;
	private Address address;
	private Payment payment;
	private List<Cart> cart;
	
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
	public UserBookStore getUser() {
		return user;
	}
	public void setUser(UserBookStore user) {
		this.user = user;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public List<Cart> getCart() {
		return cart;
	}
	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}
	
	

}
