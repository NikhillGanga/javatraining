package com.multithreading.bank;

public class Bank {

	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}
	public synchronized void withdraw(double amount)
	{
		for(int i=0;i<3;i++)
		{
			if(amount<=balance)
			{
				balance-=amount;
				System.out.println(Thread.currentThread().getName()+" withdrawing:"+amount);
				System.out.println("Remaining Balance:"+balance);
			}
			else {
				System.out.println("Insufficient Balance");
			}
		}
	}
}
