<!--
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>doctor Access</title>
         <link rel="stylesheet" type="text/css" href="style.css" media="screen" />
    </head>
    <body>
      <div id="main_container">
  <div class="header">
    <div id="logo"><a href="#"><img src="images/logo.png" alt="" width="162" height="54" border="0" /></a></div>
    <div class="right_header">
      <div class="top_menu"> <a href="login.jsp" class="login">login</a> <a href="welcome.jsp" class="sign_up">Register</a> <a href="welcome.jsp" class="sign_up">Sign Out</a></div>
      <div id="menu">
        <ul>
          <li><a class="current" href="index.jsp">Home</a></li>
          <li><a href="bookings.jsp" target="f1">Bookings</a></li>
          <li><a href="treatment.jsp">Treatments</a></li> 
          <li><a href="displayRecords.jsp">Treatments</a></li>
        </ul>
      </div>
    </div>
  </div>
    <center>
            <h3>BOOKING DETAILS</h3>
            <form action="treat" method="post">
                <table border="1">
                        <tr>
                            <td> <b>Patient Name:</b> </td>
                          <td><select name="pname">
                                    <option></option>
                                    <option></option>
                                </select></td>
                        </tr>
                        <tr>
                            <td> <b>Patient Phone:</b> </td>
                            <td><select name="phone">
                                    <option></option>
                                    <option></option>
                                </select></td>
                        </tr>
                        <tr>
                            <td> <b>Date:<select name="date">
                                        <option></option>
                                        <option></option>
                                    </select></b> </td>
                        </tr>
                        <tr>
                            <td> <b>Patient ProblemProblem: </b> </td>
                            <td>     <iframe name="f1" frameborder="0" scrolling="yes"
                                    style="overflow: hidden; height: 100%;
                                                width: 49%; float: left; " height="100%" width="49%"
                                   align="left">
                                  </iframe>
                        </tr>
                        <tr>
                            <td><b>Prescribe Treatment: </b></td>
                            <td><textarea name="ptreat" rows="4" cols="30">
                                </textarea></td>
                        </tr>
                         <tr>
                            <td><b>Prescribe Test: </b></td>
                            <td><textarea name="ptest" rows="4" cols="30">
                                </textarea></td>
                        </tr>
                        <center>
                            <tr>
                                <td><input type="submit" value="Update Records" target="f1"/> </td>
                                <td><input type="reset" value="Cancel" /></td>
                            </tr>
                        </center>
                </table>
            </form>
            </center>
    </body>
</html>
-->

<%@page import="java.sql.*"%>
<%@page import="com.hospital.model.MyConnection"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>doctor Access</title>
         <link rel="stylesheet" type="text/css" href="style.css" media="screen" />
    </head>
    <body>
      <div id="main_container">
  <div class="header">
    <div id="logo"><a href="#"><img src="images/logo.png" alt="" width="162" height="54" border="0" /></a></div>
    <div class="right_header">
      <div class="top_menu"> <a href="login.jsp" class="login">login</a> <a href="welcome.jsp" class="sign_up">Register</a> <a href="welcome.jsp" class="sign_up">Sign Out</a></div>
      <div id="menu">
        <ul>
          <li><a class="current" href="index.jsp">Home</a></li>
          <li><a href="bookings.jsp" target="f1">Bookings</a></li>
         <!-- <li><a href="treatment.jsp">Treatments</a></li> -->
          <li><a href="displayRecords.jsp">Treatments</a></li>
        </ul>
      </div>
    </div>
  </div>
    <center>
            <h3>BOOKING DETAILS</h3>
            <form action="treat" method="post">
                     <%
       Connection con = MyConnection.connect();
       Statement stmt = con.createStatement();
       ResultSet rs = stmt.executeQuery("select * from patient");
       %>
       <input list="patients" name="patient">
          <datalist id="patients" >
              <%
       while(rs.next())
       {
            int p1 = rs.getInt("phone");
           String p2 = rs.getString("name");
            String p3 = rs.getString("dob");
             String p4 = rs.getString("problem");
           %>
           <option value=<%= p1%>>
                 <option value=<%= p2%>>
                       <option value=<%= p3%>>
                             <option value=<%= p4%>>
        <%
       }
       %>
       </datalist>
           </form>
        <%
       ResultSet rs1 = stmt.executeQuery("select * from patient");
       %>
         <table border="1">
             <%
       while(rs1.next())
       {
           %>
                        <tr>
                             <td><%=rs1.getString("phone")%></td>
                            <td><%= rs1.getString("name")%></td>
                               <td><%=rs1.getString("dob")%></td>
                               <td><%=rs1.getString("problem")%></td>
                        </tr>
                        <tr>
                            <td><b>Prescribe Treatment: </b></td>
                            <td><textarea name="treat" rows="4" cols="30">
                                </textarea></td>
                        </tr>
                         <tr>
                            <td><b>Prescribe Test: </b></td>
                            <td><textarea name="test" rows="4" cols="30">
                                </textarea></td>
                        </tr>
                        <center>
                            <tr>
                                <td><input type="submit" value="Update Records" target="f1"/> </td>
                                <td><input type="reset" value="Cancel" /></td>
                            </tr>
                        </center>
                         <%
       }
       %>
                </table>
            </center>
    </body>
</html>
