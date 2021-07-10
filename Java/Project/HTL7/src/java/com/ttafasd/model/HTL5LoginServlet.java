package com.ttafasd.model;

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
@WebServlet(urlPatterns = {"/HTL5LoginServlet"})
public class HTL5LoginServlet extends HttpServlet {

String uname, upass;
    
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
            uname = request.getParameter("uname");
            upass = request.getParameter("upass");
            
            //validate user from DB
            //user = Admin, password=admin123
            if(uname.equals("Admin") && upass.equals("admin123"))
            {
                
                //create session -> HttpSession
                HttpSession se =request.getSession();//create new session
                
                //set current user in session
                se.setAttribute("myuser", uname);
                
                out.print("Welcome "+uname);
                request.getRequestDispatcher("profile.jsp").include(request, response);
                
            }
            else
            {
                out.print("Sorry.. cannot login");
                out.print("<br/>");
                out.print("Check user name or password");
                
              //RequestDispatcher
              //method1: forward()--> forward request to next page
              //method2: include()--> include content in same page
              request.getRequestDispatcher("HTL5Display.jsp").include(request, response);
        
            }
        } finally {
            out.close();
        }
    }
}