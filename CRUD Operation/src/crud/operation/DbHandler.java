package crud.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Savepoint;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DbHandler {
    private Connection con;
    private Statement stmt;
    private ResultSet resultSet;
    private Savepoint savePoint = null;
    private PreparedStatement pstmt;

    private Connection getCoonection() {
        String conUrl = "jdbc:oracle:thin:@localhost:1521:XE";
        String userName = "SYSTEM";
        String psw = "1234";
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(conUrl, userName, psw);
            conn.setAutoCommit(false);
        } catch (SQLException se) {
            System.out.println("Error Message: " + se.getMessage());
        } catch (ClassNotFoundException ce) {
            System.out.println("Error Message Class Not Found : " + ce.getMessage());
        }

        return conn;
    }

    public void insertData(StudentModel student) throws SQLException {
        this.con = getCoonection();
        try {
            String query = "insert into tblStudent values (?,?,?,?)";
            this.savePoint = this.con.setSavepoint("sp1");
            this.pstmt = this.con.prepareStatement(query);
            this.pstmt.setInt(1, student.getStudentId());
            this.pstmt.setString(2, student.getStudentName());
            this.pstmt.setString(3, student.getStudentGender());
            this.pstmt.setDouble(4, student.getStudentContact());

            int rowAffected = pstmt.executeUpdate();

            if (rowAffected > 0) {
                System.out.println("\n\t!! Data Inserted !!\n");
            } else {
                System.out.println("\n\t!! Data Not Inserted !!\n");
            }
            this.pstmt.close();
            this.con.commit();
            System.out.println("--------------------------------------------------------\n");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            this.con.rollback(savePoint);
        } finally {
               closeObjects();
        }
    }

    public ArrayList<StudentModel> getData() {
        this.con = getCoonection();
        ArrayList<StudentModel> arrStudents = new ArrayList<>();
        try {
            String query = "select * from tblStudent";

            stmt = this.con.createStatement();
            resultSet = stmt.executeQuery(query);

            while (resultSet.next()) {
                StudentModel student = new StudentModel();
                student.setStudentId(resultSet.getInt("id"));
                student.setStudentName(resultSet.getString("name"));
                student.setStudentGender(resultSet.getString("gender"));
                student.setStudentContact(resultSet.getLong("contactNum"));

                arrStudents.add(student);
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            return null;
        } finally {
            closeObjects();
        }

        return arrStudents;
    }

    public void deleteStudent(int id) throws SQLException{
        StudentModel student = new StudentModel();
        char descicion;
        try{    
            student = getStudent(id);
            System.out.println("\n\t--> Student Information:");
            System.out.println("\n\t\t-| "+student.getStudentId()+" | "+student.getStudentName()+" | "+student.getStudentGender()+" | "+student.getStudentContact()+" |");
            System.out.println("\n\t- Are You Sure You Want to delete this Record!!!\n\tPress 'y' for Yes and 'n' for No or any other key to continue...");
            
            
            
        }catch(Exception e){
            System.out.println("Error:: "+e.getMessage());
            this.con.rollback(this.savePoint);            
        }        
    }

    public StudentModel getStudent(int id) throws SQLException {
        StudentModel student = new StudentModel();

        String query = "select * from tblStudent where id = " + id;
        this.con = getCoonection();

        try {
            this.savePoint = this.con.setSavepoint("sv");
            this.stmt = this.con.createStatement();
            this.resultSet = this.stmt.executeQuery(query);

            student.setStudentId(id);
            student.setStudentName(resultSet.getString("name"));
            student.setStudentGender(resultSet.getString("gender"));
            student.setStudentContact(resultSet.getLong("contactNum"));          
        } catch (Exception e) {
            System.out.println("Error:: " + e.getMessage());
            this.con.rollback(this.savePoint);
            return null;
        }finally{
            closeObjects();
        }
        return student;
    }

    private void closeObjects() {
        try {
            if (this.con != null) {
                this.con.close();
            }
            if (this.stmt != null) {
                this.stmt.close();
            }
            if (this.resultSet != null) {
                this.resultSet.close();
            }
            if(this.pstmt != null){
                this.pstmt.close();
            }
        } catch (SQLException se) {
            System.out.println("Error: " + se.getMessage());
        }
    }
}