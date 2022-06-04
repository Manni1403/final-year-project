<%-- 
    Document   : admin_city
    Created on : Mar 15, 2017, 11:08:41 AM
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
        <title>City-PSF</title>
        <script type="text/javascript">
          function validateform(){
               var a = document.forms["reg"]["cityname"].value;
               if (a == null || a == "") {
                 alert("City field cannot be left");
                 return false;
            }
            else {
                alert("Your City is inserted");
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
<form name="reg" action="CityServlet">
    				<h2 class="w3ls-hdg">ADD / UPDATE CITY</h2>
				<div class="tab-content">
					<div class="tab-pane active" id="horizontal-form">
							<div class="form-group">

    <%
    aobj= (ArrayList) request.getAttribute("list");
    if(aobj!=null)
    {%>
<div class="form-group">
<label for="CityName" class="col-sm-4 control-label">City Name</label>
    <div class="col-sm-8">
<input type = "text" name ="cityname" value="<%=aobj.get(1)%>" class="form-control1" placeholder="City Name">
        </div></div>
    <%}
    else
   {
    %>
<div class="form-group">
<label for="CityName" class="col-sm-4 control-label">Enter New City Name</label>
    <div class="col-sm-8">
<input type = "text" value = "" name ="cityname" class="form-control1" placeholder="City Name">
        </div></div> <%}%>
<div class="col-sm-8">
<input type = "Submit" name="btn"  value="Submit" onclick="return validateform()" class="btn-primary">
<input type = "Submit" name="btn"  value="Update" onclick="return validateform()" class="btn-primary">
<input type = "reset" class="btn-warning" ></div>

</div></div></div>
 </form>
                    <table border="2">
                        <tr>
                        <th colspan="5">
                        Cities List
                        </th>
                        </tr>
                    <tr>
                        <th><b>Click To Edit</b></th>
                        <th><b>City Name</b></th>
                    </tr>

                    <%
                        cobj.connect();

                        try
                        {
                            System.out.println("table");
                            pst=cobj.con.prepareStatement("select * from tb_city");
                            rst=pst.executeQuery();
                            while(rst.next())
                            {%>
                            <tr>
                            <td>
                                 <form name="ciyttable"   method="post" action="CityServlet">
                                    <input type="submit" name="btn" value="Select">
                                    <input type="text" name="selecttxt" value="<%=rst.getLong(1)%>" style="width:1px;visibility:hidden;">
                                    </form>
                            </td>
                            <td><%=rst.getString(2) %></td>
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
