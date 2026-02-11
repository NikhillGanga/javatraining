package com.java8.feature;

import java.util.function.BiFunction;

public class LamdaDemo {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer>p1=(a,b)->a>b?a:b;
		
		System.out.println(p1.apply(23, 6));
		
		MyFunction obj=(a,b)->a+b;
		System.out.println(obj.sum(231, 123));
	}
}
