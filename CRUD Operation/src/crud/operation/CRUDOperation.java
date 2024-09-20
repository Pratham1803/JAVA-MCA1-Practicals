package crud.operation;

import java.util.Scanner;
import java.util.ArrayList;

public class CRUDOperation {

    public static void main(String[] args) {
        char isContinue = 'n';
        int option;
        DbHandler db = new DbHandler();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("!----------- Select Operation -----------!\n");
            System.out.println("\t1. Inset Data::\n\t2. Display All Data::\n\t3. Update::\n\t4. Delete ::\n\t5. Search::\n\t6. Exit::");
            System.out.print("\n- select option: ");
            option = sc.nextInt();

            if (option == 1) {
                StudentModel newStudent = new StudentModel();
                System.out.print("\n\t--> Enter Roll Number: ");
                newStudent.setStudentId(sc.nextInt());
                
                sc.nextLine();
                System.out.print("\n\t--> Enter Name: ");
                newStudent.setStudentName(sc.nextLine());

                System.out.print("\n\t--> Enter gender: ");
                newStudent.setStudentGender(sc.nextLine());
                                
                System.out.print("\n\t--> Enter Contact Number: ");
                newStudent.setStudentContact(sc.nextLong());
                sc.nextLine();
                
                try {
                    db.insertData(newStudent);
                } catch (Exception e) {
                    System.out.println("error: " + e.getMessage());
                }

            } else if (option == 2) {
                System.out.println("\n\t- Student Data: \n");
                ArrayList<StudentModel> arrStudent = db.getData();
                
                if(arrStudent != null)
                    for(StudentModel student : arrStudent){
                        System.out.println("\n\t-| "+student.getStudentId()+" | "+student.getStudentName()+" | "+student.getStudentGender()+" | "+student.getStudentContact()+" |");
                    }
                System.out.println("--------------------------------------------------------\n");                
            } else if (option == 3) {
                try{
                    System.out.print("\t- Enter Id : ");
                    int id = sc.nextInt();
                    db.updateStudent(id);
                }catch(Exception e){
                    System.out.println("Error:: "+e.getMessage());
                }
            } else if (option == 4) {
                try{
                    System.out.print("\t- Enter Id : ");
                    int id = sc.nextInt();
                    db.deleteStudent(id);
                }catch(Exception e){
                    System.out.println("Error:: "+e.getMessage());
                }
            } else if (option == 5) {
                try{
                    System.out.print("\t- Enter Id : ");
                    int id = sc.nextInt();
                    StudentModel student = db.getStudent(id);
                    System.out.println("\n\t-| "+student.getStudentId()+" | "+student.getStudentName()+" | "+student.getStudentGender()+" | "+student.getStudentContact()+" |");
                }catch(Exception e){
                    System.out.println("Error:: "+e.getMessage());
                }
            }else if (option == 6){
                System.exit(0);
            }

            System.out.println("\n- Do you want to Continue? click y or Y else click any other character...");
            isContinue = sc.next().charAt(0);

        } while (isContinue == 'y' || isContinue == 'Y');

        sc.close();
    }
}