// 17. Write program to accept rollno, marks of four subjects in an array from user and  throw MarksOutOf BoundsException if marks are  < 0 or marks  > 100.Also check ArrayIndexOutofBoundsException.

import java.util.Scanner; // Importing Scanner class from java.util package

class MarksOutOfBoundsException extends Exception { // User defined exception class
    public MarksOutOfBoundsException(String message) { // Constructor
        super(message); // Calling super class constructor
    }
}

class Result{
    private int rollNo;
    private int[] marks;

    Result() {
        this.marks = new int[4];
    }

    public void setResult(){
        Scanner sc = new Scanner(System.in); // Creating Scanner object

        try { // Try block
            System.out.print("Enter your roll number: "); // Asking user to enter roll number
            rollNo = sc.nextInt(); // Taking input from user

            for (int i = 0; i < marks.length; i++) { // Loop to iterate through marks
                System.out.print("Enter marks for subject " + (i + 1) + ": "); // Asking user to enter marks
                marks[i] = sc.nextInt(); // Taking input from user
                if (marks[i] < 0 || marks[i] > 100) { // Checking if marks are less than 0 or greater than 100
                    throw new MarksOutOfBoundsException("MarksOutOfBoundsException"); // Throwing user defined exception
                }
            }
            display(); // Calling display method
        } catch (MarksOutOfBoundsException e) { // Catch block
            System.out.println(e); // Printing exception message
        } catch (Exception e) { // Catch block
            System.out.println("Invalid Input"); // Printing message
        }
        sc.close(); // Closing Scanner object
    }

    private void display() { // Method to display details
        System.out.println("\n!------------- Student Result ----------------!\n"); // Printing separator
        System.out.println("\t- Roll No: " + rollNo); // Printing rollNo
        System.out.println("\t- Marks: "); // Printing marks
        for (int i = 0; i < marks.length; i++) { // Loop to iterate through marks
            System.out.println("\t\t: Subject " + (i + 1) + ": " + marks[i]); // Printing marks
        }
        System.out.println("\n!---------------------------------------------!\n"); // Printing separator
    }
}

class Ass1Que17 { // Main class
    public static void main(String[] args) { // Main method
        Result r = new Result(); // Creating object of Result class
        r.setResult(); // Calling setResult method
    }
}