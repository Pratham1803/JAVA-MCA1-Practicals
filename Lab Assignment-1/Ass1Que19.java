// 19. Write a java program to demonstrate the implementation of Synchronization in java.

class Table { // Table class
    synchronized void printTable(int n) { // Synchronized method to print table
        for (int i = 1; i <= 5; i++) { // Loop to iterate 5 times
            System.out.println(n * i); // Printing table
            try { // Try block
                Thread.sleep(400); // Putting thread to sleep for 400 milliseconds
            } catch (InterruptedException e) { // Catch block
                System.out.println(e);  // Printing exception message
            }
        }
    }
}

class MyThread1 extends Thread { // MyThread1 class
    Table t; // Table object

    MyThread1(Table t) { // Constructor
        this.t = t; // Initializing Table object
    }

    public void run() { // Run method
        t.printTable(5); // Calling printTable method
    }
}

class MyThread2 extends Thread { // MyThread2 class
    Table t; // Table object

    MyThread2(Table t) { // Constructor
        this.t = t; // Initializing Table object
    }

    public void run() { // Run method
        t.printTable(100); // Calling printTable method
    }
}

public class Ass1Que19 { // Main class
    public static void main(String[] args) { // Main method
        Table obj = new Table(); // Creating object of Table class
        MyThread1 t1 = new MyThread1(obj); // Creating object of MyThread1 class
        MyThread2 t2 = new MyThread2(obj); // Creating object of MyThread2 class
        t1.start(); // Starting thread 1
        t2.start(); // Starting thread 2
    }
}