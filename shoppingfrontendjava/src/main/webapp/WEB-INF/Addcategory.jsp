<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>OnlineShopping </title>
</head>
<body>
<h2><a href="categorysuccess" style="text-decoration: none;color:black;">Welcome OnlineShopping</a></h2>
<h5>Add category page ADMIN</h5>

<form action="categorysuccess" method="post">
<table>
<tr>  <td>Category Name:  </td><td><input type="text" name="categoryName" ></td></tr>
<tr>  <td>Category Id:  </td><td><input type="text" name="categoryId" ></td></tr>
</table>
<input type="submit" value="Add category" >
</form><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
Admin page: <a href="admin">click here</a><br><a href="index">Index</a>
</body>
</html>