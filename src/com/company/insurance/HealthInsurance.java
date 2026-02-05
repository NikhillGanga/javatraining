package com.company.insurance;

public class HealthInsurance implements Insurance{
	String holderName;
	int age;
	double basePremiumAmount=10000.00;
	double sumAssured;
	public double getbasePremium()
	{
		return this.basePremiumAmount;
	}
	public double getSumAssured() {
		return sumAssured;
	}
	public void setSumAssured(double sumAssured) {
		this.sumAssured = sumAssured;
	}
	@Override
	public void calculationRule(double amount) {
	    if (this.age > 45) {
	        amount = (amount / 100) * 20 + (basePremiumAmount + (sumAssured / (80 - age)));
	    } else {
	        amount = basePremiumAmount + (sumAssured / (80 - age));
	    }

	    System.out.printf("Final calculation: %.2f%n", amount);
	}

	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<=0) {
			System.err.println("Age is Invalid");
			return;
		}
		this.age = age;
	}
	
	

	
}
