package crud.operation;

public class StudentModel {
    private int studentId;
    private String studentName;
    private String studentGender;
    private long studentContact;
    
    public int getStudentId(){
        return this.studentId;
    }
    
    public void setStudentId(int id){
        this.studentId = id;
    }
    
    public String getStudentName(){
        return this.studentName;
    }
    
    public void setStudentName(String name){
        this.studentName = name;
    }
    
    public String getStudentGender(){
        return this.studentGender;
    }
    
    public void setStudentGender(String gender){
        this.studentGender = gender;
    }
    
    public long getStudentContact(){
        return this.studentContact;
    }
    
    public void setStudentContact(long contact){
        this.studentContact = contact;
    }
}
