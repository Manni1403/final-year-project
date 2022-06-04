package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.ArrayList;
import publicserviceforum.*;

public final class admin_005fdepartment_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
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
      out.write("        <title>Department-PSF</title>\n");
      out.write("         <script type=\"text/javascript\">\n");
      out.write("            function validateform(){\n");
      out.write("               var a = document.forms[\"reg\"][\"name\"].value;\n");
      out.write("               var b = document.forms[\"reg\"][\"city\"].value;\n");
      out.write("               var c = document.forms[\"reg\"][\"address\"].value;\n");
      out.write("               //var d = document.forms[\"reg\"][\"image\"].value;\n");
      out.write("               //var e = document.forms[\"reg\"][\"map\"].value;\n");
      out.write("               var f = document.forms[\"reg\"][\"officer\"].value;\n");
      out.write("               var g = document.forms[\"reg\"][\"contact\"].value;\n");
      out.write("               var h = document.forms[\"reg\"][\"email\"].value;\n");
      out.write("               var atpos = h.indexOf(\"@\");\n");
      out.write("               var dotpos = h.lastIndexOf(\".\");\n");
      out.write("               if (a == null || a == \"\") {\n");
      out.write("                 alert(\"Department field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else if (b == null || b == \"\") {\n");
      out.write("                 alert(\"City field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else if (c == null || c == \"\") {\n");
      out.write("                 alert(\"Address field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            /*else if (d == null || d == \"\") {\n");
      out.write("                 alert(\"Image field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else if (e == null || e == \"\") {\n");
      out.write("                 alert(\"Map field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }*/\n");
      out.write("            else if (f == null || f == \"\") {\n");
      out.write("                 alert(\"Name field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else if (g == null || g == \"\") {\n");
      out.write("                 alert(\"Contact Number field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else if (h == null || h == \"\") {\n");
      out.write("                 alert(\"Email field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else if (atpos<1 || dotpos<atpos+2 || dotpos+2>=y.length)\n");
      out.write("                { alert(\"Not a valid Email Address\");\n");
      out.write("                 return false;}\n");
      out.write("\n");
      out.write("            else {\n");
      out.write("                alert(\"Your Department detail is inserted\");\n");
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
      out.write("    <form name=\"reg\" action=\"DepartmentServlet\">\n");
      out.write("\t\t\t\t<h2 class=\"w3ls-hdg\">ADD/UPDATE  DEPARTMENT</h2>\n");
      out.write("\t\t\t\t<div class=\"tab-content\">\n");
      out.write("\t\t\t\t\t<div class=\"tab-pane active\" id=\"horizontal-form\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\n");

    aobj= (ArrayList) request.getAttribute("list");
    if(aobj!=null)
    {
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("<label for=\"DepartmentName\" class=\"col-sm-4 control-label\">Department Name</label>\n");
      out.write("    <div class=\"col-sm-8\">\n");
      out.write("<input type = \"text\" value = \"");
      out.print(aobj.get(1));
      out.write("\" name =\"name\" class=\"form-control1\" placeholder=\"Department Name\">\n");
      out.write("        </div></div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"DepartmentCityName\" class=\"col-sm-4 control-label\">Department City </label>\n");
      out.write("    <div class=\"col-sm-8\">\t <input type=\"text\" value = \"");
      out.print(aobj.get(2));
      out.write("\" name=\"city\" class=\"form-control1\" placeholder=\"Department City\"></div></div>\n");
      out.write("\n");
      out.write(" <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"DepartmentAddress\" class=\"col-sm-4 control-label\">Department Address</label>\n");
      out.write("    <div class=\"col-sm-8\">\t <textarea name=\"address\" id=\"txtarea1\" cols=\"50\" rows=\"4\" class=\"form-control1\" placeholder=\"Department Address\">");
      out.print(aobj.get(3));
      out.write("</textarea></div></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"DepartmentOfficerName\" class=\"col-sm-4 control-label\">Department Officer Name</label>\n");
      out.write("<div class=\"col-sm-8\"><input type=\"text\" value = \"");
      out.print(aobj.get(6));
      out.write("\" name=\"officer\" class=\"form-control1\" placeholder=\"Department Officer Name\"></div></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"DepartmentOffcContact\" class=\"col-sm-4 control-label\">Department Officer Contact No</label>\n");
      out.write("    <div class=\"col-sm-8\"> <input type=\"text\" value = \"");
      out.print(aobj.get(7));
      out.write("\" name=\"contact\" class=\"form-control1\" placeholder=\"Department Officer Contact No.\"></div></div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"DepartmentEmail\" class=\"col-sm-4 control-label\">Department Officer Email</label>\n");
      out.write("    <div class=\"col-sm-8\"> <input type=\"text\" value = \"");
      out.print(aobj.get(8));
      out.write("\" class=\"form-control1\" name=\"email\" placeholder=\"Department Officer Email\"></div></div>\n");
      out.write("    <div class=\"form-group\" style=\"visibility:hidden;\">\n");
      out.write("<label for=\"DepartmentImage\" class=\"col-sm-4 control-label\">Department Image</label>\n");
      out.write("<div class=\"col-sm-8\"><input type=\"text\" value = \"");
      out.print(aobj.get(4));
      out.write("\" name=\"image\" class=\"form-control1\" placeholder=\"Department Image\"></div> </div>\n");
      out.write("<div class=\"form-group\" style=\"visibility:hidden;\">\n");
      out.write("    <label for=\"DepartmentMap\" class=\"col-sm-4 control-label\">Department Map</label>\n");
      out.write("<div class=\"col-sm-8\"><input type=\"text\" value = \"");
      out.print(aobj.get(5));
      out.write("\" name=\"map\" class=\"form-control1\" placeholder=\"Department Map\"></div></div>\n");
      out.write("\n");
      out.write("    ");
}
    else
        {
    
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("<label for=\"DepartmentName\" class=\"col-sm-4 control-label\">Department Name</label>\n");
      out.write("    <div class=\"col-sm-8\">\n");
      out.write("<input type = \"text\" value = \"\" name =\"name\" class=\"form-control1\" placeholder=\"Department Name\">\n");
      out.write("        </div></div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"DepartmentCityName\" class=\"col-sm-4 control-label\">Department City </label>\n");
      out.write("    <div class=\"col-sm-8\">\t <input type=\"text\" value=\"\" name=\"city\" class=\"form-control1\" placeholder=\"Department City\"></div></div>\n");
      out.write("\n");
      out.write(" <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"DepartmentAddress\" class=\"col-sm-4 control-label\">Department Address</label>\n");
      out.write("    <div class=\"col-sm-8\">\t <textarea name=\"address\" id=\"txtarea1\" cols=\"50\" rows=\"4\" class=\"form-control1\" placeholder=\"Department Address\"></textarea></div></div>\n");
      out.write("                       \n");
      out.write("<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"DepartmentOfficerName\" class=\"col-sm-4 control-label\">Department Officer Name</label>\n");
      out.write("<div class=\"col-sm-8\"><input type=\"text\" value=\"\" name=\"officer\" class=\"form-control1\" placeholder=\"Department Officer Name\"></div></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"DepartmentOffcContact\" class=\"col-sm-4 control-label\">Department Officer Contact No</label>\n");
      out.write("    <div class=\"col-sm-8\"> <input type=\"text\" value=\"\" name=\"contact\" class=\"form-control1\" placeholder=\"Department Officer Contact No.\"></div></div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"DepartmentEmail\" class=\"col-sm-4 control-label\">Department Officer Email</label>\n");
      out.write("    <div class=\"col-sm-8\"> <input type=\"text\" value=\"\" class=\"form-control1\" name=\"email\" placeholder=\"Department Officer Email\"></div></div>\n");
      out.write("    <div class=\"form-group\" style=\"visibility:hidden;\">\n");
      out.write("\t<label for=\"DepartmentImage\" class=\"col-sm-4 control-label\">Department Image</label>\n");
      out.write("<div class=\"col-sm-8\"><input type=\"text\" value=\"\" name=\"image\" class=\"form-control1\" placeholder=\"Department Image\"></div> </div>\n");
      out.write("        <div class=\"form-group\" style=\"visibility:hidden;\">\n");
      out.write("            <label for=\"DepartmentMap\" class=\"col-sm-4 control-label\">Department Map</label>\n");
      out.write("<div class=\"col-sm-8\"><input type=\"text\" value=\"\" name=\"map\" class=\"form-control1\" placeholder=\"Department Map\"></div></div>\n");
      out.write("\n");
      out.write("\n");
}
      out.write("\n");
      out.write("<div class=\"col-sm-8\">\n");
      out.write("    <input type = \"Submit\"  value=\"Submit\" name=\"btn\" onclick=\"return validateform()\" class=\"btn-primary\">\n");
      out.write("    <input type = \"Submit\"  value=\"Update\" name=\"btn\" onclick=\"return validateform()\" class=\"btn-primary\">\n");
      out.write("<input type = \"reset\" class=\"btn-warning\" ></div>\n");
      out.write("\n");
      out.write("</div></div></div>\n");
      out.write(" </form>\n");
      out.write("\n");
      out.write("<table border=\"2\">\n");
      out.write("    <tr>\n");
      out.write("         <th colspan=\"9\">\n");
      out.write("             Departments List\n");
      out.write("         </th>\n");
      out.write("     </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th><b>Click To Edit</b></th>\n");
      out.write("                        <th><b>Department Name</b></th>\n");
      out.write("                        <th><b>City</b></th>\n");
      out.write("                        <th><b>Address</b></th>\n");
      out.write("                        <!--<th><b>Image</b></th>\n");
      out.write("                        <th><b>Map</b></th>-->\n");
      out.write("                        <th><b>Officer Name</b></th>\n");
      out.write("                        <th><b>Officer Contact</b></th>\n");
      out.write("                        <th><b>Officer Email</b></th>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    ");

                        cobj.connect();

                        try
                        {
                            System.out.println("table");
                            pst=cobj.con.prepareStatement("select * from tb_Department");
                            rst=pst.executeQuery();
                            while(rst.next())
                            {
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                            <td>\n");
      out.write("                                 <form name=\"depttable\"   method=\"post\" action=\"DepartmentServlet\">\n");
      out.write("                                    <input type=\"submit\" name=\"btn\" value=\"Select\">\n");
      out.write("                                    <input type=\"text\" name=\"selecttxt\" value=\"");
      out.print(rst.getLong(1));
      out.write("\" style=\"width:1px;visibility:hidden;\">\n");
      out.write("                                    </form>\n");
      out.write("                            </td>\n");
      out.write("                            <td>");
      out.print(rst.getString(2) );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rst.getString(3) );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rst.getString(4) );
      out.write("</td>\n");
      out.write("                            <!--<td>");
      out.print(rst.getString(5) );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rst.getString(6) );
      out.write("</td>-->\n");
      out.write("                            <td>");
      out.print(rst.getString(7) );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rst.getString(8) );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rst.getString(9) );
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
      out.write("</div></div></div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "admin_footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
