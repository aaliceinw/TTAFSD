/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttafsd.model;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;


/**
 *
 * @author joanlaine
 */
public class StudentQuery {
    
    //1. Insert Student record
    public static int insert(Student s)
    {
        Connection con = MyConnection.connect();
        int row_insert = 0;
        try
        {
            String qry = "insert into student(sid,firstName,lastName,score) values(?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(qry);//query getting pre-compile
            //setting column values in student table
            stmt.setInt(1, s.getSid());
            stmt.setString(2,s.getFirstName());
            stmt.setString(3,s.getlLastName());
            stmt.setInt(4, s.getScore());
            row_insert = stmt.executeUpdate();
        }//try ends
        catch(Exception ex)
        {
            System.out.println("Insert error :"+ex);//print error on server logs
        }//catch ends
        return row_insert;
    }//insert ends
}//class ends
