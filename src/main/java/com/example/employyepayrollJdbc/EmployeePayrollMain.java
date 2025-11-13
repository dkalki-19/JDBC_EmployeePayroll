package com.example.employyepayrollJdbc;


public class EmployeePayrollMain {
    public static void main(String[] args) {
        EmployeePayrollDBService dbService = new EmployeePayrollDBService();
        dbService.readData();
        dbService.updateSalary("Terisa", 4000000.00);

    }
}
