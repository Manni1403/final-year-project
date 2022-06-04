<%-- 
    Document   : admin_feedback
    Created on : Apr 23, 2017, 4:36:31 PM
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
        
         <jsp:include page="admin_header.jsp"></jsp:include>
        <center>
         <%!
           ConnectClass cobj=new ConnectClass();
           PreparedStatement pst;
           ResultSet rst;
           ArrayList aobj = new ArrayList();
        %>
        
         <table border="2">
                        <tr>
                        <th colspan="5">
                        Feedbacks List
                        </th>
                        </tr>
                    <tr>
                        <th><b>User Name</b></th>
                        <th><b>Description</b></th>
                        <th><b>Date</b></th>
                    </tr>

                    <%
                        cobj.connect();

                        try
                        {
                            System.out.println("table");
                            pst=cobj.con.prepareStatement("Select (Select first_name from tb_signup a where a.signup_id =b.signup_id) as username, Description , Feedback_Date  from tb_Feedback b");
                            rst=pst.executeQuery();
                            while(rst.next())
                            {%>
                            <tr>
                            <td><%=rst.getString(1)%></td>
                            <td><%=rst.getString(2) %></td>
                            <td><%=rst.getString(3) %></td>
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
                    <jsp:include page="admin_footer.jsp"></jsp:include>
    </body>
</html>
