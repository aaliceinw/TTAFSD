<%-- 
    Document   : profile
    Created on : 21 Jul 2021, 09:22:02
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
                       
        session=request.getSession(false);  
        if(session!=null){  
        String name=(String)session.getAttribute("myuser"); 
            if(name==null)
            {
               %>
   
        <% 
                request.getRequestDispatcher("login.jsp").include(request, response);  
            }
            else
            {       

            out.print("Hello, "+name+" Welcome to Profile"); 
            %>
       
        <h1>E-Book Website</h1>
        <hr/>
        <p>Buy your Book</p>
        <hr/>
        <form action="logout">
            <input type="submit" value="Logout"/>
        </form>
   
            <%

            }  
        }
        
        %> 
        
    </center>
    </body>
</html>
