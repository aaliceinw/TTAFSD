!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Profile</title>
    </head>
    <body>
        
        <%
                       
        session=request.getSession(false);  
        if(session!=null){  
        String name=(String)session.getAttribute("myuser"); 
            if(name==null)
            {
               %>
               <h3 style="color: red">Please Login First</h3>
        <% 
                request.getRequestDispatcher("HTL7login.jsp").include(request, response);  
            }
            else
            {       

            out.print("Hello, "+name+" Welcome to Profile"); 
            %>
    <center>
        <h1>E-Book Website</h1>
        <hr/>
        <p>Buy your Book</p>
        <hr/>
        <form action="logout">
            <input type="submit" value="Logout"/>
        </form>
    </center>
            <%

            }  
        }
        
        %> 
        
   
    </body>
</html>
