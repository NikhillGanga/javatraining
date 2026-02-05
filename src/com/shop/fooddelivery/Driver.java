package com.shop.fooddelivery;

import java.util.Scanner;

import com.company.insurance.HealthInsurance;
import com.company.insurance.LifeInsurance;
import com.company.insurance.VehicleInsurance;

public class Driver {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
	
		
		System.out.println("PRESS NUMBER \nPress 1 for:Restaurant Order \nPress 2 for:Cloud Kitchen Order \nPress 3 for:Grocery Order");
		
		int number=s.nextInt();
		
		switch(number)
		{
		case 1:
		{
			System.out.println("For Restaurant Order");
			System.out.println("Enter Name");
			String name=s.next();
			System.out.println("Enter Amount");
			double amount=s.nextDouble();
			
			RestaurantOrder restaurant =new RestaurantOrder();
			restaurant.setCustomerName(name);
			restaurant.setOrderAmount(amount);
			System.out.println(restaurant.getOrderDetails());
			
			break;
		}
		case 2:
		{
			System.out.println("For Cloud Kitchen Order");
			System.out.print("Enter Name:");
			String name=s.next();
			System.out.println("Enter distance");
			int distance=s.nextInt();
			System.out.println("Enter Amount");
			double amount=s.nextDouble();
			CloudKitchenOrder cloud=new CloudKitchenOrder();
			cloud.setCustomerName(name);
			cloud.setDeliveryDistanceInKm(distance);
			cloud.setOrderAmount(amount);
			System.out.println(cloud.getOrderDetails());
			break;
		}
		case 3:
		{
			System.out.println("For Grocery Order");
			System.out.println("Enter Name");
			String name=s.next();
			System.out.println("Enter amount");
			double amount=s.nextDouble();
			System.out.println("Enter MemberShip true or false");
			boolean  memberShip =s.nextBoolean();
			GroceryOrder grocery =new GroceryOrder();
			grocery.setCustomerName(name);
			grocery.setMemberShip(memberShip);
			grocery.setOrderAmount(amount);
			System.out.println(grocery.getOrderDetails());
			break;
		}
	}
	}
}
