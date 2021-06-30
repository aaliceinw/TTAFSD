<%-- 
    Document   : create
    Created on : 29 Jun, 2021, 3:24:45 PM
    Author     : vaibh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Student</title>
    </head>
    <body>
        
        <!--Using JSP tag :  include "master.html" page-->
        <jsp:include page="master.html"/>
        
        <h3>Student Create</h3>
        
        <!--create form for student records-->

        <form action="create" method="get">
            Student ID: <input type="text" name="sid"/>
            <br/>
            First Name: <input type="text" name="fname"/>
            <br/>
            Last Name:<input type="text" name="lname"/>
            <br/>
            Score: <input type="text" name="score"/>
            <br/>
            <input type="submit" value="Insert"/>
        </form>
        
        
        
    </body>
</html>
