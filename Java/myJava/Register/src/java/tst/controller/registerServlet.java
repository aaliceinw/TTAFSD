package tst.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author joanlaine
 */

public class registerServlet extends HttpServlet {
String name, email,pass;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	
     
        
        try {
        name = request.getParameter("name");
        email = request.getParameter("email");
        pass = request.getParameter("pass");
        
        if()
            PreparedStatement stmt = con.prepareStatement
                        ("insert into register values(?,?,?)");

            stmt.setString(1, r.setName());
            stmt.setString(2, r.setEmail());
            stmt.setString(3, r.setPass());
            String r = stmt.executeUpdate();
          
            else 
            {
                    
                    }
            
            if(r = false) {
                out.println("You are sucessfully registered");
            }
        
        }
        catch(Exception se) {
            se.printStackTrace();
        }
	
    }
}
