package com.company.insurance;

public class LifeInsurance implements Insurance {

	String holderName;
	double sumAssured;
	int policyTerm;
	
	
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double getSumAssured() {
		
		return sumAssured;
	}
	public void setSumAssured(double sumAssured) {
		if(sumAssured<=0)
		{
			System.err.println("Enter valid amount");
			return;
		}
		this.sumAssured = sumAssured;
	}
	public int getPolicyTerm() {
		return policyTerm;
	}
	public void setPolicyTerm(int policyTerm) {
		if(policyTerm<=0) {
			System.err.println("Year is Invalid");
			return;
		}
		this.policyTerm = policyTerm;
	}
	@Override
	public void calculationRule(double amount) {
		
		amount = (amount/policyTerm)*0.05;
		System.out.println("Your Final Amount:"+amount);
		
	}
	
	
}
