/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package que14;

import que13.*;
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
public class Que14MultiServletContext extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();

        String college = context.getInitParameter("college");
        String course1 = context.getInitParameter("course1");
        String course2 = context.getInitParameter("course2");

        setScreen(resp.getWriter(), college, course1, course2);
    }

    private void setScreen(PrintWriter out, String msg, String msg2, String msg3) {
        out.println("<html><head><title>Q13 Servlet Context</title></head><body style=\"background-color: pink;\">");
        out.println("<center>");
        out.println("<h1>Initilized Parameter [Servlet Context]: </h1>");
        out.println("<h2>College Name: "+msg + "</h1>");
        out.println("<h2>Course1 : "+msg2 + "</h1>");
        out.println("<h2>Course2 : "+msg3 + "</h1>");
        out.println("</center></body></html>");
    }
}