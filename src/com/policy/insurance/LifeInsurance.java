package com.policy.insurance;

import com.policy.insurance.HealthInsurance.PolicyStatus;

public class LifeInsurance implements Policy{

	
	 PolicyStatus policyStatus;
	 int policyNumber;
	   String customerName;
	    int customerAge;
	  double basePremium;
	  
	  

	   public LifeInsurance(int policyNumber, String customerName, int customerAge, double basePremium,
			PolicyStatus policyStatus) {
		super();
		this.policyNumber = policyNumber;
		this.customerName = customerName;
		this.customerAge = customerAge;
		this.basePremium = basePremium;
		this.policyStatus = policyStatus;
	}

	   @Override
	   public double calculationRule() {
		
		return basePremium+(basePremium*0.35);
	   }
	   
	   @Override
	public String toString() {
		return "HealthInsurance [policyNumber=" + policyNumber + ", customerName=" + customerName + ", customerAge="
				+ customerAge + ", basePremium=" + basePremium + ", policyStatus=" + policyStatus
				+ ", Final Amount=" + calculationRule() + "]";
	}

	   public int getPolicyNumber() {
		   return policyNumber;
	   }
	   public void setPolicyNumber(int policyNumber) {
		   this.policyNumber = policyNumber;
	   }
	   public String getCustomerName() {
		   return customerName;
	   }
	   public void setCustomerName(String customerName) {
		   this.customerName = customerName;
	   }
	   public int getCustomerAge() {
		   return customerAge;
	   }
	   public void setCustomerAge(int customerAge) {
		   this.customerAge = customerAge;
	   }
	   public double getBasePremium() {
		   return basePremium;
	   }
	   public void setBasePremium(double basePremium) {
		   this.basePremium = basePremium;
	   }

	   public PolicyStatus getPolicyStatus() {
		   return policyStatus;
	   }

	   public void setPolicyStatus(PolicyStatus policyStatus) {
		   this.policyStatus = policyStatus;
	   }
	   
	
}
