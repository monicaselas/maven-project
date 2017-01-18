
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
          
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Category </title>
</head><body>
<h2><a href="index" style="text-decoration: none;color:black;">Welcome OnlineShopping</a></h2>
<h5>Add category page ADMIN</h5>


<c:url var="action" value="/category" ></c:url>
<form:form action="${action}" method="post" commandName="categoryModel">
<table>
<tr>  <td>Category Id:  </td><td><form:input type="text" name="categoryId"  placeholder="Enter categoryId here" path="categoryId"/></td></tr>
<tr>  <td>Category Name:  </td><td><form:input type="text" name="categoryName" placeholder="Enter categoryname here" path="categoryName"/></td></tr>
</table>
<input type="submit" value="Add category" >
</form:form>

<br><br><br>
<h5>Delete category </h5>
<c:url var="action" value="/category"></c:url>
<form:form action="${action}" method="post" commandName="categoryModel">
<table>
<tr>  <td>Category Id:  </td><td><form:input type="text" name="categoryId"  placeholder="Enter categoryId here" path="categoryId"/></td></tr>
<tr>  <td>Category Name:  </td><td><form:input type="text" name="categoryName" placeholder="Enter categoryname here" path="categoryName"/></td></tr>
</table>
<input type="submit" value="delete category" ><br><br><br>
</form:form>
<br><br><br>

<h5>Edit category </h5>
<c:url var="action" value="/category"></c:url>
<form:form action="${action}" method="post" commandName="categoryModel">
<table>
<tr>  <td>Category Id:  </td><td><form:input type="text" name="categoryId"  placeholder="Enter categoryId here" path="categoryId"/></td></tr>
<tr>  <td>Category Name:  </td><td><form:input type="text" name="categoryName" placeholder="Enter categoryname here" path="categoryName"/></td></tr>
</table>
<input type="submit" value="Edit this category" >
</form:form>
<br><br><br>

<strong>Category List</strong>
<c:if test="${not empty list}">

    
   
	<table style="border: 1px solid black;">	<tr style="border: 1px solid black;"><th>Category Id</th><th>CategoryName</th></tr>
			<c:forEach var="listValue" items="${list}">
			<tr style="border: 1px solid black;">	<td>${listValue.categoryId}</td><td>${listValue.categoryName}</td></tr>
			</c:forEach>
	</table>

	</c:if>


<br><br><br><br><br><br><br><br><br><br><br><br><br><br>
Admin page: <a href="admin">click here</a><br><a href="index">Index</a>
</body>
</html>

