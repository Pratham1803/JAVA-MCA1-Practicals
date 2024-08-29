// 13. Write a Java program to create a package for EBook details class Book having Book Name, Price and Author name and import the created package using import  keyword  where we can create the object of Book class and access the method of that class.

package book; // package name

import java.util.Scanner; // importing Scanner class

public class Ebook { // class name
    private String bookName; // instance variables
    private double price; // instance variables
    private String authorName; // instance variables

    public void addBook(Scanner sc) { // method to add book details
        System.out.println("|------------ Add Book ------------|"); // printing message
        System.out.print("Enter book name: "); // printing message
        bookName = sc.nextLine(); // taking input from user
        System.out.print("Enter price: "); // printing message
        price = sc.nextDouble(); // taking input from user
        sc.nextLine(); // clearing buffer
        System.out.print("Enter author name: "); // printing message
        authorName = sc.nextLine(); // taking input from user
        System.out.println("-----------------------------------------------------"); // printing message
    }

    public void displayBook() { // method to display book details
        System.out.println("|------------ Book Details ------------|\n"); // printing message

        System.out.println("\t- Book Name: " + bookName); // printing message 
        System.out.println("\t- Price: " + price); // printing message
        System.out.println("\t- Author Name: " + authorName); // printing message

        System.out.println("-----------------------------------------------------"); // printing message
    }
}
