<%-- 
    Document   : user_applicationstatus
    Created on : Apr 4, 2017, 10:57:42 AM
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

         <table border="2">
                        <tr>
                        <th colspan="9">
                        Application Status List
                        </th>
                        </tr>
                    <tr>
                        <th><b>Token No</b></th>
                        <th><b>City</b></th>
                        <th><b>Service</b></th>
                        <th><b>Date</b></th>
                        <th><b>Description</b></th>
                        <th><b>Status</b></th>
                        <th><b>Instruction Detail</b></th>
                        <th><b>Instruction Date</b></th>
                        <th><b>View Memo</b></th>
                    </tr>

                    <%
                        cobj.connect();

                        try
                        {
                            System.out.println("table");
                            pst=cobj.con.prepareStatement("Select application_id, (Select city_name from tb_city a where a.city_id = b.city_id) as cityname, (Select service_name from tb_service a where a.service_id = b.service_id) as servicename,  AppDate, Description, Status, Objectiondetail, ObjectionDate from tb_Application b where signup_id=?");
                            pst.setLong(1,Long.parseLong(session.getAttribute("userid").toString()));
                            rst=pst.executeQuery();
                            while(rst.next())
                            {
                                String appid=rst.getString(1);
                            %>
                            <tr>
                            <td><%=appid%></td>
                            <td><%=rst.getString(2)%></td>
                            <td><%=rst.getString(3)%></td>
                            <td><%=rst.getString(4)%></td>
                            <td><%=rst.getString(5)%></td>
                            <td><%=rst.getString(6)%></td>
                            <td><%=rst.getString(7)%></td>
                            <td><%=rst.getString(8)%></td>
                             <td><a href="user_showmemo.jsp?appid=<%=appid%>">View Memo</a></td>
                            </tr>
                            <%} rst.close();
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
        </center>

                    <br>
                    <br>
        <jsp:include page="user_footer.jsp"></jsp:include>
           </body>
</html>
