/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package que7;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author prath
 */
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("txtName");
        String email = req.getParameter("txtEmail");
        String psw = req.getParameter("txtPsw");
        setResult(resp.getWriter(), name, email, psw);
    }

    private void setResult(PrintWriter out, String name, String email, String psw) {
        out.println("<html><head><title>Registration Page</title></head><body>");
        out.println("<center><table border=1>");
        
        out.println("<tr><td>Name: </td><td>"+name+"</td></tr>");
        out.println("<tr><td>Name: </td><td>"+email+"</td></tr>");
        out.println("<tr><td>Name: </td><td>"+psw+"</td></tr>");
        
        out.println("</table></center></body></html>");
    }
}
