<%-- 
    Document   : TestHome
    Created on : 28 Jun 2021, 23:27:36
    Author     : joanlaine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World Test Home !</h1>
        
        <center>
            <%
        
        session = request.getSession(false);
        //false -> using already created session
        //true -> create new session
        String uname = session.getAttribute("myuser").toString();//Object ->String
        
        %>
        
        
        <h2>Hello World Logout Test </h2> 
           
        <form action="logout" method ="post">
            
        <input type ="submit" value = "logout">
        </form>
        
            
    </center>
           
    </body>
</html>
