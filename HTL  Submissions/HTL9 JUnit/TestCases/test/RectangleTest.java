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
public class RectangleTest {
    double initw;
    double inith;
    double expResult;
    public RectangleTest(double initw, double inith, double expResult) {
        this.initw = initw;
        this.inith = inith;
        this.expResult = expResult;
    }
    @Parameters
   public static Collection<Double[]> getParameters()
    {
        Double[][] arr;//2D array
        arr = new Double[][]{ {2.0,4.0,8.0},{1.0,4.0,4.0},{-1.0,5.0,0.0} };
        return Arrays.asList(arr);
       
    }
    @Test
    public void testSomeMethod()
    {
        Rectangle obj = new Rectangle(initw,inith );
        double Result = obj.draw();
        //double expResult = 8.0;
        assertEquals(expResult, Result,0.0);
        // TODO review the generated test code and remove the default call to fail.
       
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