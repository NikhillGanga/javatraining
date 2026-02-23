package com.training.hibernate.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Product {
	
	private long prodId;
	private String prodName;
	private String prodDesc;
	private double price;
	private int stock;
	private LocalDateTime createdAt;
	private List<Order> orders;
	
	public Product(long prodId, String prodName, String prodDesc, double price, int stock, LocalDateTime createdAt,
			List<Order> orders) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
		this.price = price;
		this.stock = stock;
		this.createdAt = createdAt;
		this.orders = orders;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getProdId() {
		return prodId;
	}

	public void setProdId(long prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	

	
	

}
