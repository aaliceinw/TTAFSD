
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joanlaine
 */
class MyConnection {
    
    public static Connection connect()
    {
    
        Connection con = null;
            try
            {
            String URL = "jdbc:mysql://localhost:3306/ttafsd";//DB location
            String user = "root";//DB user name
            String pwd = "NSinuk@cv4";//DB password

            con = DriverManager.getConnection(URL , user , pwd);           
            }//try ends
            catch(Exception ex)
            {
                System.out.println("DB Error :"+ex);
            }//catch ends

            return con;
    }

}
    
