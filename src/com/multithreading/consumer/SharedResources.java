package com.multithreading.consumer;

public class SharedResources {

	String data;
	static volatile boolean flag=false;
	
	
	public String getData() {
		return data;
	}
	public synchronized  void producer(String data) {
		while(flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.data=data;
		flag=true;
		notify();
	}
	public synchronized  void consumer()
	{
		while(!flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(getData());
		flag=false;
		notify();
	}
	
}
