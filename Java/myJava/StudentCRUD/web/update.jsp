<%-- 
    Document   : update
    Created on : 29 Jun 2021, 10:55:33
    Author     : joanlaine
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Student</title>
    </head>
    <body>
    <center>
        <jsp:include page="master.html"/>
        <h1>Update Student Records</h1>


 <!--
        Create a <form> for accepting "sid" and "score"
        on "submit button" call action "update"
        
        -->
        
 <form action="update" method="get">
      
        <table border="5">
           
                 <tr>
                    <td>Student ID:</td>
                    <td><input type="text" name="sid" value="" placeholder="Record Number"/></td>
                </tr>
                <tr>
                    <td>Update Score:</td>
                    <td><input type="text" name="score" value="" placeholder="Update Score"/></td>
                </tr>
                 <tr>
                     <td><input type="submit" value="Update" /></td>
                     <td><input type="reset" value="Clear" /></td>
                </tr>
                
      
        </table>

  
      
    </form>
  
    </center>    
</html>
