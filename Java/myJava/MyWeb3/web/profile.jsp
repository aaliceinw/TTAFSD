<%-- 
    Document   : profile
    Created on : 23 Jun 2021, 15:10:30
    Author     : joanlaine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Profile</title>
    </head>
    <body>
        
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
        
    <center>
        <h1/>Discover World Tours</h1> 
  </center>
    <hr/>
    <p> buy your book</p>
    <hr/>
    <form action="logout">
        <input type="submit" value="Logout" />
    </form>
    
    <%
        }
  %>
  
  
    </body>
</html>
