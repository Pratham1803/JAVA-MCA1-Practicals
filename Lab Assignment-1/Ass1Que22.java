// 22. Write a Java program to demonstrate the behavior of ArrayList, Vector class of collections Framework. 

import java.util.ArrayList; // Importing ArrayList class from java.util package
import java.util.Vector; // Importing Vector class from java.util package

public class Ass1Que22 {
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
        System.out.println("Element at index 2: " + al.get(2)); // Printing element at index 2
        al.remove(2); // Removing element at index 2
        System.out.println("ArrayList after removing element at index 2: " + al); // Printing ArrayList
        System.out.println("Size: " + al.size()); // Printing size of ArrayList
        System.out.println("\n!---------------------------------------------!\n");

        // Vector
        System.out.println("\n!------------- Vector ----------------!\n");
        Vector<Integer> v = new Vector<Integer>(); // Creating Vector object
        v.add(10); // Adding element to Vector
        v.add(20); // Adding element to Vector
        v.add(30); // Adding element to Vector
        v.add(40); // Adding element to Vector
        v.add(50); // Adding element to Vector
        System.out.println("Vector: " + v); // Printing Vector
        System.out.println("Size: " + v.size()); // Printing size of Vector
        System.out.println("Element at index 2: " + v.get(2)); // Printing element at index 2
        v.remove(2); // Removing element at index 2
        System.out.println("Vector after removing element at index 2: " + v); // Printing Vector
        System.out.println("Size: " + v.size()); // Printing size of Vector
        System.out.println("\n!---------------------------------------------!\n");
    }   
}
