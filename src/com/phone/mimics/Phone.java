package com.phone.mimics;

public class Phone {

	
	
	String name;
	long contactNumber;
	
	
	public Phone( String name, long contactNumber) {
		super();
		
		this.name = name;
		this.contactNumber = contactNumber;
	}
	
	
	

	@Override
	public String toString() {
		return "Phone [name=" + name + ", contactNumber=" + contactNumber + "]";
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
}
