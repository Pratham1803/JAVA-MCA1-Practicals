// 6. Write a program to implement method overloading to find the area of circle, square, rectangle and triangle. 

import java.util.Scanner; // Importing Scanner class from java.util package

class Area{ // Area class
    double area; // Instance variable to store area

    void findArea(double radius){ // Method to find area of circle
        area = Math.PI * radius * radius; // Calculating area of circle
        System.out.println("\t- Area of Circle: " + area + "\n"); // Displaying area of circle
    }

    void findArea(double side1, double side2){ // Method to find area of rectangle and Square
        area = side1 * side2; // Calculating area of rectangle and square
        System.out.println("\t- Area of Rectangle: " + area + "\n"); // Displaying area of rectangle and square
    }

    void findArea(double base, double height, String triangle){ // Method to find area of triangle
        area = 0.5 * base * height; // Calculating area of triangle
        System.out.println("\t- Area of Triangle: " + area + "\n"); // Displaying area of triangle
    }
}

public class Ass1Pro6 {
    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Creating Scanner object

        Area a = new Area(); // Creating Area object

        System.out.print("Enter Radius of Circle: "); // Asking user to enter radius of circle
        double radius = sc.nextDouble(); // Accepting radius of circle
        a.findArea(radius); // Calling findArea method to find area of circle

        System.out.print("Enter Side of Square: "); // Asking user to enter side of square
        double side = sc.nextDouble(); // Accepting side of square
        a.findArea(side, side); // Calling findArea method to find area of square

        System.out.print("Enter Side1 of Rectangle: "); // Asking user to enter side1 of rectangle
        side = sc.nextDouble(); // Accepting side1 of rectangle
        System.out.print("Enter Side2 of Rectangle: "); // Asking user to enter side2 of rectangle
        double side2 = sc.nextDouble(); // Accepting side2 of rectangle
        a.findArea(side, side2); // Calling findArea method to find area of rectangle

        System.out.print("Enter Base of Triangle: "); // Asking user to enter base of triangle
        double base = sc.nextDouble(); // Accepting base of triangle
        System.out.print("Enter Height of Triangle: "); // Asking user to enter height of triangle
        double height = sc.nextDouble(); // Accepting height of triangle
        a.findArea(base, height, "triangle"); // Calling findArea method to find area of triangle

        sc.close(); // Closing Scanner object
    }
}