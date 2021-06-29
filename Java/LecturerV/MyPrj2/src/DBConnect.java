/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joanlaine
 */
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
            String URL ="jdbc:mysql://localhost:3306/ttafsd";//DB location
            String user = "root";//DB user name
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
//                 int eid = 106;// accept from user
//                  String eName = "Freda";//accept from user
//                  String address = "622 Any Street";//accept from user
//                  int score = 4250;//accept from user
            
//          String qry = "insert into student(eid,eName,address,salary) values("+eid+" , '"+ename+"' , '"+address+"' , "+salary+")";
            
//          ,, int row = stmt.executeUpdate(qry);
            
//         System.out.println("Row inserted :"+row);// 1-> ok | 0-> not ok


        //query: select - > ResultSet
        String qry1 = "select * from Employee";
        
        ResultSet rs = stmt.executeQuery(qry1);// return ResultSet -> holds all the roles from table

        //read all data
        while(rs.next())
        {
            //read data by column
            int  i = rs.getInt("Eid");
            String e = rs.getString("eName");
            String a = rs.getString("address");
            int s = rs.getInt(4);
            
            System.out.println("EID :"+i);
            System.out.println("EMPLOYEE NAME :"+e);
            System.out.println("EMPLOYEE Address :"+a);
            System.out.println("Salary"+s);
            
            System.out.println("=====================");
            
        
            
            
             
       }//while ends
        
        //query: delete
        /*delete from employee where sid = 314*/
        int eid1 = 314; //input from user
        String qry3 = "delete from employee where eid = "+eid1;
        int row_delete = stmt.executeUpdate(qry3);
        
            System.out.println("Row delete :"+row_delete);
        
    
        
        }
        catch(Exception ex)
        {
            System.out.println("DB error :"+ex);
        }//try ends
        
    }//main ends
    
}//class ends
