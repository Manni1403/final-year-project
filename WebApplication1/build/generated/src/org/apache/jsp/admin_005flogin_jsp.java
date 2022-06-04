package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login</title>\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Wool Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,\n");
      out.write("\tSmartPhone Compatible web template, free web designs for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //meta-tags -->\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \t\t\t<!-- font-awesome icons -->\n");
      out.write("<!-- //Custom Theme files -->\n");
      out.write("<!-- js -->\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<!-- //js -->\n");
      out.write("<!-- web-font -->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Raleway:400,100,200,300,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
      out.write("<!-- //web-font -->\n");
      out.write("    <link href=\"css/popuo-box.css\" rel=\"stylesheet\" />\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("            function validateform(){\n");
      out.write("               var a = document.forms[\"reg\"][\"adhar\"].value;\n");
      out.write("               var b = document.forms[\"reg\"][\"password\"].value;\n");
      out.write("               if (a == null || a == \"\") {\n");
      out.write("                 alert(\"Name field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("               else if (b == null || b == \"\"){\n");
      out.write("                 alert(\"Password field cannot be left\");\n");
      out.write("                 return false;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            else {\n");
      out.write("                alert(\"Login Successfull\");\n");
      out.write("                return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("         <div class=\"header-nav\">\n");
      out.write("          <a class=\"navbar-brand\" href=\"index.html\"><img src=\"images/logo.jpg\" width=\"300\" height=\"100\" /></a>\n");
      out.write("         </div><br/>\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-12\">&nbsp;</div> <div class=\"col-lg-12\">&nbsp;</div> <div class=\"col-lg-12\">&nbsp;</div> <div class=\"col-lg-12\">&nbsp;</div> <div class=\"col-lg-12\">&nbsp;</div>\n");
      out.write("          <br/><div class=\"col-sm-4\">\n");
      out.write("       <h3 class=\"agileinfo_sign\"> LogIn</h3>\n");
      out.write("        </div>\n");
      out.write("\t\t<div class=\"agileits_signin_form\">\n");
      out.write("\t\t\t<form name=\"reg\" action=\"loginservlet\" method=\"get\">\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"adhar\" placeholder=\"User Name\"  class=\"form-control1\">\n");
      out.write("\t\t\t</div>\n");
      out.write("                                <div>&nbsp;</div>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                <input type=\"password\" name=\"password\" placeholder=\"Password\"  class=\"form-control1\">\n");
      out.write("                                </div>\n");
      out.write("                                <div>&nbsp;</div>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"LOGIN\" name=\"btn\" onclick=\"return validateform()\" class=\"btn-primary\">\n");
      out.write("                                </div>\n");
      out.write("                                <div>&nbsp;</div>\n");
      out.write("                        </form></div></div></div>\n");
      out.write("     <div class=\"footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"footer-agileitsrow\">\n");
      out.write("\t\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t\t<h3>Social Media</h3>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i> Facebook</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i> Twitter</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-google\" aria-hidden=\"true\"></i> Google+</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-dribbble\" aria-hidden=\"true\"></i> Dribbble</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t\t<h3>Contact Us</h3>\n");
      out.write("\t\t\t\t\t<p>Pelleesque conquat dignissim lacus quis altrcies.</p>\n");
      out.write("\t\t\t\t\t<div class=\"footer-grid-address\">\n");
      out.write("\t\t\t\t\t\t<p>Tel.800-255-9999</p>\n");
      out.write("\t\t\t\t\t\t<p>Fax: 1234 568</p>\n");
      out.write("\t\t\t\t\t\t<p>Email: <a class=\"email-link\" href=\"mailto:info@example.com\">Example.com</a></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"copy-right\">\n");
      out.write("\t\t<p>© 2017 Public Services Forum. All rights reserved.</p>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- //footer -->\n");
      out.write("\t<!-- start-smooth-scrolling -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t    jQuery(document).ready(function ($) {\n");
      out.write("\t        $(\".scroll\").click(function (event) {\n");
      out.write("\t            event.preventDefault();\n");
      out.write("\n");
      out.write("\t            $('html,body').animate({ scrollTop: $(this.hash).offset().top }, 1000);\n");
      out.write("\t        });\n");
      out.write("\t    });\n");
      out.write("\t</script>\n");
      out.write("\t<!-- //end-smooth-scrolling -->\n");
      out.write("\t<!-- smooth-scrolling-of-move-up -->\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t    $(document).ready(function () {\n");
      out.write("\t        /*\n");
      out.write("\t\t\tvar defaults = {\n");
      out.write("\t\t\t\tcontainerID: 'toTop', // fading element id\n");
      out.write("\t\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("\t\t\t\tscrollSpeed: 1200,\n");
      out.write("\t\t\t\teasingType: 'linear'\n");
      out.write("\t\t\t};\n");
      out.write("\t\t\t*/\n");
      out.write("\n");
      out.write("\t        $().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("\n");
      out.write("\t    });\n");
      out.write("\t</script>\n");
      out.write("\t<!-- //smooth-scrolling-of-move-up -->\n");
      out.write("\t<!-- for bootstrap working -->\n");
      out.write("\t<script src=\"js/bootstrap.js\"> </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
