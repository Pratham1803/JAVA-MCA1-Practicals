// 3. Create class Student with instance variables Stud id, name, address, marks1, marks2, marks3. Write constructor to initialize the instance variables. Also, create method result which display percentage and average marks based on three subject marks. 

import java.util.Scanner; // Importing Scanner class from java.util package

class Student{
    String studId; // Instance variable to store student ID
    String name; // Instance variable to store student Name
    String address; // Instance variable to store student Address
    double marks1; // Instance variable to store student Marks1
    double marks2; // Instance variable to store student Marks2
    double marks3; // Instance variable to store student Marks3

    Student(Scanner sc){ // Constructor to initialize instance variables
        System.out.print("Enter Student ID: "); // Asking user to enter Student ID
        studId = sc.nextLine(); // Accepting Student ID
        System.out.print("Enter Name: "); // Asking user to enter Name
        name = sc.nextLine(); // Accepting Name
        System.out.print("Enter Address: "); // Asking user to enter Address
        address = sc.nextLine(); // Accepting Address
        System.out.print("Enter Marks1: "); // Asking user to enter Marks1
        marks1 = sc.nextDouble(); // Accepting Marks1
        System.out.print("Enter Marks2: "); // Asking user to enter Marks2
        marks2 = sc.nextDouble(); // Accepting Marks2
        System.out.print("Enter Marks3: "); // Asking user to enter Marks3
        marks3 = sc.nextDouble(); // Accepting Marks3
    }

    void result(){ // Method to display percentage and average marks
        double total = marks1 + marks2 + marks3; // Calculating total marks
        double percentage = (total / 300) * 100; // Calculating percentage
        double average = total / 3; // Calculating average marks

        System.out.println("!-------- Student Result --------!\n"); // Displaying message
        System.out.println("\tStudent ID: " + studId); // Displaying Student ID
        System.out.println("\tName: " + name); // Displaying Name
        System.out.println("\tAddress: " + address); // Displaying Address
        System.out.println("\tMarks1: " + marks1); // Displaying Marks1
        System.out.println("\tMarks2: " + marks2); // Displaying Marks2
        System.out.println("\tMarks3: " + marks3); // Displaying Marks3
        System.out.println("\tTotal Marks: " + total); // Displaying total marks
        System.out.println("\tPercentage: " + percentage); // Displaying percentage
        System.out.println("\tAverage Marks: " + average); // Displaying average marks
        System.out.println("\n!--------------------------------!\n"); // Displaying message
    }
}

public class Ass1Pro3 {
    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Creating Scanner object
        
        Student s = new Student(sc); // Creating Student object
        s.result(); // Calling result method
        
        sc.close(); // Closing Scanner object
    }
}