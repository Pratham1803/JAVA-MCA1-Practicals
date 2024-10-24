/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1;

import java.util.Scanner;
/**
 *
 * @author prath
 */
public class View {
    
    public StudentModel collectData(StudentModel model){        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter New Student Details: ");
        System.out.print("\n\t- Enter Student Id: ");
        model.setId(sc.nextInt());
        
        System.out.print("\n\t- Enter Student Name: ");
        sc.nextLine();
        model.setName(sc.nextLine());
        
        System.out.print("\n\t- Enter Student Course: ");
        model.setCourse(sc.nextLine());
        
        return model;
    }
    
    public void display(StudentModel model){
        System.out.println("-------------- Student Details --------------\n");
        System.out.println("\t- Id: "+model.getId());
        System.out.println("\t- Name: "+model.getName());
        System.out.println("\t- Course: "+model.getCourse());
        System.out.println("\n---------------------------------------------------\n");
    }
}
