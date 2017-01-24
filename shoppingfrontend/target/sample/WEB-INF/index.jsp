<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>RajeshShopping </title>
</head>
<body>
<h2>Welcome RajeshShopping</h2>
<h5>Register yourself and join with us</h5>

<form:errors path="obj.*"/>
<form action="RegistrationForm" method="post">
<table>
<tr>  <td>Your sweet name: </td><td><input type="text" name="username" ></td></tr>

<tr> <td>Email-id: </td><td><input type="text" name="id" ></td></tr>

<tr> <td>Password: </td><td><input type="password" name="password" ></td></tr>

<tr> <td>Confirm Password:</td><td><input type="password" ></td></tr>

<tr> <td>Mobile-No: </td><td><input type="text" name="mobile" ></td></tr>
<tr> <td>Address: </td></tr>
<tr> <td>Street name: </td><td><input type="text" name="addressobj.streetName" ></td>
 <td>City: </td><td><input type="text" name="addressobj.cityName" ></td>
 <td>pin-code: </td><td><input type="text" name="addressobj.pinCode" ></td></tr>
</table>
<input type="submit" value="fun begins here" >
</form>
</body>
</html>
