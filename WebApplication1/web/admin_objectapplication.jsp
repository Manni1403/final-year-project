<%-- 
    Document   : user_objectserviceapplication
    Created on : Apr 24, 2017, 3:32:30 PM
    Author     : MANMOHAN SINGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Object Application</title>
    <script type="text/javascript">
            function validateform(){
               var a = document.forms["reg"]["date"].value;
               var b = document.forms["reg"]["description"].value;
               if (a == null || a == "") {
                 alert("Objection Date field cannot be left");
                 return false;
            }
            else if (b == null || b == "") {
                 alert("Objection Detail field cannot be left");
                 return false;
            }
            else {
                alert("Your Object Detail Application detail is updated");
                return true;
                }
            }
        </script>
    </head>
    <body>
          <jsp:include page="admin_header.jsp"></jsp:include>

        <div class="codes">
		<div class="container">
<div class="grid_3 grid_4">
    <form name="reg" action="ApplyServlet">
				<h2 class="w3ls-hdg">UPDATE OBJECT APPLICATION DETAIL</h2>
				<div class="tab-content">
					<div class="tab-pane active" id="horizontal-form">
							<div class="form-group">
    <div class="form-group">
<label for="Date" class="col-sm-4 control-label">Instruction Date</label>
    <div class="col-sm-8">
<input type = "text"  name ="date" class="form-control1" placeholder="Objection Date">
        </div></div>
<div class="form-group">
<label for="Detail" class="col-sm-4 control-label">Instruction Detail</label>
    <div class="col-sm-8">
<input type = "text"  name ="description" class="form-control1" placeholder="Objection Detail">
        </div></div>


<div class="col-sm-8">
    <input type="text" name="appid" value="<%=request.getParameter("appid")%>" style="width:1px;visibility:hidden;">
    <input type = "Submit" name="btn" value="Update" onclick="return validateform()" class="btn-primary">

<input type = "reset" class="btn-warning" ></div>


</div></div></div>
 </form>
</div></div></div>
        <jsp:include page="admin_footer.jsp"></jsp:include>
    </body>
</html>
