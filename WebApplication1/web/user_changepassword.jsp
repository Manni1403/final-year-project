<%-- 
    Document   : user_changepassword
    Created on : Apr 4, 2017, 11:23:52 AM
    Author     : MANMOHAN SINGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
        <script type="text/javascript">
            function validateform(){
               var a = document.forms["reg"]["name"].value;
               var b = document.forms["reg"]["oldpassword"].value;
               var c = document.forms["reg"]["newpassword"].value;
               if (a == null || a == "") {
                 alert("User Name field cannot be left");
                 return false;
            }
               else if (b == null || b == "" ||c == null || c == "" ) {
                 alert("Password field cannot be left");
                 return false;
            }
            else if (b.match(c)==null) {
                 alert("Passwords donot match");
                 return false;
            }
            else {
                alert("Your Password is successfully changed");
                return true;
                }
            }
        </script>
    </head>
    <body>
        <jsp:include page="user_header.jsp"></jsp:include>
<div class="codes">
		<div class="container">
<div class="grid_3 grid_4">
    <form name="reg" action="loginservlet">
				<h2 class="w3ls-hdg">CHANGE PASSWORD</h2>
				<div class="tab-content">
					<div class="tab-pane active" id="horizontal-form">
							<div class="form-group">


<div class="form-group">
<label for="signup" class="col-sm-4 control-label">User Name</label>
    <div class="col-sm-8">
<input type="text" name="adhar"  class="form-control1" placeholder="User Name"/>
        </div></div>

                                <div class="form-group">
								<label for="oldpassword" class="col-sm-4 control-label">Old Password </label>
                                                                <div class="col-sm-8">
                                                                   <input type="password" name="password"  class="form-control1" placeholder="Old Password"/></div></div>

 <div class="form-group">
								<label for="newpassword" class="col-sm-4 control-label">New Password</label>
    <div class="col-sm-8">	 <input type="password" name="newpassword"  class="form-control1" placeholder="News Password"/></div></div>

<div class="form-group">
<div class="col-sm-8">
    <input type = "Submit"  value="Change Password" name="btn" onclick="return validateform()" class="btn-primary">

<input type = "reset" class="btn-warning" ></div>

</div></div></div></div>
 </form>
</div></div></div>
        <jsp:include page="user_footer.jsp"></jsp:include>
    </body>
</html>
