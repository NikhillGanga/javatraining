package com.payroll.management;

public class Permanent implements Employee {

	String empId;
	String name;
	String department;
	String type;
	double baseSalary;
	double hra;
	double hoursWorked;
	
	
	
	public Permanent(String empId, String name, String department, String type, double baseSalary, double hra,
			double hoursWorked) {
		super();
		this.empId = empId;
		this.name = name;
		this.department = department;
		this.type = type;
		this.baseSalary = baseSalary;
		this.hra = hra;
		this.hoursWorked = hoursWorked;
	}
	@Override
	public double calculateSalary() {
		return baseSalary + hra;
		

	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) throws InvalidSalaryException {
	    if (baseSalary <= 0) {
	        throw new InvalidSalaryException("Enter valid amount");
	    }
	    this.baseSalary = baseSalary;
	}

	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) throws InvalidSalaryException  {
		 if (hoursWorked <= 0) {
		        throw new InvalidSalaryException("Enter valid Hours Worked");
		    }
		this.hoursWorked = hoursWorked;
	}
	
	
	
	
	
}
