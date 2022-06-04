<%-- 
    Document   : admin_cityservicemapping
    Created on : Mar 15, 2017, 12:25:42 PM
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
        <title>City Service Mapping-PSF</title>

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
    <form name="reg" action="CSMappingServlet">
				<h2 class="w3ls-hdg">ADD/UPDATE CITY SERVICE MAPPING</h2>
				<div class="tab-content">
					<div class="tab-pane active" id="horizontal-form">
							<div class="form-group">
    <%
    aobj= (ArrayList) request.getAttribute("list");
    if(aobj!=null)
    {%>
    <div class="form-group">
<label for="Name" class="col-sm-4 control-label">City Name</label>
    <div class="col-sm-8">
        <select name="cityid" class="form-control1">
                      <%
        cobj.connect();
        try
       {
            pst = cobj.con.prepareStatement("select * from tb_city");
            rst = pst.executeQuery();
            while(rst.next())
          { String str = rst.getString(1).trim();
                       if(str.equals(aobj.get(1)))
                       {
       %>
                   <option value="<%=str%>" selected=selected> <B><%=rst.getString(2)%></B>

                   <%}
                else
                {%>
                <option value="<%=str%>" > <B><%=rst.getString(2)%></B>
                <%}
                }}
            catch(Exception ex)
            {
                System.out.println("problem in update foreign key city id" +ex);
             }
            finally
            {
                cobj.disconnect();
            }
            %>
        </select>
        </div></div>
<div class="form-group">
<label for="Name" class="col-sm-4 control-label">Service Name</label>
    <div class="col-sm-8">
   <select name="serviceid" class="form-control1">
                             <%
        cobj.connect();
        try
       {
            pst = cobj.con.prepareStatement("select * from tb_service");
            rst = pst.executeQuery();
            while(rst.next())
          { String str = rst.getString(1).trim();
                       if(str.equals(aobj.get(2)))
                       {
       %>
                   <option value="<%=str%>" selected=selected> <B><%=rst.getString(2)%></B>

                   <%}
                else
                {%>
                <option value="<%=str%>" > <B><%=rst.getString(2)%></B>
                <%}
                }}
            catch(Exception ex)
            {
                System.out.println("problem in update foreign key service id" +ex);
             }
            finally
            {
                cobj.disconnect();
            }
            %>
   </select>
        </div></div>

    <%}
    else
        {
    %>

<div class="form-group">
<label for="Name" class="col-sm-4 control-label">City Name</label>
    <div class="col-sm-8">
        <select name="cityid" class="form-control1">
                     <%

        cobj.connect();
        try
       {
            pst = cobj.con.prepareStatement("select * from tb_city");
            rst = pst.executeQuery();
            while(rst.next())
            {%>
               <option value=<%=rst.getString(1)%>><b><%=rst.getString(2)%></b>
            <%}}
            catch(Exception ex)
            {
                System.out.println("problem in foreign key city id" +ex);
             }
            finally
            {
                cobj.disconnect();
            }
            %>
        </select>
        </div></div>


<div class="form-group">
<label for="Name" class="col-sm-4 control-label">Service Name</label>
    <div class="col-sm-8">
   <select name="serviceid" class="form-control1">
                <%

        cobj.connect();
        try
       {
            pst = cobj.con.prepareStatement("select * from tb_service");
            rst = pst.executeQuery();
            while(rst.next())
            {%>
               <option value=<%=rst.getString(1)%>><b><%=rst.getString(2)%></b>
            <%}}
            catch(Exception ex)
            {
                System.out.println("problem in foreign key service id" +ex);
             }
            finally
            {
                cobj.disconnect();
            }
            %>
        </select>
        </div></div>
<%}%>

<div class="col-sm-8">
    <input type = "Submit" name="btn" value="Submit" onclick="return validateform()" class="btn-primary">
  <input type = "Submit"  name="btn" value="Update" onclick="return validateform()" class="btn-primary">
<input type = "reset" class="btn-warning" ></div>

<table border="2">
     <tr>
         <th colspan="3">
             City Services Table
         </th>
     </tr>
     <tr>
         <th>Click</th>
         <th>CityID</th>
         <th>ServiceID</th>
     </tr>
            <%
             cobj.connect();
             try{
             pst = cobj.con.prepareStatement("select Mapping_ID , (Select city_name from tb_city a where a.city_id=b.city_id),(select service_name from tb_service a where a.Service_ID = b.service_id) from tb_mapping b");
             rst = pst.executeQuery();
             while(rst.next())
             { %>
             <tr>
             <td>
                 <form name="selectbtn" action="CSMappingServlet" method="post">
                     <input type ="submit" name="btn" value="Select">
                     <input type ="text" name="selecttxt" value="<%=rst.getLong(1)%>" style="width:1px;visibility:hidden;">
                 </form>
             </td>
             <td><%=rst.getString(2) %></td>
             <td><%=rst.getString(3) %></td>
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
 </form>
</div></div></div>
        <jsp:include page="admin_footer.jsp"></jsp:include>
    </body>
</html>
