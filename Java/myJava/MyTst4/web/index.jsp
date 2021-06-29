<%-- 
    Document   : index
    Created on : 28 Jun 2021, 21:52:52
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
        <h2>Hello World Test4!</h2>
        <hr/>
        
        <form  action=check method="post">
            Username: <input type="text" name="uname" value="" />
            <br/>
            Password:<input type="password" name="upass" value="" />
            <br/>
            <input type="submit" value="Login" />
            <input type="reset" value="Clear" />
       
        </form>
    </center>     
    </body>
</html>
