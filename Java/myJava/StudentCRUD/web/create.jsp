<%-- 
    Document   : create
    Created on : 29 Jun 2021, 10:54:43
    Author     : joanlaine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Student</title>
    </head>
    <body style="background-color:powderblue;">
        <!using JSP tag : include "master.html" page-->
        <jsp:include page="master.html"/>
        
    <h3>Student Create</h3>
    
    <!create form for student records-->
    
    <form action="" method="get">
        <center>
        <table border="5">
           
                <tr>
                    <td>Student ID:</td>
                    <td><input type="text" name="sid" value="" /></td>
                </tr>
                <tr>
                    <td>First Name:</td>
                    <td><input type="text" name="fname" value="" /></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><input type="text" name="lname" value="" /></td>
                </tr>
                </tr>
                <tr>
                    <td>Score:</td>
                    <td><input type="text" name="Score" value="" /></td>
                </tr>
                 <tr>
                     <td><input type="submit" value="Submit" /></td>
                     <td><input type="reset" value="Clear" /></td>
                </tr>
                
       </center>     
        </table>

        
    </center>    
    </form>
    
    
    </body>
</html>