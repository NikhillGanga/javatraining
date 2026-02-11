package com.java8.payment;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Driver {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Payment Details");
		System.out.print("Enter Payment ID:");
		String paymentId=s.next();
		System.out.print("Enter Amount:");
		double amount=s.nextDouble();
		Predicate<Double> predicate=n->n>0;
		String status = "";

		Consumer<String> consumer=n->System.out.println("Log:"+n);
		if (predicate.test(amount)) {
		    status = "Successful";
		    consumer.accept(status);
		}
		else if(!predicate.test(amount))
		{
			status="Failed";
			consumer.accept(status);
		}
		
		Random random = new Random();

		Supplier<String> generate = () -> {
		    long number = Math.abs(random.nextLong()) % 1_000_000_0000L; // 10 digits max
		    return "PT" + String.format("%010d", number);
		};

                String referenceId=generate.get();
         Payment payment=new Payment(paymentId, amount, status,referenceId);
         Function<Payment, String>function=n->n.toString();
         System.out.println(function.apply(payment));
		
	}
}
