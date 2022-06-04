/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package publicserviceforum;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author MANMOHAN SINGH
 */
public class ServiceServlet extends HttpServlet {
static String id;
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
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
            String servicename=request.getParameter("servicename");
            String sectionid=request.getParameter("sectionid");
            String departid=request.getParameter("departid");
            String doc=request.getParameter("doc");
            String button=request.getParameter("btn");
            String serviceid =request.getParameter("selecttxt");

            PreparedStatement pst;
            ResultSet rst;
            ConnectClass cobj=new ConnectClass();
            psfmodel pobj=new psfmodel();

            if(button.equals("Submit"))
            {
                    if(pobj.serviceSave(servicename, sectionid, departid, doc)==true)
                    {
                        RequestDispatcher robj=request.getRequestDispatcher("admin_service.jsp");
                       robj.forward(request, response);
                    }
            }
               else  if(button.equals("Select"))
                        {
                            ArrayList  aobj = new ArrayList();
                            aobj = pobj.serviceSelect(serviceid);
                            id =aobj.get(0).toString();
                            System.out.print("return id "+ id);
                            RequestDispatcher reqd=request.getRequestDispatcher("admin_service.jsp");
                            request.setAttribute("list", aobj);
                            reqd.include(request, response);

                        }

            else
               if(button.equals("Update"))
               {
                      if(pobj.serviceUpdate(id, servicename, sectionid, departid, doc)==true)
                    {
                     RequestDispatcher reqd = request.getRequestDispatcher("admin_service.jsp");
                     reqd.forward(request, response);
                    }
               }
                } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
