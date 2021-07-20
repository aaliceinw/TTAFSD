package com.tta.controller;


import com.tta.model.MyConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OrderServlet extends HttpServlet {

    String myitem; 
    int itemID=0;
    double price=0.0;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         try{
            /* TODO output your page here. You may use following sample code. */   

        //get request parameters            
            myitem = request.getParameter("myitem");
            System.out.println(myitem);
        //connect to database
                Connection con = MyConnection.connect();
         //write sql       
                Statement stmt = con.createStatement();
                
          //get results
                ResultSet rs = stmt.executeQuery("select * from myitem where itemName='"+myitem+"'");
                if(rs.next())
                {
                   itemID = rs.getInt("itemid");
                   price = rs.getDouble("price");
                }
                
                int insertOrder = stmt.executeUpdate("insert into myorder(itemName, itemid, price) values('"+myitem+"',"+itemID+","+price+")");
               
                request.getRequestDispatcher("orderPage.jsp").forward(request, response);
            }
            catch(Exception ex)
            {
                System.out.println("order error :"+ex);
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
