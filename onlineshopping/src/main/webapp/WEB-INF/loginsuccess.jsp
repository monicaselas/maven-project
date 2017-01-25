<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome onlineShopping</title>
</head>
<body>
<h2>Welcome Shoppingcart</h2>

<h4> Hello ${userModel.username} You have been Successfully Logged in</h4>
<ul>
			<li>Your email: ${userModel.emailid}</li>
			<li>Your mobile: ${userModel.mobile}</li>
		    <li>Your address: ${userModel.address}</li>
			
			
			</ul>

<a href="login">logout</a>
</body>
</html>