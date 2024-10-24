package que3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author 24MCA143 pratham Rathod
 * Write a java program that connects to a database using JDBC and delete the records of Student 
 * from  Student Table  in Java Application.(Assume Suitable Structure:  Sno, Sname, Sage, Saddress 
 * and Scontactno)
 */
public class Que3 {
    public static void main(String[] args){
        Connection con = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);
        
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";           
            con = DriverManager.getConnection(url,"SYSTEM","1234");
            
            String query = "delete from tblStudent where id = ?";
            pstmt = con.prepareStatement(query);
            
            System.out.println("Enter Id: ");
            pstmt.setInt(1, sc.nextInt());
            
            int res = pstmt.executeUpdate();
            
            if(res > 0){
                System.out.println("record Deleted");
            }else{
                System.out.println("record Not Deleted");
            }                      
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }finally{
            try{
                if(con != null) con.close();
                if(pstmt != null) pstmt.close();
            }catch(Exception e){
                System.out.println("Error:: "+e.getMessage());
            }
        }
    }
}