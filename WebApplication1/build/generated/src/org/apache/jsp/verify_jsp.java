package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class verify_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("                <script type=\"text/javascript\">\n");
      out.write("            function validateform(){\n");
      out.write("               var a = document.forms[\"reg\"][\"otp\"].value;\n");
      out.write("               if (a == null || a == \"\") {\n");
      out.write("                 alert(\"OTP field cannot be left blank\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("                return true;\n");
      out.write("               </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("               ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("         <div class=\"codes\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("<div class=\"grid_3 grid_4\">\n");
      out.write("    <form name=\"reg\" action=\"signupservlet\" method=\"get\">\n");
      out.write("\t\t\t<h2 class=\"w3ls-hdg\">VERIFY YOUR PHONE NO</h2>\n");
      out.write("\t\t\t<div class=\"tab-content\">\n");
      out.write("\t\t\t<div class=\"tab-pane active\" id=\"horizontal-form\">\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("<label class=\"col-sm-4 control-label\">Enter OTP.");
      out.print(session.getAttribute("otp").toString());
      out.write("</label>\n");
      out.write("    <div class=\"col-sm-8\">\n");
      out.write("   <input type=\"text\" value=\"\" name=\"otp\" class=\"form-control1\" placeholder=\"Enter OTP.\"></div>\n");
      out.write("   <div class=\"col-sm-8\">\n");
      out.write("    <input type = \"Submit\" name=\"btn\" value=\"Submit OTP\" onclick=\"return validateform()\" class=\"btn-primary\">\n");
      out.write("<input type = \"reset\" class=\"btn-warning\" ></div>\n");
      out.write("\n");
      out.write(" </div>\n");
      out.write("</div></div></div>\n");
      out.write(" </form>\n");
      out.write("</div></div></div>\n");
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
