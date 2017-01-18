<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Supplier</title>
</head>
<body>
<h5>Add supplier page ADMIN</h5>

<c:url var="action" value="/supplier" ></c:url>
<form:form action="${action}" method="post" commandName="supplierModel">
<table>
<tr>  <td>supplier Id:  </td><td><form:input type="text" name="supplierId"  placeholder="Enter supplierId here" path="supplierId"/></td></tr>
<tr>  <td>supplier Name:  </td><td><form:input type="text" name="supplierName" placeholder="Enter suppliername here" path="supplierName"/></td></tr>
<tr>  <td>supplier Details:  </td><td><form:input type="text" name="supplierDetails" placeholder="Enter supplierDetails here" path="supplierDetails"/></td></tr>
</table>
<input type="submit" value="Add supplier" >
</form:form>

<br><br><br>
<br>
<h5>Delete supplier </h5>
<c:url var="action" value="/deletesupplier" ></c:url>
<form:form action="${action}" method="post" commandName="supplierModel">
<table>
<tr>  <td>supplier Id:  </td><td><form:input type="text" name="supplierId"  placeholder="Enter supplierId here" path="supplierId"/></td></tr>
<tr>  <td>supplier Name:  </td><td><form:input type="text" name="supplierName" placeholder="Enter suppliername here" path="supplierName"/></td></tr>
</table>
<input type="submit" value="delete supplier" >
</form:form>


<br><br><br>
<h5>Edit supplier page ADMIN</h5>

<c:url var="action" value="/editsupplier" ></c:url>
<form:form action="${action}" method="post" commandName="supplierModel">
<table>
<tr>  <td>supplier Id:  </td><td><form:input type="text" name="supplierId"  placeholder="Enter supplierId here" path="supplierId"/></td></tr>
<tr>  <td>supplier Name:  </td><td><form:input type="text" name="supplierName" placeholder="Enter suppliername here" path="supplierName"/></td></tr>
<tr>  <td>supplier Details:  </td><td><form:input type="text" name="supplierDetails" placeholder="Enter supplierDetails here" path="supplierDetails"/></td></tr>
</table>
<input type="submit" value="Edit this supplier" >
</form:form>

<br><br
<strong>Supplier List</strong>
<c:if test="${not empty list}">
   
	<table style="border: 1px solid black;">	<tr style="border: 1px solid black;"><th>Supplier Id</th><th>Supplier Name</th><th>Supplier Name</th>Supplier Details</tr>
			<c:forEach var="listValue" items="${list}">
			<tr style="border: 1px solid black;">	<td>${listValue.SupplierId}</td><td>${listValue.supplierName}</td><td>${listValue.SupplierDetails}</td></tr>
			</c:forEach>
	</table>

	</c:if>

><br><br><br>
Admin page: <a href="admin">click here</a><br><a href="index">Index</a>
</body>
</html>
