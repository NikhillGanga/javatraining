package com.shop.fooddelivery;

public interface Order {

	abstract public double calculateFinalAmount();
	abstract public String getOrderDetails();

}
