<%-- 
    Document   : buy
    Created on : 25 Jun 2021, 12:23:20
    Author     : joanlaine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shop</title>
    </head>
    <body>
    <center>
            <%
        
        session = request.getSession(false);
        //false -> using already created session
        //true -> create new session
        String uname = session.getAttribute("myuser").toString();//Object ->String
        
        %>
        
           <h3>Hello <%=uname%></h3> 
           
        <form action="logout" method ="post">
            
         <input type ="submit" value = "logout">
        </form>
        
        <a href="buy.jsp"> Buy Product<a/>
            
    </center>
    </body>
</html>
