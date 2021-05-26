alert("Welcome to Javascript class");

//use this to write comments in the code
/* this is how we write multipline comments in the code*/

//Javascript variable
var data1;
var data2,data3,data4;

// storename
var name = "Vaibhavi"; // String => ""
var number = 100; // Number


//method 1
var n1 = "Cat";

//method 2
var n2;
n2 = "Kittty";

//method 3
n3 = 12;

//---------------------------

// display output
document.write("This is how to display javascript output. ");
document.writeln("");
document.write("My Name Is "+n1);
document.writeln("");
document.writeln("Hello!"); //newline
document.writeln("Bye!");

/* Javascript operator */

var result;
var num1, num2;

//1. Arithmatic
result = 10 +2;
//or
num1 = 10; //String
num2 = 2; //String
result = num1 + num2;
document.writeln("Addition is "+result );
document.writeln(num1+ "+" +num2+ "="+result);

num1 = 3
num2 = 4

document.writeln("Difference :"+(num1 - num2));
document.writeln("Multiplication :"+(num1 * num2));

num1 = 10
num2 = 2
// num1 / num2 = 5 (reminder = 0)
document.writeln("Division :"+(num1 / num2));
document.writeln("Reminder :"+(num1 % num2));

//2. Arithmic Operator
//result = 5;
result = result + result +num1; //5+10--> result
result = result +num1;//5+10--> result
result += num1 ;
document.writeln("Result = "+result);

//3. Comparision : true(Yes) | false(No) =:Boolean
// Q. Is 10 bigger than 2-> Yes
result = 10 > 2;
document.writeln("10 > 2 ="+result);
result = 10 < 2;
document.writeln("10 < 2 ="+result);

var s1 = "abc";
//var s2 = "xyz";
var s2 = "abc"
result = s1 == s2;
// = Assignment
// == equality
document.writeln("Check String equality ="+result);

//4.Logical Operator (it is always a comparison of stm1 op stm2)=> boolean
/* 

AND-> &&
stmt1   stmt2  &&
T       T       T
T       F       F
F       T       F
F       F       F

OR-> ||
stmt1   stmt2  ||
T       T       T
T       F       T
F       T       T
F       F       F

*/
// Q. check given number is divisible by 5 and 3? (Input = 12)
//answer: if reminder of "12/5" is equal to "0"
var input = 12;
result = input % 5;// 12 % 5 = 2
result1 = input % 3;//12 % 3 = 0
document.writeln("reminder ="+result);

var stmt1 = result == 0;//boolean (true or false)
var stmt2 = result1 == 0;//boolean (treu | false)
document.writeln("stmt1 ="+stmt1);//false
document.writeln("stmt2 "+stmt2);//true

// 5 and 3
var check = (input % 5 == 0) && (input % 3 == 0);
document.writeln("12 is divided by 5 and 3 ="+check);

// 5 and 3
var check = (input % 5 == 0)|| (input % 3 == 0);
document.writeln("12 is divided by 5 or 3 ="+check);

//Q. check whether the user is valid or not => login
/*
username = "admin"
password = "admin"

*/

var username ="admin";
var password ="admin";

var input1 = "v";//user input
var input2 = "v123";//user input

check = (input1==username) && (input2==password);
document.writeln("Is user valid :"+check);

// logical not !
result = 10 < 2;//false
document.writeln("10 is greater than 2 ="+result);
check =!result; //!false => true
document.writeln("after negation :"+check);