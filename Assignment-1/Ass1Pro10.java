// 10. Declare an abstract class vehicle with an abstract method name numwheels(). Provide the two subclasses two-wheeler and four wheelers, each one of which implements this method. Create instance of these two subclasses and demonstrate the use of numwheels () method.

abstract class Vehicle{ // Abstract class Vehicle
    abstract void numWheels(); // Abstract method numWheels
}

class TwoWheeler extends Vehicle{ // TwoWheeler class extending Vehicle class
    void numWheels(){ // Overriding numWheels method
        System.out.println("\t- Number of wheels in Two Wheeler: 2\n"); // Displaying number of wheels in Two Wheeler
    }
}

class FourWheeler extends Vehicle{ // FourWheeler class extending Vehicle class
    void numWheels(){ // Overriding numWheels method
        System.out.println("\t- Number of wheels in Four Wheeler: 4\n"); // Displaying number of wheels in Four Wheeler
    }
}

public class Ass1Pro10 {
    public static void main(String[] args) {
        TwoWheeler tw = new TwoWheeler(); // Creating object of TwoWheeler class
        FourWheeler fw = new FourWheeler(); // Creating object of FourWheeler class

        tw.numWheels(); // Calling numWheels method of TwoWheeler class
        fw.numWheels(); // Calling numWheels method of FourWheeler class
    }
}