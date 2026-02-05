package com.bank.account;


public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber, Customer customer) {
        super(accountNumber, customer);
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
    }

    @Override
    public void withdraw(int amount) {
    	if(balance-amount<=1000) {
    		System.err.println("Your Minimum balance is less than 1000");
    		return;
    	}
    	else if (amount > balance) {
            System.err.println("Insufficient Balance");
            return;
        }
        balance -= amount;
    }
}
