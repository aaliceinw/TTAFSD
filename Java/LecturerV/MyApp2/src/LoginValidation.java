import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class LoginValidation {
    public static void main(String[] args) {
        try
        {
            
            //1. Add driver
            Class.forName("com.mysql.cj.jdbc.Driver");//mysql DB
            
            //2. Get Connection
            String URL = "jdbc:mysql://localhost:3306/tta";//DB location
            String user = "root";//DB user name
            String pwd = "root";//DB password
            
            Connection con = DriverManager.getConnection(URL , user , pwd); 
            
            //4. Write Sql
            Statement stmt = con.createStatement();
            
             /*check valid user: myuser*/
            String username = "Vaibhu";//input from user
            String upass = "v@123";//input from user
            
            String qry2 = "select * from myuser where username='"+username+"' and password='"+upass+"'";
            ResultSet rs1 = stmt.executeQuery(qry2);
            if(rs1.next())
            {
                System.out.println("Login success !");
                System.out.println("Welcome "+username);
                //enter your account
            }
            else
            {
                System.out.println("OOps.. login fails !");
            }
            
            
        }
        catch(Exception ex)
        {
            System.out.println("DB error :"+ex);
        }
    }
}
