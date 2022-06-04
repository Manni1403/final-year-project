<%-- 
    Document   : header
    Created on : Mar 15, 2017, 7:39:00 AM
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

        <meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Wool Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,
	SmartPhone Compatible web template, free web designs for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //meta-tags -->
<!-- Custom Theme files -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/font-awesome.css" rel="stylesheet"> 			<!-- font-awesome icons -->
<!-- //Custom Theme files -->
<!-- js -->
<script src="js/jquery-1.11.1.min.js" type="text/javascript"></script>
<!-- //js -->
<!-- web-font -->
<link href='//fonts.googleapis.com/css?family=Raleway:400,100,200,300,500,600,700,800,900' rel='stylesheet' type='text/css'>
<!-- //web-font -->
    <link href="css/popuo-box.css" rel="stylesheet" />

    </head>
    <body>
                <%!
           ConnectClass cobj=new ConnectClass();
           PreparedStatement pst;
           ResultSet rst;
           ArrayList aobj = new ArrayList();
        %>

                <div class="header">
		<div class="container">
			<div class="header-nav">
				<nav class="navbar navbar-default">
					<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
					   <a class="navbar-brand" href="index.html"><img src="images/logo.jpg" width="600" height="100" /></a>
					</div>
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse nav-wil" id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav">
							<li class="hvr-bounce-to-bottom active"><a href="index.jsp">Home</a></li>
							<li class="hvr-bounce-to-bottom"><a href="about.jsp">About</a></li>
							<li><a href="#" class="dropdown-toggle hvr-bounce-to-bottom" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Services<span class="caret"></span></a>
								<ul class="dropdown-menu">
                                                                    <%
                        cobj.connect();

                        try
                        {
                            System.out.println("table");
                            pst=cobj.con.prepareStatement("select * from tb_service");
                            rst=pst.executeQuery();
                            while(rst.next())
                            {%>
					<li class="hvr-bounce-to-bottom"><a href="#small-dialog" class="play-icon popup-with-zoom-anim"><%=rst.getString(2)%></a></li>
				<%}
                            rst.close();
                        }

                        catch(Exception ex)
                        {
                            System.out.println(ex);
                        }

                        finally
                        {
                            cobj.disconnect();
                        }
                    %>
								</ul>
							</li>
							<li class="hvr-bounce-to-bottom"><a href="faq.jsp">Departments</a></li>
							<li class="hvr-bounce-to-bottom"><a href="register.jsp">Register</a></li>
                            <li class="hvr-bounce-to-bottom"><a href="#small-dialog" class="play-icon popup-with-zoom-anim">Login</a></li>
						</ul>
					</div><!-- //navbar-collapse -->
				</nav>
			</div>
		</div>
	</div> <br />
    <div class="col-lg-12">&nbsp; &nbsp;</div>
	<!-- //header -->
     <!-- pop-up-box -->
	<div id="small-dialog" class="mfp-hide w3ls_small_dialog wthree_pop">
		<h3 class="agileinfo_sign"> LogIn</h3>
		<<div class="agileits_signin_form">
			<form action="loginservlet" method="get">
                            <input type="text" name="adhar" placeholder="AdharNo" required="" class="form-control1">
                            <div>&nbsp;</div>	<input type="password" name="password" placeholder="Password" required="" class="form-control1">
				<div>&nbsp;</div>
				<input type="submit" name="btn" value="LOG IN" class="btn-primary">
				<div>&nbsp;</div>
				<div class="w3agile_social_icons">
					<ul>
						<li class="wthree_follow" style="display:inline">Follow us on :</li>
						<li style="display:inline"><a href="#" class="w3_agile_facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
						<li style="display:inline"><a href="#" class="agile_twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
						<li style="display:inline"><a href="#" class="w3_agile_dribble"><i class="fa fa-dribbble" aria-hidden="true"></i></a></li>
					</ul>
				</div>
			</form>
		</div>
	</div>
<!-- //pop-up-box -->
<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
<script>
    $(document).ready(function () {
        $('.popup-with-zoom-anim').magnificPopup({
            type: 'inline',
            fixedContentPos: false,
            fixedBgPos: true,
            overflowY: 'auto',
            closeBtnInside: true,
            preloader: false,
            midClick: true,
            removalDelay: 300,
            mainClass: 'my-mfp-zoom-in'
        });

    });
</script>
    </body>
</html>
