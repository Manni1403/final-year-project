package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register-PSF</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function validateform(){\n");
      out.write("               var a = document.forms[\"reg\"][\"aadhar\"].value;\n");
      out.write("               var b = document.forms[\"reg\"][\"firstname\"].value;\n");
      out.write("               var c = document.forms[\"reg\"][\"lastname\"].value;\n");
      out.write("               var d = document.forms[\"reg\"][\"father\"].value;\n");
      out.write("               var e = document.forms[\"reg\"][\"mother\"].value;\n");
      out.write("               var f = document.forms[\"reg\"][\"category\"].value;\n");
      out.write("               var g = document.forms[\"reg\"][\"qualification\"].value;\n");
      out.write("              // var h = document.forms[\"reg\"][\"dob\"].value;\n");
      out.write("               var i = document.forms[\"reg\"][\"house\"].value;\n");
      out.write("               var j = document.forms[\"reg\"][\"locality\"].value;\n");
      out.write("               var k = document.forms[\"reg\"][\"city\"].value;\n");
      out.write("               var l = document.forms[\"reg\"][\"tehsil\"].value;\n");
      out.write("               var m = document.forms[\"reg\"][\"district\"].value;\n");
      out.write("               var n = document.forms[\"reg\"][\"state\"].value;\n");
      out.write("               var o = document.forms[\"reg\"][\"pincode\"].value;\n");
      out.write("              // var p = document.forms[\"reg\"][\"pan\"].value;\n");
      out.write("              // var q = document.forms[\"reg\"][\"voter\"].value;\n");
      out.write("               var r = document.forms[\"reg\"][\"email\"].value;\n");
      out.write("               var s = document.forms[\"reg\"][\"pass\"].value;\n");
      out.write("               var t = document.forms[\"reg\"][\"cpass\"].value;\n");
      out.write("               var atpos = r.indexOf(\"@\");\n");
      out.write("               var dotpos = r.lastIndexOf(\".\");\n");
      out.write("               if (a == null || a == \"\") {\n");
      out.write("                 alert(\"Aadhar Card Number field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("                if (a.length<12) {\n");
      out.write("                 alert(\"Aadhar Card Number field cannot be less than 16\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else if (b == null || b == \"\") {\n");
      out.write("                 alert(\"First Name field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else if (c == null || c == \"\") {\n");
      out.write("                 alert(\"Last Name field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else if (d == null || d == \"\") {\n");
      out.write("                 alert(\"Father Name field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else if (e == null || e == \"\") {\n");
      out.write("                 alert(\"Mother Name field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else if (f == null || f == \"\") {\n");
      out.write("                 alert(\"Category field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else if (g == null || g == \"\") {\n");
      out.write("                 alert(\"Qualification field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else if (h == null || h == \"\") {\n");
      out.write("                 alert(\"Date Of Birth field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("                 else if (i == null || i == \"\") {\n");
      out.write("                 alert(\"House field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else if (j == null || j == \"\") {\n");
      out.write("                 alert(\"Locality field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else if (k == null || k == \"\") {\n");
      out.write("                 alert(\"City/Town field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("             else if (l == null || l == \"\") {\n");
      out.write("                 alert(\"Tehsil field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("             else if (m == null || m == \"\") {\n");
      out.write("                 alert(\"District field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("             else if (n == null || n == \"\") {\n");
      out.write("                 alert(\"State field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else if (o == null || o == \"\") {\n");
      out.write("                 alert(\"Pincode field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("             else if (p == null || p == \"\") {\n");
      out.write("                 alert(\"Pan No. field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else if (q == null || q == \"\") {\n");
      out.write("                 alert(\"Voter Id field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else if (r == null || r == \"\") {\n");
      out.write("                 alert(\"Email field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else if (atpos<1 || dotpos<atpos+2 || dotpos+2>=y.length)\n");
      out.write("                { alert(\"Not a valid Email Address\");\n");
      out.write("                 return false;}\n");
      out.write("             else if (s == null || s == \"\" ||t == null || t == \"\" ) {\n");
      out.write("                 alert(\"Password field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else if (s.match()==null) {\n");
      out.write("                 alert(\"Passwords donot match\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else {\n");
      out.write("                alert(\"Your Registration detail is inserted\");\n");
      out.write("                return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("         <div class=\"codes\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("<div class=\"grid_3 grid_4\">\n");
      out.write("    <form name=\"reg\" action=\"signupservlet\" method=\"get\">\n");
      out.write("\t\t\t<h2 class=\"w3ls-hdg\">REGISTRATION FORM</h2>\n");
      out.write("\t\t\t<div class=\"tab-content\">\n");
      out.write("\t\t\t<div class=\"tab-pane active\" id=\"horizontal-form\">\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("<label class=\"col-sm-4 control-label\">Aadhar Card No.<h6>(This is used as a User Name)</h6></label>\n");
      out.write("    <div class=\"col-sm-8\">\n");
      out.write("   <input type=\"text\" value=\"\" name=\"aadhar\" class=\"form-control1\" placeholder=\"Aadhar Card No.\"></div>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("<label class=\"col-sm-4 control-label\">First Name</label>\n");
      out.write("    <div class=\"col-sm-8\">\n");
      out.write("<input type = \"text\" value =\"\" name =\"firstname\" class=\"form-control1\" placeholder=\"Name\">\n");
      out.write("        </div></div>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("<label class=\"col-sm-4 control-label\">Last Name</label>\n");
      out.write("    <div class=\"col-sm-8\">\n");
      out.write("<input type = \"text\" value = \"\" name =\"lastname\" class=\"form-control1\" placeholder=\"Last Name\">\n");
      out.write("        </div></div>\n");
      out.write("\n");
      out.write("         <div class=\"form-group\">\n");
      out.write("\t<label class=\"col-sm-4 control-label\">Father Name </label>\n");
      out.write("    <div class=\"col-sm-8\">\n");
      out.write("        <input type=\"text\" value=\"\" name=\"father\" class=\"form-control1\" placeholder=\"Father Name\"></div></div>\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("<label class=\"col-sm-4 control-label\">Mother Name</label>\n");
      out.write("    <div class=\"col-sm-8\">\n");
      out.write("<input type = \"text\" value = \"\" name =\"mother\" class=\"form-control1\" placeholder=\"Mother Name\">\n");
      out.write("        </div></div>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("\t<label class=\"col-sm-4 control-label\">Blood Group</label>\n");
      out.write("    <div class=\"col-sm-8\">\n");
      out.write("        <input type=\"text\" value=\"\" name=\"blood\"  class=\"form-control1\" placeholder=\"Blood Group\"></div></div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("\t<label class=\"col-sm-4 control-label\">Category</label>\n");
      out.write("    <div class=\"col-sm-8\">\n");
      out.write("        <input type=\"text\" name=\"category\" value=\"\" class=\"form-control1\" placeholder=\"Category\"></div></div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("\t\t<label class=\"col-sm-4 control-label\">Qualification</label>\n");
      out.write("    <div class=\"col-sm-8\"> <input type=\"text\" value=\"\" name=\"qualification\" class=\"form-control1\" placeholder=\"Qualification\"></div></div>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("<label  class=\"col-sm-4 control-label\">Date Of Birth</label>\n");
      out.write("    <div class=\"col-sm-8\">\n");
      out.write("        <input type=\"text\" value=\"\" name=\"dob\" class=\"form-control1\" placeholder=\"Date Of Birth\"></div></div>\n");
      out.write("    <div class=\"form-group\"><div class=\"form-group\">\n");
      out.write(" <label class=\"col-sm-4 control-label\">House No</label>\n");
      out.write("    <div class=\"col-sm-8\"> <input type=\"text\" name=\"house\" value=\"\" class=\"form-control1\" placeholder=\"House No\"></div></div>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("<label class=\"col-sm-4 control-label\">Locality</label>\n");
      out.write("<div class=\"col-sm-8\"><textarea name=\"locality\" id=\"txtarea1\" cols=\"50\" rows=\"4\" class=\"form-control1\"></textarea></div></div>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("\t<label class=\"col-sm-4 control-label\">City/Town</label>\n");
      out.write("<div class=\"col-sm-8\"><input type=\"text\" value=\"\" name=\"city\" class=\"form-control1\" placeholder=\"City/Town\"></div></div>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("\t<label class=\"col-sm-4 control-label\">Tehsil</label>\n");
      out.write("<div class=\"col-sm-8\"><input type=\"text\" name=\"tehsil\" value=\"\"  class=\"form-control1\" placeholder=\"Tehsil\"\"></div></div>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("    <label class=\"col-sm-4 control-label\">District</label>\n");
      out.write("<div class=\"col-sm-8\"><input type=\"text\" value=\"\" name=\"district\" class=\"form-control1\" placeholder=\"District\"></div></div>\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("<label class=\"col-sm-4 control-label\">State</label>\n");
      out.write("    <div class=\"col-sm-8\"> <input type=\"text\" value=\"\" name=\"state\" class=\"form-control1\" placeholder=\"State\"></div></div>\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("\t<label class=\"col-sm-4 control-label\">Pincode</label>\n");
      out.write("<div class=\"col-sm-8\"><input type=\"text\" name=\"pincode\" value=\"\"  class=\"form-control1\" placeholder=\"Pincode\"></div></div>\n");
      out.write("               \n");
      out.write("<div class=\"form-group\">\n");
      out.write("\t\t<label class=\"col-sm-4 control-label\">Pancard No.</label>\n");
      out.write("\n");
      out.write("    <div class=\"col-sm-8\">\t<input type = \"text\" value = \"\" name = \"pan\" class=\"form-control1\" placeholder=\"Pancard No.\"> </div></div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("\t\t<label class=\"col-sm-4 control-label\">Contact No</label>\n");
      out.write("<div class=\"col-sm-8\"><input type=\"text\" value=\"\" name=\"voter\" class=\"form-control1\" placeholder=\"Voter Id\"></div></div>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("<label class=\"col-sm-4 control-label\">Email</label>\n");
      out.write("<div class=\"col-sm-8\"><input type=\"text\" value=\"\" name=\"email\" class=\"form-control1\" placeholder=\"Email\"></div> </div>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("<label class=\"col-sm-4 control-label\">Password</label>\n");
      out.write("    <div class=\"col-sm-8\">\t <input type = \"password\" value = \"\" name = \"pass\" class=\"form-control1\"> </div></div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("<lab0el class=\"col-sm-4 control-label\">Confirm Password </label>\n");
      out.write("    <div class=\"col-sm-8\">\n");
      out.write("        <input type=\"password\" value=\"\" name=\"cpass\" class=\"form-control1\"></div></div>\n");
      out.write("<div class=\"col-sm-8\">\n");
      out.write("    <input type = \"Submit\" name=\"btn\" value=\"Submit\" onclick=\"return validateform()\" class=\"btn-primary\">\n");
      out.write("<input type = \"reset\" class=\"btn-warning\" ></div>\n");
      out.write("</div></div></div></div>\n");
      out.write(" </form>\n");
      out.write("</div></div></div>\n");
      out.write("          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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
