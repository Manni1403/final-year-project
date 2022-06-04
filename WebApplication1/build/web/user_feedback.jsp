<%-- 
    Document   : user_feedback
    Created on : Apr 4, 2017, 10:59:49 AM
    Author     : MANMOHAN SINGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedback</title>
        <script type="text/javascript">
            function validateform(){
               var b = document.forms["reg"]["description"].value;
               var c = document.forms["reg"]["date"].value;
                if (b == null || b == "") {
                 alert("Description field cannot be left");
                 return false;
            }
            else if (c == null || c == "") {
                 alert("Date field cannot be left");
                 return false;
            }
            else {
                alert("Your Feedback is inserted");
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
    <form name="reg" action="FeedbackServlet">
				<h2 class="w3ls-hdg">ADD FEEDBACK</h2>
				<div class="tab-content">
					<div class="tab-pane active" id="horizontal-form">
							<div class="form-group">


<!--<div class="form-group">
<label for="signup" class="col-sm-4 control-label">User Name</label>
    <div class="col-sm-8">
<select name="signupid" class="form-control1"></select>
        </div></div>-->

                                <div class="form-group">
								<label for="Description" class="col-sm-4 control-label">Description </label>
                                                                <div class="col-sm-8">
                                                                    <textarea  id="txtarea1" cols="50" rows="4"  name="description" class="form-control1" placeholder="News Description"></textarea></div></div>

 <div class="form-group">
								<label for="Date" class="col-sm-4 control-label">Feedback Date</label>
    <div class="col-sm-8">	 <input name="date"  class="form-control1" placeholder="News Date"/></div></div>

<div class="form-group">
<div class="col-sm-8">
    <input type = "Submit"  value="Submit" name="btn" onclick="return validateform()" class="btn-primary">

<input type = "reset" class="btn-warning" ></div>

</div></div></div>
 </form>
</div></div></div>
        <jsp:include page="user_footer.jsp"></jsp:include>
    </body>
</html>
