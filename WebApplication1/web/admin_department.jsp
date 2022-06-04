

<%-- 
    Document   : admin_department
    Created on : Mar 15, 2017, 11:40:23 AM
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
        <title>Department-PSF</title>
         <script type="text/javascript">
            function validateform(){
               var a = document.forms["reg"]["name"].value;
               var b = document.forms["reg"]["city"].value;
               var c = document.forms["reg"]["address"].value;
               //var d = document.forms["reg"]["image"].value;
               //var e = document.forms["reg"]["map"].value;
               var f = document.forms["reg"]["officer"].value;
               var g = document.forms["reg"]["contact"].value;
               var h = document.forms["reg"]["email"].value;
               var atpos = h.indexOf("@");
               var dotpos = h.lastIndexOf(".");
               if (a == null || a == "") {
                 alert("Department field cannot be left");
                 return false;
            }
            else if (b == null || b == "") {
                 alert("City field cannot be left");
                 return false;
            }
            else if (c == null || c == "") {
                 alert("Address field cannot be left");
                 return false;
            }
            /*else if (d == null || d == "") {
                 alert("Image field cannot be left");
                 return false;
            }
            else if (e == null || e == "") {
                 alert("Map field cannot be left");
                 return false;
            }*/
            else if (f == null || f == "") {
                 alert("Name field cannot be left");
                 return false;
            }
            else if (g == null || g == "") {
                 alert("Contact Number field cannot be left");
                 return false;
            }
            else if (h == null || h == "") {
                 alert("Email field cannot be left");
                 return false;
            }
            else if (atpos<1 || dotpos<atpos+2 || dotpos+2>=y.length)
                { alert("Not a valid Email Address");
                 return false;}

            else {
                alert("Your Department detail is inserted");
                return true;
                }
            }
        </script>
    </head>
    <body>
        <jsp:include page="admin_header.jsp"></jsp:include>
         <%!
           ConnectClass cobj=new ConnectClass();
           PreparedStatement pst;
           ResultSet rst;
           ArrayList aobj = new ArrayList();
        %>
        <div class="codes">
		<div class="container">
<div class="grid_3 grid_4">
    <form name="reg" action="DepartmentServlet">
				<h2 class="w3ls-hdg">ADD/UPDATE  DEPARTMENT</h2>
				<div class="tab-content">
					<div class="tab-pane active" id="horizontal-form">
							<div class="form-group">

