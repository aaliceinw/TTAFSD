<%-- 
    Document   : CMEHome
    Created on : 27 Jun 2021, 14:36:04
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
    <center>CMEHome (Login Successfully)
        
           <form action="check" name=login method="POST" >
            <table border="1" cellpadding="10">
                

                    <tr>
                        <td>Username:</td>
                        <td><input type="text" value="" name="uname"></td> 
                    </tr>
                    <br/>
                    <tr>
                        <td>User Password:</td>
                        <td><input type="password" name="upass" value="" ></td>
                       
                    </tr>
                    <br/>
                    <tr>
                        <td>Login<input type="submit" value="Login" /></td>
                        <br/>
                        <td>Clear<input type="reset" value="Clear" name="reset" /></td>
                    </tr>
                   
                </tbody>
            </table>

            
       </form>
        
        
        
    </center>
    </body>
</html>
