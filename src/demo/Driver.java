package demo;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Library library=new Library();
		System.out.println("Library Management System");
		System.out.println("Press C for Create \nPress R for Read \nPress U for Update \nPress D for Delete \nPress E for Exit");
		
	
		
		while(true)
		{

			String input=s.next();
			if(input.equalsIgnoreCase("C"))
			{
				System.out.println("You selected for create operation");
				System.out.println("Enter Name");
				String name=s.next();
				System.out.println("Enter number");
				long number=s.nextLong();
				Member member=new Member(name,number);
		        library.write(member);
		        System.out.println("=================================");
				library.read();
				System.out.println("=================================");
		        
			}
			else if(input.equalsIgnoreCase("R"))
			{
				System.out.println("You selected for read operation");
		        System.out.println("=================================");
				library.read();
		        System.out.println("=================================");
			}
			else if(input.equalsIgnoreCase("U"))
			{
				System.out.println("You selected for update operation");
				System.out.println("=================================");
				library.read();
				System.out.println("=================================");
				System.out.println("Enter name");
				String name=s.next();
				System.out.println("Enter number");
				long number=s.nextLong();
			
				library.update(name, number);
			}
			else if(input.equalsIgnoreCase("D"))
			{
				System.out.println("You selected for delete operation");
				System.out.println("Enter Number");
				long number=s.nextLong();
				System.out.println("=================================");
				library.read();
				System.out.println("=================================");
				library.delete(number);
				
			}
			else if(input.equalsIgnoreCase("E"))
			{
				System.out.println("You selected for exit operation");
				break;
			}
			
				
		}
	}
}
