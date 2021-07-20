
package com.hospital.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class RecordQuery {
    //1. Insert Patient record
    public static int insert(Record r)
    {
        Connection con = MyConnection.connect();
        int row_insert = 0;
        try
        {
            //qry1 insert patient booking details into record db
            String qry1 = "insert into record(name,phone,address,dob,password) values(?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(qry1);//query getting pre-compile
            //setting column values in student table
            
            stmt.setString(1,r.getName());
            //stmt.setInt(2,r.getPhone());
            //stmt.setString(3,r.getAddress());
            stmt.setString(4, r.getDob());
            //stmt.setString(5, r.getPassword());
            row_insert = stmt.executeUpdate();
        }//try ends
        catch(Exception ex)
        {
            System.out.println("Insert error :"+ex);//print error on server logs
        }//catch ends
        return row_insert;
    }//insert ends
}
