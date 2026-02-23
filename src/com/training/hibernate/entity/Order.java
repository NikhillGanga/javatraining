package com.training.hibernate.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Order {
	private long orderId;
	private String orderType;
	private int quantity;
	private double totalAmount;
	private LocalDateTime orderTime;
	private Product product;
	public Order(long orderId, String orderType, int quantity, double totalAmount, LocalDateTime orderTime,
			Product product) {
		super();
		this.orderId = orderId;
		this.orderType = orderType;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
		this.orderTime = orderTime;
		this.product = product;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public LocalDateTime getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(LocalDateTime orderTime) {
		this.orderTime = orderTime;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}
