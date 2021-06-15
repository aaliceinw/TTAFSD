//alert("Welcome to Javascript class");

// Javascript variable
var data1;
var data2,data3,data4;

// store name or number
var name = "Vaibhavi"; // String => ""
var number = 100; // Number

//method 1
var n1 = "Cat";

//method 2
var n2;
n2 = "Kitty";

//method 3
n3 = 12;

//-------------------------

// display output
document.write("Hi Students !");
document.write("My Name = "+name);
document.writeln("");
document.writeln("hello");//new line
document.writeln("bye");

/* Javascript operator */
 
var result;
var num1 , num2;

// 1. Arithmatic
result = 10 + 2;
//or
num1 = 10;//number
num2 = 2;//number
result = num1 + num2;
document.writeln("Addition is "+result);
document.writeln(num1+"+"+num2+"="+result);

num1 = "10";//String
num2 = "2";//String

result = num1 + num2;
document.writeln("Addition is "+result);
document.writeln(num1+"+"+num2+"="+result);

num1 = 3;
num2 = 4;

document.writeln("Difference :"+(num1 - num2));
document.writeln("Multiplication :"+(num1 * num2));

num1 = 10;
num2 = 2;
// num1 / num2 = 5 (reminder = 0)
document.writeln("Division :"+(num1 / num2));//5
document.writeln("Reminder :"+(num1 % num2));//0


//2. Arithmatic assignment
result = 5;
//result = result + num1;//5+10--> result
result += num1 ; 
document.writeln("Result = "+result);

//3. Comparision : true(Yes) | false(No) => Boolean
// Q. Is 10 bigger than 2?-> Yes
result = 10 > 2; 
document.writeln("10 > 2 = "+result);
result = 10 < 2; 
document.writeln("10 < 2 = "+result);

var s1 = "abc";
//var s2 = "xyz";
var s2 = "abc";
result = s1 == s2;
// = Assignment
// == equality
document.writeln("Check String equality = "+result);


//4. Logical (stmt1 op stmt2)=> boolean
/* 
AND-> &&  
stmt1   stmt2   &&
T       T       T
T       F       F
F       T       F
F       F       F

OR-> ||
stmt1   stmt2   ||
T       T       T
T       F       T
F       T       T
F       F       F

*/
// Q. check given nunber is divisible by 5 and 3? (input = 12)
// answer: if reminder of "12/5" is equal to "0"
var input = 12;
result = input % 5;// 12 % 5 = 2
result1 = input % 3;//12 % 3 = 0
document.writeln("reminder ="+result);
document.writeln("reminder1 ="+result1);

var stmt1 = result == 0;//boolean (true | false)
var stmt2 = result1 == 0;//boolean (true | false)
document.writeln("stmt1 ="+stmt1);//false
document.writeln("stmt2 ="+stmt2);//true

// 5 and 3
var check = (input % 5 == 0) && (input % 3 == 0);
document.writeln("12 is divide by 5 and 3 = "+check);

// 5 or 3
var check = (input % 5 == 0) || (input % 3 == 0);
document.writeln("12 is divide by 5 or 3 = "+check);

// Q. check whether user is valid or not => login
/*
username = "admin" 
password = "admin"
*/

var username = "admin";
var password = "admin";

var input1 = "v";//user input
var input2 = "v123";//user input

check = (input1==username) && (input2==password);
document.writeln("Is user valid :"+check);

// logical not !
result  = 10 < 2;//false
document.writeln("10 is greater than 2 = "+result);
check = !result; // !false => true
document.writeln("after negation :"+check);

/*====================================== */

//1. if -> only true
/*Q. Check age of driver */
var age = 17;
if(age >= 18)
{
    document.writeln("Can drive a car");
}

//2. if_else
age = 17;
if(age >= 18)
{
    document.writeln("Can drive a car");
}
else{
    document.writeln("Can not drive a car")
}

/*Q. check username and password and print message */
var username = "admin";
var password = "admin123";

