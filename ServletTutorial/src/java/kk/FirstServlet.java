package kk;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author prath
 */
@WebServlet(name = "FirstServlet", urlPatterns = {"/FirstServlet"})
public class FirstServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        
        req.setAttribute("num", num1+num2);        
        
        RequestDispatcher rd = req.getRequestDispatcher("sq");
        rd.forward(req, resp);
    }   
}
