package com.bank.account;

public abstract class Account {

    String accountNumber;
     Customer customer;
    int balance;

    public Account(String accountNumber, Customer customer) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = 0;
    }

    public abstract void deposit(int amount);
    public abstract void withdraw(int amount);

    public int getBalance() {
        return balance;
    }

    public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
        return customer;
    }
}
