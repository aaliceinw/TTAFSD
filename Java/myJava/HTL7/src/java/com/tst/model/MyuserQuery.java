/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tst.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author joanlaine
 */
public class MyuserQuery {
    
    //1.Insert Myuser record
    public static int insert(Myuser u)
    {
        Connection con = MyConnection.connect();
        int row_insert = 0;
        try
        {
            String qry = "insert into myuser(uid,uname,upass) values(?,?,?)";
            PreparedStatement stmt = con.prepareStatement(qry);//query getting pre-compile
            //setting column values in student table
            stmt.setInt(1, u.getUid());
            stmt.setString(2,u.getUname());
            stmt.setString(3,u.getUpass());
            row_insert = stmt.executeUpdate();
        }//try ends
        catch(Exception ex)
        {
            System.out.println("Insert error :"+ex);//print error on server logs
        }//catch ends
        return row_insert;
    }//insert ends

////2. update -> int
//    public static int update(int sid , int up_score)
//    {
//        int row_update = 0;
//        try
//        {
//            Connection con = MyConnection.connect();//get connection
//            Statement stmt = con.createStatement();
//            
//            String qry = "update student set score="+up_score+" where sid="+sid;;
//            
//            row_update = stmt.executeUpdate(qry);
//        }
//        catch(Exception ex)
//        {
//            System.out.println("Update Error :"+ex);
//        }
//        
//        return row_update;
//    }
    
    //3. delete -> int
    public static int delete(int uid)
    {
        int row_delete = 0;
        try
        {
            Connection con = MyConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "delete from myuser where uid="+uid;
            
            row_delete = stmt.executeUpdate(qry);
        }
        catch(Exception ex)
        {
            System.out.println("Delete Error :"+ex);
        }
        
        return row_delete;
    }    
    
}//class ends

 
