<%-- 
    Document   : profile
    Created on : 25 Jun 2021, 11:48:53
    Author     : joanlaine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Profile</title>
    </head>
    <body>
        <h1>Welcome to a new world!</h1>
        <hr/>

    
      <center>
            <%
        
        session = request.getSession(false);
        //false -> using already created session
        //true -> create new session
        String uname = session.getAttribute("myuser").toString();//Object ->String
        
        %>
        
           <h3>Hello </h3> 
           
        <form action="logout" method ="post">
            
         <input type ="submit" value = "logout">
        </form>
        
        <a href="buy.jsp"> Buy Product<a/>
            
    </center>
           
        
        
    </body>
</html>
