package com.multithreading.consumer;

public class Driver {

	public static void main(String[] args) {
		SharedResources shared=new SharedResources();
		Thread consumer=new Thread(()->
		
				shared.consumer()
				,"Thread-1");
		Thread producer=new Thread(()->{
			try {
				Thread.sleep(100);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			shared.producer("Hello");
			shared.consumer();
		},"Thread-2");
		consumer.start();
		producer.start();
	}
}
