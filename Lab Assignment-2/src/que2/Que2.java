package que2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 *
 * @author 24MCA143 pratham rathod
 * Write a java program that connects to a database using JDBC and insert the records into 
 * Student Table  from Java Application.(Assume Suitable Structure:  Sno, Sname, Sage, Saddress 
 * and Scontactno)
 */

public class Que2 {
    public static void main(String[] args){
        Connection con = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);
        
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            con = DriverManager.getConnection(url,"SYSTEM","1234");
            
            String Query = "INSERT INTO tblStudent(id,name,gender,contactnum) values(?,?,?,?)";
            pstmt = con.prepareStatement(Query);
            
            System.out.println("- Enter Student Id: ");
            pstmt.setInt(1, sc.nextInt());
            
            sc.nextLine();
            
            System.out.println("- Enter Student Name: ");
            pstmt.setString(2, sc.nextLine());
            
            System.out.println("- Enter Student Gender: ");
            pstmt.setString(3, sc.nextLine());
            
            System.out.println("- Enter Contact Number: ");
            pstmt.setLong(4, sc.nextLong());
            
            if(pstmt.execute()){
                System.out.println("\n\t!! Record Inserted !!");
            }else{
                System.out.println("\n\t!! Record not Inserted !!");
            }
            
        }catch(Exception e){
            System.out.println("Error:: "+e.getMessage());
        }finally{
            try{
                if(con != null){
                    con.close();
                }
                if(pstmt != null){
                    pstmt.close();
                }
            }catch(Exception e){
                System.out.println("Error:: " + e.getMessage());
            }
        }
    }
}