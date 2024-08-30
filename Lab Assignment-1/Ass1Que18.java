// 18. Write a program to set the priority of two threads and check which thread executes first and uses more CPU time.  

public class Ass1Que18 { // Main class
    public static void main(String[] args) { // Main method
        Thread t1 = new Thread(() -> { // Creating thread 1
            for (int i = 0; i < 5; i++) { // Loop to iterate 5 times
                System.out.println("Thread 1, Time: " + i); // Printing message
                try { // Try block
                    Thread.sleep(1000); // Putting thread to sleep for 1 second
                } catch (InterruptedException e) { // Catch block
                    e.printStackTrace(); // Printing exception message
                }
            }
        });
        Thread t2 = new Thread(() -> { // Creating thread 2
            for (int i = 0; i < 5; i++) { // Loop to iterate 5 times
                System.out.println("\t- Thread 2, Time: " + i); // Printing message
                try { // Try block
                    Thread.sleep(1000); // Putting thread to sleep for 1 second
                } catch (InterruptedException e) { // Catch block
                    e.printStackTrace(); // Printing exception message
                }
            }
        });

        t1.setPriority(Thread.MIN_PRIORITY); // Setting priority of thread 1 to minimum
        t2.setPriority(Thread.MAX_PRIORITY); // Setting priority of thread 2 to maximum

        t1.start(); // Starting thread 1
        t2.start(); // Starting thread 2
    }
}