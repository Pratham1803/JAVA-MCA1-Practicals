// 1. Write a program to accept Student information such as roll no, name, course and fees using suitable method and display the same. 

import java.util.Scanner; // Importing Scanner class from java.util package

class Student{ // Student class
    String rollNo; // Instance variables to store student Roll number
    String name; // Instance variables to store student Name
    String course; // Instance variables to store student Course
    double fees; // Instance variables to store student Fees

    void accept(){ // Method to accept student information
        Scanner sc = new Scanner(System.in); // Creating Scanner object
        System.out.print("Enter Roll No: "); // Asking user to enter Roll number
        rollNo = sc.nextLine(); // Accepting Roll number
        System.out.print("Enter Name: "); // Asking user to enter Name
        name = sc.nextLine(); // Accepting Name
        System.out.print("Enter Course: "); // Asking user to enter Course
        course = sc.nextLine(); // Accepting Course
        System.out.print("Enter Fees: "); // Asking user to enter Fees
        fees = sc.nextDouble(); // Accepting Fees
        sc.close(); // Closing Scanner object
    }

    void display(){ // Method to display student information
        System.out.println("!-------- Student Information --------!\n"); // Displaying message
        System.out.println("\tRoll No: " + rollNo); // Displaying Roll number
        System.out.println("\tName: " + name); // Displaying Name
        System.out.println("\tCourse: " + course); // Displaying Course
        System.out.println("\tFees: " + fees); // Displaying Fees
        System.out.println("\n!------------------------------------!\n"); // Displaying message
    }
}

public class Ass1Pro1 { // Main class
    public static void main(String[] args) { // Main method
        Student s = new Student(); // Creating Student object   
        s.accept(); // Calling accept method
        s.display(); // Calling display method
    }
}