//method demo
public class Demo3 {
    /*
    <Access specifier> <Return type> <Method name>(Parameter list)
    {
     	     body of the method
    } 

    */
    
    //Q. create method for addition(+)
    
    //1. void-no parameter
    public void m1()
    {
        int a = 10;
        int b = 2;
        int c = a + b;
        System.out.println("Result = "+c);
    }//m1 ends
    
    
    //2. return_type - no parameter
    public int m2()
    {
        int a = 12;
        int b = 56;
        int c = a + b;
        
        return c;
    }//m2 ends
    
    //3. with parameter
    public void m3(int a , int b)
    {
        int c = a + b;
        System.out.println("Result of m3() = "+c);
    }//m3 ends
    
    
    //main method
    public static void main(String[] args) {
        
        //create object: ClassName objname = new ClassName(); -> constructor
        Demo3 obj1 = new Demo3();
        //method call using object-> .(dot) operator
        obj1.m1();
                
        int result = obj1.m2();
        System.out.println("Result of m2() = "+result);
        
        obj1.m3(20 , 50);
        
    }//main ends
    
    
}//class ends
