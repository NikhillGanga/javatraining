package com.bank.training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Bank b = new Bank();

        //System.out.println("Enter bank balance");
        Bank.setBankBalance(10000);
        System.out.println("Your Bank Balance is : "+Bank.getBankBalance());
       
        

        System.out.println("For withdraw Press W or For Deposit Press D");
        String press = s.next();

        if (press.equalsIgnoreCase("W")) {
            System.out.println("Enter withdraw amount");

            while (true) {
                try {
                    int value = s.nextInt();
                    b.setWithdrawAmount(value);
                    b.withdraw();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter numbers only!");
                    s.next();
                }
            }
        }
        else if (press.equalsIgnoreCase("D")) {
            System.out.println("Enter deposit Amount");

            while (true) {
                try {
                    int value = s.nextInt();
                    b.setDepositAmount(value);
                    b.deposit();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter numbers only!");
                    s.next();
                }
            }
        }
    }
}
