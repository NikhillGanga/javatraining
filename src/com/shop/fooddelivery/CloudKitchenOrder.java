package com.shop.fooddelivery;

public class CloudKitchenOrder implements Order {
	   String customerName;
	   double  orderAmount;
	   int deliveryDistanceInKm;
	 
	   @Override
	   public double calculateFinalAmount() {
		if(deliveryDistanceInKm<5)
		{
			return orderAmount+30;
		}
		else
		{
			return orderAmount+60;
		}
	   }
	   @Override
	   public String getOrderDetails() {
			return "Customer Name:"+customerName+"\nOrder Amount:"+orderAmount+"\nFinal Amount:"+calculateFinalAmount();

	   }
	   public String getCustomerName() {
		   return customerName;
	   }
	   public void setCustomerName(String customerName) {
		   this.customerName = customerName;
	   }
	   public double getOrderAmount() {
		   return orderAmount;
	   }
	   public void setOrderAmount(double orderAmount) {
		   this.orderAmount = orderAmount;
	   }
	   public int getDeliveryDistanceInKm() {
		   return deliveryDistanceInKm;
	   }
	   public void setDeliveryDistanceInKm(int deliveryDistanceInKm) {
		   this.deliveryDistanceInKm = deliveryDistanceInKm;
	   }
	 

}
