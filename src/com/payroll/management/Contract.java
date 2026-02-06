package com.payroll.management;

public class Contract implements Employee {

	String empId;
	String name;
	String department;
	String type;
	double baseSalary;
	double hoursWorked;
	double hourlyRate;
	
	
	
	public Contract(String empId, String name, String department, String type, double baseSalary, double hoursWorked,
			double hourlyRate) {
		super();
		this.empId = empId;
		this.name = name;
		this.department = department;
		this.type = type;
		this.baseSalary = baseSalary;
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	@Override
	public double calculateSalary( ) {
		return hoursWorked*hourlyRate-((hoursWorked*hourlyRate)*0.10);
		
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
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked)throws InvalidSalaryException  {
		 if (hoursWorked <= 0) {
		        throw new InvalidSalaryException("Enter valid amount");
		    }
		this.hoursWorked = hoursWorked;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	
}
