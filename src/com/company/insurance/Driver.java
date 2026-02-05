package com.company.insurance;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	
		
		System.out.println("PRESS NUMBER \nPress 1 for:Health Insurance \nPress 2 for:Life Insurance \nPress 3 for:Vehicle Insurance");
		
		int number=s.nextInt();
		
		switch(number)
		{
		case 1:
		{
			System.out.println("Application for Health Insurance");
			System.out.println("Enter Name");
			String name=s.next();
			System.out.println("Enter Age");
			int age=s.nextInt();
			System.out.println("Enter Amount");
			double amount=s.nextDouble();
			
			HealthInsurance health=new HealthInsurance();
			health.setHolderName(name);
			health.setAge(age);
			health.setSumAssured(amount);
			System.out.println("Base Premium :"+health.getbasePremium());
			health.calculationRule(health.getSumAssured());
			break;
		}
		case 2:
		{
			System.out.print("Application for Life Insurance");
			System.out.print("Enter Name:");
			String name=s.next();
			System.out.println("Enter year");
			int year=s.nextInt();
			System.out.println("Enter Amount");
			double amount=s.nextDouble();
			LifeInsurance lifeinsurance=new LifeInsurance();
			lifeinsurance.setHolderName(name);
			lifeinsurance.setPolicyTerm(year);
			lifeinsurance.setSumAssured(amount);
			lifeinsurance.calculationRule(lifeinsurance.getSumAssured());
			break;
		}
		case 3:
		{
			System.out.println("Application for Vehicle Insurance");
			System.out.println("Enter Name");
			String name=s.next();
			System.out.println("Enter value");
			double amount=s.nextDouble();
			System.out.println("Enter Type 2 0r 4");
			int  type =s.nextInt();
			VehicleInsurance vehicle =new VehicleInsurance();
			vehicle.setHolderName(name);
			vehicle.setValue(amount);
			vehicle.setVehicleType(type);
			vehicle.calculationRule(vehicle.getValue());
			break;
		}
		
		
		
	}
	
	}
}
