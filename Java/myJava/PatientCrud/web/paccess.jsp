<%-- 
    Document   : create
    Created on : 2 Jul 2021, 09:34:24
    Author     : joanlaine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patient Login</title>
    </head>
    <body style="background-color:peachpuff;">
    <center>
        <!using JSP tag : include "master.html" page-->
        <jsp:include page="master.html"/>
        
    <h3>Patient Login</h3>
    
    <!create form for student records-->
    
    <form method="POST">
        
        <table border="5" cellpadding="10">
          
                <tr>
                    <td>Doctor ID: <input type="text" name="docid" value="" placeholder="Doctor Id"/></td>
                    <td>Name of Doctor: <input type="text" name="docname" value="" placeholder="Doctor's Name"/></td>
                   <tr/> 
                    <td>Address:<input type="text" name="Address" value="" placeholder="Doctor's Address"/></td>
                    <td>Phone Number:<input type="text" name="dphone" value="" /></td>
                    <tr>
                        <td><select name="ddob" multiple="multiple">
                                <option>DD</option>
                                <option>MM</option>
                                <option>YYYY</option>
                            </select></td>
                            <td>Degree: <input type="text" name="degree" value="" placeholder="Degrees"/></td>
                           
                </tr>
                
                
                <tr>
                    <td>Speciality: <input type="text" name="speciality" value="" placeholder="Speciality" /></td>
                    <td>Password: <input type="password" name="" value="" /></td>
                    
                </tr>
                <tr>
                    <td><input type="submit" value="Save" /></td>
                    <td><input type="reset" value="Cancel" /></td>
                </tr>
               
        </table>

        
        
    </form>
    
    </body>
</html>
