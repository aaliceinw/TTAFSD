<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen" />
        <title>welcome</title>
    </head>
    <body>
       <form name="registrationForm" onsubmit="return validateForm()" action="confirmation.php" method="post">
    <h1>Welcome</h1>
    <br/><br/></br>

    <div class="row">
        <label>Select User</label>
        <div class="form-inline">
            <label><input type="radio" name="duser" value="doctor"> Doctor</label>
            <label><input type="radio" name="puser" value="patient"> Patient</label>
        </div>
        <div class="error" id="genderErr"></div>
    </div>
    
    </div>        
    <div class="row">
        <input id=s1 type="submit" value="Submit">
    </div>
</form>
    </body>
</html>
