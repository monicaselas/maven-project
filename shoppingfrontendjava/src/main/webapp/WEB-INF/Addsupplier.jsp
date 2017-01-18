Skip to content
This repository
Search
Pull requests
Issues
Gist
 @Soundariya0104
 Watch 1
  Star 0
  Fork 0 srimuthurajesh/Spring-Shopping-FrontBack
 Code  Issues 0  Pull requests 0  Projects 0  Wiki  Pulse  Graphs
Branch: master Find file Copy pathSpring-Shopping-FrontBack/ShoppingFrontEnd/src/main/webapp/WEB-INF/addsupplier.jsp
6d5ad84  5 days ago
@srimuthurajesh srimuthurajesh categories added
1 contributor
RawBlameHistory     
23 lines (21 sloc)  892 Bytes
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OnlineShopping</title>
</head>
<body>
<h5>Add supplier page ADMIN</h5>

<form action="suppliersuccess" method="post">
<table>
<tr>  <td>Supplier Name:  </td><td><input type="text" name="supplierName" ></td></tr>
<tr>  <td>Supplier Id:  </td><td><input type="text" name="supplierId" ></td></tr>

<tr>  <td>Supplier Details:  </td><td><input type="text" name="supplierDetails" ></td></tr>
</table>
<input type="submit" value="Add Supplier" >
</form><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
Admin page: <a href="admin">click here</a><br><a href="index">Index</a>
</body>
</html>
