// 6. Write a program to implement method overloading to find the area of circle, square, rectangle and triangle. 

import java.util.Scanner;

class Area { // Class to calculate the area of different shapes
    // Method to calculate the area of a circle
    public void area(float radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }

    // Method to calculate the area of a rectangle
    public void area(float length, float width) {
        System.out.println("Area of Rectangle: " + (length * width));
    }

    // Method to calculate the area of a triangle
    public void area(float base, float height, float side1, float side2) {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

public class Ass1Que6 { // Main class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object to take input from the user
        Area a = new Area(); // Object of the Area class

        // Taking input from the user and calculating the area of Circle
        System.out.print("Enter the radius of the circle: "); // Asking the user to enter the radius of the circle
        float radius = sc.nextFloat(); // Taking the radius as input from the user
        a.area(radius); // Calling the area method with the radius as the parameter
        
        // Taking input from the user and calculating the area of Square 
        System.out.print("Enter the length of the square: "); // Asking the user to enter the length of the square
        float side1 = sc.nextFloat(); // Taking the length as input from the user
        a.area(side1, side1); // Calling the area method with the length as the parameter
        
        // Taking input from the user and calculating the area of Rectangle
        System.out.print("Enter the Length of the rectangle: "); // Asking the user to enter the length of the rectangle
        side1 = sc.nextFloat(); // Taking the length as input from the user

        System.out.print("Enter the Breadth of the rectangle: "); // Asking the user to enter the breadth of the rectangle
        float side2 = sc.nextFloat(); // Taking the breadth as input from the user
        a.area(side1, side2); // Calling the area method with the length and breadth as the parameters
        
        // Taking input from the user and calculating the area of Triangle
        System.out.print("Enter the base and height of the triangle: "); // Asking the user to enter the base and height of the triangle
        float base = sc.nextFloat(); // Taking the base as input from the user
        float height = sc.nextFloat(); // Taking the height as input from the user
        
        System.out.print("Enter the sides of the triangle: "); // Asking the user to enter the sides of the triangle
        side1 = sc.nextFloat(); // Taking the first side as input from the user
        side2 = sc.nextFloat(); // Taking the second side as input from the user
        a.area(base, height, side1, side2); // Calling the area method with the base, height, and sides as the parameters
        
        sc.close(); // Closing the scanner object
    }   
}