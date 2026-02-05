package com.bank.account;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);
        Customer customer = new Customer(
            "C001",
            "Nikhil",
            "nikhil@gmail.com"
        );

        Account account = new SavingsAccount(
            "ACC123",
            customer
        );
        

        account.deposit(5000);
     
     //   Bank.setBankBalance(10000);
        System.out.println("Your Bank Balance is : "+account.getBalance());
       
        

        System.out.println("For withdraw Press W or For Deposit Press D");
        String press = s.next();
        if (press.equalsIgnoreCase("W")) {
            System.out.println("Enter withdraw amount");

            while (true) {
                try {
                    int value = s.nextInt();
                   account.withdraw(value);
                    break;
                } catch (InputMismatchException e) {
                    System.err.println("Please enter numbers only!");
                    s.next();
                }
            }
        }
        else if (press.equalsIgnoreCase("D")) {
            System.out.println("Enter deposit Amount");

            while (true) {
                try {
                    int value = s.nextInt();
                     account.deposit(value);
                    break;
                } catch (InputMismatchException e) {
                    System.err.println("Please enter numbers only!");
                    s.next();
                }
            }
        }


        System.out.println("Customer Name: " + account.getCustomer().getCustomerName());
        System.out.println("Balance: " + account.getBalance());
    }
}
