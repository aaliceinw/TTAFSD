<%-- 
    Document   : display
    Created on : 25 Jun 2021, 11:08:48
    Author     : joanlaine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
      <h3> JSP Test</h3>
        <hr/>
        <form name ="myForm" action="AnyName" method="post"><br/>
            User Name: <input type="text" name="uname"/>
            Password: <input type="password" name="upass" value="" />
            Email:<input type="text" name="email" value="" />
            <br/>
            <input type="submit" value="Display"/>
        </form>
</html>
