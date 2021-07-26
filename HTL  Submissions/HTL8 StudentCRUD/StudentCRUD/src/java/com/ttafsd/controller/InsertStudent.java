/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttafsd.controller;

import com.ttafsd.model.Student;
import com.ttafsd.model.StudentQuery;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author joanlaine
 */
public class InsertStudent extends HttpServlet {
int sid;
String first;
String last;
int score;
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            sid =Integer.parseInt(request.getParameter("sid"));
            first = request.getParameter("firstname");
            last = request.getParameter("lastname");
 score =Integer.parseInt(request.getParameter("score"));
 
 
      //create Student object
     Student s = new Student(sid, first,last,score);
     //create Student record DB
     int r = StudentQuery.insert(s);   
     
     if(r==1)
     {
     out.print("Student record created succesfully");
     request.getRequestDispatcher("display.jsp").include(request,response); 
     }//if ends
     
     else{
         out.print("Error. Cannot save record");
         request.getRequestDispatcher("display.jsp").include(request,response); 
     }//else ends
     
  
            
            
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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

}
