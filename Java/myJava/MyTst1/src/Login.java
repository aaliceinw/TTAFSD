import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

// student table queries
public class Login {
    
   int = uid;
   String = uname;
   String = upass;
    
    
   public Login ()
    {
    
    int uid = -1;
    String uname = "NA";
    String upass = "NA";
   
    
    //1. insert -> int
    public int insert(int uid, String uname, String upass,);
    
    {
        int row_insert = 0;
        try
        {
            Connection con = MyConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "insert into Login(uid,uname, upass) values("+uid+" , '"+uname+"' , '"+upass+")";
            
            row_insert = stmt.executeUpdate(qry);
            
        }
        catch(Exception ex)
        {
            System.out.println("Insert Error :"+ex);
        }
        
        return row_insert;
    }
    
    

    
    //4. select -> void
    public void display()
    {
        try
        {
            Connection con = MyConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "select * from myuser";
            
            ResultSet rs = stmt.executeQuery(qry);//return ResultSet-> holds all rows from table
            
            //read all data
            //next() -> check if next row is present
            while(rs.next())
            {
                //read data by column
//                int i = rs.getInt("sid");
//                String f = rs.getString("firstName");
//                String l = rs.getString("lastName");
//                int s = rs.getInt("score");
//              
                int i = rs.getInt(1);
                String n = rs.getString(2);
                String p = rs.getString(3);
                
                System.out.println("UID :"+i);
                System.out.println("NAME :"+n);
                System.out.println("PASSWORD :"+p);
                
                System.out.println("========================");
                
            }//while ends
            
        }
        catch(Exception ex)
        {
            System.out.println("Display Error :"+ex);
        }
    }
    
}
