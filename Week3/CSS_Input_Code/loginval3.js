//Defining a ffunction to display error message
function printError(elemID, hintMsg) {
    document.getElementById(elemID).innerHTML = hintmsg;

}

//defining a function to validate form
function validateForm() {
    //Retrieving the value of form elements
    var firstname = document.loginForm.firstname.value;
    var lastname = document.loginForm.lastname.value;
    var pw1 = document.loginForm.pw1.value;
    var pw2 = document.loginForm.pw2.value;
    var message = document.loginForm.value;
    
}



//Defining error variables with a default value
var firstnameErr = lastnameErr = pw1Err = pw2Err = true;


function validateForm(){
	var firstname = document.forms["loginForm"]["firstname"].value;
	var lastname = document.forms["loginForm"]["lastname"].value;
	var pw1 = document.forms["loginForm"]["pw1"].value;
    var Pw2 = document.forms["loginForm"]["pw2"].value;
	var message = document.forms["loginForm"]["your-message"].value;

	if (firstname.length<1) {
        document.getElementById('firstnameErr').innerHTML = " Please Enter Your First Name *"
    }
    if (lastname.length<1) {
        document.getElementById('lastnameErr').innerHTML = " Please Enter Your Last Name *";
    }
    if (pw1.length<1) {
        document.getElementById('pw1Err').innerHTML = " Please Enter Password *"; 
    }  
    if (pw2.length<1) {
        document.getElementById('pw2Err').innerHTML = "Passwords do not match *"; 
    }
    if (message.length<1) {
        document.getElementById('error-message').innerHTML = " Please complete form*";
    }          
    if(firstname.length<1 || lastname.length<1 || pw1<1 || pw2<1){
       	return false;
    }            
}