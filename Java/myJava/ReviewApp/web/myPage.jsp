<%-- 
    Document   : myPage
    Created on : 25 Jun 2021, 10:59:26
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
        <%
            String uname = request.getParameter("uname");
            out.print("Welcome" +uname);
            
            %>
            
            <hr/>
            <h1/>Welcome <%=uname%></h1>
    </body>
</html>
