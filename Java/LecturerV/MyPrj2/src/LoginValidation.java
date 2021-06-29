import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginValidation {
    public static void main(String[] args) {
        try
        {
            //1. Add driver
            Class.forName("com.mysql.cj.jdbc.Driver");//mysql DB
            
            //2. Get Connection
            String URL ="jdbc:mysql://localhost:3306/tta";//DB location
            String user = "root";//DB user name
            String pwd = "NSinuk@cv4";//DB password
            
            //3. Connect
            
            Connection con = DriverManager.getConnection(URL, user, pwd);
            
            //4. Write SQL
            Statement stmt = con.createStatement();
            
            /*check valid user: myuser*/
            String username = "Joan";//input from user
            String upass = "j@123";//input from user
            
            String qry2 = "select * from myuser where username='"+username+"' and password='"+upass+"'";
            ResultSet rs1 = stmt.executeQuery(qry2);
            
            if(rs1.next())
            {
                System.out.println("Login Successful!");
                System.out.println("Welcome"+username);
               //enter your account
            }
            else
            {
                    System.out.println("Oops... login details incorrect!");
            }
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            System.out.println("DB Error" +ex);
        }
    }
    
}
