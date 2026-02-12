package com.multithreading.demo;

public class NumberThread implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println("Currect thread is: "+Thread.currentThread().getName()+"-"+i);
		
	}

}
