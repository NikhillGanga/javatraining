package com.policy.insurance;

import java.util.Scanner;

public class Driver {

    enum PolicyType {
        HEALTH, LIFE, VEHICLE, TRAVEL
    }

    public static void main(String[] args) {

       Scanner s =new Scanner(System.in);
      
       Insurance insurance=new Insurance();
       while(true)
       {
    	   System.out.println("""
    			   =================================
    			           INSURANCE MENU
    			   =================================
    			   A - Add Policy
    			   S - Search Policy
    			   C - Count Policies
    			   T - Active / Expired Count
    			   E - Exit
    			   =================================
    			   """);
           String input=s.next();
    	   if(input.equalsIgnoreCase("A"))
           {
           	insurance.add();
           	
           }
           else if(input.equalsIgnoreCase("S"))
           {
           	insurance.search();
           }
           else if(input.equalsIgnoreCase("C"))
           {
        	   insurance.countForActiveorExpired();
           }
           else if(input.equalsIgnoreCase("T"))
           {
        	   insurance.searchForActiveorExpired();
           }
           else if(input.equalsIgnoreCase("E"))
           break;
       }
    }
}
