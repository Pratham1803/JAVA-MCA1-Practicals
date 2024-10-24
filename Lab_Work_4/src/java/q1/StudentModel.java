/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1;

/**
 *
 * @author prath
 */
public class StudentModel {
    private int id;
    private String name;
    private String course;
    
    public StudentModel(int id, String name, String course)
    {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    
    public StudentModel(){}
    
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getCourse(){
        return this.course;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }    
}