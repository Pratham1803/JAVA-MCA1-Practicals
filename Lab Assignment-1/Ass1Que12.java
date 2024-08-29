// 12. Write a Package TYBCA which has two classes Subject and Marks. Subject Class is for accepting Subjects and Marks class is to accept marks. Create a main class which will use package and calculate total marks and percentage.

import java.util.Scanner; // import Scanner class from java.util package

import tybca.*; // import all classes from tybca package

public class Ass1Que12 { // public class Ass1Que12
    public static void main(String[] args) { // main method
        Scanner sc = new Scanner(System.in); // create Scanner object sc
        
        Subject s = new Subject(sc); // create Subject object s and pass Scanner object sc as argument
        s.addSubject(); // call addSubject method on object s
        
        Marks m = new Marks(s.getSubjects(),sc); // create Marks object m and pass ArrayList of subjects and Scanner object sc as arguments
        m.addMarks(); // call addMarks method on object m

        System.out.println("\n-------------------------------------------------------------------------------------\n"); // print a line
        System.out.println("\n!--------------------------------- Subject Report ---------------------------------!\n"); // print a line

        for(int i = 0; i < s.getSubjects().size(); i++) { // loop through all subjects
            System.out.println("\tSubject: " + s.getSubjects().get(i) + "\tMarks: " + m.getMarks().get(i)); // print subject and marks
        }

        System.out.println("\n\tTotal Marks: " + m.totalMarks()); // print total marks
        System.out.println("\tPercentage: " + m.percentage() + "%"); // print percentage
 
        System.out.println("\n-------------------------------------------------------------------------------------\n"); // print a line

        sc.close(); // close Scanner object sc
    }
}
