
import java.util.Scanner;

// + - * / %
public class Calculator {
    //1. +
    public double add(double a , double b)
    {
        return a+b;
    }//add ends
    
    //2. -
    public double sub(double a , double b)
    {
        return a-b;
    }//sub ends
    
    //3. * : multiplication
    public double multi(double a , double b)
    {
        return a*b;
    }//multi ends
    
    //4. / : division-> 10/2 = 5
    public double div(double a , double b)
    {
        return a/b;
    }//div ends
    
    //5. % : remainder-> 10%2 = 0
    public double rem(double a , double b)
    {
        return a%b;
    }//rem ends

    
    //main method
    public static void main(String[] args) {
        
        Calculator obj = new Calculator();//object 
        
        double num1 , num2;
        int answer;
        
        //Scanner -> user input
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("5. %");
            System.out.println("Enter your choice:");        
            //int choice = sc.nextInt();
            String choice = sc.next();
            switch(choice)
            {
                case "+":
                    System.out.println("Enter num1=");
                    num1 = sc.nextDouble();
                    System.out.println("Enter num2=");
                    num2 = sc.nextDouble();
                    System.out.println("Result ="+(obj.add(num1, num2)));
                    break;

                case "-":
                    System.out.println("Enter num1=");
                    num1 = sc.nextDouble();
                    System.out.println("Enter num2=");
                    num2 = sc.nextDouble();
                    System.out.println("Result ="+(obj.sub(num1, num2)));
                    break;

                case "*":
                    System.out.println("Enter num1=");
                    num1 = sc.nextDouble();
                    System.out.println("Enter num2=");
                    num2 = sc.nextDouble();
                    System.out.println("Result ="+(obj.multi(num1, num2)));
                    break;

                case "/":
                    System.out.println("Enter num1=");
                    num1 = sc.nextDouble();
                    System.out.println("Enter num2=");
                    num2 = sc.nextDouble();
                    System.out.println("Result ="+(obj.div(num1, num2)));
                    break;

                case "%":
                    System.out.println("Enter num1=");
                    num1 = sc.nextDouble();
                    System.out.println("Enter num2=");
                    num2 = sc.nextDouble();
                    System.out.println("Result ="+(obj.rem(num1, num2)));
                    break;

                default:
                    System.out.println("Please select correct choice");

            }//switch ends
            
            System.out.println("Do you want to continue? 1(Yes) / 0(No):");
            answer = sc.nextInt();

        }while(answer == 1);
        
        
        
                
    }//main ends
    
}//class ends
