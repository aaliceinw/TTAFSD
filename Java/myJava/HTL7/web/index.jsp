<%-- 
    Document   : index
    Created on : 27 Jun 2021, 12:52:23
    Author     : joanlaine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>     Welcome to Change Management Essentials!
            
         
                <form  action = "LoginServlet" method="POST">
                    
                   Name: <input type="text" name="uname" value="" />
                    Password <input type="password" name="upass" value="" />
                    <br/>
                    <input type="submit" value="Login" name="submit" />
                    <br/>
                    <input type="reset" value ="Clear" name="reset"/>
                    
                </form>
         </center>
  
</html>
