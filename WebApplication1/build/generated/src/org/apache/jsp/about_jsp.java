package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>About-PSF</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"about\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h2>About Us</h2>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"w3layouts-text\">\n");
      out.write("\t\t\t\t<img src=\"images/images.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t<p style=\"text-align:justify\">In recent years, the Government of India has taken many initiatives to usher in an era of e-Governance to improve the delivery of public services.\n");
      out.write("The National e-Governance Plan (NeGP) includes many high impact e-Governance projects that have been identified as Mission Mode Projects (MMP's).\n");
      out.write("One such project focuses on reforming Public services in India. Our e-Publiic Services enables simple, efficient and transparent processes for delivery of passport and related services.\n");
      out.write("Apart from creating a countrywide networked environment for Government staff.</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"advantages\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h3>Our Advantages</h3>\n");
      out.write("\t\t\t<div class=\"advantages-agileinfo\">\n");
      out.write("\t\t\t\t<div class=\"col-md-6 our-advantages-grid\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-3 our-advantages-grd-left\">\n");
      out.write("\t\t\t\t\t\t<p>1.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-9 our-advantages-grd-right\">\n");
      out.write("\t\t\t\t\t\t<h4>Transparency</h4>\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-6 our-advantages-grid\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-3 our-advantages-grd-left\">\n");
      out.write("\t\t\t\t\t\t<p>2.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-9 our-advantages-grd-right\">\n");
      out.write("\t\t\t\t\t\t<h4>Democratization</h4>\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                <div class=\"col-lg-12\">&nbsp;</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-6 our-advantages-grid\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-3 our-advantages-grd-left\">\n");
      out.write("\t\t\t\t\t\t<p>3.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-9 our-advantages-grd-right\">\n");
      out.write("\t\t\t\t\t\t<h4>Convenience</h4>\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-6 our-advantages-grid\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-3 our-advantages-grd-left w3ls-advnt\">\n");
      out.write("\t\t\t\t\t\t<p>4.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-9 our-advantages-grd-right\">\n");
      out.write("\t\t\t\t\t\t<h4>Speed and Efficiency</h4>\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div><div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!--<div class=\"history agileits-w3layouts\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"col-md-6 history-agileleft\">\n");
      out.write("\t\t\t\t<h3>History</h3>\n");
      out.write("\t\t\t\t<div class=\" history-agileleft-grid\">\n");
      out.write("\t\t\t\t\t<p><i class=\"glyphicon glyphicon-calendar\" aria-hidden=\"true\"></i>21.5.2014</p>\n");
      out.write("\t\t\t\t\t<h4>consequatur aut perferendis</h4>\n");
      out.write("\t\t\t\t\t<p class=\"aut\">Itaque earum rerum hic tenetur a sapiente delectus,\n");
      out.write("\t\t\t\t\t\tut aut reiciendis voluptatibus maiores alias consequatur voluptates repudiandae sint et\n");
      out.write("\t\t\t\t\t\tmolestiae non recusandae aut perferendis.</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\" history-agileleft-grid\">\n");
      out.write("\t\t\t\t\t<p><i class=\"glyphicon glyphicon-calendar\" aria-hidden=\"true\"></i>28.5.2015</p>\n");
      out.write("\t\t\t\t\t<h4>consequatur aut perferendis</h4>\n");
      out.write("\t\t\t\t\t<p class=\"aut\">Itaque earum rerum hic tenetur a sapiente delectus,\n");
      out.write("\t\t\t\t\t\tut aut reiciendis voluptatibus maiores alias consequatur voluptates repudiandae sint et\n");
      out.write("\t\t\t\t\t\tmolestiae non recusandae aut perferendis.</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\" history-agileleft-grid\">\n");
      out.write("\t\t\t\t\t<p><i class=\"glyphicon glyphicon-calendar\" aria-hidden=\"true\"></i>03.10.2016</p>\n");
      out.write("\t\t\t\t\t<h4>consequatur aut perferendis</h4>\n");
      out.write("\t\t\t\t\t<p class=\"aut\">Itaque earum rerum hic tenetur a sapiente delectus,\n");
      out.write("\t\t\t\t\t\tut aut reiciendis voluptatibus maiores alias consequatur voluptates repudiandae sint et\n");
      out.write("\t\t\t\t\t\tmolestiae non recusandae aut perferendis.</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-6 history-right\">\n");
      out.write("\t\t\t\t<h3>What We Offer</h3>\n");
      out.write("\t\t\t\t<h4>voluptatibus maiores alias</h4>\n");
      out.write("\t\t\t\t<p>Donec volutpat eros quis velit facilisis, vel feugiat orci posuere. Pellentesque ac hendrerit sem, non varius quam. Nam ex ante, congue aliquet mattis a, vulputate quis mauris. Nunc sit amet nisl ornare</p>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><span class=\"glyphicon glyphicon-menu-right\"></span><a href=\"#\">recusandae aut perferendis</a></li>\n");
      out.write("\t\t\t\t\t<li><span class=\"glyphicon glyphicon-menu-right\"></span><a href=\"#\">voluptatibus maiores alias</a></li>\n");
      out.write("\t\t\t\t\t<li><span class=\"glyphicon glyphicon-menu-right\"></span><a href=\"#\">molestiae non recusandae</a></li>\n");
      out.write("\t\t\t\t\t<li><span class=\"glyphicon glyphicon-menu-right\"></span><a href=\"#\">alias consequatur voluptates</a></li>\n");
      out.write("\t\t\t\t\t<li><span class=\"glyphicon glyphicon-menu-right\"></span><a href=\"#\">tenetur a sapiente delectus</a></li>\n");
      out.write("\t\t\t\t\t<li><span class=\"glyphicon glyphicon-menu-right\"></span><a href=\"#\">earum rerum hic tenetur</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>-->\n");
      out.write("  ");
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
