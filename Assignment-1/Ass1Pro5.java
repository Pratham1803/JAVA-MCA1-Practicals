// 5. Demonstrate an application to show the uses of "super" keyword in java to access the member having same name of super and subclass.

class SuperKeyword {
    protected int a; // Instance variable
    protected int b; // Instance variable

    SuperKeyword(int a, int b) { // Constructor with parameters
        this.a = a; // Assigning value of a to instance variable a
        this.b = b; // Assigning value of b to instance variable b
    }
}

class SubClass extends SuperKeyword {
    int a; // Instance variable
    int b; // Instance variable

    SubClass(int a, int b) { // Constructor with parameters
        super(a + 5, b + 5); // Calling super class constructor
        this.a = a; // Assigning value of a to instance variable a
        this.b = b; // Assigning value of b to instance variable b
    }

    void display() { // Method to display values of instance variables
        System.out.println("Value of a with super key word: " + super.a); // Displaying value of super class instance
                                                                          // variable a
        System.out.println("Value of b with super key word: " + super.b); // Displaying value of super class instance
                                                                          // variable b
        System.out.println("\nValue of a without super key word: " + this.a); // Displaying value of local variable a
        System.out.println("Value of b without super key word: " + this.b); // Displaying value of local variable b
    }
}

public class Ass1Pro5 {
    public static void main(String[] args) { // Main method
        SubClass sc = new SubClass(10, 20); // Creating SubClass object
        sc.display(); // Calling display method
    }
}