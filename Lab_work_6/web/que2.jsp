<%-- 
    Document   : que2
    Created on : 14-Nov-2024, 2:05:37 pm
    Author     : prath
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Program 2</title>
    </head>
    <body>
    <center>
        <h1>Calculator</h1>
        <form action="#" method="post">
            Enter Number : <input type="number" name="txtNum1" /> <br><br>
            Enter Number : <input type="number" name="txtNum2" /> <br><br><br>
            <input type="submit" name="btnSubmit" value="Addition"/>
            <input type="submit" name="btnSubmit" value="Substraction"/><br><br>
            <input type="submit" name="btnSubmit" value="Multiplication"/>
            <input type="submit" name="btnSubmit" value="Division"/><br><br>
        </form>
        <%
            if(request.getParameter("btnSubmit") != "" 
            && request.getParameter("txtNum1") != "" 
            && request.getParameter("txtNum2") != ""){
            
                int num1 = Integer.parseInt(request.getParameter("txtNum1"));
                int num2 = Integer.parseInt(request.getParameter("txtNum2"));            
                String task = request.getParameter("btnSubmit");

                if(task.equals("Addition")){
                    out.println("<h3>"+num1 + " + " + num2 +" = " + (num1 + num2)+"</h3>");
                }else if(task.equals("Substraction")){
                    out.println("<h3>"+num1 + " - " + num2 +" = " + (num1 - num2)+"</h3>");
                }else if(task.equals("Multiplication")){
                    out.println("<h3>"+num1 + " * " + num2 +" = " + (num1 * num2)+"</h3>");
                }else if(task.equals("Division")){
                    if(num2 == 0){
                        out.println("<h3>Num2 should not be 0!!</h3>");
                    }
                    out.println("<h3>"+num1 + " / " + num2 +" = " + (num1 / num2)+"</h3>");
                }                
            }            
        %>
    </center>
</body>
</html>
