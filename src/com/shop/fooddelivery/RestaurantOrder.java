package com.shop.fooddelivery;

public class RestaurantOrder implements Order {
	    String customerName;
	    String [] products= {"coffee", "tea", "lemon tea" };
	    double orderAmount;
	    double gstPercentage=0.18;
		@Override
		public double calculateFinalAmount() {
			return (orderAmount*0.18)+orderAmount;
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
		public double getGstPercentage() {
			return gstPercentage;
		}
		public void setGstPercentage(double gstPercentage) {
			this.gstPercentage = gstPercentage;
		}

		
	    

}
