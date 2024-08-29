// 9. Write a program to find the area of Circle, Rectangle, Square using Runtime Polymorphism(DMD). 

class Area { // Class to calculate the area of different shapes
    // Method to calculate the area of a circle
    public void area(float radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }

    // Method to calculate the area of a square
    public void area(float side, float side1) {
        System.out.println("Area of Square: " + (side * side1));
    }
}

public class Ass1Que9 {
  public static void main(String[] args) {
    Area a = new Area(); // Object of the Area class

    // Calculating the area of Circle
    a.area(5.0f); // Calling the area method with the radius as the parameter

    // Calculating the area of Rectangle
    a.area(5.0f, 10.0f); // Calling the area method with the length and breadth as the parameters

    // Calculating the area of Square
    a.area(5.0f,5.0f); // Calling the area method with the side as the parameter
  }  
}
