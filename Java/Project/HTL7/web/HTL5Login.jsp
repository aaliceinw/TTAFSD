<%-- 
    Document   : HTL5Display
    Created on : 9 Jul 2021, 13:30:14
    Author     : joanlaine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
    </head>
    <body>
        <h1>UserLogin</h1>
    <center>
         <form action="check" method="post">
       
        <table border="5">
           
                 <tr>
                    <td>User Name:</td>
                    <td><input type="text" name="uname" value="" placeholder="uname"/></td>
                </tr>
               
                <tr>
                    <td>Password:</td>
                    <td><input type="text" name="pwd" value="" placeholder="Enter Password"/></td>
                </tr>
             
               
                 <tr>
                     <td><input type="submit" value="Login" /></td>
                     <td><input type="reset" value="Clear" /></td>
                </tr>
                
           
        </table>

        
        
    </form>
    
        </center>
        
</html>
