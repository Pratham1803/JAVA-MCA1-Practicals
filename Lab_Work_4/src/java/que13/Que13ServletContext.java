/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package que13;

import jakarta.servlet.ServletContext;
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

public class Que13ServletContext extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        setScreen(resp.getWriter(), context.getInitParameter("college"));
    }
    
    private void setScreen(PrintWriter out, String msg) {
        out.println("<html><head><title>Q13 Servlet Context</title></head><body style=\"background-color: pink;\">");
        out.println("<center>");
        out.println("<h1>Initilized Parameter [Servlet Context]: ");
        out.println(msg + "</h1>");        
        out.println("</center></body></html>");
    }
}