if(username=="admin" && password=="admin123")
{
    //ok-> login success code
    document.writeln("Welcome to my website :"+username);
}
else{
    //not ok -> login fail code
    document.writeln("Oops.. something went wrong !");
}

// if_else_if ladder
/*Q. check score of student and give grades
90-100 = A+
80-90 = A
70-80 = B
60-70 = C
50-60 = D
<50 = fail
*/
//input = 34
/*
if(cond1)
{

}
else if(cond2){

}
else if(cond3){

}
else if(cond4)
{

}
else{

}
*/

//2. switch_case
var choice = 6;
switch(choice)
{
    case 1:
        document.writeln("I am in case 1");
        break;
    case 2:
        document.writeln("I am in case 2");
        break;
    case 3:                
        document.writeln("I am in case 3");
        break;
    default:
        document.writeln("Please give valid choice");
}

/*Q. create calculator -> + - * / % */
/*
num1 = 10;
num2 = 2;
document.writeln("1. Addition");
document.writeln("2. Difference");
input = 1;
switch(input)
{
    case 1:
        document.writeln("Addition :"+(num1 + num2));
        break;
}
*/

//=========================

/* unary operator: 
1. ++ : increment -> by 1
2. -- : decrement -> by 1

eg.
num =  10;
document.writeln(num++); // 11

*/

//3. while loop -> true -> keep running
//Q. print 1-10
var i = 1;
while(i<=10)// 11 <= 10
{
    document.writeln(i);// 1 2 3 4 5 6 7 8 9 10
    i++;//11
}
document.writeln("==========================");

//Q. print all even number from 1-10
// even number -> number % 2 == 0;
var input = 1;
while(input<=10)
{
    if(input % 2 == 0)
    {
        document.writeln(input);//2 4 6 8 10
    }    
    input++;
}

document.writeln("==========================");

//4. do_while
//Q. print 1-10
var i = 1;
do{
    document.writeln(i);// 11
    i++;//12
}while(i <= 10);// 12 <= 10


//Q. print even number between 1-10 using do_while

document.writeln("==========================");

//5. for loop
/*
for(init ; condition ;  step)
{
    //code
}

flow of execution:
1. init (one time)
2. condition
3. code
4. step
5. go to 2

*/
//Q. print 1-10
for(var i = 1 ; i <= 10 ; i++)
{
    document.writeln(i);//1 2 ...
}

//Q. print even number between 1-10 using for

//Q. print all numbers between 1-100, which is divisible by 3 and 5
//Q. print all prime numbers between 1-100 
//Q. print table of any number. eg. 2 4 6 8 10 12....
/*Q. print following pattern(hint: for loop inside for loop)
    
    *
    * *
    * * *
    * * * *


*/ 





/*Q. create calculator -> + - * / % */
/*
num1 = 10;
num2 = 2;
document.writeln("1. Addition");
document.writeln("2. Difference");
input = 1;
switch(input)
{
    case 1:
        document.writeln("Addition :"+(num1 + num2));
        break;
}
*/

//=========================

/* Practice Q1 -Create Calculator  -> + - * / % */ 
var result;
var num1, num2;
result = num1,num2;

/* 1 - addition*/
num1 = 10;
num2 = 2;
result = 10 + 2;
document.writeln("Addition is "+result);
document.writeln(num1+"+"+num2+ "="+result);

/* 2 - difference*/

num1 = 17
num2 = 5

document.writeln("Difference :"+(num1 - num2));


input = 1

var + - * / %;


switch(input)
{
    case 1:
        document.writeln("Addition :"+(num1 + num2));
        break;
    case 2:
        document.writeln("Difference :"+(num1 - num2));
        break;
    case 3:
        document.writeln("Multiply :"+(num1 * num2));
        break:
    case 4:
        document.writeln("Division :"+(num1 / num2));
        break;
    case 5:
        document.writeln("Remainder :"+(num1 % num2));
        break;

    default:
        document.writeln("Select Operator");
}

//=========================

