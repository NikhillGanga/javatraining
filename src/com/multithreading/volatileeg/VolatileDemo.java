package com.multithreading.volatileeg;

public class VolatileDemo {

	
		static volatile boolean flag=false;
		public static void main(String []args)
		{
			Thread t1=new Thread(()->{
				while(!flag)
				{
					System.out.println("Not updated");
				}
				System.out.println("Flag Updated");
			},"Thread-1");
			Thread t2=new Thread(()->{
				try {
					Thread.sleep(500);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				flag=true;
				System.out.println("Flag Updated by:"+Thread.currentThread().getName());
			},"Thread-2");
			t1.start();
			t2.start();
			
		}
	
}
