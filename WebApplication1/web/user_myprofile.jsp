<%-- 
    Document   : user_myprofile
    Created on : Apr 4, 2017, 10:57:01 AM
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
        <title>My Profile</title>
        <script type="text/javascript">
            function validateform(){
               var a = document.forms["reg"]["aadhar"].value;
               var b = document.forms["reg"]["firstname"].value;
               var c = document.forms["reg"]["lastname"].value;
               var d = document.forms["reg"]["father"].value;
               var e = document.forms["reg"]["mother"].value;
               var f = document.forms["reg"]["category"].value;
               var g = document.forms["reg"]["qualification"].value;
               var h = document.forms["reg"]["dob"].value;
               var i = document.forms["reg"]["house"].value;
               var j = document.forms["reg"]["locality"].value;
               var k = document.forms["reg"]["city"].value;
               var l = document.forms["reg"]["tehsil"].value;
               var m = document.forms["reg"]["district"].value;
               var n = document.forms["reg"]["state"].value;
               var o = document.forms["reg"]["pincode"].value;
               var p = document.forms["reg"]["pan"].value;
               var q = document.forms["reg"]["voter"].value;
               var r = document.forms["reg"]["email"].value;
               var s = document.forms["reg"]["pass"].value;
               //var t = document.forms["reg"]["cpass"].value;
               var atpos = r.indexOf("@");
               var dotpos = r.lastIndexOf(".");
               if (a == null || a == "") {
                 alert("Aadhar Card Number field cannot be left");
                 return false;
            }
            else if (b == null || b == "") {
                 alert("First Name field cannot be left");
                 return false;
            }
            else if (c == null || c == "") {
                 alert("Last Name field cannot be left");
                 return false;
            }
            else if (d == null || d == "") {
                 alert("Father Name field cannot be left");
                 return false;
            }
            else if (e == null || e == "") {
                 alert("Mother Name field cannot be left");
                 return false;
            }
            else if (f == null || f == "") {
                 alert("Category field cannot be left");
                 return false;
            }
            else if (g == null || g == "") {
                 alert("Qualification field cannot be left");
                 return false;
            }
            else if (h == null || h == "") {
                 alert("Date Of Birth field cannot be left");
                 return false;
            }
                 else if (i == null || i == "") {
                 alert("House field cannot be left");
                 return false;
            }
            else if (j == null || j == "") {
                 alert("Locality field cannot be left");
                 return false;
            }
            else if (k == null || k == "") {
                 alert("City/Town field cannot be left");
                 return false;
            }
             else if (l == null || l == "") {
                 alert("Tehsil field cannot be left");
                 return false;
            }
             else if (m == null || m == "") {
                 alert("District field cannot be left");
                 return false;
            }
             else if (n == null || n == "") {
                 alert("State field cannot be left");
                 return false;
            }
            else if (o == null || o == "") {
                 alert("Pincode field cannot be left");
                 return false;
            }
             else if (p == null || p == "") {
                 alert("Pan No. field cannot be left");
                 return false;
            }
            else if (q == null || q == "") {
                 alert("Voter Id field cannot be left");
                 return false;
            }
            else if (r == null || r == "") {
                 alert("Email field cannot be left");
                 return false;
            }
            else if (atpos<1 || dotpos<atpos+2 || dotpos+2>=y.length)
                { alert("Not a valid Email Address");
                 return false;}
             else if (s == null || s == "") {
                 alert("Password field cannot be left");
                 return false;
            }
            /*else if (s.match()==null) {
                 alert("Passwords donot match");
                 return false;
            }*/
            else {
                alert("Your Registration detail is inserted");
                return true;
                }
            }
        </script>

    </head>
    <body>
      <jsp:include page="user_header.jsp"></jsp:include>
      <%!
           ConnectClass cobj=new ConnectClass();
           PreparedStatement pst;
           ResultSet rst;
           ArrayList aobj = new ArrayList();
        %>

       <div class="codes">
		<div class="container">
<div class="grid_3 grid_4">
    <form name="reg" action="signupservlet" method="get">
			<h2 class="w3ls-hdg">MY PROFILE</h2>
			<div class="tab-content">
			<div class="tab-pane active" id="horizontal-form">
			<div class="form-group">

