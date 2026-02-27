package com.stream.filter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;



public class Driver {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Nikhil", 50000));
        employees.add(new Employee(2, "Rahul", 70000));
        employees.add(new Employee(3, "Anjali", 60000));
        employees.add(new Employee(4, "Vikram", 80000));

        Optional<Employee> secondHighest = employees.stream()
                .map(Employee::getSalary)        // get all salaries
                .distinct()                     // remove duplicate salaries
                .sorted(Comparator.reverseOrder()) // sort descending
                .skip(1)                        // skip highest
                .findFirst()                    // get second highest salary
                .flatMap(secondSalary ->
                        employees.stream()
                                .filter(e -> e.getSalary() == secondSalary)
                                .findFirst()
                );

        if (secondHighest.isPresent()) {
            System.out.println("Second Highest Salary Employee:");
            System.out.println(secondHighest.get());
        } else {
            System.out.println("Not enough employees.");
        }
    }
}
