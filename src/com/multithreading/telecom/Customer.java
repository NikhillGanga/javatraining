package com.multithreading.telecom;

public class Customer {

	String customerId;
	String name;
	long phoneNumber;	
	double walletBalance;
	
	public Customer(String customerId, String name, long phoneNumber, double walletBalance) {
		this.customerId = customerId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.walletBalance = walletBalance;
	}

	
	

	 public String getCustomerId() {
		return customerId;
	}




	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public long getPhoneNumber() {
		return phoneNumber;
	}




	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}




	public double getWalletBalance() {
		return walletBalance;
	}




	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}




	 public synchronized void makeCall(int minutes)
	 {
		 if(walletBalance<minutes*2)
		 { 
			 throw new InsufficientBalanceException("Insufficient balance");
		     
		 }
		 walletBalance-=minutes*2;
		 System.out.println("Name:"+getName()+"=Available balance:"+walletBalance);
	 }
	public  synchronized void recharge(double amount)
	{
		walletBalance+=amount;
		System.out.println("Name:"+getName()+"= After recharge your balance:"+walletBalance);
	}
	    

	
}
