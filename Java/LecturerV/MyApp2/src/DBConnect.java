

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;


public class DBConnect {
    
    public static void main(String[] args) {
    
        try
        {
            
     //1.Add driver
     Class.forName("com.mysql.cj.jdbc.Driver");//mysql DB
     
     //2.Get Connection
     String URL = "jdbc:mysql://localhost:3306/tta";//DB location
     String user = "root";//DB username
     String pwd = "NSinuk@cv4";//DB password
     
     Connection con = DriverManager.getConnection(URL, user, pwd);
     
     //3.Test Connection
     if(con !=null)
     {
         //ok
         System.out.println("Connected");
     }
     else
     {
         //not.ok
         System.out.println("Not Connected");
     }
     
     //4.Write Sql
        Statement stmt = con.createStatement();
        
//          query: insert
//                 int sid = 106;// accept from user
//                  String firstName = "Sam";//accept from user
//                  String lastName = "S";//accept from user
//                  int score = 90;//accept from user
            
//          String qry = "insert into student(sid,firstName,lastName,score) values("+sid+" , '"+firstName+"' , '"+lastName+"' , "+score+")";
            
//          ,, int row = stmt.executeUpdate(qry);
            
//         System.out.println("Row inserted :"+row);// 1-> ok | 0-> not ok


        //query: select - > ResultSet
        String qry1 = "select * from student";
        
        ResultSet rs = stmt.executeQuery(qry1);// return ResultSet -> holds all the roles from table

        //read all data
        while(rs.next())
        {
            //read data by column
            int  i = rs.getInt("Sid");
            String f = rs.getString("firstName");
            String l = rs.getString("lastName");
            int s = rs.getInt(4);
            
            System.out.println("SID :"+i);
            System.out.println("FIRST NAME :"+f);
            System.out.println("LAST NAME :"+1);
            System.out.println("SCORE"+s);
            
            System.out.println("=====================");
            
        
            
            
             
       }//while ends
        
        //query: delete
        /*delete from student where sid = 104*/
        int sid1 = 104; //input from user
        String qry3 = "delete from student where sid = "+sid1;
        int row_delete = stmt.executeUpdate(qry3);
        
            System.out.println("Row delete :"+row_delete);
        
    
        
        }
        catch(Exception ex)
        {
            System.out.println("DB error :"+ex);
        }//try ends
        
    }//main ends
    
}//class ends
