<%-- 
    Document   : home
    Created on : 23 Jun 2021, 10:21:02
    Author     : joanlaine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
    <center><h1>Welcome to Shopping Website</h1></center>
    <hr/>
    
    <!--Addition of two numbers-->
    <p> int Number1 = 10</p>
    <p> int Number2 = 20</P>
    <br/>
    <p> int Result = Number1 +Number2</p>
    <hr/>
    
    <!-- Scriplet tag for Java Code -->
   
<%
            String n1 = request.getParameter("num1");//return String
            String n2 = request.getParameter("num2");
            
            int number1 = Integer.parseInt(n1);//String->int
            int number2 = Integer.parseInt(n2);
            
            int Result = number1 + number2;
        
        %>
        <p>Number 1 = <%= number1%></p>
        <p>Number 2 = <%= number2%></p>
        <br/>
        <!--Scriplet Tag to display output-->
        <P>Addition is= <%= Result%></p>
        <hr/>
        
    </body>
</html>
