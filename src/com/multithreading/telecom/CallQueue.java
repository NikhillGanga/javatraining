package com.multithreading.telecom;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.function.Supplier;

public class CallQueue {

	public static void main(String[] args) {
		//Queue<CallRequest> callRequests = new LinkedList<>();

		Customer c1 = new Customer("C001", "Nikhil", 7995892163L, 20);
		Customer c2 = new Customer("C002", "Rahul", 7995892164L, 50);
		Customer c3 = new Customer("C003", "Anjali", 7995892165L, 100);

		CallRequest r1 = new CallRequest(c1, "R001", 7995892163L, 5);
		CallRequest r2 = new CallRequest(c2, "R002", 7995892164L, 3);
		CallRequest r3 = new CallRequest(c3, "R003", 7995892165L, 7);

		
//		callRequests.add(r1);
//		callRequests.add(r2);
//		callRequests.add(r3);
		//int recharge=23;
		
		Thread t1=new Thread(
				()->r1.getCustomer().makeCall(r1.getMinutes())
				);
		Thread t2=new Thread(
				()->r2.getCustomer().makeCall(r2.getMinutes())
				);
		Thread t3=new Thread(
				()->r3.getCustomer().makeCall(r3.getMinutes())
				);
		Random random = new Random();

        

        Queue<Thread> thread=new LinkedList<Thread>();
            thread.add(t1);
            thread.add(t2);
            thread.add(t3);
		
            for(Thread t:thread)
            {
            	Supplier<String> otp = () -> 
                String.format("%04d", random.nextInt(1_00_0));
              Integer sleep1=Integer.parseInt(otp.get());
              System.out.println(sleep1);
              try {
				t.sleep(sleep1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
              t.start();
            }
			
			
		
		
	}
}
