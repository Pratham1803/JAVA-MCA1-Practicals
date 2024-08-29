// 3. Create class Student with instance variables Stud id, name, address, marks1, marks2, marks3. Write constructor to initialize the instance variables. Also, create method result which display percentage and average marks based on three subject marks. 

import java.util.Scanner;

class Student {
    int studId;
    String name;
    String address;
    int marks1;
    int marks2;
    int marks3;

    Student(Scanner sc) {
        System.out.print("Enter Student ID: ");
        studId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Student Address: ");
        address = sc.nextLine();
        System.out.print("Enter Marks 1: ");
        marks1 = sc.nextInt();
        System.out.print("Enter Marks 2: ");
        marks2 = sc.nextInt();
        System.out.print("Enter Marks 3: ");
        marks3 = sc.nextInt();
    }

    void result() {
        int total = marks1 + marks2 + marks3;
        float percentage = (total / 3);
        System.out.println("Percentage: " + percentage);
        System.out.println("Average: " + total);
    }
}

public class Ass1Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student(sc);
        s.result();
    }
}