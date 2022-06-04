<%-- 
    Document   : userfooter
    Created on : Apr 3, 2017, 5:59:59 PM
    Author     : MANMOHAN SINGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<div class="footer">
		<div class="container">
			<div class="footer-agileitsrow">
				<div class="col-md-3 footer-grid">
					<h3>Extras</h3>
					<p>Ut rutrum neque a mollis laoreet diam enim feuiat dui nec ulacoper quam felis id diam. Nunc ut tortor ligula eu petiu risus. Pelleesque conquat dignissim lacus quis altrcies.</p>
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
					<h3>Useful Info</h3>
					<ul>
						<li><a href="#">Home</a></li>
						<li><a href="#">About</a></li>
						<li><a href="#">Services</a></li>
						<li><a href="#">FAQ</a></li>
                        <li><a href="#">Register</a></li>
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
	<!-- //for bootstrap working -->
    </body>
</html>
