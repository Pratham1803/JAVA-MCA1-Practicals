// 8. Create person class with data members as person_id& name. Derive two classes Student & faculty from it. The fields of Student are course name & fees paid. The fields of faculty are subject name & number of year’s experience. Use proper method to accept values & override display method. (Using parameterized constructor).

import java.util.Scanner; // Importing Scanner class from java.util package

class Person{ // Person class
    private String personId; // Instance variable to store person ID
    private String name; // Instance variable to store person Name

    Person(String personId, String name){ // Constructor with parameters
        this.personId = personId; // Assigning value of person ID to instance variable personId
        this.name = name; // Assigning value of name to instance variable name
    }

    void display(){ // Method to display person information
        System.out.println("\t- Person ID: " + personId); // Displaying person ID
        System.out.println("\t- Name: " + name); // Displaying Name
    }
}

class Student extends Person{ // Student class extending Person class
    private String courseName; // Instance variable to store course name
    private double feesPaid; // Instance variable to store fees paid

    Student(String personId, String name, String courseName, double feesPaid){ // Constructor with parameters
        super(personId, name); // Calling super class constructor
        this.courseName = courseName; // Assigning value of course name to instance variable courseName
        this.feesPaid = feesPaid; // Assigning value of fees paid to instance variable feesPaid
    }

    void display(){ // Method to display student information
        System.out.println("!-------- Student Information --------!\n"); // Displaying message
        super.display(); // Calling super class display method
        System.out.println("\t- Course Name: " + courseName); // Displaying course name
        System.out.println("\t- Fees Paid: " + feesPaid); // Displaying fees paid
        System.out.println("!------------------------------------!\n"); // Displaying message
    }
}

class Faculty extends Person{ // Faculty class extending Person class
    private String subjectName; // Instance variable to store subject name
    private int experience; // Instance variable to store experience

    Faculty(String personId, String name, String subjectName, int experience){ // Constructor with parameters
        super(personId, name); // Calling super class constructor
        this.subjectName = subjectName; // Assigning value of subject name to instance variable subjectName
        this.experience = experience; // Assigning value of experience to instance variable experience
    }

    void display(){ // Method to display faculty information
        System.out.println("!-------- Faculty Information --------!\n"); // Displaying message
        super.display(); // Calling super class display method
        System.out.println("\t- Subject Name: " + subjectName); // Displaying subject name
        System.out.println("\t- Experience: " + experience + " years"); // Displaying experience
        System.out.println("!------------------------------------!\n"); // Displaying message
    }
}

public class Ass1Pro8 { // Main class
    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Creating Scanner object

        System.out.print("Enter Person ID: "); // Asking user to enter Person ID
        String personId = sc.nextLine(); // Accepting Person ID
        System.out.print("Enter Name: "); // Asking user to enter Name
        String name = sc.nextLine(); // Accepting Name

        System.out.print("Enter Course Name: "); // Asking user to enter Course Name
        String courseName = sc.nextLine(); // Accepting Course Name
        System.out.print("Enter Fees Paid: "); // Asking user to enter Fees Paid
        double feesPaid = sc.nextDouble(); // Accepting Fees Paid
        sc.nextLine(); // Clearing buffer

        Student s = new Student(personId, name, courseName, feesPaid); // Creating Student object
        s.display(); // Calling display method

        System.out.print("Enter Person ID: "); // Asking user to enter Person ID
        personId = sc.nextLine(); // Accepting Person ID
        System.out.print("Enter Name: "); // Asking user to enter Name
        name = sc.nextLine(); // Accepting Name

        System.out.print("Enter Subject Name: "); // Asking user to enter Subject Name
        String subjectName = sc.nextLine(); // Accepting Subject Name
        System.out.print("Enter Experience: "); // Asking user to enter Experience
        int experience = sc.nextInt(); // Accepting Experience

        Faculty f = new Faculty(personId, name, subjectName, experience); // Creating Faculty object
        f.display(); // Calling display method

        sc.close(); // Closing Scanner object
    }
}