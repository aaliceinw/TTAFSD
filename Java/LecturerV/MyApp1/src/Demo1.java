
public class Demo1 {
    //variable
    int a = 10;//4 byte -> class variable
    double b = 10.0;// 8 byte
    char c = 'W';// 1 byte
    String d = "W";
    String e = "abc";
    boolean f = true;//1 bit
    boolean g = false;//1 bit
    
    //to run program: main() method
    //static= no need of object
    public static void main(String[] args) {
        int a = 20;//local variable
        
        // display output
        System.out.println("Hi Student");//sop
        System.out.println("hi Student");
        
        //Q. print 1-N(N accept from user)
        int N = 5;
        int i = 1;
        while( i <= N)
        {
            System.out.println(i);
            i++;
            
        }//while ends
        
        //print variables
        System.out.println("a = "+a);
        
    }//main ends
    
    
    
}//class ends
