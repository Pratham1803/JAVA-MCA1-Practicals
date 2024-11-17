/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package que8;

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
public class Que8Calculation extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1 = req.getParameter("txtNum1");
        String num2 = req.getParameter("txtNum2");
        String oper = req.getParameter("rbOper");

        if (num1.isEmpty() || num2.isEmpty() || num1 == null || num2 == null || oper.isEmpty() || oper == null) {
            setScreen(resp.getWriter(), "Fill The Form Correct!!");
        } else {
            int num1Int = Integer.parseInt(num1);
            int num2Int = Integer.parseInt(num2);
            if (oper.equals("Add")) {
                setScreen(resp.getWriter(), "Addition = " + (num1Int + num2Int));
            } else if (oper.equals("Sub")) {
                setScreen(resp.getWriter(), "Subtraction = " + (num1Int - num2Int));
            } else if (oper.equals("Mul")) {
                setScreen(resp.getWriter(), "Multiplication = " + (num1Int * num2Int));
            } else if (oper.equals("Div")) {
                setScreen(resp.getWriter(), "Division = " + ((float) num1Int / num2Int));
            } else {
                setScreen(resp.getWriter(), "Something Went Wrong!!");
            }
        }
    }

    private void setScreen(PrintWriter out, String msg) {
        out.println("<html><head><title>Registration Page</title></head><body style=\"background-color: pink;\">");
        out.println("<center>");
        out.println("<h1 style=\"color: blue;\">" + msg + "</h1>");
        out.println("<a href='Q8RadioCalc.html'>Back</a>");
        out.println("</center></body></html>");
    }
}
