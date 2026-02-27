package com.stream.filter;

	public class Employee {

	    private int empId;
	    private String empName;
	    private double salary;

	    // Constructor
	    public Employee(int empId, String empName, double salary) {
	        this.empId = empId;
	        this.empName = empName;
	        this.salary = salary;
	    }

	    // Getter
	    public double getSalary() {
	        return salary;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +
	                "empId=" + empId +
	                ", empName='" + empName + '\'' +
	                ", salary=" + salary +
	                '}';
	    }
	}

