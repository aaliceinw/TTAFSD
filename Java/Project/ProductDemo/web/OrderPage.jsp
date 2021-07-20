<%-- 
    Document   : orderPage
    Created on : 19 Jul, 2021, 2:59:21 PM
    Author     : vaibh
--%>

<%@page import="java.sql.*"%>
<%@page import="com.tta.model.MyConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="order">
            
       <%
          
           
       Connection con = MyConnection.connect();
       Statement stmt = con.createStatement();
       
       ResultSet rs = stmt.executeQuery("select * from myitem");
       %>
       <input list="items" name="myitem">
          <datalist id="items" >
          
       <%
       while(rs.next())
       {
           String iname = rs.getString("itemName");
           %>
      
           <option value=<%= iname%>>
        <%
       }
       %>
       </datalist> 
        
       <input type="submit" value="Add"/>
     </form>
       
       <%
       ResultSet rs1 = stmt.executeQuery("select * from myorder");
       %>
       <table border="1">
       <%
       while(rs1.next())
       {
           %>
           <tr>
               <td><%= rs1.getString("itemName")%></td>
               <td><%= rs1.getDouble("price")%></td>
           </tr>
           <%
       }
       
       %>
       </table>
       <%
       ResultSet rs2 = stmt.executeQuery("select sum(price) from myorder");
       double bill = 0.0;
       if(rs2.next())
       {
           bill = rs2.getDouble(1);
       }
       %>
       Total Bill = <%= bill%>
       <br/>
       
    </body>
</html>
