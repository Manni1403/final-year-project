<%-- 
    Document   : demojsp
    Created on : Mar 29, 2017, 1:48:43 PM
    Author     : MANMOHAN SINGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head><title>Registration Form</title>
<script type="text/javascript">
function validateForm()
{
var a=document.forms["reg"]["Name"].value;
var b=document.forms["reg"]["city"].value;
var c=document.forms["reg"]["email"].value;
var d=document.forms["reg"]["c_name"].value;
var e=document.forms["reg"]["b_category"].value;
var f=document.forms["reg"]["adress"].value;
var g=document.forms["reg"]["c_no"].value;
var h=document.forms["reg"]["uname"].value;
var i=document.forms["reg"]["password"].value;
var j=document.forms["reg"]["cpass"].value;
var atpos=c.indexOf("@");
var dotpos=c.lastIndexOf(".");

if (a==null || a=="")
  {
  alert("name field cannot be left");
  return false;
  }
else
 if (b==null || b=="")
  {
  alert("you must mention your city or town name");
  return false;
  }
else
if(c==null || c=="")
{
return false;
}
else
 if (d==null || d=="")
  {
  alert("You must give your company name.");
  return false;
  }
else
 if (e==null || e=="")
  {
  alert("you must mention your business category.");
  return false;
  }
else
 if (f==null || f=="")
  {
  alert("You must give your company address.");
  return false;
  }
else
 if (g==null || g=="")
  {
  alert("You must give your contact number.");
  return false;
  }
else
 if (h==null || h=="")
  {
  alert("username must be filled");
  return false;
  }
else
 if (i==null || i=="" || j==null || j=="")
  {
  alert("password field can't be empty");
  return false;
  }
else
 if(i.match(j)==null)
{
alert("passwords donot match");
  return false;
}
else
 if (atpos<1 || dotpos<atpos+2 || dotpos+2>=y.length)
  {
  alert("Not a valid e-mail address");
 return false;
  }

else
{
alert("Your account has been successfully registered");
return true;
}
}

</script>
</head>
<body>

<form name="reg" >
<Center>
<table cellpadding = 10 border =0 width=1000>
<tr background="inner-header.jpg">
<th colspan = 4><font color="red"><h2> REGISTRATION FORM </h2></font></th>
</tr>
<tr>
<td rowspan = 14> <img src ="company.webp" height="650" width="250"> </td>
<td> <b> Name </b>  </td>
<td> <input type = "text" value = "" name = "Name" placeholder="Enter name"> </td>
<td rowspan = 14> <img  src = "images.webp"  width="250" height="450">  </td> </tr>

<tr> <td > <b> Gender </b> </td> <td>  <input type = "radio" value = "M" name = "gen" checked >Male
		<input type = "radio" value = "F" name = "gen">Female  </td> </tr>

<tr> <td>  <b> City/Town</b>  </td>
<td><input type="text" value="" name="city"></td>
 </tr>

<tr> <td>  <b> Email</b>  </td>
<td><input type="text" value="" name="email"></td> </tr>
<tr> <td>  <b>Company Name </b> </td> <td> <input type="text" value="" name="c_name">
 </td> </tr>
<tr> <td>  <b>Category </b> </td> <td> <input type="text" value="" name="b_category">
 </td> </tr>

 <tr> <td>  <b>Enter Keyword 1 </b> </td> <td> <input type="text" value="" name="k1">
 </td> </tr>
<tr> <td>  <b>Enter Keyword 2 </b> </td> <td> <input type="text" value="" name="k2">
 </td> </tr>

<tr> <td>  <b>Company Address </b> </td> <td>
<TextArea name = "adress" rows = 5 cols = 20> </TextArea> </td> </tr>
<tr><td><b>Contact No.</b></td>
<td> <input type = "text" value = "" name = "c_no"> </td>

<tr> <td>  <b>UserName </b> </td> <td> <input type="text" value="" name="uname">
 </td> </tr>
<tr> <td> <b> Password</b> </td> <td> <input type = "password" value = "" name = "password"> </td>
 </tr>
<tr> <td>  <b>Confirm password </b> </td> <td> <input type="password" value="" name="cpass">
 </td> </tr>
<tr> <td>

<input type = "Submit" name="submit" value="submit" onclick="return validateForm()"> </td> <td>

<input type = "reset" > </td> </tr>
</table>
</Center>
</form>
</body>
</html>
