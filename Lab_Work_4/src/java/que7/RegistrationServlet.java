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

public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {       
        PrintWriter out = resp.getWriter();
        setPage(out);
    }   
    
    private void setPage(PrintWriter out){
        out.println("<html><head><title>Registration Page</title></head><body>");
        out.println("<center><form action='WelcomePage' method='POST'>");
        out.println("Name: <input type='text' id='txtName' name='txtName'/><br>");
        out.println("Email: <input type='email' id='txtEmail' name='txtEmail'/><br>");
        out.println("Password: <input type='password' id='txtPsw' name='txtPsw'/><br><br>");
        out.println("<input type='submit' id='btnSubmit' name='btnSubmit'/><br>");
        out.println("</form></center></body></html>");
    }
}