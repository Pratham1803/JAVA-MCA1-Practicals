// 21.  Write a java program to sort the array in ascending order. 
import java.util.Scanner; // Importing Scanner class from java.util package

public class Ass1Que21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object
        int arr[] = new int[5]; // Declaring array of size 5

        System.err.print("- Enter 5 elements: "); // Printing message
        for(int i = 0; i<arr.length; i++){ // Loop to iterate through array
            arr[i] = sc.nextInt(); // Taking input from user
        }

        int temp; // Declaring temp variable
        for (int i = 0; i < arr.length; i++) { // Loop to iterate through array
            for (int j = i + 1; j < arr.length; j++) { // Loop to iterate through array
                if (arr[i] > arr[j]) { // Checking if element at i is greater than element at j
                    temp = arr[i]; // Storing element at i in temp
                    arr[i] = arr[j]; // Storing element at j in i
                    arr[j] = temp; // Storing temp in j
                }
            }
        }
        System.out.print("\n\t--> Sorted Array: "); // Printing message
        for (int i = 0; i < arr.length; i++) { // Loop to iterate through array
            System.out.print(arr[i] + " "); // Printing element at i
        }

        sc.close(); // Closing Scanner object
    }
}