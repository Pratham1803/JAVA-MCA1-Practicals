// 11. Write a program to Design a Shape as an interface and then Design class for Circle, Rectangle and Triangle which implements the interface and override method drawShape()

interface Shape{ // Shape interface
    void drawShape(); // Method to draw shape
}

class Circle implements Shape{ // Circle class implementing Shape interface
    public void drawShape(){ // Overriding drawShape method
        System.out.println("\t- Drawing Circle\n"); // Displaying drawing circle
    }
}

class Rectangle implements Shape{ // Rectangle class implementing Shape interface
    public void drawShape(){ // Overriding drawShape method
        System.out.println("\t- Drawing Rectangle\n"); // Displaying drawing rectangle
    }
}

class Triangle implements Shape{ // Triangle class implementing Shape interface
    public void drawShape(){ // Overriding drawShape method
        System.out.println("\t- Drawing Triangle\n"); // Displaying drawing triangle
    }
}

public class Ass1Pro11 {
    public static void main(String[] args) {
        Circle c = new Circle(); // Creating object of Circle class
        Rectangle r = new Rectangle(); // Creating object of Rectangle class
        Triangle t = new Triangle(); // Creating object of Triangle class

        c.drawShape(); // Calling drawShape method of Circle class
        r.drawShape(); // Calling drawShape method of Rectangle class
        t.drawShape(); // Calling drawShape method of Triangle class
    }
}