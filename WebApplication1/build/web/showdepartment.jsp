<%-- 
    Document   : showdepartment
    Created on : May 4, 2017, 9:12:38 AM
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
          <jsp:include page="header.jsp"></jsp:include>
          <center>
   <%!
           ConnectClass cobj=new ConnectClass();
           PreparedStatement pst;
           ResultSet rst;
           ArrayList aobj = new ArrayList();
        %>
        <%String cityname = request.getParameter("city");%>
                <div class="codes">
		<div class="container">
<div class="grid_3 grid_4">
                    <table border="2">
                        <tr>
                        <th colspan="5">
                            <center>Department List - <%=cityname%> </center>
                        </th>
                        </tr>
                    <tr>
                        <th><b>Department Name</b></th>
                        <th><b>Address</b></th>
                        <th><b>Officer Name</b></th>
                        <th><b>Officer Contact</b></th>
                        <th><b>Officer Email</b></th>

                    </tr>

                    <%
                        cobj.connect();

                        try
                        {
                            
                            System.out.println("table");
                            pst=cobj.con.prepareStatement("select dept_name, dept_address, dept_officername, dept_officercontact, dept_officeremail from tb_department where dept_city=?");
                            pst.setString(1,cityname);
                            rst=pst.executeQuery();
                            while(rst.next())
                            {%>
                            <tr>
                            <td><%=rst.getString(1) %></td>
                            <td><%=rst.getString(2) %></td>
                            <td><%=rst.getString(3) %></td>
                            <td><%=rst.getString(4) %></td>
                            <td><%=rst.getString(5) %></td>

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

</div>
                </div>
                </div>
          </center>
          <jsp:include page="footer.jsp"></jsp:include>
        
    </body>
</html>
