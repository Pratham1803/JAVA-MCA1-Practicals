// 7. Demonstrate an application to show the uses of "super" keyword in java to call the constructor of super class from subclass. 

class SuperClass{
    SuperClass(){ // Constructor of SuperClass
        System.out.println("SuperClass constructor called!"); // Displaying message
    }
}

class SubClass extends SuperClass{
    SubClass(){ // Constructor of SubClass
        super(); // Calling constructor of SuperClass
        System.out.println("SubClass constructor called!"); // Displaying message
    }
}

public class Ass1Pro7 {
    public static void main(String[] args) { // Main method
        SubClass sc = new SubClass(); // Creating SubClass object
    }
}