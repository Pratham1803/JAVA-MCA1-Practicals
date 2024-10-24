package que4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 *
 * @author 24MCA143 pratham rathod Write a java program that connects to a
 * database using JDBC and update the records of Student into Student Table from
 * Java Application.(Assume Suitable Structure: Sno, Sname, Sage, Saddress and
 * Scontactno)
 */
public class Que4 {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            con = DriverManager.getConnection(url, "SYSTEM", "1234");

            String query = "update tblstudent set name = ?, gender = ?, contactnum = ? where id = ?";

            System.out.println("- Enter Student Id : ");
            int id = sc.nextInt();

            System.out.println("- Enter Student Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("- Enter Student Gender : ");
            String gender = sc.nextLine();

            System.out.println("- Enter Student Contact Number : ");
            long contact = sc.nextLong();

            pstmt = con.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setString(2, gender);
            pstmt.setLong(3, contact);
            pstmt.setInt(4, id);

            int res = pstmt.executeUpdate();
            if (res > 0) {
                System.out.println("Record Updated");
            } else {
                System.out.println("Record not Updated");
            }

        } catch (Exception e) {
            System.out.println("Error:: " + e.getMessage());
        } finally {
            try {
                if (con == null) {
                    con.close();
                }
                if (pstmt == null) {
                    pstmt.close();
                }
            } catch (Exception e) {
                System.out.println("Error:: " + e.getMessage());
            }
        }
    }
}