<%-- 
    Document   : login4
    Created on : 28 Jun 2021, 22:35:02
    Author     : joanlaine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login4</title>
    </head>
    
    <body>
    <center>
         <form  action=check method="post">
            User Name: <input type="text" name="uname" value="" />
            <br/>
            Password:<input type="password" name="upass" value="" />
            <br/>
            <input type="submit" value="Login" />
            <input type="reset" value="Clear" />
     
        </form>
    </center>  
    </body>
</html>
