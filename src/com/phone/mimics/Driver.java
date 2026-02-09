package com.phone.mimics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Driver {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        List<Phone> phoneNumber = new ArrayList<>();

        phoneNumber.add(new Phone( "Nikhil", 9875432130L));
        phoneNumber.add(new Phone( "Vishal", 7889262782L));

       while(true)
       {
    	   System.out.println("For \nAdding press A  \nDelete press D \nView all press V \npress E for exit");
           String input = s.next();

           if (input.equalsIgnoreCase("V")) {

           	System.out.println("List of All contacts");
           	System.out.println("====================");
               for (Phone p : phoneNumber) {
                   System.out.println(p);
               }

           } else if (input.equalsIgnoreCase("A")) {

              

               s.nextLine(); 

               System.out.println("Enter Name");
               String name = s.nextLine();

               System.out.println("Enter Phone Number");
               long number = s.nextLong();
               boolean found=true;
               for (int i = 0; i < phoneNumber.size(); i++) {
           	    if (phoneNumber.get(i).getContactNumber() == number) {
           	       System.err.println("This Number already available for this Name:"+phoneNumber.get(i).getName());
           	       found=false;
           	        break;   
           	    }
           	  }
               if(found)
               {
               	phoneNumber.add(new Phone(name, number));
               }

               System.out.println("List of All contacts");
           	System.out.println("====================");
               
               for (Phone p : phoneNumber) {
                   System.out.println(p);
               }

           } else if (input.equalsIgnoreCase("D")) {

           	System.out.println("Enter Phone Number to delete");
           	long number = s.nextLong();

           	for (int i = 0; i < phoneNumber.size(); i++) {
           	    if (phoneNumber.get(i).getContactNumber() == number) {
           	        phoneNumber.remove(i);
           	        break;   
           	    }
           	    
           	    
           	}
           	
           	
           	System.out.println("List of All contacts");
           	System.out.println("====================");
                    for (Phone p : phoneNumber) {
                        System.out.println(p);
                    }


           }
           
           else if(input.equalsIgnoreCase("E"))
        	   break;
       }
        

    }
}
