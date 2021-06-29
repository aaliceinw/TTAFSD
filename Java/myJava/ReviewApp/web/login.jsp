<%-- 
    Document   : login
    Created on : 25 Jun 2021, 11:17:40
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
          <h3>Hello World Login Test4!</h3>
        <hr/>
        
        <form method="POST" enctype="multipart/form-data">
            User Name: <input type="text" name="uname" value="" />
            <br/>
            Password:<input type="password" name="upass" value="" />
            <br/>
            <input type="submit" value="Login" />
            <input type="reset" value="Clear" />
       
        </form>
    </body>
</html>