<%
    aobj= (ArrayList) request.getAttribute("list");
    if(aobj!=null)
    {%>
<div class="form-group">
<label for="DepartmentName" class="col-sm-4 control-label">Department Name</label>
    <div class="col-sm-8">
<input type = "text" value = "<%=aobj.get(1)%>" name ="name" class="form-control1" placeholder="Department Name">
        </div></div>

                                <div class="form-group">
								<label for="DepartmentCityName" class="col-sm-4 control-label">Department City </label>
    <div class="col-sm-8">	 <input type="text" value = "<%=aobj.get(2)%>" name="city" class="form-control1" placeholder="Department City"></div></div>
<%--<td rowspan = 14> <img  src = "images.webp"  width="250" height="450">  </td> </tr> --%>
 <div class="form-group">
								<label for="DepartmentAddress" class="col-sm-4 control-label">Department Address</label>
    <div class="col-sm-8">	 <textarea name="address" id="txtarea1" cols="50" rows="4" class="form-control1" placeholder="Department Address"><%=aobj.get(3)%></textarea></div></div>


<div class="form-group">
								<label for="DepartmentOfficerName" class="col-sm-4 control-label">Department Officer Name</label>
<div class="col-sm-8"><input type="text" value = "<%=aobj.get(6)%>" name="officer" class="form-control1" placeholder="Department Officer Name"></div></div>



<div class="form-group">
								<label for="DepartmentOffcContact" class="col-sm-4 control-label">Department Officer Contact No</label>
    <div class="col-sm-8"> <input type="text" value = "<%=aobj.get(7)%>" name="contact" class="form-control1" placeholder="Department Officer Contact No."></div></div>
                                <div class="form-group">
								<label for="DepartmentEmail" class="col-sm-4 control-label">Department Officer Email</label>
    <div class="col-sm-8"> <input type="text" value = "<%=aobj.get(8)%>" class="form-control1" name="email" placeholder="Department Officer Email"></div></div>
    <div class="form-group" style="visibility:hidden;">
<label for="DepartmentImage" class="col-sm-4 control-label">Department Image</label>
<div class="col-sm-8"><input type="text" value = "<%=aobj.get(4)%>" name="image" class="form-control1" placeholder="Department Image"></div> </div>
<div class="form-group" style="visibility:hidden;">
    <label for="DepartmentMap" class="col-sm-4 control-label">Department Map</label>
<div class="col-sm-8"><input type="text" value = "<%=aobj.get(5)%>" name="map" class="form-control1" placeholder="Department Map"></div></div>

    <%}
    else
        {
    %>

<div class="form-group">
<label for="DepartmentName" class="col-sm-4 control-label">Department Name</label>
    <div class="col-sm-8">
<input type = "text" value = "" name ="name" class="form-control1" placeholder="Department Name">
        </div></div>

                                <div class="form-group">
								<label for="DepartmentCityName" class="col-sm-4 control-label">Department City </label>
    <div class="col-sm-8">	 <input type="text" value="" name="city" class="form-control1" placeholder="Department City"></div></div>
<%--<td rowspan = 14> <img  src = "images.webp"  width="250" height="450">  </td> </tr> --%>
 <div class="form-group">
								<label for="DepartmentAddress" class="col-sm-4 control-label">Department Address</label>
    <div class="col-sm-8">	 <textarea name="address" id="txtarea1" cols="50" rows="4" class="form-control1" placeholder="Department Address"></textarea></div></div>
                       
<div class="form-group">
								<label for="DepartmentOfficerName" class="col-sm-4 control-label">Department Officer Name</label>
<div class="col-sm-8"><input type="text" value="" name="officer" class="form-control1" placeholder="Department Officer Name"></div></div>



<div class="form-group">
								<label for="DepartmentOffcContact" class="col-sm-4 control-label">Department Officer Contact No</label>
    <div class="col-sm-8"> <input type="text" value="" name="contact" class="form-control1" placeholder="Department Officer Contact No."></div></div>
                                <div class="form-group">
								<label for="DepartmentEmail" class="col-sm-4 control-label">Department Officer Email</label>
    <div class="col-sm-8"> <input type="text" value="" class="form-control1" name="email" placeholder="Department Officer Email"></div></div>
    <div class="form-group" style="visibility:hidden;">
	<label for="DepartmentImage" class="col-sm-4 control-label">Department Image</label>
<div class="col-sm-8"><input type="text" value="" name="image" class="form-control1" placeholder="Department Image"></div> </div>
        <div class="form-group" style="visibility:hidden;">
            <label for="DepartmentMap" class="col-sm-4 control-label">Department Map</label>
<div class="col-sm-8"><input type="text" value="" name="map" class="form-control1" placeholder="Department Map"></div></div>


<%}%>
<div class="col-sm-8">
    <input type = "Submit"  value="Submit" name="btn" onclick="return validateform()" class="btn-primary">
    <input type = "Submit"  value="Update" name="btn" onclick="return validateform()" class="btn-primary">
<input type = "reset" class="btn-warning" ></div>

</div></div></div>
 </form>

<table border="2">
    <tr>
         <th colspan="9">
             Departments List
         </th>
     </tr>
                    <tr>
                        <th><b>Click To Edit</b></th>
                        <th><b>Department Name</b></th>
                        <th><b>City</b></th>
                        <th><b>Address</b></th>
                        <!--<th><b>Image</b></th>
                        <th><b>Map</b></th>-->
                        <th><b>Officer Name</b></th>
                        <th><b>Officer Contact</b></th>
                        <th><b>Officer Email</b></th>
                    </tr>

                    <%
                        cobj.connect();

                        try
                        {
                            System.out.println("table");
                            pst=cobj.con.prepareStatement("select * from tb_Department");
                            rst=pst.executeQuery();
                            while(rst.next())
                            {%>
                            <tr>
                            <td>
                                 <form name="depttable"   method="post" action="DepartmentServlet">
                                    <input type="submit" name="btn" value="Select">
                                    <input type="text" name="selecttxt" value="<%=rst.getLong(1)%>" style="width:1px;visibility:hidden;">
                                    </form>
                            </td>
                            <td><%=rst.getString(2) %></td>
                            <td><%=rst.getString(3) %></td>
                            <td><%=rst.getString(4) %></td>
                            <!--<td><%=rst.getString(5) %></td>
                            <td><%=rst.getString(6) %></td>-->
                            <td><%=rst.getString(7) %></td>
                            <td><%=rst.getString(8) %></td>
                            <td><%=rst.getString(9) %></td>
                            </tr>
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

                </table>
</div></div></div>
        <jsp:include page="admin_footer.jsp"></jsp:include>
    </body>
</html>

