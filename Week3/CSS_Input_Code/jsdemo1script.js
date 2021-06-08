//function 1
function display()
{
    alert("You click button");
}

//function 2: with parameter
function cube(number)
{
    alert(number * number * number);
}

//function 3: getting element value
function show()
{
    var uname = document.getElementById("t1").value;
    if(uname=="" || uname==null)
    {
        //alert("Please enter name");
        document.getElementById("msg").innerText = "Please enter name";
    }
    else{
        //alert("Wow.. very nice name "+uname);
        document.getElementById("msg").innerText = "Wow.. very nice name "+uname;
    }
   
}

//function 4: passing "this" as parameter
function changeColor(val)
{
    if(val.value==""||val.value==null)
    {
        val.style.background = "red";
    }
    else
    {
        val.style.background = "white";
    }
}

//function 5: 
function add()
{
    var num1 = document.getElementById("n1").value;//to get value
    var num2 = document.getElementById("n2").value;//to get value
    //convert String into number(int, double)
    //in-built function -> parseXXX(value);
    //xxx -> Int | Double
    var result = parseInt(num1) + parseInt(num2);//numbers
    //set value to result
    document.getElementById("r1").value = result;

}