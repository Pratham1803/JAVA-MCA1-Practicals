package que1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

/**
 *
 * @author 24MCA143 pratham rathod Write a java program that connects to a
 * database using JDBC and Fetch the records of Student Table .(Assume Suitable
 * Structure: Sno, Sname, Sage, Saddress and Scontactno)
 */
public class Main {

    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String conUrl = "jdbc:oracle:thin:@localhost:1521:XE";
            String uname = "SYSTEM";
            String psw = "1234";
            con = DriverManager.getConnection(conUrl, uname, psw);

            String Query = "select * from tblstudent";
            stmt = con.createStatement();
            rs = stmt.executeQuery(Query);

            System.out.println("ID\t\t\tNAME\t\t\t\tGender\t\t\tContactNum");
            while (rs.next()) {
                System.out.print(rs.getInt("id") + "\t\t\t");
                System.out.print(rs.getString("name") + "\t\t\t\t");
                System.out.print(rs.getString("gender") + "\t\t\t");
                System.out.println(rs.getLong("ContactNum"));
            }
        } catch (Exception e) {
            System.out.println("Error:: " + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();                   
                }
                if(stmt != null){
                    stmt.close();
                }
                if(rs != null){
                    rs.close();
                }
            } catch (Exception e) {
                System.out.println("Error:: " + e.getMessage());
            }
        }
    }
}
