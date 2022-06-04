package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.ArrayList;
import publicserviceforum.*;

public final class admin_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


           ConnectClass cobj=new ConnectClass();
           PreparedStatement pst;
           ResultSet rst;
           ArrayList aobj = new ArrayList();
        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Home-PSF</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "admin_header.jsp", out, false);
      out.write("\n");
      out.write("      <center>\n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("        <table border=\"2\">\n");
      out.write("                        <tr>\n");
      out.write("                        <th colspan=\"13\">\n");
      out.write("                        Authorise Application Status\n");
      out.write("                        </th>\n");
      out.write("                        </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th><b>Click To Authorize</b></th>\n");
      out.write("                        <th><b>Token No</b></th>\n");
      out.write("                        <th><b>Adhar</b></th>\n");
      out.write("                        <th><b>Name</b></th>\n");
      out.write("                        <th><b>Email</b></th>\n");
      out.write("                        <th><b>City</b></th>\n");
      out.write("                        <th><b>Service</b></th>\n");
      out.write("                        <th><b>Date</b></th>\n");
      out.write("                        <th><b>Description</b></th>\n");
      out.write("                        <th><b>Status</b></th>\n");
      out.write("                        <th><b>Instruction Detail</b></th>\n");
      out.write("                        <th><b>Instruction Date</b></th>\n");
      out.write("                        <th><b>View Memo</b></th>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    ");

                        cobj.connect();

                        try
                        {
                            System.out.println("table");
                            pst=cobj.con.prepareStatement("Select Application_ID, Aadhaar_Card_No, First_Name, email_id, (Select city_name from tb_city a where a.city_id = b.city_id) as cityname, (Select service_name from tb_service a where a.service_id = b.service_id) as servicename, AppDate, Description, Status, Objectiondetail, ObjectionDate from tb_Application b join tb_signup c on b.Signup_id = c.SignUp_ID where status='pending'");
                            rst=pst.executeQuery();
                            while(rst.next())
                            {
                                String appid = rst.getString(1);
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td><form name=\"apply\" action=\"ApplyServlet\">\n");
      out.write("                                        <input type=\"Submit\" name=\"btn\" value=\"Accept\" >\n");
      out.write("                                        <input type=\"Submit\" name=\"btn\" value=\"Object\" >\n");
      out.write("                                        <input type =\"text\" name=\"appid\" value=\"");
      out.print(appid);
      out.write("\" style=\"width:1px;visibility: hidden;\">\n");
      out.write("                                    </form></td>\n");
      out.write("                                    <td>");
      out.print(appid);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rst.getString(2));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rst.getString(3));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rst.getString(4));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rst.getString(5));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rst.getString(6));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rst.getString(7));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rst.getString(8));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rst.getString(9));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rst.getString(10));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rst.getString(11));
      out.write("</td>\n");
      out.write("                             <td><a href=\"admin_showmemo.jsp?appid=");
      out.print(appid);
      out.write("\">View Memo</a></td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                            ");
} rst.close();
                        }

                        catch(Exception ex)
                        {
                            System.out.println(ex);
                        }

                        finally
                        {
                            cobj.disconnect();
                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("        </center>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "admin_footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
