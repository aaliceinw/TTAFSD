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
    
}


//Defining error variables with a default value
var firstnameErr = lastnameErr = pw1Err = pw2Err = true;

//Validate firstname
if(firstname == "") {
    printError("firstnameErr", "Please enter your first name");
} else {
    var regex = /^[a-zA-Z\s]+$/;                
    if(regex.test(firstname) === false) {
        printError("firstnameErr", "Please enter a valid first name");
    } else {
        printError("firstnameErr", "");
        firstnameErr = false;
    }
}

//Validate last name
if(lastname == "") {
    printError("lastnameErr", "Please enter your lastname address");
} else {
    // Regular expression for basic lastnamevalidation
    var regex = /^\S+@\S+\.\S+$/;
    if(regex.test(lastname) === false) {
        printError("lastnameErr", "Please enter a valid lastname address");
    } else{
        printError("lastname", "");
        lastnameErr = false;
    }
}

    // Validate pw1
    if(pw1 == "") {
        printError("pw1Err", "Please enter your pw1 number");
    } else {
        var regex = /^[1-9]\d{9}$/;
        if(regex.test(pw1) === false) {
            printError("pw1Err", "Please enter a valid 10 digit pw1 number");
        } else{
            printError("pw1Err", "");
            pw1Err = false;
        }
    }
    
  // Validate pw2
  if(pw1 == "") {
    printError("pw2Err", "Please comfirm your password");
} else {
    var regex = /^[1-9]\d{9}$/;
    if(regex.test(pw1) === false) {
        printError("pw2Err", "Passwords dom't match");
    } else{
        printError("pw2Err", "");
        pw1Err = false;
    }
}

//Prevent form from being submit if there are any errors
if((firstnameErr || lastnameErr || pw1Err || pw2) = true) {
    return false;
}else{
    // Creating a string from input data for preview
    var dataPreview = "You've entered the following details: \n" +
                        "First Name: " +firstname + "\n" +
                        "Last Name: " +lastname + "\n" +
                        "Pw1:" +pw1 + "\n" +
                        "Pw2:" +pw2 + "\n" +
 
    //Display input data in a dialog box before submitting the form
    alert(dataPreview);
}
