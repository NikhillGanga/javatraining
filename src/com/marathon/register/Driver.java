package com.marathon.register;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Register register =new Register();
		
		


		System.out.println("Enter the details for Register marathon");
		
			try {
				while(true)
				{
					System.out.println("Enter Name");
					String name=s.nextLine();

					if(name.length()<4)
					{
						System.err.println("Minimum character has to be more than 4");
						
						continue;
					}
					register.setName(name);
					break;
				}
				while(true)
				{
					
					System.out.println("Enter age");
					int age=s.nextInt();
					
					if(age<18 || age>60)
					{
						System.err.println("Age between 18 to 60 will be accepted");
						continue;
					}
					register.setAge(age);
					break;
				}
				while(true)
				{
					System.out.println("Enter gender");
					String gender=s.next();
					
					if(!gender.equalsIgnoreCase("male") &&  !gender.equalsIgnoreCase("female") && !gender.equalsIgnoreCase("other")){
						System.err.println("only male, female and other gender will be accepted");
						continue;
						
					}
					register.setGender(gender);
					break;
				}
				while(true)
				{
					System.out.println("Enter contact number");
					String contact=s.next();
					
					String regex = "^[6-9]\\d{9}$";
					boolean valid = contact.matches(regex);
					if(!valid)
					{
						System.err.println("number should be 10 digit or start with 6,7,8,9 ");
						continue;
					}
					register.setContact(contact);
				
					break;
				}
				System.out.println("Registration Successfull\nName:"+register.getName()+"\nAge:"+register.getAge()+"\nGender:"+register.getGender()+"\nContact Details:"+register.getContact());
			}
			
			catch(InputMismatchException e)
			{
				System.err.println("Only letters will be accepted");
			}
			
			
		
		
	}
}