<%--<td rowspan = 14> <img src ="company.webp" height="650" width="250"> </td>--%>
<%
                        cobj.connect();

                        try
                        {
                            System.out.println("My profile page");
                            pst=cobj.con.prepareStatement("select * from tb_signup where signup_id="+ Long.parseLong(session.getAttribute("userid").toString()));
                            rst=pst.executeQuery();
                            if(rst.next())
                            {%>
<div class="form-group">
<label class="col-sm-4 control-label">Aadhar Card No.<h6>(This is used as a User Name)</h6></label>
    <div class="col-sm-8">
   <input type="text" value="<%=rst.getString(2)%>" name="aadhar" class="form-control1" placeholder="Aadhar Card No."></div>
 </div>

<div class="form-group">
<label class="col-sm-4 control-label">First Name</label>
    <div class="col-sm-8">
<input type = "text" value ="<%=rst.getString(3)%>" name ="firstname" class="form-control1" placeholder="Name">
        </div></div>
<div class="form-group">
<label class="col-sm-4 control-label">Last Name</label>
    <div class="col-sm-8">
<input type = "text" value = "<%=rst.getString(4)%>" name ="lastname" class="form-control1" placeholder="Last Name">
        </div></div>

         <div class="form-group">
	<label class="col-sm-4 control-label">Father Name </label>
    <div class="col-sm-8">
        <input type="text" value="<%=rst.getString(5)%>" name="father" class="form-control1" placeholder="Father Name"></div></div>
<%--<td rowspan = 14> <img  src = "images.webp"  width="450" height="450">  </td> </tr> --%>
<div class="form-group">
<label class="col-sm-4 control-label">Mother Name</label>
    <div class="col-sm-8">
<input type = "text" value = "<%=rst.getString(6)%>" name ="mother" class="form-control1" placeholder="Mother Name">
        </div></div>
<div class="form-group">
	<label class="col-sm-4 control-label">Blood Group</label>
    <div class="col-sm-8">
        <input type="text" value="<%=rst.getString(7)%>" name="blood"  class="form-control1" placeholder="Blood Group"></div></div>
    <div class="form-group">
	<label class="col-sm-4 control-label">Category</label>
    <div class="col-sm-8"> <input type="text" name="category" value="<%=rst.getString(8)%>" class="form-control1" placeholder="Category"></div></div>
    <div class="form-group">
		<label class="col-sm-4 control-label">Qualification</label>
    <div class="col-sm-8"> <input type="text" value="<%=rst.getString(9)%>" name="qualification" class="form-control1" placeholder="Qualification"></div></div>
<div class="form-group">
<label  class="col-sm-4 control-label">Date Of Birth</label>
    <div class="col-sm-8">
        <input type="text" value="<%=rst.getString(10)%>" name="dob" class="form-control1" placeholder="Date Of Birth"></div></div>
    <div class="form-group"><div class="form-group">
 <label class="col-sm-4 control-label">House No</label>
    <div class="col-sm-8"> <input type="text" name="house" value="<%=rst.getString(11)%>" class="form-control1" placeholder="House No"></div></div>
<div class="form-group">
<label class="col-sm-4 control-label">Locality</label>
<div class="col-sm-8"><textarea name="locality" id="txtarea1" cols="50" rows="4" class="form-control1"><%=rst.getString(12)%></textarea></div></div>
<div class="form-group">
	<label class="col-sm-4 control-label">City/Town</label>
<div class="col-sm-8"><input type="text" value="<%=rst.getString(13)%>" name="city" class="form-control1" placeholder="City/Town"></div></div>
<div class="form-group">
	<label class="col-sm-4 control-label">Tehsil</label>
<div class="col-sm-8"><input type="text" name="tehsil" value="<%=rst.getString(14)%>"  class="form-control1" placeholder="Tehsil""></div></div>
<div class="form-group">
    <label class="col-sm-4 control-label">District</label>
<div class="col-sm-8"><input type="text" value="<%=rst.getString(15)%>" name="district" class="form-control1" placeholder="District"></div></div>

<div class="form-group">
<label class="col-sm-4 control-label">State</label>
    <div class="col-sm-8"> <input type="text" value="<%=rst.getString(16)%>" name="state" class="form-control1" placeholder="State"></div></div>
       <div class="form-group">
	<label class="col-sm-4 control-label">Pincode</label>
<div class="col-sm-8"><input type="text" name="pincode" value="<%=rst.getString(17)%>"  class="form-control1" placeholder="Pincode"></div></div>

<div class="form-group">
		<label class="col-sm-4 control-label">Pancard No.</label>

    <div class="col-sm-8">	<input type = "text" value = "<%=rst.getString(18)%>" name = "pan" class="form-control1" placeholder="Pancard No."> </div></div>
    <div class="form-group">
		<label class="col-sm-4 control-label">Voter Id</label>
<div class="col-sm-8"><input type="text" value="<%=rst.getString(19)%>" name="voter" class="form-control1" placeholder="Voter Id"></div></div>
<div class="form-group">
<label class="col-sm-4 control-label">Email</label>
<div class="col-sm-8"><input type="text" value="<%=rst.getString(20)%>" name="email" class="form-control1" placeholder="Email"></div> </div>
<div class="form-group">
<label class="col-sm-4 control-label">Password</label>
    <div class="col-sm-8">	 <input type = "password" value = "<%=rst.getString(21)%>" name = "pass" class="form-control1"> </div></div>
        <%}
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
<div class="col-sm-8">

    <input type = "Submit" name="btn" value="Update" onclick="return validateform()" class="btn-primary">
<input type = "reset" class="btn-warning" ></div>
</div></div></div></div>
 </form>
</div></div></div>
      <jsp:include page="user_footer.jsp"></jsp:include>
    </body>
</html>
