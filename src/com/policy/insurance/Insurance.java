package com.policy.insurance;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.policy.insurance.Driver.PolicyType;
import com.policy.insurance.HealthInsurance.PolicyStatus;

public class Insurance {

	Scanner s = new Scanner(System.in);
	 Map<Integer, Policy> policyMap=new HashMap<Integer, Policy>();;
	public  void add()
	{
		 
	        

	        System.out.println("Enter the type for policy (HEALTH / LIFE / VEHICLE / TRAVEL)");
	        String typeInput = s.next().toUpperCase();

	        PolicyType policyType;
	        try {
	            policyType = PolicyType.valueOf(typeInput);
	        } catch (IllegalArgumentException e) {
	            System.err.println("Invalid policy type!");
	            return;
	        }

	        System.out.println("Enter the policy number");
	        int policyNumber = s.nextInt();

	        System.out.println("Enter the name");
	        String customerName = s.next();

	        System.out.println("Enter the age");
	        int customerAge = s.nextInt();

	        System.out.println("Enter the base premium amount");
	        double basePremium = s.nextDouble();

	        System.out.println("Enter the Status (ACTIVE / EXPIRED)");
	        String statusInput = s.next().toUpperCase();

	        PolicyStatus policyStatus;
	        try {
	            policyStatus = PolicyStatus.valueOf(statusInput);
	        } catch (IllegalArgumentException e) {
	            System.err.println("Invalid policy status!");
	            return;
	        }

	        Policy policy;

	        if (policyType == PolicyType.HEALTH) {
	            System.out.println("Application for Health Insurance");
	            policy = new HealthInsurance(
	                    policyNumber,
	                    customerName,
	                    customerAge,
	                    basePremium,
	                    policyStatus
	            );

	        } else if (policyType == PolicyType.LIFE) {
	            System.out.println("Application for Life Insurance");
	            policy = new LifeInsurance(
	                    policyNumber,
	                    customerName,
	                    customerAge,
	                    basePremium,
	                    policyStatus
	            );

	        } else if (policyType == PolicyType.VEHICLE) {
	            System.out.println("Application for Vehicle Insurance");
	            policy = new VehicleInsurance(
	                    policyNumber,
	                    customerName,
	                    customerAge,
	                    basePremium,
	                    policyStatus
	            );

	        } else {
	            System.out.println("Application for Travel Insurance");
	            policy = new TravelInsurance(
	                    policyNumber,
	                    customerName,
	                    customerAge,
	                    basePremium,
	                    policyStatus
	            );
	        }

	        policyMap.put(policyNumber, policy);

	        System.out.println("\n----- Stored Policies -----");
	        for (Map.Entry<Integer, Policy> entry : policyMap.entrySet()) {
	            System.out.println(
	                    "Policy Number: " + entry.getKey() +
	                    " | Policy Details: " + entry.getValue()
	            );
	        }

	}
	 public void search()
	 {
		 System.out.println("Enter the Policy Number");
		 int policyNumber=s.nextInt();
		 System.out.println("\n----- Stored Policies -----");
		 boolean found=false;
	        for (Map.Entry<Integer, Policy> entry : policyMap.entrySet()) {
	        	
	            if(policyNumber==entry.getKey())
	            {
	            	found=true;
	            	System.out.println(
		                    "Policy Number: " + entry.getKey() +
		                    " | Policy Details: " + entry.getValue()
		            );
	            	return;
	            }
	            
	        }
	        if(!found)
            {
            	System.out.println("Not found any policy on this number");
            }

		 
	 }
	 public void countForActiveorExpired() {

		    int activeCount = 0;
		    int expiredCount = 0;

		    for (Map.Entry<Integer, Policy> entry : policyMap.entrySet()) {

		        Policy policy = entry.getValue();

		        if (policy.getPolicyStatus() == PolicyStatus.ACTIVE) {
		            activeCount++;
		        } else if (policy.getPolicyStatus() == PolicyStatus.EXPIRED) {
		            expiredCount++;
		        }
		    }

		    System.out.println("Active Policies  : " + activeCount);
		    System.out.println("Expired Policies : " + expiredCount);
		}
	 public void searchForActiveorExpired() {

		  
		 
		  while(true)
		  {
			  System.out.println("================================");
			  System.out.println("Select an option:");
			  System.out.println("A - Active accounts");
			  System.out.println("E - Expired accounts");
			  System.out.println("T - Terminate");
			  System.out.println("================================");

			  String input=s.next();
			  PolicyStatus p;
			  if(input.equalsIgnoreCase("A"))
			  {
				  p=PolicyStatus.ACTIVE;
				  for (Map.Entry<Integer, Policy> entry : policyMap.entrySet()) {

				        Policy policy = entry.getValue();

				        if (policy.getPolicyStatus() == PolicyStatus.ACTIVE) {
				            System.out.println("Policy Number: " + entry.getKey() +
				                    " | Policy Details: " + entry.getValue());
				        
				        }
				    }
				  
			  }
			  else if(input.equalsIgnoreCase("E"))
			  {
				  p=PolicyStatus.EXPIRED;
				  for (Map.Entry<Integer, Policy> entry : policyMap.entrySet()) {

				        Policy policy = entry.getValue();

				        if (policy.getPolicyStatus() == PolicyStatus.EXPIRED) {
				            System.out.println("Policy Number: " + entry.getKey() +
				                    " | Policy Details: " + entry.getValue());
				        
				        }
				    }
			  }
			  else if(input.equalsIgnoreCase("T"))
				  break;
		  }
			  
			  
		   

		   
		}

}
