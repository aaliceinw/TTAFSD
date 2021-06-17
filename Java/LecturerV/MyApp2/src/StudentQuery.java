import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

// student table queries
public class StudentQuery {
    
    //1. insert -> int
    public int insert(int sid, String firstName, String lastName, int score)
    {
        int row_insert = 0;
        try
        {
            Connection con = MyConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "insert into student(sid,firstName,lastName,score) values("+sid+" , '"+firstName+"' , '"+lastName+"' , "+score+")";
            
            row_insert = stmt.executeUpdate(qry);
            
        }
        catch(Exception ex)
        {
            System.out.println("Insert Error :"+ex);
        }
        
        return row_insert;
    }
    
    //2. update -> int
    public int update(int sid , int up_score)
    {
        int row_update = 0;
        try
        {
            Connection con = MyConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "update student set score="+up_score+" where sid="+sid;;
            
            row_update = stmt.executeUpdate(qry);
        }
        catch(Exception ex)
        {
            System.out.println("Update Error :"+ex);
        }
        
        return row_update;
    }
    
    //3. delete -> int
    public int delete(int sid)
    {
        int row_delete = 0;
        try
        {
            Connection con = MyConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "delete from student where sid="+sid;
            
            row_delete = stmt.executeUpdate(qry);
        }
        catch(Exception ex)
        {
            System.out.println("Delete Error :"+ex);
        }
        
        return row_delete;
    }
    
    //4. select -> void
    public void display()
    {
        try
        {
            Connection con = MyConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "select * from student";
            
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
                String f = rs.getString(2);
                String l = rs.getString(3);
                int s = rs.getInt(4);
                
                System.out.println("SID :"+i);
                System.out.println("FIRST NAME :"+f);
                System.out.println("LAST NAME :"+l);
                System.out.println("SCORE :"+s);
                
                System.out.println("========================");
                
            }//while ends
            
        }
        catch(Exception ex)
        {
            System.out.println("Display Error :"+ex);
        }
    }
    
}
