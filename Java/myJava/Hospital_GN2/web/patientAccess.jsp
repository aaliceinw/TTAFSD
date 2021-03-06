<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.hospital.model.MyConnection"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>patient</title>
        <link rel="stylesheet" type="text/css" href="style.css" media="screen" />
    </head>
    <body>
      <div id="main_container">
  <div class="header">
    <div id="logo"><a href="index.jsp"><img src="images/logo.png" alt="" width="162" height="54" border="0" /></a></div>
    <div class="right_header">
        <div class="top_menu"> <a href="login.jsp" class="login">login</a>  <a href="logout" class="sign_up">Logout</a> </div>
     <div id="menu">
        <ul>
          <li><a class="current" href="index.jsp">Home</a></li>
    </ul>
      </div>
    </div>
  </div>
  <div id="middle_box">
    <div class="middle_box_content"><img src="images/banner_content.jpg" alt="" /></div>
    </div>
         <center>
             <%
             String name = request.getAttribute("name").toString();
             request.setAttribute("name",name);
             %>
             <div class="form">
        <form action="booking" method="post">
            <h1> Patient Access Form</h1>
            <fieldset>
            <table border="1">
                <tr>
                    <td>Patient Name:</td>
                    <td><input type="text" name="name" value="<%= name%>"/></td>
                </tr>
                <tr>
                    <td>Phone Number:<input type="text" name="phone" value="" /> </td>
                    <td>Date of Birth: <input type="date" name="dob" value="" /></td>
                </tr>
                <tr>
                    <td>Problem:<textarea name="problem" rows="4" cols="20"></textarea> </td>
                </tr>

                     <%
       Connection con = MyConnection.connect();
       Statement stmt = con.createStatement();
       ResultSet rs1 = stmt.executeQuery("select * from doctor");
       %>
       <td><select name="docName">
             <%
       while(rs1.next())
       {
           %>
           <option value=<%= rs1.getString("docName")%>><%=rs1.getString("docName")%>
           </option>
                   <%
                   }
                   %>
           </select>
                   </td>
                </tr>
                <tr>
            <td>Booking Date: <input type="date" name="bookingDate" /></td>
                </tr>
                <br/>
                <tr>
                    <td><input id="s1" type="submit" value="Book" /></td>
                    <td><input id="s1" type="reset" value="Clear" /></td>
                </tr>
       </table>      
                            </fieldset>
                                 </form>
                                </div>
                                </div>    
                            </center>
    </body>
</html>