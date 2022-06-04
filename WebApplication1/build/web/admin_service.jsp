<%-- 
    Document   : admin_service
    Created on : Mar 15, 2017, 12:17:00 PM
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
        <title>Service-PSF</title>
<script type="text/javascript">
            function validateform(){
               var a = document.forms["reg"]["servicename"].value;
               var b = document.forms["reg"]["doc"].value;
               if (a == null || a == "") {
                 alert("Service field cannot be left");
                 return false;
            }
            else if (b == null || b == "") {
                 alert("Document field cannot be left");
                 return false;
            }
            else {
                alert("Your Service is inserted");
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
    <form name="reg" action="ServiceServlet">
				<h2 class="w3ls-hdg">ADD/UPDATE SERVICE</h2>
				<div class="tab-content">
					<div class="tab-pane active" id="horizontal-form">
							<div class="form-group">

    <%
    aobj= (ArrayList) request.getAttribute("list");
    if(aobj!=null)
    {%>
    <div class="form-group">
<label for="Name" class="col-sm-4 control-label">Service Name</label>
    <div class="col-sm-8">
<input type = "text" value = "<%=aobj.get(1)%>" name ="servicename" class="form-control1" placeholder="Service Name">
        </div></div>
    <div class="form-group">
<label for="Name" class="col-sm-4 control-label">Section Name</label>
    <div class="col-sm-8">
        <select name="sectionid" class="form-control1">
              <%

        cobj.connect();
        try
       {
            pst = cobj.con.prepareStatement("select * from tb_section");
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
                System.out.println("problem in foreign key section id" +ex);
             }
            finally
            {
                cobj.disconnect();
            }
            %>

        </select>
        </div></div>
                                                            <div class="form-group">
<label for="Name" class="col-sm-4 control-label">Department Name</label>
    <div class="col-sm-8">
 <select name="departid" class="form-control1">
     
      <%
                              
        cobj.connect();
        try
       {
            pst = cobj.con.prepareStatement("select * from tb_department");
            rst = pst.executeQuery();
            while(rst.next())
           { String str = rst.getString(1).trim();
                       if(str.equals(aobj.get(3)))
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
                System.out.println("problem in foreign key department id" +ex);
             }
            finally
            {
                cobj.disconnect();
            }
            %>
 </select>
        </div></div>
                                                            <div class="form-group">
<label for="Name" class="col-sm-4 control-label">Doc.Required</label>
    <div class="col-sm-8">
<input type = "text" value = "<%=aobj.get(4)%>" name ="doc" class="form-control1" placeholder="Doc.Required">
        </div></div>
 <%}
    else
        {
    %>

<div class="form-group">
<label for="Name" class="col-sm-4 control-label">Service Name</label>
    <div class="col-sm-8">
<input type = "text" value = "" name ="servicename" class="form-control1" placeholder="Service Name">
        </div></div>
                                                            <div class="form-group">
<label for="Name" class="col-sm-4 control-label">Section Name</label>
    <div class="col-sm-8">
        <select name="sectionid" class="form-control1">
            
              <%
                              
        cobj.connect();
        try
       {
            pst = cobj.con.prepareStatement("select * from tb_section");
            rst = pst.executeQuery();
            while(rst.next())
            {%>
               <option value=<%=rst.getString(1)%>><b><%=rst.getString(2)%></b> 
            <%}}
            catch(Exception ex)
            {
                System.out.println("problem in foreign key section id" +ex);
             }
            finally
            {
                cobj.disconnect();
            }
            %>
        </select>
        </div></div>
                                                            <div class="form-group">
<label for="Name" class="col-sm-4 control-label">Department Name</label>
    <div class="col-sm-8">
 <select name="departid" class="form-control1">

      <%

        cobj.connect();
        try
       {
            pst = cobj.con.prepareStatement("select * from tb_department");
            rst = pst.executeQuery();
            while(rst.next())
            {%>
               <option value=<%=rst.getString(1)%>><b><%=rst.getString(2)%></b>
            <%}}
            catch(Exception ex)
            {
                System.out.println("problem in foreign key department id" +ex);
             }
            finally
            {
                cobj.disconnect();
            }
            %>

 </select>
        </div></div>
                                                            <div class="form-group">
<label for="Name" class="col-sm-4 control-label">Doc.Required</label>
    <div class="col-sm-8">
<input type = "text" value = "" name ="doc" class="form-control1" placeholder="Doc.Required">
        </div></div><%}%>
<div class="col-sm-8">
<input type = "Submit"  value="Submit" name="btn" onclick="return validateform()" class="btn-primary">
<input type = "Submit"  value="Update" name="btn" onclick="return validateform()" class="btn-primary">
<input type = "reset" class="btn-warning" ></div>

  <table border="2">
     <tr>
         <th colspan="5">
             Services List
         </th>
     </tr>
     <tr>
         <th>Click</th>
         <th>Service Name</th>
         <th>Section ID</th>
         <th>Department ID</th>
         <th>Docs Required</th>
     </tr>
         <%
             System.out.println("in table service");
             cobj.connect();
             try{
             pst = cobj.con.prepareStatement("select * from tb_service");
             rst = pst.executeQuery();
             while(rst.next())
             { %>
              <tr>
             <td>
                 <form name="selectbtn" action="ServiceServlet" method="post">
                     <input type ="submit" name="btn" value="Select">
                     <input type ="text" name="selecttxt" value="<%=rst.getLong(1)%>">
                 </form>
             </td>
             <td><%=rst.getString(2) %></td>
             <td><%=rst.getString(3) %></td>
             <td><%=rst.getString(4) %></td>
             <td><%=rst.getString(5) %></td>
                  </tr>

         <%}}
         catch(Exception ex)
{
        System.out.println("problem in table servicejsp table or in select button" +ex);
}
finally
{
cobj.disconnect();
}
      System.out.println("exit from table service");   %>


 </table>

</div></div></div>
 </form>
</div></div></div>
        <jsp:include page="admin_footer.jsp"></jsp:include>
    </body>
</html>