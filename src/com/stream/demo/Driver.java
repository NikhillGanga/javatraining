package com.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
	    List<Integer> list = Arrays.asList(2, 1, 3, 2, 3, 4);

	    List<Integer> sortedList = list.stream()
	            .filter(n -> n % 2 != 0)
	            .map(x -> x * x)
	            .sorted()
	            .collect(Collectors.toList());

	    System.out.println(sortedList);
	}

}
