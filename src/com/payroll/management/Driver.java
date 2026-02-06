package com.payroll.management;

public class Driver {

    public static void main(String[] args) {

        Employee employee1 = new Permanent("101", "Rahul Sharma", "IT", "Permanent", 10000, 0, 0);
        Employee employee2 = new Contract("102", "Anjali Verma", "HR", "Contract", 0, 160, 300);
        Employee employee3 = new Permanent("103", "Mohit Singh", "Finance", "Permanent", 45000, 8000, 0);
        Employee employee4 = new Contract("104", "Priya Nair", "IT", "Contract", 0, 0, 250);
        Employee employee5 = new Permanent("105", "Arjun Mehta", "IT", "Permanent", 20000, 7000, 0);

        Employee[] employees = {
            employee1, employee2, employee3, employee4, employee5
        };

        // Header
        System.out.printf(
            "%-6s %-15s %-12s %-12s %-12s %-10s %-14s %-12s %-12s%n",
            "EmpID", "Name", "Department", "Type",
            "BaseSalary", "HRA", "HoursWorked", "HourlyRate", "FinalSalary"
        );

        System.out.println(
            "------------------------------------------------------------------------------------------------------------"
        );

        for (Employee e : employees) {

            // Step 1: calculate salary
            e.calculateSalary();

            if (e instanceof Permanent) {
                Permanent p = (Permanent) e;

                System.out.printf(
                    "%-6s %-15s %-12s %-12s %-12.2f %-10.2f %-14s %-12s %-12.2f%n",
                    p.getEmpId(),
                    p.getName(),
                    p.getDepartment(),
                    p.getType(),
                    p.getBaseSalary(),
                    p.getHra(),
                    "-",
                    "-",
                    p.calculateSalary()
                );

            } else if (e instanceof Contract) {
                Contract c = (Contract) e;

                System.out.printf(
                    "%-6s %-15s %-12s %-12s %-12s %-10s %-14.2f %-12.2f %-12.2f%n",
                    c.getEmpId(),
                    c.getName(),
                    c.getDepartment(),
                    c.getType(),
                    "-",
                    "-",
                    c.getHoursWorked(),
                    c.getHourlyRate(),
                    c.calculateSalary()
                );
            }
        }
    }
}
