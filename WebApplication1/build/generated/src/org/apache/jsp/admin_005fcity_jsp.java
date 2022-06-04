package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.ArrayList;
import publicserviceforum.*;

public final class admin_005fcity_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>City-PSF</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("          function validateform(){\n");
      out.write("               var a = document.forms[\"reg\"][\"cityname\"].value;\n");
      out.write("               if (a == null || a == \"\") {\n");
      out.write("                 alert(\"City field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else {\n");
      out.write("                alert(\"Your City is inserted\");\n");
      out.write("                return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "admin_header.jsp", out, false);
      out.write("\n");
      out.write("         ");
      out.write("\n");
      out.write("        <div class=\"codes\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("<div class=\"grid_3 grid_4\">\n");
      out.write("<form name=\"reg\" action=\"CityServlet\">\n");
      out.write("    \t\t\t\t<h2 class=\"w3ls-hdg\">ADD / UPDATE CITY</h2>\n");
      out.write("\t\t\t\t<div class=\"tab-content\">\n");
      out.write("\t\t\t\t\t<div class=\"tab-pane active\" id=\"horizontal-form\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\n");
      out.write("    ");

    aobj= (ArrayList) request.getAttribute("list");
    if(aobj!=null)
    {
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("<label for=\"CityName\" class=\"col-sm-4 control-label\">City Name</label>\n");
      out.write("    <div class=\"col-sm-8\">\n");
      out.write("<input type = \"text\" name =\"cityname\" value=\"");
      out.print(aobj.get(1));
      out.write("\" class=\"form-control1\" placeholder=\"City Name\">\n");
      out.write("        </div></div>\n");
      out.write("    ");
}
    else
   {
    
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("<label for=\"CityName\" class=\"col-sm-4 control-label\">Enter New City Name</label>\n");
      out.write("    <div class=\"col-sm-8\">\n");
      out.write("<input type = \"text\" value = \"\" name =\"cityname\" class=\"form-control1\" placeholder=\"City Name\">\n");
      out.write("        </div></div> ");
}
      out.write("\n");
      out.write("<div class=\"col-sm-8\">\n");
      out.write("<input type = \"Submit\" name=\"btn\"  value=\"Submit\" onclick=\"return validateform()\" class=\"btn-primary\">\n");
      out.write("<input type = \"Submit\" name=\"btn\"  value=\"Update\" onclick=\"return validateform()\" class=\"btn-primary\">\n");
      out.write("<input type = \"reset\" class=\"btn-warning\" ></div>\n");
      out.write("\n");
      out.write("</div></div></div>\n");
      out.write(" </form>\n");
      out.write("                    <table border=\"2\">\n");
      out.write("                        <tr>\n");
      out.write("                        <th colspan=\"5\">\n");
      out.write("                        Cities List\n");
      out.write("                        </th>\n");
      out.write("                        </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th><b>Click To Edit</b></th>\n");
      out.write("                        <th><b>City Name</b></th>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    ");

                        cobj.connect();

                        try
                        {
                            System.out.println("table");
                            pst=cobj.con.prepareStatement("select * from tb_city");
                            rst=pst.executeQuery();
                            while(rst.next())
                            {
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                            <td>\n");
      out.write("                                 <form name=\"ciyttable\"   method=\"post\" action=\"CityServlet\">\n");
      out.write("                                    <input type=\"submit\" name=\"btn\" value=\"Select\">\n");
      out.write("                                    <input type=\"text\" name=\"selecttxt\" value=\"");
      out.print(rst.getLong(1));
      out.write("\" style=\"width:1px;visibility:hidden;\">\n");
      out.write("                                    </form>\n");
      out.write("                            </td>\n");
      out.write("                            <td>");
      out.print(rst.getString(2) );
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
}
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
      out.write("\n");
      out.write("</div></div></div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "admin_footer.jsp", out, false);
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
