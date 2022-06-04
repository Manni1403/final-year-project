<%-- 
    Document   : admin_news
    Created on : Apr 3, 2017, 4:16:45 PM
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
        <title>NEWS PSF</title>
<script type="text/javascript">
            function validateform(){
               var a = document.forms["reg"]["title"].value;
               var b = document.forms["reg"]["description"].value;
               var c = document.forms["reg"]["date"].value;
               if (a == null || a == "") {
                 alert("Title field cannot be left");
                 return false;
            }
            else if (b == null || b == "") {
                 alert("Description field cannot be left");
                 return false;
            }
            else if (c == null || c == "") {
                 alert("Date field cannot be left");
                 return false;
            }
            else {
                alert("Your News is inserted");
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
    <form name="reg" action="NewsServlet">
				<h2 class="w3ls-hdg">ADD/UPDATE NEWS</h2>
				<div class="tab-content">
					<div class="tab-pane active" id="horizontal-form">
							<div class="form-group">

    <%
    aobj= (ArrayList) request.getAttribute("list");
    if(aobj!=null)
    {%>
    <div class="form-group">
<label for="NewsTitle" class="col-sm-4 control-label">News Title</label>
    <div class="col-sm-8">
<input type = "text" value = "<%=aobj.get(1)%>" name ="title" class="form-control1" placeholder="News Title">
        </div></div>

                                <div class="form-group">
                    <label for="NewsDescription" class="col-sm-4 control-label">News Description </label>
                    <div class="col-sm-8">
                    <textarea  id="txtarea1" cols="50" rows="4"  name="description" class="form-control1" placeholder="News Description"><%=aobj.get(2)%> </textarea></div></div>

                    <div class="form-group">
		<label for="NewsDate" class="col-sm-4 control-label">News Date</label>
    <div class="col-sm-8">	 <input type="text" name="date" value="<%=aobj.get(3)%>" class="form-control1" placeholder="News Date"/></div></div>

    <%}
    else
        {
    %>

<div class="form-group">
<label for="NewsTitle" class="col-sm-4 control-label">News Title</label>
    <div class="col-sm-8">
<input type = "text" value = "" name ="title" class="form-control1" placeholder="News Title">
        </div></div>

                                <div class="form-group">
								<label for="NewsDescription" class="col-sm-4 control-label">News Description </label>
                                                                <div class="col-sm-8">
                                                                    <textarea  id="txtarea1" cols="50" rows="4"  name="description" class="form-control1" placeholder="News Description"></textarea></div></div>

 <div class="form-group">
								<label for="NewsDate" class="col-sm-4 control-label">News Date</label>
    <div class="col-sm-8">	 <input type="text" name="date"  class="form-control1" placeholder="News Date"/></div></div>
    <%}%>

<div class="form-group">
<div class="col-sm-8">
    <input type = "Submit"  value="Submit" name="btn" onclick="return validateform()" class="btn-primary">
    <input type = "Submit"  value="Update" name="btn" onclick="return validateform()" class="btn-primary">
    <input type = "reset" class="btn-warning" ></div>
        
</div></div></div></div>
    </form>
 <table border="2">
     <tr>
         <th colspan="4">
             News List
         </th>
     </tr>
     <tr>
         <th>Click</th>
         <th>News ID</th>
         <th>News Title</th>
         <th>News Date</th>
     </tr>



         <%
             cobj.connect();
             try{
             pst = cobj.con.prepareStatement("select * from tb_News");
             rst = pst.executeQuery();
             while(rst.next())
             { %>
             <tr>
             <td>
                 <form name="selectbtn" action="NewsServlet" method="post">
                     <input type ="submit" name="btn" value="Select">
                     <input type ="text" name="selecttxt" value="<%=rst.getLong(1)%>" style="width:1px;visibility:hidden;">
                 </form>
             </td>
             <td><%=rst.getString(2) %></td>
             <td><%=rst.getString(3) %></td>
             <td><%=rst.getString(4) %></td>
             </tr>
         <%}}
         catch(Exception ex)
{
        System.out.println("problem in table servicecitymapping or in select button" +ex);
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
