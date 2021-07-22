import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
//for parameterized test case
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
//for parameter list
import java.util.Collection;
import java.util.Arrays;


@RunWith(Parameterized.class)
public class ComStrTest {
    
    //1.create a variable
    String a;
    String b;
    String ExpResult;
    
  //. create  "Parameter Constructor" of class to be tested
    public ComStrTest(String a, String b, String ExpResult) {
        this.a = a;
        this.b = b;
        this.ExpResult = ExpResult;
    }
 //3. create method to pass parameter list  
    @Parameters
    public static Collection<Object[]> getParameters()
    {
        String[][] arr;//2D array
        arr = new String [][]{ {"1","0", "10"} , {"hi","bye", "hibye"} , {"10","number", "10number"} , {"age","29", "age29"} };
        return Arrays.asList(arr);
    }
    //4. create "test case"
    @Test
    public void addTest()
            
             
    {
        ComStr obj = new ComStr();
        String Result = obj.combine(a,b);
        assertEquals(Result, Result);
    }   
    
     @BeforeClass
    public static void setUpClass()
    {
        System.out.println("Test Started");
    }
    @AfterClass
    public static void tearDownClass()
    {
        System.out.println("Test Stopped");
    }
    @Before
    public  void setUpCase()
    {
        System.out.println("Test Case Setup");
    }
    @After
    public void tearDownCase()
    {
        System.out.println("Test Case Tear Down");
    }
    
    
    
    }        
 
   
