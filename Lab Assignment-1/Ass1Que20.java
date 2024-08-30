// 20. Define an Employee class with suitable attributes having getSalary() method, which returns salary withdrawn by a particular employee. Write a class Manager which extends a class Employee, override the getSalary () method, which will return salary of manager by adding traveling allowance, house rent allowance etc.

import java.util.Scanner; // Importing Scanner class from java.util package

class Employee { // Employee class
    private double salary; // Private attribute salary

    public Employee(double salary) { // Parameterized constructor
        this.salary = salary; // Initializing salary
    }

    public double getSalary() { // Method to get salary
        return salary; // Returning salary
    }
}

class Manager extends Employee { // Manager class extending Employee class
    private double travelingAllowance; // Private attribute travelingAllowance
    private double houseRentAllowance; // Private attribute houseRentAllowance

    public Manager(double salary, double travelingAllowance, double houseRentAllowance) { // Parameterized constructor
        super(salary); // Calling super class constructor
        this.travelingAllowance = travelingAllowance; // Initializing travelingAllowance
        this.houseRentAllowance = houseRentAllowance; // Initializing houseRentAllowance
    }

    public double getSalary() { // Overriding getSalary method
        return super.getSalary() + travelingAllowance + houseRentAllowance; // Returning salary
    }
}

public class Ass1Que20 { // Main class
    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Creating Scanner object
        
        System.out.print("- Enter Manager's Salary: "); // Asking user to enter manager's salary
        double managerSalary = sc.nextDouble(); // Taking input from user

        System.out.print("- Enter Manager's Traveling Allowance: "); // Asking user to enter manager's traveling allowance
        double managerTravelingAllowance = sc.nextDouble(); // Taking input from user

        System.out.print("- Enter Manager's House Rent Allowance: "); // Asking user to enter manager's house rent allowance
        double managerHouseRentAllowance = sc.nextDouble(); // Taking input from user

        Manager m = new Manager(managerSalary,  managerTravelingAllowance, managerHouseRentAllowance); // Creating object of Manager class

        System.out.println("\n\t--> Manager's Total Salary: " + m.getSalary()); // Printing manager's salary


        System.out.print("\n- Enter Employee's Salary: "); // Asking user to enter employee's salary
        double employeeSalary = sc.nextDouble(); // Taking input from user

        Employee e = new Employee(employeeSalary); // Creating object of Employee class
        System.out.println("\n\t--> Employee's Salary: " + e.getSalary()); // Printing employee's salary
        
        sc.close(); // Closing Scanner object
    }   
}