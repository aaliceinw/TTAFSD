<%-- 
    Document   : profile
    Created on : 29 Jun 2021, 00:15:31
    Author     : joanlaine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>profile</title>
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
              request.getRequestDispatcher("login4.jsp").include(request, response);
          }
          else
          {
          %>
        
    <center>
        <h1/>World Class Tours</h1> 
  </center>
    <hr/>
    <p> Book your trip today.</p>
    <hr/>
    <form action="logout">
        <input type="submit" value="Logout" />
    </form>
    
    <%
        }
  %>
  
    </body>
</html>
