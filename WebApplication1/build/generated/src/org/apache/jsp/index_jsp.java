package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.ArrayList;
import publicserviceforum.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Home-PSF</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        \t<div class=\"banner\">\n");
      out.write("\t\t<!-- Slider-starts-Here -->\n");
      out.write("\t\t<script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t    // You can also use \"$(window).load(function() {\"\n");
      out.write("\t\t    $(function () {\n");
      out.write("\t\t        // Slideshow 3\n");
      out.write("\t\t        $(\"#slider3\").responsiveSlides({\n");
      out.write("\t\t            auto: true,\n");
      out.write("\t\t            pager: true,\n");
      out.write("\t\t            nav: false,\n");
      out.write("\t\t            speed: 500,\n");
      out.write("\t\t            namespace: \"callbacks\",\n");
      out.write("\t\t            before: function () {\n");
      out.write("\t\t                $('.events').append(\"<li>before event fired.</li>\");\n");
      out.write("\t\t            },\n");
      out.write("\t\t            after: function () {\n");
      out.write("\t\t                $('.events').append(\"<li>after event fired.</li>\");\n");
      out.write("\t\t            }\n");
      out.write("\t\t        });\n");
      out.write("\n");
      out.write("\t\t    });\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<!-- //End-slider-script -->\n");
      out.write("\t\t<div  id=\"top\" class=\"callbacks_container\">\n");
      out.write("\t\t\t<ul class=\"rslides\" id=\"slider3\">\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"banner-info\">\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"banner-info1\">\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"banner-info2\">\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"banner-bottom-grids\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"col-md-3 banner-bottom-grid\">\n");
      out.write("\t\t\t\t\t<div class=\"banner-bottom-grd w3-agile-back\">\n");
      out.write("\t\t\t\t\t\t<h4>STEP 01</h4>\n");
      out.write("\t\t\t\t\t\t<p>Sign <span>Up</span></p>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 banner-bottom-grid\">\n");
      out.write("\t\t\t\t\t<div class=\"banner-bottom-grd w3-agile-back1\">\n");
      out.write("\t\t\t\t\t\t<h4>STEP 02</h4>\n");
      out.write("\t\t\t\t\t\t<p>Sign<span> In</span></p>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 banner-bottom-grid\">\n");
      out.write("\t\t\t\t\t<div class=\"banner-bottom-grd w3-agile-back2\">\n");
      out.write("\t\t\t\t\t\t<h4>STEP 03</h4>\n");
      out.write("\t\t\t\t\t\t<p>Apply for a <span> Service</span></p>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 banner-bottom-grid\">\n");
      out.write("\t\t\t\t\t<div class=\"banner-bottom-grd w3-agile-back3\">\n");
      out.write("\t\t\t\t\t\t<h4>STEP 04</h4>\n");
      out.write("\t\t\t\t\t\t<p>Get <span> Authorized</span></p>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- //banner -->\n");
      out.write("\t<!-- welcome -->\n");
      out.write("\t<div class=\"welcome w3-agileits\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h2>About Us</h2>\n");
      out.write("\t\t\t<div class=\"banner-agileits-w3layouts\">\n");
      out.write("\t\t\t\t<div class=\"col-md-4 welcome-grid\">\n");
      out.write("\t\t\t\t\t<img src=\"images/1.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-8 welcome-grid\">\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t<p style=\"text-align:justify\">In recent years, the Government of India has taken many initiatives to usher in an era of e-Governance to improve the delivery of public services.\n");
      out.write("The National e-Governance Plan (NeGP) includes many high impact e-Governance projects that have been identified as Mission Mode Projects (MMP's).\n");
      out.write("One such project focuses on reforming Public services in India. Our e-Publiic Services enables simple, efficient and transparent processes for delivery of passport and related services.\n");
      out.write("Apart from creating a countrywide networked environment for Government staff.</p>\n");
      out.write("\t\t\t\t\t<div class=\"more\">\n");
      out.write("\t\t\t\t\t\t<a href=\"single.html\">Read More</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- //welcome -->\n");
      out.write("\n");
      out.write("\t<!-- //newsletter -->\n");
      out.write("\t<!-- news -->\n");
      out.write("        ");

             cobj.connect();
             try{
             pst = cobj.con.prepareStatement("select top(4) * from tb_News order by news_date desc");
             rst = pst.executeQuery();
             rst.next();
             String title1=rst.getString(2);
                 String description1=rst.getString(3);
                 String date1=rst.getString(4);
         
      out.write("\n");
      out.write("\t<div class=\"news\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h3>News & Events</h3>\n");
      out.write("\t\t\t<p class=\"news-wthreetext\"></p>\n");
      out.write("\t\t\t<div class=\"news-agileinfo\">\n");
      out.write("\t\t\t\t<div class=\"col-md-6 news-grid\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-4 news-grid-left\">\n");
      out.write("\t\t\t\t\t\t<p>");
      out.print(title1);
      out.write("<span>");
      out.print(date1);
      out.write("</span></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-8 news-grid-right\">\n");
      out.write("\t\t\t\t\t\t<p>");
      out.print(description1);
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t<div class=\"more\">\n");
      out.write("\t\t\t\t\t\t\t<!--<a href=\"single.html\">Read More</a>-->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                      ");

                      rst.next();
             String title2=rst.getString(2);
                 String description2=rst.getString(3);
                 String date2=rst.getString(4);

      out.write("\n");
      out.write("         \n");
      out.write("\t\t\t\t<div class=\"col-md-6 news-grid\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-4 news-grid-left\">\n");
      out.write("\t\t\t\t\t\t<p>");
      out.print(title2);
      out.write("<span>");
      out.print(date2);
      out.write("</span></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-8 news-grid-right\">\n");
      out.write("\t\t\t\t\t\t<p>");
      out.print(description2);
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t<div class=\"more\">\n");
      out.write("\t\t\t\t\t\t\t<!--<a href=\"single.html\">Read More</a>-->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("                                                 ");
 rst.next();
             String title3=rst.getString(2);
                 String description3=rst.getString(3);
                 String date3=rst.getString(4); 
      out.write("\n");
      out.write("\t\t\t<div class=\"news-agileinfo\">\n");
      out.write("\t\t\t\t<div class=\"col-md-6 news-grid\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-4 news-grid-left\">\n");
      out.write("\t\t\t\t\t\t<p>");
      out.print(title3);
      out.write("<span>");
      out.print(date3);
      out.write("</span></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-8 news-grid-right\">\n");
      out.write("\t\t\t\t\t\t<p>");
      out.print(description3);
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t<div class=\"more\">\n");
      out.write("\t\t\t\t\t\t\t<!--<a href=\"single.html\">Read More</a>-->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                                                ");
