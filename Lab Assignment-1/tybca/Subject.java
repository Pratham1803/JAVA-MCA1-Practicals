// 12. Write a Package TYBCA which has two classes Subject and Marks. Subject Class is for accepting Subjects and Marks class is to accept marks. Create a main class which will use package and calculate total marks and percentage.

package tybca; // package declaration

import java.util.ArrayList; // import ArrayList class from java.util package
import java.util.Scanner; // import Scanner class from java.util package

public class Subject { // public class Subject
    private ArrayList<String> subjects; // private instance variable subjects of type ArrayList<String>
    private Scanner sc; // private instance variable sc of type Scanner

    public Subject(Scanner sc) { // constructor with Scanner object as argument
        subjects = new ArrayList<String>(); // initialize subjects as a new ArrayList<String>
        this.sc = sc; // initialize sc with the passed Scanner object
    }

    public void addSubject() { // method to add subjects
        int n = 0; // declare and initialize n as 0
        System.out.print("Enter number of subjects: "); // print message
        n = sc.nextInt(); // read integer input from user and store in n

        for (int i = 0; i < n; i++) { // loop through n times
            System.out.print("Enter subject " + (i + 1) + ": "); // print message
            subjects.add(sc.next()); // read input from user and add to subjects
        }
    }

    public ArrayList<String> getSubjects() { // method to get subjects
        return subjects; // return subjects
    }
}