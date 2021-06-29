<%-- 
    Document   : index
    Created on : 29 Jun 2021, 09:14:50
    Author     : joanlaine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TestPgCon</title>
    </head>
    <body>
    <center>
        <h1>Test Page Connection</h1>
        
        
        <form name="myform" action="DisplayServlet">
        
        <table border="4" >
           
            <tbody>
                <tr>
                    <td>User Name: </td>
                    <td><input type="text" name="uname" value="" /></td>
                    
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><input type="password" name="upass" value="" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login" name="login" /></td>
                    <td><input type="reset" value="Clear" name="reset" /></td>
                </tr>
            </tbody>
        </table>
    </form>
        
    </center>    
    </body>
</html>
