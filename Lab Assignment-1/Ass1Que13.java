// 13. Write a Java program to create a package for EBook details class Book having Book Name, Price and Author name and import the created package using import  keyword  where we can create the object of Book class and access the method of that class.

import java.util.Scanner; // importing Scanner class

import book.Ebook; // importing Ebook class from book package

public class Ass1Que13 { // class name
    private static Scanner sc; // instance variables
    private static Ebook ebook; // instance variables

    public static void main(String[] args) { // main method
        sc = new Scanner(System.in); // creating object of Scanner class
        ebook = new Ebook(); // creating object of Ebook class

        ebook.addBook(sc); // calling addBook method
        ebook.displayBook(); // calling displayBook method
    }
}