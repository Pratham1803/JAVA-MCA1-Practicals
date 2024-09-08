package crud.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.PreparedStatement;

class Db{
    private Connection conn = null;
    private  Statement stmt = null;
    private ResultSet resultSet = null;
    private final String conUrl = "jdbc:oracle:thin:@localhost:1521:XE";
    private final String userName = "SYSTEM";
    private final String psw = "1234";
    
    public void insertData(int rollNum, String name){
        try{
            Class.forName("oracle.jdbc.OracleDriver");         
            conn = DriverManager.getConnection(conUrl,userName,psw);
            
            String query = "insert into tbldemo values (?,?)";
            
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, rollNum);
            pstmt.setString(2, name);
            
            int rowAffected =  pstmt.executeUpdate();
            
            if(rowAffected > 0)
                System.out.println("\n\t!! Data Inserted !!\n");
            else
                System.out.println("\n\t!! Data Not Inserted !!\n");
            pstmt.close();
            System.out.println("--------------------------------------------------------\n");
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            try{
                if(conn != null) conn.close();
                if(stmt != null) stmt.close();
                if(resultSet != null) resultSet.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }
    
    public void getData(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");         
            conn = DriverManager.getConnection(conUrl,userName,psw);
            
            String query = "select * from tbldemo";
            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(query);
            
            while(resultSet.next()){
                int rollNum = resultSet.getInt("userid");
                String name = resultSet.getString("username");
                
                System.out.println("\t-> ID: "+rollNum+" "+name);
            }
            System.out.println("--------------------------------------------------------\n");
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            try{
                if(conn != null) conn.close();
                if(stmt != null) stmt.close();
                if(resultSet != null) resultSet.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }
}

public class CRUDOperation {
    public static void main(String[] args) {
      char isContinue = 'n';  
      int option;
      Db db = new Db();
      Scanner sc = new Scanner(System.in);
      
      do{
          System.out.println("!----------- Select Operation -----------!\n");
          System.out.println("\t1. Inset Data::\n\t2. Display Data::\n\t3. Exit::");
          System.out.print("\n- select option: ");
          option = sc.nextInt();
          
          if(option == 1){
              System.out.print("\n\t--> Enter Roll Number: ");
              int num = sc.nextInt();
               sc.nextLine();
              System.out.print("\n\t--> Enter Name: ");
              String name = sc.nextLine();
              
              db.insertData(num, name);
              
              System.out.println("\n- Do you want to Continue? click y or Y else click any other character...");
              isContinue = sc.next().charAt(0);
          }else if(option == 2){
              System.out.println("\n\t- Data: \n");
              db.getData();
              
              System.out.print("\n- Do you want to Continue? click y or Y else click any other character...");
              isContinue = sc.next().charAt(0);
          }else if(option == 3){
              System.exit(0);
          }
          
      }while(isContinue == 'y' || isContinue == 'Y');
      
      sc.close();
    }    
}