// 4. Write a java code to demonstrate the use of "this" keyword with suitable example to remove the ambiguity between instance and local variable.

class ThisKeyword{
    private int a; // Instance variable
    private int b; // Instance variable

    ThisKeyword(int a, int b){ // Constructor with parameters
        this.a = a; // Assigning value of a to instance variable a
        this.b = b; // Assigning value of b to instance variable b
    }

    void display(int a, int b){ // Method to display values of instance variables
        System.out.println("Value of a with this key word: " + this.a); // Displaying value of instance variable a
        System.out.println("Value of b with this key word: " + this.b); // Displaying value of instance variable b
        System.out.println("\nValue of a without this key word: " + a); // Displaying value of local variable a
        System.out.println("Value of b without this key word: " + b); // Displaying value of local variable b
    }
}

public class Ass1Pro4 {
    public static void main(String[] args) { // Main method
        ThisKeyword tk = new ThisKeyword(10, 20); // Creating ThisKeyword object
        tk.display(30, 40); // Calling display method
    }
}
