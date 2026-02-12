package com.multithreading.bank;

public class Driver {

	public static void main(String[] args) {
		Bank bank=new Bank(20000);
		Runnable task1=()->bank.withdraw(1000);
		Runnable task2=()->bank.withdraw(1000);
		Thread t1=new Thread(task1,"Thread-1");
		Thread t2=new Thread(task2,"Thread-2");
		t1.start();
		t2.start();
		
	}
}
