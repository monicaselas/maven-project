<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Shoppingcart</title>
</head>
<body>
<h2><a href="index" style="text-decoration: none;color:black;">Welcome RajeshShopping Login</a></h2>


<c:url var="action" value="/loginresult" ></c:url>
<form:form action="${action}" method="post" commandName="userModel">
<table>
<tr>
<td>Username:</td> <td><form:input type="text" path="username" placeholder="Enter username"/></td></tr>
<tr><td>Password:</td> <td><form:input type="password" path="password" placeholder="Enter password"/></td></tr>
<tr><td><input type="submit" value="Sign in ">
</td></tr></table>
</form:form><br>
 <a href="register" style="text-decoration: none; color:black;">NewUser? signup</a>
<br><br>
${msg}

</body>
</html>