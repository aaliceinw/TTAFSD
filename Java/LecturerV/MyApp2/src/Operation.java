
public class Operation {
    
public static void main(String[] args) {
        
        System.out.println("Code start");
        int a = 10;
        int b = 2;
        int result = 0;
        
        result  = 0; // 10/0 = infinity
        
        
       try{
           result = a/b;
       }
        catch(Exception ex)
        {
            System.out.println("I am in Catch");
        }    
        System.out.println("Division :"+result);
        System.out.println("Code stops"); 
    }

}
