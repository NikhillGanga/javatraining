package com.stream.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        Employee e1 = new Employee("E001", "Nikhil", 6735, 35);
        Employee e2 = new Employee("E002", "Rahul", 500, 25);
        Employee e3 = new Employee("E003", "Anjali", 7200, 30);
        Employee e4 = new Employee("E004", "Priya", 400, 22);
        Employee e5 = new Employee("E005", "Karan", 9000, 40);

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5);

       
//        System.out.println("===== Salary > 5000 =====");
//        employees.stream()
//                .filter(emp -> emp.getSalary() > 5000)
//                .forEach(System.out::println);
//
//       
//        System.out.println("\n===== Sorted by Age =====");
//        employees.stream()
//                .sorted(Comparator.comparing(Employee::getAge))
//                .forEach(System.out::println);
//
//      
//        System.out.println("\n===== Adding 10% Salary ====");
//        employees.forEach(emp ->
//                emp.setSalary(emp.getSalary() * 1.10)
//        );
//        employees.forEach(System.out::println);
        
        System.out.println("\n===== Sorted by Age and who have greater than 5000 and add 10% hike =====");

        employees.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .filter(emp -> emp.getSalary() > 5000)
                .peek(emp -> emp.setSalary(emp.getSalary() * 1.10))
                .forEach(System.out::println);

      
      

      
    }
}
