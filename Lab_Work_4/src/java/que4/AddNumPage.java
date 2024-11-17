package que4;

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
 * @author 24MCA143 pratham rathod
 */
@WebServlet(name = "AddNumPage", urlPatterns = {"/AddNumPage"})
public class AddNumPage extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("txtNum1"));
        int num2 = Integer.parseInt(req.getParameter("txtNum2"));
        
        req.setAttribute("result", (num1 + num2));
        
        RequestDispatcher rd = req.getRequestDispatcher("AddResult");       
        rd.forward(req, resp);
    }   
}