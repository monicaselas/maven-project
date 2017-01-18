
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product</title>
</head>
<body>
<h5>Add product page ADMIN</h5>
<c:url var="action" value="/product" ></c:url>
<form:form action="${action}" method="post" commandName="productModel">
<table>
<tr>  <td>Product Id:  </td><td><form:input type="text"   placeholder="Enter ProductId here" path="productId"/></td></tr>
<tr>  <td>Product Name:  </td><td><form:input type="text"  placeholder="Enter Productname here" path="productName"/></td></tr>
<tr>  <td>Product Description:  </td><td><form:input type="text"  placeholder="Enter ProductDescription here" path="productDescription"/></td></tr>
</table>
<input type="submit" value="Add Product" >
</form:form>

<br><br><br>
<h5>Delete Product </h5>

<c:url var="action" value="/product" ></c:url>
<form:form action="${action}" method="post" commandName="productModel">
<table>
<tr>  <td>Product Id:  </td><td><form:input type="text"   placeholder="Enter ProductId here" path="productId"/></td></tr>
<tr>  <td>Product Name:  </td><td><form:input type="text"  placeholder="Enter Productname here" path="productName"/></td></tr>
</table>
<input type="submit" value="delete Product" >
</form:form>

<br><br><br>
<h5>Edit Product </h5>

<c:url var="action" value="/product" ></c:url>
<form:form action="${action}" method="post" commandName="productModel">
<table>
<tr>  <td>Product Id:  </td><td><form:input type="text"  placeholder="Enter ProductId here" path="productId"/></td></tr>
<tr>  <td>Product Name:  </td><td><form:input type="text"  placeholder="Enter Productname here" path="productName"/></td></tr>
<tr>  <td>Product Description:  </td><td><form:input type="text" placeholder="Enter ProductDescription here" path="productDescription"/></td></tr>

</table>
<input type="submit" value="Edit this Product" >
</form:form>

<br><br>
<strong>Product List</strong>
<c:if test="${not empty list}">

    
   
	<table style="border: 1px solid black;">	<tr style="border: 1px solid black;"><th>Category Id</th><th>CategoryName</th><th>ProductDescription</th></tr>
			<c:forEach var="listValue" items="${list}">
			<tr style="border: 1px solid black;">	<td>${listValue.productId}</td><td>${listValue.productName}</td><td>${listValue.productDescription}</td></tr>
			</c:forEach>
	</table>

	</c:if>

<br><br><br>
<br><br><br><br><br><br><br><br><br><br><br>Admin page: <a href="admin">click here</a><br><a href="index">Index</a>
</body>
</html>