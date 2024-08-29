// 4. Write a java code to demonstrate the use of "this" keyword with suitable example to remove the ambiguity between instance and local variable.  

public class Ass1Que4 {
    // Instance variable
    private int value;

    // Constructor with a parameter
    public Ass1Que4(int value) {
        // Using 'this' keyword to refer to the instance variable
        this.value = value;
    }

    // Method to display the value
    public void display() {
        System.out.println("The value is: " + this.value);
    }

    public static void main(String[] args) {
        // Creating an object of Example class
        Ass1Que4 example = new Ass1Que4(10);
        // Displaying the value
        example.display();
    }
}