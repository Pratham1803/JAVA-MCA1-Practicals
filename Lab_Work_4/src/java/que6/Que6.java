package que6;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author prath
 */

public class Que6 implements Servlet {
    ServletConfig config;
    @Override
    public void init(ServletConfig sc) throws ServletException {
        this.config = sc;
        System.out.println("Servlet Initialize");
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
        PrintWriter out= sr1.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1> Welcome Innocent & Beloved Students of MCA-I Div-II   </h1>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    public String getServletInfo() {
        return " This Servlet is Developed by KK";
    }

    @Override
    public void destroy() {
        System.out.println("Servlet Destroyed");
    }
}