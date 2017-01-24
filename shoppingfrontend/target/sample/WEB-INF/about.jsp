<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RajeshShopping</title>
</head>
<body>
<h2>${msg} </h2>
<br>

<table style="width:35%; ">

<tr> 
<td>  Your name is  </td>    <td>: ${obj.username}</td> 
</tr>

<tr>
<td>Your Email-id is </td> <td>: ${obj.id}</td>
</tr>

<tr>
<td>Your password is </td> <td>: ${obj.password}</td>
</tr>

<tr>
<td>Your Mobile number is </td> <td>: ${obj.mobile}</td>
</tr>
<tr>
<td>Your Address is </td> <td><br><br>${obj.addressobj.streetName}<br> ${obj.addressobj.cityName}<br> ${obj.addressobj.pinCode}</td>
</tr>

</table>
</body>
</html>