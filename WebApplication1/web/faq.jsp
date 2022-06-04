<%-- 
    Document   : faq
    Created on : Mar 15, 2017, 10:41:18 AM
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
   <%!
           ConnectClass cobj=new ConnectClass();
           PreparedStatement pst;
           ResultSet rst;
           ArrayList aobj = new ArrayList();
        %>
                <div class="codes">
		<div class="container">
<div class="grid_3 grid_4">
    <form name="reg" action="DepartmentServlet">
				<h2 class="w3ls-hdg">Select City</h2>
                                <div class="tab-content">
					<div class="tab-pane active" id="horizontal-form">
							<div class="form-group">
                                                            <div class="form-group">
<label for="Name" class="col-sm-4 control-label">Select City Name</label>
    <div class="col-sm-8">
        <select name="city" class="form-control1">
              <%

        cobj.connect();
        try
       {
            pst = cobj.con.prepareStatement("select distinct dept_city, dept_city from tb_department");
            rst = pst.executeQuery();
            while(rst.next())
            {%>
               <option value=<%=rst.getString(1)%>><b><%=rst.getString(2)%></b>
            <%}}
            catch(Exception ex)
            {
                System.out.println("problem in dept city" +ex);
             }
            finally
            {
                cobj.disconnect();
            }
            %>
        </select>
        </div></div>
        <div class="col-sm-8">
    <input type = "Submit" name="btn" value="Next"  class="btn-primary">
 </div>


                                                            </div>
                </div>
                </div>

    </form>
</div>
                </div>
                </div>

          <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
