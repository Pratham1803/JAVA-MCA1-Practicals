// 12. Write a Package TYBCA which has two classes Subject and Marks. Subject Class is for accepting Subjects and Marks class is to accept marks. Create a main class which will use package and calculate total marks and percentage.

package tybca; // package declaration
 
import java.util.ArrayList; // import ArrayList class from java.util package
import java.util.Scanner; // import Scanner class from java.util package

public class Marks { // public class Marks
    private ArrayList<Integer> marks; // private instance variable marks of type ArrayList<Integer>
    private ArrayList<String> subjects; // private instance variable subjects of type ArrayList<String>
    private Scanner sc; // private instance variable sc of type Scanner

    public Marks(ArrayList<String> subjects,Scanner sc) { // constructor with ArrayList of subjects and Scanner object as arguments
        this.marks = new ArrayList<Integer>(); // initialize marks as a new ArrayList<Integer>
        this.subjects = subjects; // initialize subjects with the passed ArrayList of subjects
        this.sc = sc; // initialize sc with the passed Scanner object
    }

    public void addMarks(){ // method to add marks
        int n = this.subjects.size(); // declare and initialize n as the size of subjects
        sc.nextLine(); // consume the newline character

        System.out.println("\n\t!--------------------------------- Enter Marks ---------------------------------!\n"); // print a line

        for (int i = 0; i < n; i++) { // loop through n times
            System.out.print("\t- Enter marks for " + this.subjects.get(i) + ": "); // print message
            int number = sc.nextInt(); // read integer input from user and store in number
            this.marks.add(number); // add number to marks
        }
    }

    public int totalMarks() { // method to calculate total marks
        int total = 0; // declare and initialize total as 0
        for (int i = 0; i < this.marks.size(); i++) { // loop through all marks
            total += this.marks.get(i); // add mark to total
        } 
        return total; // return total
    }

    public double percentage() { // method to calculate percentage
        return (double) totalMarks() / this.marks.size(); // return total marks divided by number of subjects
    }

    public ArrayList<Integer> getMarks() { // method to get marks
        return marks; // return marks
    }
}