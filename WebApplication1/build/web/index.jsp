<%-- 
    Document   : index
    Created on : Mar 15, 2017, 7:31:13 AM
    Author     : MANMOHAN SINGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.ArrayList"%>
<%@page  import="publicserviceforum.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home-PSF</title>

    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <%!
           ConnectClass cobj=new ConnectClass();
           PreparedStatement pst;
           ResultSet rst;
           ArrayList aobj = new ArrayList();
        %>
        	<div class="banner">
		<!-- Slider-starts-Here -->
		<script src="js/responsiveslides.min.js"></script>
		<script>
		    // You can also use "$(window).load(function() {"
		    $(function () {
		        // Slideshow 3
		        $("#slider3").responsiveSlides({
		            auto: true,
		            pager: true,
		            nav: false,
		            speed: 500,
		            namespace: "callbacks",
		            before: function () {
		                $('.events').append("<li>before event fired.</li>");
		            },
		            after: function () {
		                $('.events').append("<li>after event fired.</li>");
		            }
		        });

		    });
		</script>
		<!-- //End-slider-script -->
		<div  id="top" class="callbacks_container">
			<ul class="rslides" id="slider3">
				<li>
					<div class="banner-info">
						<%--<div class="baner-w3text">
							<h3>Hello!</h3>
							<p>We Provide Good Quality Of Wool</p>
						</div>--%>
					</div>
				</li>
				<li>
					<div class="banner-info1">
						<%--<div class="baner-w3text">
							<h3>Sheep Farm</h3>
							<p>Temporibus autem quibusdam aut</p>
						</div>--%>
					</div>
				</li>
				<li>
					<div class="banner-info2">
						<%--<div class="baner-w3text">
							<h3>Wool</h3>
							<p>Necessitatibus saepe eveniet ut et.</p>
						</div>--%>
					</div>
				</li>
			</ul>
		</div>
		<div class="banner-bottom-grids">
			<div class="container">
				<div class="col-md-3 banner-bottom-grid">
					<div class="banner-bottom-grd w3-agile-back">
						<h4>STEP 01</h4>
						<p>Sign <span>Up</span></p>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="col-md-3 banner-bottom-grid">
					<div class="banner-bottom-grd w3-agile-back1">
						<h4>STEP 02</h4>
						<p>Sign<span> In</span></p>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="col-md-3 banner-bottom-grid">
					<div class="banner-bottom-grd w3-agile-back2">
						<h4>STEP 03</h4>
						<p>Apply for a <span> Service</span></p>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="col-md-3 banner-bottom-grid">
					<div class="banner-bottom-grd w3-agile-back3">
						<h4>STEP 04</h4>
						<p>Get <span> Authorized</span></p>
						<div class="clearfix"> </div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- //banner -->
	<!-- welcome -->
	<div class="welcome w3-agileits">
		<div class="container">
			<h2>About Us</h2>
			<div class="banner-agileits-w3layouts">
				<div class="col-md-4 welcome-grid">
					<img src="images/1.jpg" alt=" " class="img-responsive" />
				</div>
				<div class="col-md-8 welcome-grid">
					<%--<h4>voluptatibus maiores alias consequatur aut perferendis aliquid ex ea commodi consequatur</h4>--%>
					<p style="text-align:justify">In recent years, the Government of India has taken many initiatives to usher in an era of e-Governance to improve the delivery of public services.
