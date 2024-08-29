// 11. Write a program to Design a Shape as an interface and then Design class for Circle, Rectangle and Triangle which implements the interface and override method drawShape(). 

interface Shape { // Interface to store the details of a shape
    void drawShape(); // Abstract method to draw the shape
} 

// Circle class to store the details of a circle and implement the Shape interface
class Circle implements Shape {
    public void drawShape() { // Method to draw a circle
        System.out.println("Drawing Circle"); // Display the message
    }
}

// Rectangle class to store the details of a rectangle and implement the Shape interface
class Rectangle implements Shape {
    public void drawShape() { // Method to draw a rectangle
        System.out.println("Drawing Rectangle"); // Display the message
    }
}

// Triangle class to store the details of a triangle and implement the Shape interface
class Triangle implements Shape {
    public void drawShape() { // Method to draw a triangle
        System.out.println("Drawing Triangle"); // Display the message
    }
}

public class Ass1Que11 { // Main class
    public static void main(String[] args) { // Main method
        Circle circle = new Circle(); // Create an object of the Circle class
        circle.drawShape(); // Call the drawShape method of the Circle class

        Rectangle rectangle = new Rectangle(); // Create an object of the Rectangle class
        rectangle.drawShape(); // Call the drawShape method of the Rectangle class

        Triangle triangle = new Triangle(); // Create an object of the Triangle class
        triangle.drawShape(); // Call the drawShape method of the Triangle class
    }   
}
