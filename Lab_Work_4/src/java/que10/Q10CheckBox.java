/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package que10;

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

public class Q10CheckBox extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String favPlayer[] = req.getParameterValues("cbPlayers");
        String value = "";
        
        for(String v : favPlayer){
            value += v+", ";
        }
        
        setScreen(resp.getWriter(), value);
    }   
    
    private void setScreen(PrintWriter out, String msg) {
        out.println("<html><head><title>Registration Page</title></head><body style=\"background-color: pink;\">");
        out.println("<center>");
        out.println("<h1>You Selected Your favourite Players are: </h1>");
        out.println("<h1>" + msg + "</h1>");
        out.println("<a href='Q10MultiCheckBox.html'>Back</a>");
        out.println("</center></body></html>");
    }
}
