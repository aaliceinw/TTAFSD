<%-- 
    Document   : Display
    Created on : 23 Jun 2021, 10:01:38
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
    <center>
        <h3> JSP Test</h3>
        <hr/>
        <form name ="uname" action="show" method="post"><br/>
            User Name: <input type="text" name="username"/>
            Email Address: <input type="text" name="email" value="" />
            <br/>
            <input type="submit" value="Display"/>
        </form>
        
    </body>
</html>
