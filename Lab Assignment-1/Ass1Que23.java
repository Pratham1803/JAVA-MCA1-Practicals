// 23.  Demonstrate the working of Iterator & ListIterator interface in java. 

import java.util.ArrayList; // Importing ArrayList class from java.util package
import java.util.Iterator; // Importing Iterator class from java.util package
import java.util.ListIterator; // Importing ListIterator class from java.util package

public class Ass1Que23 {
    public static void main(String[] args) {
        // ArrayList
        System.out.println("\n!------------- ArrayList ----------------!\n");
        ArrayList<Integer> al = new ArrayList<Integer>(); // Creating ArrayList object
        al.add(10); // Adding element to ArrayList
        al.add(20); // Adding element to ArrayList
        al.add(30); // Adding element to ArrayList
        al.add(40); // Adding element to ArrayList
        al.add(50); // Adding element to ArrayList
        System.out.println("ArrayList: " + al); // Printing ArrayList
        System.out.println("Size: " + al.size()); // Printing size of ArrayList
        System.out.println("\n!---------------------------------------------!\n");

        // Iterator
        System.out.println("\n!------------- Iterator ----------------!\n");
        Iterator<Integer> itr = al.iterator(); // Creating Iterator object
        while(itr.hasNext()) { // Loop to iterate through ArrayList
            System.out.println(itr.next()); // Printing element
        }
        System.out.println("\n!---------------------------------------------!\n");

        // ListIterator
        System.out.println("\n!------------- ListIterator ----------------!\n");
        ListIterator<Integer> litr = al.listIterator(); // Creating ListIterator object
        while(litr.hasNext()) { // Loop to iterate through ArrayList
            System.out.println(litr.next()); // Printing element
        }
        System.out.println("\n!---------------------------------------------!\n");
    }   
}