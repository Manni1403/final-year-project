<%-- 
    Document   : admin_section
    Created on : Mar 15, 2017, 12:14:43 PM
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
        <title>Section-PSF</title>
<script type="text/javascript">
            function validateform(){
               var a = document.forms["reg"]["sectionname"].value;
               if (a == null || a == "") {
                 alert("Section field cannot be left");
                 return false;
            }
            else {
                alert("Your Section is inserted");
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
    <form name="reg" action="SectionServlet">
				<h2 class="w3ls-hdg">ADD /UPDATE SECTION</h2>
				<div class="tab-content">
					<div class="tab-pane active" id="horizontal-form">
							<div class="form-group">

 <%
    aobj= (ArrayList) request.getAttribute("list");
    if(aobj!=null)
    {%>
    <div class="form-group">
<label for="Name" class="col-sm-4 control-label">Section Name</label>
    <div class="col-sm-8">
<input type = "text" value="<%=aobj.get(1)%>"  name ="sectionname" class="form-control1" placeholder="Section Name">
        </div></div>
     <%}
    else
        {
    %>
<div class="form-group">
<label for="Name" class="col-sm-4 control-label">Section Name</label>
    <div class="col-sm-8">
<input type = "text" value = "" name ="sectionname" class="form-control1" placeholder="Section Name">
        </div></div>
<%}%>
<div class="col-sm-8">
<input type = "Submit"  value="Submit" name="btn" onclick="return validateform()" class="btn-primary">
<input type = "Submit" name="btn"  value="Update" onclick="return validateform()" class="btn-primary">
<input type = "reset" class="btn-warning" ></div>
</div></div></div>
 </form>
                    <table border="2">
                        <tr>
         <th colspan="2">
             Sections List
         </th>
     </tr>
                    <tr>
                        <th><b>Click To Edit</b></th>
                        <th><b>Section Name</b></th>
                    </tr>

                    <%
                        cobj.connect();

                        try
                        {
                            System.out.println("table");
                            pst=cobj.con.prepareStatement("select * from tb_section");
                            rst=pst.executeQuery();
                            while(rst.next())
                            {%>
                            <tr>
                            <td>
                                 <form name="sectiontable"   method="post" action="SectionServlet">
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
