/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package que11;

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

public class Q11ServletConfig extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig config = getServletConfig();
        setScreen(resp.getWriter(), config.getInitParameter("uniName"));
    }
    
    private void setScreen(PrintWriter out, String msg) {
        out.println("<html><head><title>Q11 Servlet Config</title></head><body style=\"background-color: pink;\">");
        out.println("<center>");
        out.println("<h1>Initilized Parameter: ");
        out.println(msg + "</h1>");        
        out.println("</center></body></html>");
    }
}
