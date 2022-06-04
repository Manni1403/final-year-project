<%-- 
    Document   : admin_login
    Created on : Apr 18, 2017, 4:49:46 PM
    Author     : MANMOHAN SINGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
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
    <script type="text/javascript">
            function validateform(){
               var a = document.forms["reg"]["adhar"].value;
               var b = document.forms["reg"]["password"].value;
               if (a == null || a == "") {
                 alert("Name field cannot be left");
                 return false;
            }
               else if (b == null || b == ""){
                 alert("Password field cannot be left");
                 return false;
            }

            else {
                alert("Login Successfull");
                return true;
                }
            }
        </script>
    </head>
    <body>
        <div class="header">
		<div class="container">
         <div class="header-nav">
          <a class="navbar-brand" href="index.html"><img src="images/logo.jpg" width="300" height="100" /></a>
         </div><br/>

                    <div class="col-lg-12">&nbsp;</div> <div class="col-lg-12">&nbsp;</div> <div class="col-lg-12">&nbsp;</div> <div class="col-lg-12">&nbsp;</div> <div class="col-lg-12">&nbsp;</div>
          <br/><div class="col-sm-4">
       <h3 class="agileinfo_sign"> LogIn</h3>
        </div>
		<div class="agileits_signin_form">
			<form name="reg" action="loginservlet" method="get">
                            <div class="col-sm-4">
				<input type="text" name="adhar" placeholder="User Name"  class="form-control1">
			</div>
                                <div>&nbsp;</div>
                                <div class="col-sm-4">
                                <input type="password" name="password" placeholder="Password"  class="form-control1">
                                </div>
                                <div>&nbsp;</div>
                                <div class="col-sm-4">
				<input type="submit" value="LOGIN" name="btn" onclick="return validateform()" class="btn-primary">
                                </div>
                                <div>&nbsp;</div>
                        </form></div></div></div>
     <div class="footer">
		<div class="container">
			<div class="footer-agileitsrow">
				<div class="col-md-3 footer-grid">
					
				</div>
				<div class="col-md-3 footer-grid">
					<h3>Social Media</h3>
					<ul>
						<li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i> Facebook</a></li>
						<li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i> Twitter</a></li>
						<li><a href="#"><i class="fa fa-google" aria-hidden="true"></i> Google+</a></li>
						<li><a href="#"><i class="fa fa-dribbble" aria-hidden="true"></i> Dribbble</a></li>
					</ul>
				</div>
				
				<div class="col-md-3 footer-grid">
					<h3>Contact Us</h3>
					<p>Pelleesque conquat dignissim lacus quis altrcies.</p>
					<div class="footer-grid-address">
						<p>Tel.800-255-9999</p>
						<p>Fax: 1234 568</p>
						<p>Email: <a class="email-link" href="mailto:info@example.com">Example.com</a></p>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<div class="copy-right">
		<p>© 2017 Public Services Forum. All rights reserved.</p>
	</div>
	<!-- //footer -->
	<!-- start-smooth-scrolling -->
	<script type="text/javascript" src="js/move-top.js"></script>
	<script type="text/javascript" src="js/easing.js"></script>
	<script type="text/javascript">
	    jQuery(document).ready(function ($) {
	        $(".scroll").click(function (event) {
	            event.preventDefault();

	            $('html,body').animate({ scrollTop: $(this.hash).offset().top }, 1000);
	        });
	    });
	</script>
	<!-- //end-smooth-scrolling -->
	<!-- smooth-scrolling-of-move-up -->
	<script type="text/javascript">
	    $(document).ready(function () {
	        /*
			var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear'
			};
			*/

	        $().UItoTop({ easingType: 'easeOutQuart' });

	    });
	</script>
	<!-- //smooth-scrolling-of-move-up -->
	<!-- for bootstrap working -->
	<script src="js/bootstrap.js"> </script>

    </body>

</html>
