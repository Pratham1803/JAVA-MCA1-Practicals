// 2. Write a Java program can contain two classes: Computer and Laptop. Both classes have their own constructors and a method. In main method create object of two classes and call their methods.

class Computer{
    Computer(){ // Constructor of Computer class
        System.out.println("Computer class constructor called!"); // Displaying message
    }

    void display(){ // Method of Computer class
        System.out.println("Computer class method called!"); // Displaying message
    }
}

class Laptop{
    Laptop(){ // Constructor of Laptop class
        System.out.println("Laptop class constructor called!"); // Displaying message
    }

    void display(){ // Method of Laptop class
        System.out.println("Laptop class method called!"); // Displaying message
    }
}

public class Ass1Pro2 {
    public static void main(String[] args) { // Main method
        Computer c = new Computer(); // Creating Computer object
        c.display(); // Calling display method of Computer class

        Laptop l = new Laptop(); // Creating Laptop object
        l.display(); // Calling display method of Laptop class
    }   
}
