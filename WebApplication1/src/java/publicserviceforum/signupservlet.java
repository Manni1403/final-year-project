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
/*import java.util.*;
import javax.mail.*;
import javax.mail.Address.*;
import javax.mail.internet.*;
import javax.activation.*;
/**
 *
 * @author MANMOHAN SINGH
 */
public class signupservlet extends HttpServlet {
   
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
  System.out.print("in the servlet");
 
        String adhar = request.getParameter("aadhar");
        String name = request.getParameter("firstname");
        String lname = request.getParameter("lastname");
        String fname = request.getParameter("father");
        String mname = request.getParameter("mother");
        String blood = request.getParameter("blood");
        String category = request.getParameter("category");
        String qualification = request.getParameter("qualification");
        String dob = request.getParameter("dob");
        String hno = request.getParameter("house");
        String address= request.getParameter("locality");
        String city =request.getParameter("city");
        String tehsil = request.getParameter("tehsil");
        String district = request.getParameter("district");
        String state = request.getParameter("state");
        String pincode = request.getParameter("pincode");
        String pancard = request.getParameter("pan");
        String voter = request.getParameter("voter");
        String email = request.getParameter("email");
        String password = request.getParameter("pass");
        String btn = request.getParameter("btn");
        String otp = request.getParameter("otp");
        psfmodel model = new psfmodel();
        try {
            if(btn.equals("Submit"))
            {
                HttpSession session = request.getSession();
                session.setAttribute("adhar", adhar);
                session.setAttribute("name", name);
                session.setAttribute("lname", lname);
                session.setAttribute("fname", fname);
                session.setAttribute("mname", mname);
                session.setAttribute("blood", blood);
                session.setAttribute("category", category);                
                session.setAttribute("qualification", qualification);
                session.setAttribute("dob", dob);
                session.setAttribute("house", hno);
                session.setAttribute("address", address);
                session.setAttribute("city", city);
                session.setAttribute("tehsil", tehsil);
                session.setAttribute("district", district);
                session.setAttribute("state", state);
                session.setAttribute("pincode", pincode);
                session.setAttribute("pancard", pancard);
                session.setAttribute("voter", voter);
                session.setAttribute("email", email);
                session.setAttribute("password", password);
                String otpvalue= Long.toString(Math.round(Math.random()*10000));
                session.setAttribute("otp", otpvalue);
                
                RequestDispatcher reqd = request.getRequestDispatcher("verify.jsp");
                reqd.forward(request, response);
            }
 else
            if(btn.equals("Submit OTP"))
            {
                HttpSession session = request.getSession();
                if(session.getAttribute("otp").toString().equals(otp))
                {

                adhar= session.getAttribute("adhar").toString();
                name= session.getAttribute("name").toString();
                lname= session.getAttribute("lname").toString();
                fname= session.getAttribute("fname").toString();
                mname=session.getAttribute("mname").toString();
                blood=session.getAttribute("blood").toString();
                category=session.getAttribute("category").toString();                
                qualification=session.getAttribute("qualification").toString();
                dob=session.getAttribute("dob").toString();
                hno=session.getAttribute("house").toString();
                address=session.getAttribute("address").toString();
                city=session.getAttribute("city").toString();
                tehsil=session.getAttribute("tehsil").toString();
                district=session.getAttribute("district").toString();
                state=session.getAttribute("state").toString();
                pincode=session.getAttribute("pincode").toString();
                pancard=session.getAttribute("pancard").toString();
                voter=session.getAttribute("voter").toString();
                email=session.getAttribute("email").toString();
                password = session.getAttribute("password").toString();

                    
                if(model.signupSave(adhar, name, lname, fname, mname, blood, category, qualification, dob, hno, address, city, tehsil, district, state, pincode, pancard, voter, email, password)==true)
                {
                System.out.print("Record Saved");
                RequestDispatcher reqd = request.getRequestDispatcher("register.jsp");
                reqd.forward(request, response);
                }
                else
                {
                System.out.print("Record not Saved");
                RequestDispatcher reqd = request.getRequestDispatcher("error.jsp");
                reqd.forward(request, response);
                }
                }
                else
                {
                out.print("<script>alert(\" Invalid OTP \")</script>");
                }
            }
            else
                
            if(btn.equals("Update"))
            {
                HttpSession session = request.getSession();
                System.out.print("in signup servlet");
                if(model.signupUpdate(session.getAttribute("userid").toString(), adhar, name, lname, fname, mname, blood, category, qualification, dob, hno, address, city, tehsil, district, state, pincode, pancard, voter, email, password)==true)
                {
                System.out.print("Record Updated");
                RequestDispatcher reqd = request.getRequestDispatcher("user_myprofile.jsp");
                reqd.forward(request, response);
                }
                else
                {
                    System.out.print("Record not Updated");
                }
            }
 }
        catch(Exception ex)
        { System.out.print(ex);}
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
