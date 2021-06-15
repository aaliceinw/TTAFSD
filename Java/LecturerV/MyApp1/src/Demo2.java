// giving input from user

import java.util.Scanner;// scan input

public class Demo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//get value from output window-> String

        System.out.println("Enter your name:");
        String s1 = sc.next();//String 
        System.out.println("Your enter = " + s1);

        System.out.println("----------------------");

        //Q. Print 1-N(N accept from user)
        System.out.println("Enter Number:");
        int N = sc.nextInt();//int
        int i = 1;
        while (i <= N) {
            System.out.println(i);
            i++;

        }//while ends

        System.out.println("--------------------");

        //Q. Check age
        System.out.println("Enter age:");
        double age = sc.nextDouble();//double
        if (age >= 18) {
            System.out.println("Can drive a car");
        } else {
            System.out.println("Can not drive a car");
        }

    }//main ends
}//class ends
