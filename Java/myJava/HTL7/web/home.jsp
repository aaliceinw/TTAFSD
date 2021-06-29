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
    <center>CMEHome
        
               <% //get current session
          HttpSession se = request.getSession(false);
          
          String myuser =se.getAttribute("myuser").toString();//Object -> String
          /*
          true -> create new session
          false -> use the current session  
          */
          //check session is new or current
          if (myuser == null || myuser.equals("") || myuser.equals(null))
          {
              
              out.print("You need to login first");
              request.getRequestDispatcher("login.jsp").include(request, response);
          }
          else
          {
          %>
        
          

        
        
        
    </center>
    </body>
</html>
