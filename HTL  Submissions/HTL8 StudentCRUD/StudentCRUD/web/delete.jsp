<%-- 
    Document   : delete
    Created on : 29 Jun 2021, 10:55:16
    Author     : joanlaine
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Student</title>
    </head>
     <center>
        <jsp:include page="master.html"/>
        <h1>Delete Students</h1>
        
        <!--
        Create <form> accepting "student id",
        on "submit button" call action "delete"
        -->
       
        
        
 <form action="delete" method="get">
       
        <table border="5">
           
                 <tr>
                    <td>Student ID:</td>
                    <td><input type="text" name="sid" value="" placeholder="Record Number"/></td>
                </tr>

                 <tr>
                     <td><input type="submit" value="Delete" /></td>
                     <td><input type="reset" value="Clear" /></td>
                </tr>
                
         
        </table>

        
      
    </form>
  
        
        
        
 
       
    </center>    
</html>
