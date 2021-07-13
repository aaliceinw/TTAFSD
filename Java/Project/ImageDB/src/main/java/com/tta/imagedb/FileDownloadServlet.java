/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tta.imagedb;

import com.tta.model.MyConnection;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@MultipartConfig(maxFileSize = 16177215)
public class FileDownloadServlet extends HttpServlet {
 private static final int BUFFER_SIZE = 4096;
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
               //get values of text fields
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
            
        Connection conn = null; // connection to the database
        String message = null; // message will be sent back to client
        String filepath = "/Users/joanlaine/Documents/Talent Tech Academy/TTAFSD/Java/Project/ImageDB/src/main/webapp/FromDb.jpg";
        try {
            // connects to the database
            conn = MyConnection.connect();
            if(new File(filepath).exists()==true)
                new File(filepath).delete();
        
            //Obtaining the file from database
            //Using a second statement
            String sql1 = "SELECT * FROM contacts WHERE first_name=? AND last_name=?";
            PreparedStatement pstmtSelect = conn.prepareStatement(sql1);
            pstmtSelect.setString(1, firstName);
            pstmtSelect.setString(2, lastName);
            
            ResultSet result = pstmtSelect.executeQuery();
            if (result.next()) {
                Blob blob = result.getBlob("photo");
                InputStream inputStream1 = blob.getBinaryStream();//blob-> binary stream
                
                OutputStream outputStream = new FileOutputStream(new File(filepath));
                int bytesRead = -1;
                byte[] buffer = new byte[BUFFER_SIZE];
                while ((bytesRead = inputStream1.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
                inputStream1.close();
                outputStream.close();
                System.out.println("File saved");
                // sets the message in request scope
            request.setAttribute("filePath", filepath);

            // forwards to the message page
            request.getRequestDispatcher("message.jsp").forward(request, response);
            }
        } catch (SQLException ex) {
            message = "ERROR: " + ex.getMessage();
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                // closes the database connection
                try {
                    conn.close();
                } catch (SQLException ex) {
                    //silent
                }
            }
            
        }
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
