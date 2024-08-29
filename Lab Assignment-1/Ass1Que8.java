// 8. Create person class with data members as person_id& name. Derive two classes Student & faculty from it. The fields of Student are course name & fees paid. The fields of faculty are subject name & number of years’ experience. Use proper method to accept values & override display method. (Using parameterized constructor).

import java.util.Scanner; // Importing Scanner class from java.util package

class Person{ // Class to store the details of a person
    private int person_id; // Variable to store the person ID
    private String name; // Variable to store the name of the person
 
    Person(int person_id, String name){ // Constructor to initialize the person ID and name
        this.person_id = person_id; // Assign the person ID
        this.name = name; // Assign the name
    }

    int getPersonId(){ // Method to return the person ID
        return person_id; // Return the person ID
    }

    String getName(){ // Method to return the name
        return name; // Return the name
    }
}

// Student class derived from Person class to store the details of a student
class Student extends Person{
    private String course_name; // Variable to store the course name
    private int fees_paid; // Variable to store the fees paid

    Student(int person_id, String name, String course_name, int fees_paid){ // Constructor to initialize the student details
        super(person_id, name); // Call the constructor of the base class
        this.course_name = course_name; // Assign the course name
        this.fees_paid = fees_paid; // Assign the fees paid
    }

    void display(){ // Method to display the student details
        System.out.println("\n\t- Student Details:"); // Display the heading
        System.out.println("\tPerson ID: " + getPersonId()); // Display the person ID
        System.out.println("\tName: " + getName()); // Display the name
        System.out.println("\tCourse Name: " + course_name); // Display the course name
        System.out.println("\tFees Paid: " + fees_paid); // Display the fees paid
    }
}

// Faculty class derived from Person class to store the details of a faculty
class Faculty extends Person{  
    private String subject_name; // Variable to store the subject name
    private int years_experience; // Variable to store the years of experience

    Faculty(int person_id, String name, String subject_name, int years_experience){ // Constructor to initialize the faculty details
        super(person_id, name); // Call the constructor of the base class
        this.subject_name = subject_name; // Assign the subject name
        this.years_experience = years_experience; // Assign the years of experience
    }

    void display(){ // Method to display the faculty details
        System.out.println("\n\t- Faculty Details:"); // Display the heading
        System.out.println("\tPerson ID: " + getPersonId()); // Display the person ID
        System.out.println("\tName: " + getName()); // Display the name
        System.out.println("\tSubject Name: " + subject_name); // Display the subject name
        System.out.println("\tYears of Experience: " + years_experience); // Display the years of experience
    }
}

// Main class
public class Ass1Que8 {
    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Creating an object of Scanner class
        
        // Accepting the details of the student
        System.out.print("Enter Student ID: "); // Prompt the user to enter the student ID
        int student_id = sc.nextInt(); // Accept the student ID from the user
        sc.nextLine(); // Move the cursor to the next line
        System.out.print("Enter Student Name: "); // Prompt the user to enter the student name
        String student_name = sc.nextLine(); // Accept the student name from the user
        System.out.print("Enter Course Name: "); // Prompt the user to enter the course name
        String course_name = sc.nextLine(); // Accept the course name from the user
        System.out.print("Enter Fees Paid: "); // Prompt the user to enter the fees paid
        int fees_paid = sc.nextInt(); // Accept the fees paid from the user
        Student student = new Student(student_id, student_name, course_name, fees_paid); // Create an object of Student class
        student.display(); // Display the student details


        // Accepting the details of the faculty
        System.out.print("Enter Faculty ID: "); // Prompt the user to enter the faculty ID
        int faculty_id = sc.nextInt(); // Accept the faculty ID from the user
        sc.nextLine(); // Move the cursor to the next line
        System.out.print("Enter Faculty Name: "); // Prompt the user to enter the faculty name
        String faculty_name = sc.nextLine(); // Accept the faculty name from the user
        System.out.print("Enter Subject Name: "); // Prompt the user to enter the subject name
        String subject_name = sc.nextLine(); // Accept the subject name from the user
        System.out.print("Enter Years of Experience: "); // Prompt the user to enter the years of experience
        int years_experience = sc.nextInt(); // Accept the years of experience from the user
        Faculty faculty = new Faculty(faculty_id, faculty_name, subject_name, years_experience); // Create an object of Faculty class
        faculty.display(); // Display the faculty details
    }
}