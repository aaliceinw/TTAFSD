<%-- 
    Document   : display
    Created on : 29 Jun 2021, 10:54:56
    Author     : joanlaine
--%>

<%@page import="com.ttafsd.model.MyConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Student</title>
    </head>
    <body><center>
        <jsp:include page="master.html"/>
        
        <h1>Display Student List</h1>
        
        
        <!--Database code to display all records-->
        <%
        try
        {
        Connection con = MyConnection.connect();//get connection
        Statement stmt = con.createStatement();//create statement
        String qry = "select * from student";//select query to display all records
        ResultSet rs = stmt.executeQuery(qry);//execute query
        %>
        <!Database code to display all records in a table from ResultSet in browser>
        <table  border="1" padding="10">
        <%    
                //get one by one record from ResultSet
                while(rs.next())
                {
        %>            
                    <tr>
                        <td><%= rs.getInt(1)%></td>
                        <td><%= rs.getString(2)%></td>
                        <td><%= rs.getString(3)%></td>
                        <td><%= rs.getInt(4)%></td>
                    </tr>
        <%
                    
                }//while ends
        %>
            </table>       
        <%        
            }//try ends
            catch(Exception ex)
            {
                System.out.println("Display error :"+ex);
            }//catch ends
        
        %>
       
    </center>   
    </body>
</html>