rst.next();
             String title4=rst.getString(2);
                 String description4=rst.getString(3);
                 String date4=rst.getString(4);
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-md-6 news-grid\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-4 news-grid-left\">\n");
      out.write("\t\t\t\t\t\t<p>");
      out.print(title4);
      out.write("<span>");
      out.print(date4);
      out.write("</span></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-8 news-grid-right\">\n");
      out.write("\t\t\t\t\t\t<p>");
      out.print(description4);
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t<div class=\"more\">\n");
      out.write("\t\t\t\t\t\t\t<!--<a href=\"single.html\">Read More</a>-->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("                                                ");
}
         catch(Exception ex)
{
        System.out.println("problem in table servicecitymapping or in select button" +ex);
}
finally
{
cobj.disconnect();
}
         
      out.write("\n");
      out.write("\t<!-- //news -->\n");
      out.write("\t<!-- customer -->\n");
      out.write("        \n");
      out.write("\t<div class=\"customer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h3 style=\"color:maroon\">Deartments</h3>\n");
      out.write("\t\t\t<div class=\"customer-w3layoutsgrids\">\n");
      out.write("\t\t\t\t<ul id=\"flexiselDemo1\">\n");
      out.write("                                    ");

             cobj.connect();
             try{
             pst = cobj.con.prepareStatement("select  * from tb_Department");
             rst = pst.executeQuery();
             while(rst.next())
             {
      out.write("\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<div class=\"customer-grid\">\n");
      out.write("                                                    <h4 style=\"color:maroon\">Department Name: ");
      out.print(rst.getString(2));
      out.write("</h4>\n");
      out.write("\t\t\t\t\t\t\t<p>City: ");
      out.print(rst.getString(3));
      out.write("<br>\n");
      out.write("                                                            Address: ");
      out.print(rst.getString(4));
      out.write("<br>\n");
      out.write("                                                            Officer: ");
      out.print(rst.getString(7));
      out.write("<br>\n");
      out.write("                                                            Contact: ");
      out.print(rst.getString(8));
      out.write("<br>\n");
      out.write("                                                            Email: ");
      out.print(rst.getString(9));
      out.write("<br>\n");
      out.write("                                                        </p>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("                                        ");
 }}
         catch(Exception ex)
{
        System.out.println("problem in table servicecitymapping or in select button" +ex);
}
finally
{
cobj.disconnect();
}
         
      out.write("\n");
      out.write("\t\t\t\t\t<!--<li>\n");
      out.write("\t\t\t\t\t\t<div class=\"customer-grid\">\n");
      out.write("\t\t\t\t\t\t\t<p> Sed quia non numquam eius modi tempora neque porro quisquam est, qui dolorem ipsum quia dolor sit amet,\n");
      out.write("\t\t\t\t\t\t\t\tconsectetur, adipisci velit,\n");
      out.write("\t\t\t\t\t\t\t\tincidunt ut labore et dolore magnam aliquam quaerat voluptatem.</p>\n");
      out.write("\t\t\t\t\t\t\t<h4>Micheal Robert</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<div class=\"customer-grid\">\n");
      out.write("\t\t\t\t\t\t\t<p> Qui dolorem ipsum quia dolor sit amet, veque porro quisquam est,\n");
      out.write("\t\t\t\t\t\t\t\tconsectetur, adipisci velit, sed quia non numquam eius modi tempora\n");
      out.write("\t\t\t\t\t\t\t\tincidunt ut labore et dolore magnam aliquam quaerat voluptatem.</p>\n");
      out.write("\t\t\t\t\t\t\t<h4>Williumson</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>-->\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t    $(window).load(function () {\n");
      out.write("\t\t\t\t        $(\"#flexiselDemo1\").flexisel({\n");
      out.write("\t\t\t\t            visibleItems: 3,\n");
      out.write("\t\t\t\t            animationSpeed: 1000,\n");
      out.write("\t\t\t\t            autoPlay: true,\n");
      out.write("\t\t\t\t            autoPlaySpeed: 3000,\n");
      out.write("\t\t\t\t            pauseOnHover: true,\n");
      out.write("\t\t\t\t            enableResponsiveBreakpoints: true,\n");
      out.write("\t\t\t\t            responsiveBreakpoints: {\n");
      out.write("\t\t\t\t                portrait: {\n");
      out.write("\t\t\t\t                    changePoint: 480,\n");
      out.write("\t\t\t\t                    visibleItems: 1\n");
      out.write("\t\t\t\t                },\n");
      out.write("\t\t\t\t                landscape: {\n");
      out.write("\t\t\t\t                    changePoint: 640,\n");
      out.write("\t\t\t\t                    visibleItems: 2\n");
      out.write("\t\t\t\t                },\n");
      out.write("\t\t\t\t                tablet: {\n");
      out.write("\t\t\t\t                    changePoint: 768,\n");
      out.write("\t\t\t\t                    visibleItems: 2\n");
      out.write("\t\t\t\t                }\n");
      out.write("\t\t\t\t            }\n");
      out.write("\t\t\t\t        });\n");
      out.write("\n");
      out.write("\t\t\t\t    });\n");
      out.write("\t\t\t\t</script>\n");
      out.write("\t\t\t\t<script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        \n");
      out.write(" ");
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
