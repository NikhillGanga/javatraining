package com.phone.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Driver {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Map<Phone1,Contact> phoneNumber = new HashMap<Phone1,Contact>();

       phoneNumber.put(new Phone1(new Contact(9875432130L), "Nikhil"), new Contact(9875432130L));
       phoneNumber.put(new Phone1(new Contact(7889262782L), "Vishal"), new Contact(7889262782L));

       for(Map.Entry<Phone1, Contact> entry : phoneNumber.entrySet())
	   {
		   System.out.println("Name:"+entry.getKey().getName()+"  Number:"+entry.getValue().getContactNumber());
	   }
       
       while(true)
       {
    	   System.out.println("For \nAdding press A  \nDelete press D \nView all press V \npress E for exit");
           String input = s.next();

           if (input.equalsIgnoreCase("V")) {

           	System.out.println("List of All contacts");
           	System.out.println("====================");
            for(Map.Entry<Phone1, Contact> entry : phoneNumber.entrySet())
     	   {
     		   System.out.println("Name:"+entry.getKey().getName()+"  Number:"+entry.getValue().getContactNumber());
     	   }

           } else if (input.equalsIgnoreCase("A")) {

              

               s.nextLine(); 

               System.out.println("Enter Name");
               String name = s.nextLine();

               System.out.println("Enter Phone Number");
               long number = s.nextLong();
               boolean found=true;
               for(Map.Entry<Phone1, Contact> entry : phoneNumber.entrySet())
        	   {
            	   if(entry.getKey().equals(number))
        		  found=false;
            	   System.out.println("This number is available:"+number);
            	   break;
        	   }
               if(found)
               {
            	   
                   phoneNumber.put(new Phone1(new Contact(number), "Vishal"), new Contact(number));

            	   
               }

               System.out.println("List of All contacts");
           	System.out.println("====================");
               
            for(Map.Entry<Phone1, Contact> entry : phoneNumber.entrySet())
     	   {
     		   System.out.println("Name:"+entry.getKey().getName()+"  Number:"+entry.getValue().getContactNumber());
     	   }
           } else if (input.equalsIgnoreCase("D")) {

           	System.out.println("Enter Phone Number to delete");
           	long number = s.nextLong();

            for(Map.Entry<Phone1, Contact> entry : phoneNumber.entrySet())
     	   {
            	 if(entry.getKey().equals(number))
            	 {
            		 phoneNumber.remove(number);
            		 break;
     	   }
           	
           	    
           	    
           	}
           	
           	
           	System.out.println("List of All contacts");
           	System.out.println("====================");
            for(Map.Entry<Phone1, Contact> entry : phoneNumber.entrySet())
     	   {
     		   System.out.println("Name:"+entry.getKey().getName()+"  Number:"+entry.getValue().getContactNumber());
     	   }

           }
           
           else if(input.equalsIgnoreCase("E"))
        	   break;
       }
        
    }
}
