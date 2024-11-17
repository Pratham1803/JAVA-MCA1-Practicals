<%-- 
    Document   : que1
    Created on : 14-Nov-2024, 1:50:06 pm
    Author     : prath
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1>Hello User, Today Date Is: </h1>
            <% Date date = new Date();%>
            <%= date %>                    
            
            <h3>
                Day = <%=date.getDate() %>
            </h3>
            <h3>
                Month = <%=date.getMonth()%>
            </h3>
            <h3>
                Year = <%=date.getYear()%>
            </h3>
    </body>
</html>
