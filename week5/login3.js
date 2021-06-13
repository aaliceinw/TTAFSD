
  function alert(){
    var fname = document.getElementById("t1").value;
    if( fname=="" || fname==null)
    {
        //alert enter first name
        document.getElementById("msg").innerHTML = "Enter First Name";
    }
    else
    {
        //confirm first name input 
        document.getElementById("Your Entered ");
}

function alert(){
    var lname = document.getElementById("t2").value;
    if( lname=="" || lname==null)
    {
        //alertlast name
        document.getElementById("msg").innerHTML = "Enter Last Name";
    }
}

function alert(){
    var pw1 = document.getElementById("pw1").value;
    if( pw1 =="" || pw1==null)
    {
        //alert enter password
        document.getElementById("msg").innerHTML = "Enter Password";
    }
}

function alert(){
    var btn = document.getElementById("btn").value;
    if( pw2 =="" || pw2==null)
    {
        //alert enter password
        document.getElementById("msg").innerText = "Complete form and press submit";
    }
}

  }
