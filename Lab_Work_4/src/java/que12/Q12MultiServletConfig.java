/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package que12;

import que11.*;
import jakarta.servlet.ServletConfig;
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

public class Q12MultiServletConfig extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig config = getServletConfig();
        
        String fName = config.getInitParameter("fName");
        String mName = config.getInitParameter("mName");
        String lName = config.getInitParameter("lName");
        
        setScreen(resp.getWriter(), fName,mName,lName);
    }
    
    private void setScreen(PrintWriter out, String msg1,String msg2,String msg3) {
        out.println("<html><head><title>Q12 Multi Param Config</title></head><body style=\"background-color: pink;\">");
        out.println("<center>");
        out.println("<h1>Initilized Parameter: </h1>");
        out.println("<h1>First Name = "+msg1 + "</h1>");        
        out.println("<h1>Middle Name = "+msg2 + "</h1>");        
        out.println("<h1>Last Name = "+msg3 + "</h1>");        
        out.println("</center></body></html>");
    }
}
