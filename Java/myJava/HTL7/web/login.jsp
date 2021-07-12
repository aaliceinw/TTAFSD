<%-- 
    Document   : login
    Created on : 27 Jun 2021, 15:09:27
    Author     : joanlaine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>loginpage`</title>
    </head>
    <body>
    <center>
        <h2>Login Page</h2>
        <hr/>
        <table>
        <form action="login.jsp" method=post name="login">
            <td>User Name: <input type="text" name="uname" value="" /></td>
            
            <td>Password: <input type="password" name="upass" value="" /></td>
            <br/>
            <td><input type="submit" value="Login" name="submit" /></td>
            <td><input type="reset" value ="Clear" name="reset"></td> 
        </form>
        </table>    
            </center>
    </body>
</html>