The National e-Governance Plan (NeGP) includes many high impact e-Governance projects that have been identified as Mission Mode Projects (MMP's).
One such project focuses on reforming Public services in India. Our e-Publiic Services enables simple, efficient and transparent processes for delivery of passport and related services.
Apart from creating a countrywide networked environment for Government staff.</p>
					<div class="more">
						<a href="single.html">Read More</a>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!-- //welcome -->

	<!-- //newsletter -->
	<!-- news -->
        <%
             cobj.connect();
             try{
             pst = cobj.con.prepareStatement("select top(4) * from tb_News order by news_date desc");
             rst = pst.executeQuery();
             rst.next();
             String title1=rst.getString(2);
                 String description1=rst.getString(3);
                 String date1=rst.getString(4);
         %>
	<div class="news">
		<div class="container">
			<h3>News & Events</h3>
			<p class="news-wthreetext"></p>
			<div class="news-agileinfo">
				<div class="col-md-6 news-grid">
					<div class="col-xs-4 news-grid-left">
						<p><%=title1%><span><%=date1%></span></p>
					</div>
					<div class="col-xs-8 news-grid-right">
						<p><%=description1%></p>
						<div class="more">
							<!--<a href="single.html">Read More</a>-->
						</div>
					</div>
					<div class="clearfix"> </div>
				</div>
                      <%
                      rst.next();
             String title2=rst.getString(2);
                 String description2=rst.getString(3);
                 String date2=rst.getString(4);
%>
         
				<div class="col-md-6 news-grid">
					<div class="col-xs-4 news-grid-left">
						<p><%=title2%><span><%=date2%></span></p>
					</div>
					<div class="col-xs-8 news-grid-right">
						<p><%=description2%></p>
						<div class="more">
							<!--<a href="single.html">Read More</a>-->
						</div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>
                                                 <% rst.next();
             String title3=rst.getString(2);
                 String description3=rst.getString(3);
                 String date3=rst.getString(4); %>
			<div class="news-agileinfo">
				<div class="col-md-6 news-grid">
					<div class="col-xs-4 news-grid-left">
						<p><%=title3%><span><%=date3%></span></p>
					</div>
					<div class="col-xs-8 news-grid-right">
						<p><%=description3%></p>
						<div class="more">
							<!--<a href="single.html">Read More</a>-->
						</div>
					</div>
					<div class="clearfix"> </div>
				</div>
                                                <%rst.next();
             String title4=rst.getString(2);
                 String description4=rst.getString(3);
                 String date4=rst.getString(4);%>
				<div class="col-md-6 news-grid">
					<div class="col-xs-4 news-grid-left">
						<p><%=title4%><span><%=date4%></span></p>
					</div>
					<div class="col-xs-8 news-grid-right">
						<p><%=description4%></p>
						<div class="more">
							<!--<a href="single.html">Read More</a>-->
						</div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
                                                <%}
         catch(Exception ex)
{
        System.out.println("problem in table servicecitymapping or in select button" +ex);
}
finally
{
cobj.disconnect();
}
         %>
	<!-- //news -->
	<!-- customer -->
        
	<div class="customer">
		<div class="container">
			<h3 style="color:maroon">Deartments</h3>
			<div class="customer-w3layoutsgrids">
				<ul id="flexiselDemo1">
                                    <%
             cobj.connect();
             try{
             pst = cobj.con.prepareStatement("select  * from tb_Department");
             rst = pst.executeQuery();
             while(rst.next())
             {%>
					<li>
						<div class="customer-grid">
                                                    <h4 style="color:maroon">Department Name: <%=rst.getString(2)%></h4>
							<p>City: <%=rst.getString(3)%><br>
                                                            Address: <%=rst.getString(4)%><br>
                                                            Officer: <%=rst.getString(7)%><br>
                                                            Contact: <%=rst.getString(8)%><br>
                                                            Email: <%=rst.getString(9)%><br>
                                                        </p>
							
						</div>
					</li>
                                        <% }}
         catch(Exception ex)
{
        System.out.println("problem in table servicecitymapping or in select button" +ex);
}
finally
{
cobj.disconnect();
}
         %>
					<!--<li>
						<div class="customer-grid">
							<p> Sed quia non numquam eius modi tempora neque porro quisquam est, qui dolorem ipsum quia dolor sit amet,
								consectetur, adipisci velit,
								incidunt ut labore et dolore magnam aliquam quaerat voluptatem.</p>
							<h4>Micheal Robert</h4>
						</div>
					</li>
					<li>
						<div class="customer-grid">
							<p> Qui dolorem ipsum quia dolor sit amet, veque porro quisquam est,
								consectetur, adipisci velit, sed quia non numquam eius modi tempora
								incidunt ut labore et dolore magnam aliquam quaerat voluptatem.</p>
							<h4>Williumson</h4>
						</div>
					</li>-->
				</ul>
				<script type="text/javascript">
				    $(window).load(function () {
				        $("#flexiselDemo1").flexisel({
				            visibleItems: 3,
				            animationSpeed: 1000,
				            autoPlay: true,
				            autoPlaySpeed: 3000,
				            pauseOnHover: true,
				            enableResponsiveBreakpoints: true,
				            responsiveBreakpoints: {
				                portrait: {
				                    changePoint: 480,
				                    visibleItems: 1
				                },
				                landscape: {
				                    changePoint: 640,
				                    visibleItems: 2
				                },
				                tablet: {
				                    changePoint: 768,
				                    visibleItems: 2
				                }
				            }
				        });

				    });
				</script>
				<script type="text/javascript" src="js/jquery.flexisel.js"></script>
			</div>
		</div>
	</div>
        
 <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
