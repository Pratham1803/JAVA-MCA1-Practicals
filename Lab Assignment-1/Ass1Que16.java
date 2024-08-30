// 16. Write a class Driver with attributes vehicle no, name & age. Initialize values through parameterized constructor. If age of driver is less than 18 then generate user-defined exception “AgeNotWithinTheRange” using Constructor. 

class AgeNotWithinTheRange extends Exception { // User defined exception class
    public AgeNotWithinTheRange(String message) { // Constructor
        super(message); // Calling super class constructor
    }
}

class Driver { // Driver class
    private String vehicleNo; // Private attribute vehicleNo
    private String name; // Private attribute name
    private int age; // Private attribute age

    public Driver(String vehicleNo, String name, int age) { // Parameterized constructor
        this.vehicleNo = vehicleNo; // Initializing vehicleNo
        this.name = name; // Initializing name
        try { // Try block
            if (age < 18) { // Checking if age is less than 18
                throw new AgeNotWithinTheRange("AgeNotWithinTheRange"); // Throwing user defined exception
            }
            this.age = age; // Initializing age
            display(); // Calling display method
        } catch (AgeNotWithinTheRange e) { // Catch block
            System.out.println(e); // Printing exception message
        }
    }

    private void display() { // Method to display details
        System.out.println("Vehicle No: " + vehicleNo); // Printing vehicleNo
        System.out.println("Name: " + name); // Printing name
        System.out.println("Age: " + age); // Printing age
    }
}

public class Ass1Que16 { // Main class
    public static void main(String[] args) { // Main method
        Driver d1 = new Driver("KA-01-HH-1234", "John", 20); // Creating object of Driver class

        Driver d2 = new Driver("KA-01-HH-5678", "Doe", 15); // Creating object of Driver class
    }
}