package com.hospital.controller;

import com.hospital.model.MyConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DAccessServlet extends HttpServlet {
  
    String patient;
     int phone;
            String name;
            String dob;
            String problem;
    protected void getRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
 /* TODO output your page here. You may use following sample code. */   

        try {
           
           //get request parameters 
          patient = request.getParameter("patient"); 
          System.out.println(patient);
            
          //connect to database
            
                Connection con = MyConnection.connect();
           //write sql      
                Statement stmt = con.createStatement();
           //get results     
                ResultSet rs = stmt.executeQuery("select * from patient where phone='"+phone+"', name='"+name+"', dob='"+dob+"' and problem='"+problem+"'");
                if(rs.next())
                {
                   phone = rs.getInt("phone");
                   name = rs.getString("name");
                   dob= rs.getString("dob");
                   problem=rs.getString("problem");
                }//if ends
                
                int insertPatient = stmt.executeUpdate("insert into record(phone, name, dob, problem) values('"+patient+"',"+phone+","+name+","+dob+", "+problem+")");
               
                request.getRequestDispatcher("doctorAccess.jsp").forward(request, response);
            
        } //try ends
        catch(Exception ex) 
        {
               System.out.println("Booking error :"+ex);
        }//catch ends
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */}
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

    










