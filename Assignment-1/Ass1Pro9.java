// 9. Write a program to find the area of Circle, Rectangle, Square using Runtime Polymorphism(DMD). 

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
}

public class Ass1Pro9 {
    public static void main(String[] args) {
        Area a = new Area(); // Creating object of Area class

        a.findArea(5); // Calling findArea method with one argument
        a.findArea(5, 10); // Calling findArea method with two arguments
        a.findArea(5,5); // Calling findArea method with one argument
    }
}