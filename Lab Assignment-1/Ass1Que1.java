// 1. Write a program to accept Student information such as roll no, name, course and fees using suitable method and display the same. 

import java.util.Scanner; // Importing Scanner class from java.util package

class Student{ // Student class with private data members and public methods
    private String rollNo; // Private data members To Store Roll Number
    private String name; // Private data members To Store Name
    private String course; // Private data members To Store Course
    private double fees; // Private data members To Store Fees

    public void getData(){ // Method to get data from user
        Scanner sc = new Scanner(System.in); // Creating Scanner object
        System.out.print("Enter Roll No: "); // Asking user to enter Roll Number
        rollNo = sc.nextLine(); // Storing Roll Number
        System.out.print("Enter Name: "); // Asking user to enter Name
        name = sc.nextLine(); // Storing Name
        System.out.print("Enter Course: "); // Asking user to enter Course
        course = sc.nextLine(); // Storing Course
        System.out.print("Enter Fees: "); // Asking user to enter Fees
        fees = sc.nextDouble(); // Storing Fees
        sc.close(); // Closing Scanner object
    }

    public void displayData(){ // Method to display data
        System.out.println("\n-> Student Information: "); // Displaying Student Information
        System.out.println("\tRoll No: " + rollNo); // Displaying Roll Number
        System.out.println("\tName: " + name); // Displaying Name
        System.out.println("\tCourse: " + course); // Displaying Course
        System.out.println("\tFees: " + fees); // Displaying Fees
    }
} 

public class Ass1Que1{ // Main class
    public static void main(String[] args){ // Main method
        Student s = new Student(); // Creating object of Student class
        s.getData(); // Calling getData method
        s.displayData(); // Calling displayData method
    }
}