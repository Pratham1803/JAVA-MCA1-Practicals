// 2. Write a Java program can contain two classes: Computer and Laptop. Both classes have their own constructors and a method. In main method create object of two classes and call their methods. 

import java.util.Scanner;

class Computer {
    private String brand;
    private String model;
    private double price;

    public Computer(Scanner sc) {
        System.out.println("\n- Enter Computer Information: ");
        System.out.print("Enter Brand: ");
        brand = sc.nextLine();
        System.out.print("Enter Model: ");
        model = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
        sc.nextLine();
    }

    public void displayData() {
        System.out.println("\n-> Computer Information: ");
        System.out.println("\tBrand: " + brand);
        System.out.println("\tModel: " + model);
        System.out.println("\tPrice: " + price);
    }
}

class Laptop {
    private String brand;
    private String model;
    private double price;

    public Laptop(Scanner sc) {
        System.out.println("\n- Enter Laptop Information: ");
        System.out.print("Enter Brand: ");
        brand = sc.nextLine();
        System.out.print("Enter Model: ");
        model = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
        sc.nextLine();
    }

    public void displayData() {
        System.out.println("\n-> Laptop Information: ");
        System.out.println("\tBrand: " + brand);
        System.out.println("\tModel: " + model);
        System.out.println("\tPrice: " + price);
    }
}

public class Ass1Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Computer c = new Computer(sc);
        c.displayData();
        Laptop l = new Laptop(sc);
        l.displayData();

        sc.close();
    }
}