package com.shop.fooddelivery;

public class GroceryOrder implements Order {
	String customerName;
	   double  orderAmount;
	   boolean isMemberShip;
	   
	   @Override
	   public double calculateFinalAmount() {
		if(isMemberShip)
		{
			return orderAmount-(orderAmount*0.10);
		}
		else {
			return orderAmount;
		}
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
	   public boolean isMemberShip() {
		   return isMemberShip;
	   }
	   public void setMemberShip(boolean isMemberShip) {
		   this.isMemberShip = isMemberShip;
	   }
	 
	   @Override
	   public String getOrderDetails() {
			return "Customer Name:"+customerName+"\nOrder Amount:"+orderAmount+"\nFinal Amount:"+calculateFinalAmount();

	   }
	  

}
