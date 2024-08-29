// 5. Demonstrate an application to show the uses of "super" keyword in java to access the member having same name of super and subclass. 

class SuperClass{ // Superclass with a variable num
    int num = 100; // Initialize num to 100
}

class SubClass extends SuperClass{ // Subclass with a variable num that has the same name as the superclass variable num but different value
    int num = 110; // Initialize num to 110

    void display(){ // Method to display the values of both num variables
        System.out.println("Subclass num: " + num); // Display the value of the subclass variable num
        System.out.println("Superclass num: " + super.num); // Display the value of the superclass variable num using the super keyword
    }
}

public class Ass1Que5 { // Main class
    public static void main(String[] args) { // Main method
        SubClass sub = new SubClass(); // Create an object of the SubClass
        sub.display(); // Call the display method
    }   
}