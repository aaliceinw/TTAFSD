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
    <center>
        <!using JSP tag : include "master.html" page-->
        <jsp:include page="master.html"/>
        
    <h3>Student Create</h3>
    
    <!create form for student records-->
    
    <form action="insert" method="get">
       
        <table border="5">
           
                 <tr>
                    <td>Student ID:</td>
                    <td><input type="text" name="sid" value="" placeholder="Record Number"/></td>
                </tr>
                <tr>
                    <td>First Name:</td>
                    <td><input type="text" name="firstname" value="" placeholder="First Name" /></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><input type="text" name="lastname" value="" placeholder="Last Name"/></td>
                </tr>
             
                <tr>
                    <td>Score:</td>
                    <td><input type="text" name="score" value="" placeholder="Score" /></td>
                </tr>
                 <tr>
                     <td><input type="submit" value="Submit" /></td>
                     <td><input type="reset" value="Clear" /></td>
                </tr>
                
           
        </table>

        
        
    </form>
    
        </center>
    </body>
</html>
