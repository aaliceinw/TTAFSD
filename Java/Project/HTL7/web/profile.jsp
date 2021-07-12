<%-- 
    Document   : profile.jsp
    Created on : 10 Jul 2021, 12:41:56
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
        <h1>HTL7 - Login and Logout - Welcome</h1>
        
       
        
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
              request.getRequestDispatcher("HTL5login.jsp").include(request, response);
          }
          else
          {
          %>
<br><br>

<!--   
           <h3>My Website </h3> 
           
        <form action="logout" method ="post">
            
         <input type ="submit" value = "logout">
    </body>-->

    
</html>
