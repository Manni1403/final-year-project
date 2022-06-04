/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package publicserviceforum;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MANMOHAN SINGH
 */
public class loginservlet extends HttpServlet {
   
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

         String user = request.getParameter("adhar");
            String password = request.getParameter("password");
             String newpassword = request.getParameter("newpassword");
            String btn = request.getParameter("btn");
            ConnectClass cobj = new ConnectClass();
            psfmodel psf = new psfmodel();
HttpSession session = request.getSession();
        try {

            if(btn.equals("LOG IN"))
            {
                System.out.println("entering in Login  controller for user");
                if(psf.checkUserLogin(user, password) >0)
                {
                    long userid=psf.checkUserLogin(user, password);
                     session.setAttribute("user", user);
                     session.setAttribute("userid", userid);
                     RequestDispatcher reqd = request.getRequestDispatcher("user_myprofile.jsp");
                     reqd.forward(request, response);
                }
            }
             else
             if(btn.equals("LOG OUT"))
             {
                 System.out.println("logging out controller for user");
                 session.invalidate();
                 RequestDispatcher reqd = request.getRequestDispatcher("index.jsp");
                 reqd.forward(request, response);
             }
 else
                       if(btn.equals("LOGIN"))
            {
                System.out.println("entering in Login  controller for admin");
                if(psf.checkAdminLogin(user, password) == true)
                {

                     session.setAttribute("admin", user);
                        RequestDispatcher reqd = request.getRequestDispatcher("admin_home.jsp");
                    reqd.forward(request, response);
                }
                else
                    System.out.println("Login unsuccessfull");
            }
             else
             if(btn.equals("logout"))
             {
                 System.out.println("logging out controller for admin");
                 session.invalidate();
                 RequestDispatcher reqd = request.getRequestDispatcher("admin_login.jsp");
                    reqd.forward(request, response);
                }
            else
            if(btn.equals("Change"))
             {
                 System.out.println("change servlet for admin");
                 if(psf.changeadminpassword(user,password,newpassword)==true)
                 {
                 RequestDispatcher reqd = request.getRequestDispatcher("admin_changepassword.jsp");
                    reqd.forward(request, response);
                }}
            else
                if(btn.equals("Change Password"))
             {
                 System.out.println("change servlet for user");
                 if(psf.changeuserpassword(user,password,newpassword)==true)
                 {
                 RequestDispatcher reqd = request.getRequestDispatcher("user_changepassword.jsp");
                    reqd.forward(request, response);
                }}
        }
         finally { 
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
