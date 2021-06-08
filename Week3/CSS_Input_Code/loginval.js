//Defining function to enter first name
function show()
{
    {
    var firstname = document.getElementById("t1").value;
    if(firstname=="" || firstname==null)
    {
        //alert(Please enter First Name)
        document.getElementById("msg").innerText="Please enter your First Name";
    }

    else{
        //alert(Thank you for entering your +t1;
        document.getElementById("msg").innerText = "Thank you "+firstname;
    }
}

}
//Defining function to enter last name)
function show()
{
    {
    var lastname = document.getElementById("t2").value;
    if(lastname=="" || lastname==null)
    {
        //alert(Please enter Last Name)
        document.getElementById("msg").innerText="Please enter your Last Name";
    }

    else{
        //alert(Thank you for entering your +t2);
        document.getElementById("msg").innerText = "Thank you "+lastname;
    }
}
}

//Defining function to enter password
{
    {
    var password = document.getElementById("pw1").value;
    if(password=="" || password==null)
    {
        //alert(Please enter Password);
        document.getElementById("msg").innerText="Please enter Password";
    }

    else{
        //alert(Thank you for Password);
        document.getElementById("msg").innerText = "Thank you "+firstname;
    }
}
}

//Defining function to validate password
{
    {
    var vpassword = document.getElementById("pw2").value;
    if(vpassword=="" || vpassword==null)
    {
        //alert(Please confirm password);
        document.getElementById("msg").innerText="Please confirm password";
    }

    else{
        //alert(Thank you);
        document.getElementById("msg").innerText = "Thank you "+firstname;
    }
}
}