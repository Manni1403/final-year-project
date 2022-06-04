<%-- 
    Document   : admin_home
    Created on : Mar 16, 2017, 3:46:59 AM
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
        <title>Admin Home-PSF</title>
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
                        <th colspan="13">
                        Authorise Application Status
                        </th>
                        </tr>
                    <tr>
                        <th><b>Click To Authorize</b></th>
                        <th><b>Token No</b></th>
                        <th><b>Adhar</b></th>
                        <th><b>Name</b></th>
                        <th><b>Email</b></th>
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
                            pst=cobj.con.prepareStatement("Select Application_ID, Aadhaar_Card_No, First_Name, email_id, (Select city_name from tb_city a where a.city_id = b.city_id) as cityname, (Select service_name from tb_service a where a.service_id = b.service_id) as servicename, AppDate, Description, Status, Objectiondetail, ObjectionDate from tb_Application b join tb_signup c on b.Signup_id = c.SignUp_ID where status='pending'");
                            rst=pst.executeQuery();
                            while(rst.next())
                            {
                                String appid = rst.getString(1);
                            %>
                            <tr>
                                <td><form name="apply" action="ApplyServlet">
                                        <input type="Submit" name="btn" value="Accept" >
                                        <input type="Submit" name="btn" value="Object" >
                                        <input type ="text" name="appid" value="<%=appid%>" style="width:1px;visibility: hidden;">
                                    </form></td>
                                    <td><%=appid%></td>
                            <td><%=rst.getString(2)%></td>
                            <td><%=rst.getString(3)%></td>
                            <td><%=rst.getString(4)%></td>
                            <td><%=rst.getString(5)%></td>
                            <td><%=rst.getString(6)%></td>
                            <td><%=rst.getString(7)%></td>
                            <td><%=rst.getString(8)%></td>
                            <td><%=rst.getString(9)%></td>
                            <td><%=rst.getString(10)%></td>
                            <td><%=rst.getString(11)%></td>
                             <td><a href="admin_showmemo.jsp?appid=<%=appid%>">View Memo</a></td>

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
