<%-- 
    Document   : admin_applyservice
    Created on : Apr 24, 2017, 3:18:31 PM
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
        <title>Apply Service</title>
        <script type="text/javascript">
            function validateform(){
               var a = document.forms["reg"]["date"].value;
               var b = document.forms["reg"]["description"].value;
               if (a == null || a == "") {
                 alert("Date field cannot be left");
                 return false;
            }
            else if (b == null || b == "") {
                 alert("Desciption field cannot be left");
                 return false;
            }
            else {
                alert("Your Apply for Service detail is inserted");
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
           String cityid;
        %>
      

        <div class="codes">
		<div class="container">
<div class="grid_3 grid_4">
    <form name="reg" action="ApplyServlet">
				<h2 class="w3ls-hdg">APPLY FOR SERVICES</h2>
				<div class="tab-content">
					<div class="tab-pane active" id="horizontal-form">
							<div class="form-group">
    <!--<div class="form-group">
<label for="Name" class="col-sm-4 control-label">City Name</label>
    <div class="col-sm-8">
        <select name="cityid" class="form-control1">
              <%

        cobj.connect();
        try
       {
            pst = cobj.con.prepareStatement("select * from tb_service a join  tb_mapping b on a.service_id=b.Service_ID and b.City_ID = ?");
            pst.setLong(1,Long.parseLong(session.getAttribute("selectcity").toString()));
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
        </div></div>-->


<div class="form-group">
<label for="Name" class="col-sm-4 control-label">Service Name</label>
    <div class="col-sm-8">
   <select name="serviceid" class="form-control1">
                       <%

        cobj.connect();
        try
       {
            pst = cobj.con.prepareStatement("select * from tb_service a join  tb_mapping b on a.service_id=b.Service_ID and b.City_ID = ?");
            pst.setLong(1,Long.parseLong(session.getAttribute("selectcity").toString()));
            rst = pst.executeQuery();
            while(rst.next())
            {%>
               <option value="<%=rst.getString(1)%>"><b><%=rst.getString(2)%></b>
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
    <div class="form-group">
<label for="AppDate" class="col-sm-4 control-label">Application Date</label>
    <div class="col-sm-8">
<input type = "text"  name ="date" class="form-control1" placeholder="Application Date">
        </div></div>
<div class="form-group">
<label for="Description" class="col-sm-4 control-label">Description</label>
    <div class="col-sm-8">
<input type = "text"  name ="description" class="form-control1" placeholder="Description">
        </div></div>


<div class="col-sm-8">
    <input type="text" name="cityid" value="<%=session.getAttribute("selectcity").toString()%>" style="width:1px;visibility: hidden;">
    <input type = "Submit" name="btn" value="Submit" onclick="return validateform()" class="btn-primary">
 
<input type = "reset" class="btn-warning" ></div>


</div></div></div>
 </form>
</div></div></div>
        <jsp:include page="user_footer.jsp"></jsp:include>
    </body>
</html>
