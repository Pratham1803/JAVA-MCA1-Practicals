// 15. Write an application that will accept age from user and find whether it is greater than 18 or not. If it is less than 18 generate an user defined exception "Not Eligible for Voting". 

import java.util.Scanner; // Importing Scanner class from java.util package

class NotEligibleForVoting extends Exception { // User defined exception class
    public NotEligibleForVoting(String message) { // Constructor
        super(message); // Calling super class constructor
    }
}

public class Ass1Que15 { // Main class
    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Creating Scanner object
        try { // Try block
            System.out.print("Enter your age: "); // Asking user to enter age
            int age = sc.nextInt(); // Taking input from user
            if (age < 18) { // Checking if age is less than 18
                throw new NotEligibleForVoting("Not Eligible for Voting"); // Throwing user defined exception
            } 
            System.out.println("Eligible for Voting"); // Printing message
        } catch (NotEligibleForVoting e) { // Catch block
            System.out.println(e); // Printing exception message
        } catch (Exception e) { // Catch block
            System.out.println("Invalid Input"); // Printing message
        }
        sc.close(); // Closing Scanner object
    }   
}