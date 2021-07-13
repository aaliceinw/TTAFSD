package com.hospital.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author joanlaine
 */
@WebServlet(urlPatterns ={"/DlogServlet"})
public class DlogServlet extends HttpServlet {

    String docid, password;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */   

        //get request parameters
        docid = request.getParameter("docid");
        password = request.getParameter("password");
        
       //check valid user credentials
        if(docid.equals(password))
        
        {
         //login ok  
         //Manage user session-> HttpSession
            
        HttpSession se = request.getSession();//create new session
        se.setAttribute("doctor", docid);
        
        //out.print("Welcome "+docName);
        //goto doctorAccess.jsp
        request.getRequestDispatcher("doctorAccess.jsp").forward(request,response);
        } //try ends
        else
        {
            //login not ok
            out.print("Oops - User name or password invalid. Please try again.");
                
                //request Dispatcher
                //forward-> forward page content
                //include-> include page content
                request.getRequestDispatcher("dlog.jsp").include(request, response);
                
            }//else ends
           
        }//tryends
           
       catch(Exception ex) {
            out.close();
        }//finally ends
    }//class ends

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
