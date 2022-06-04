<%-- 
    Document   : verify
    Created on : Apr 14, 2018, 5:46:05 PM
    Author     : Vishesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <script type="text/javascript">
            function validateform(){
               var a = document.forms["reg"]["otp"].value;
               if (a == null || a == "") {
                 alert("OTP field cannot be left blank");
                 return false;
            }
            else
                return true;
               </script>
    </head>
    <body>
               <jsp:include page="header.jsp"></jsp:include>
         <div class="codes">
		<div class="container">
<div class="grid_3 grid_4">
    <form name="reg" action="signupservlet" method="get">
			<h2 class="w3ls-hdg">VERIFY YOUR PHONE NO</h2>
			<div class="tab-content">
			<div class="tab-pane active" id="horizontal-form">
			<div class="form-group">

<%--<td rowspan = 14> <img src ="company.webp" height="650" width="250"> </td>--%>
<div class="form-group">
<label class="col-sm-4 control-label">Enter OTP.<%=session.getAttribute("otp").toString()%></label>
    <div class="col-sm-8">
   <input type="text" value="" name="otp" class="form-control1" placeholder="Enter OTP."></div>
   <div class="col-sm-8">
    <input type = "Submit" name="btn" value="Submit OTP" onclick="return validateform()" class="btn-primary">
<input type = "reset" class="btn-warning" ></div>

 </div>
</div></div></div>
 </form>
</div></div></div>
<jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
