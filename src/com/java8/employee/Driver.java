package com.java8.employee;

import java.util.Scanner;
import java.util.function.DoubleFunction;
import java.util.function.Function;

public class Driver {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		Employee employee1 =new Employee("E001", "Nikhil", 1000);
		Employee employee2=new Employee("E002", "Vishal", 107456);
		System.out.println(employee1);
		System.out.println(employee2);
		
		
		Function<Double,Double>p1=n->n+(n*0.15);
		employee1.setSalary(p1.apply(employee1.getSalary()));
		DoubleFunction<Double>p2=n->n+(n*0.15);
		employee2.setSalary(p2.apply(employee2.getSalary()));
		System.out.println("||=====After Revised Salary======||");
		System.out.println(employee1);
		System.out.println(employee2);
		
		
		
	}
}
