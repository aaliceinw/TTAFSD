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
                <h2>User Login4</h2>
        
        <form action="profile4" method="POST">
            <table border="1" cellpadding="10">
              
               
                    <tr>
                        <td>User Name</td>
                        <td><input type="text" name="uname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="upass" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Login" /></td>
                        <td><input type="reset" value="Clear" /></td>
                    </tr>
                
            </table>
    </center>  
    </body>
</html>
