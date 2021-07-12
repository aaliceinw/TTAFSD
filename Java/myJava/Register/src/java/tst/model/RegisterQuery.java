
package tst.model;
        
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
        
public class RegisterQuery {
  
   //1.Insert Register record
    public static int insert(Register r) 
      {
        Connection con = MyConnection.connect();
        int row-insert = 0;
        try 
        {
            String qry = ("insert into register(name, email, pass) values(?,?,?)");
            PreparedStatement stmt = con.prepareStatement(qry);
            //setting column values in register table
            stmt.setString(1, r.getName());
            stmt.setString(2, r.getEmail());
            stmt.setString(3, r.getPass());
            row_insert =stmt.executeUpdate();
           
            if(r = true) {
                out.println("You are sucessfully registered");
            }
            
            else{
                
            }
       }//try ends
       
        catch(Exception ex)
        {
            System.out.println("Insert error :"+ex);//print error on server logs
        }//catch ends
        return row_insert;
    }//insert ends
    }
