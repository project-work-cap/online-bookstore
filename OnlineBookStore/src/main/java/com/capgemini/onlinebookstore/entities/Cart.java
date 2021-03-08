package com.capgemini.onlinebookstore.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Cart {
	@Id
	private long cartId;
	private int quantity;
	private double totalPrice;
	private List<Book> bookList;
	private Order order;
	
	public long getCartId() {
		return cartId;
	}
	public void setCartId(long cartId) {
		this.cartId = cartId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}

	
}
