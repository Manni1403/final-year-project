<%-- 
    Document   : user_showmemo
    Created on : Apr 26, 2017, 10:09:07 AM
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
        <title>JSP Page</title>
    </head>
    <body>
                    <jsp:include page="user_header.jsp"></jsp:include>
                     <center>
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
			<h2 class="w3ls-hdg">Application Memo</h2>
			<div class="tab-content">
			<div class="tab-pane active" id="horizontal-form">
			<div class="form-group">

<%--<td rowspan = 14> <img src ="company.webp" height="650" width="250"> </td>--%>
<%
                        cobj.connect();
                        String appid=request.getParameter("appid");
                        try
                        {
                            System.out.println("My profile page");
                            pst=cobj.con.prepareStatement("Select application_id, (Select city_name from tb_city a where a.city_id = b.city_id) as cityname, (Select service_name from tb_service a where a.service_id = b.service_id) as servicename,  AppDate, Description, Status, Objectiondetail, ObjectionDate from tb_Application b where application_id=?");
                               pst.setLong(1,Long.parseLong(appid));
                            rst=pst.executeQuery();
                            if(rst.next())
                            {%>
<div class="form-group">
<label class="col-sm-4 control-label">Token No.- <%=rst.getString(1)%>  </label>
   
 </div>

<div class="form-group">
<label class="col-sm-4 control-label">City - <%=rst.getString(2)%></label>
   </div>
<div class="form-group">
<label class="col-sm-4 control-label">Service - <%=rst.getString(3)%></label>
</div>
         <div class="form-group">
	<label class="col-sm-4 control-label">Date - <%=rst.getString(4)%></label>
    </div>
<%--<td rowspan = 14> <img  src = "images.webp"  width="450" height="450">  </td> </tr> --%>
<div class="form-group">
<label class="col-sm-4 control-label">Description - <%=rst.getString(5)%></label>
   </div>
<div class="form-group">
	<label class="col-sm-4 control-label">Status - <%=rst.getString(6)%></label>
    </div>
    <div class="form-group">
	<label class="col-sm-4 control-label">Objection Detail - <%=rst.getString(7)%></label>
</div>
    <div class="form-group">
		<label class="col-sm-4 control-label">Objection Date - <%=rst.getString(8)%></label>
</div>
 <div class="form-group">
		<label class="col-sm-4 control-label">Time - 9:30 am</label>
</div>
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

</div></div></div>
 </form>
</div></div></div>
                     </center>
      <jsp:include page="user_footer.jsp"></jsp:include>
       
    </body>
</html>
