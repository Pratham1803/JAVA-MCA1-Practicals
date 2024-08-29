// 10. Declare an abstract class vehicle with an abstract method name numwheels(). Provide the two subclasses two-wheeler and four wheelers, each one of which implements this method. Create instance of these two subclasses and demonstrate the use of numwheels() method. 

abstract class Vehicle{ // Abstract class to store the details of a vehicle
    abstract void numWheels(); // Abstract method to display the number of wheels
}

class TwoWheeler extends Vehicle{ // Class to store the details of a two-wheeler
    void numWheels(){ // Method to display the number of wheels of a two-wheeler
        System.out.println("Number of Wheels in a Two-Wheeler: 2"); // Display the number of wheels
    }
}

class FourWheeler extends Vehicle{ // Class to store the details of a four-wheeler
    void numWheels(){ // Method to display the number of wheels of a four-wheeler
        System.out.println("Number of Wheels in a Four-Wheeler: 4"); // Display the number of wheels
    }
}

public class Ass1Que10 {
    public static void main(String[] args) { // Main method
        TwoWheeler twoWheeler = new TwoWheeler(); // Create an object of the TwoWheeler class
        twoWheeler.numWheels(); // Call the numWheels method of the TwoWheeler class

        FourWheeler fourWheeler = new FourWheeler(); // Create an object of the FourWheeler class
        fourWheeler.numWheels(); // Call the numWheels method of the FourWheeler class
    }   
}
