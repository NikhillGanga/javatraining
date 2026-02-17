package com.multithreading.telecom;

public class CallRequest {

		Customer customer;
		String  requestId;
	    long phoneNumber;
	    int minutes;
		

		public CallRequest(Customer customer, String requestId, long phoneNumber, int minutes) {
			super();
			this.customer = customer;
			this.requestId = requestId;
			this.phoneNumber = phoneNumber;
			this.minutes = minutes;
		}


		public Customer getCustomer() {
			return customer;
		}


		public void setCustomer(Customer customer) {
			this.customer = customer;
		}


		public String getRequestId() {
			return requestId;
		}


		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}


		public long getPhoneNumber() {
			return phoneNumber;
		}


		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}


		public int getMinutes() {
			return minutes;
		}


		public void setMinutes(int minutes) {
			this.minutes = minutes;
		}


		
	    
}
