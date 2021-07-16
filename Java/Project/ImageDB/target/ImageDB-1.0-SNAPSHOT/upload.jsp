<%-- 
    Document   : upload
    Created on : 13 Jul, 2021, 3:06:58 PM
    Author     : vaibh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <body>
        <h1>File Upload to Database</h1>
        <form name="fileform" method="post" action="uploadServlet" enctype="multipart/form-data">
            <label for="firstName">First Name:</label>
            <input type="text" name="firstName" size="50" placeholder="Enter Your FirstName" required/><br><br>
            <label for="lastName">Last Name: </label>
            <input type="text" name="lastName" size="50" placeholder="Enter Your LastName" required/><br><br>
            <label for="photo"> Portrait Photo:  </label>
            <input type="file" name="photo" size="50" placeholder="Upload Your Image" required/><br><br>
            <input type="submit" value="Save">
        </form>
    </body>
    </body>
</html>
