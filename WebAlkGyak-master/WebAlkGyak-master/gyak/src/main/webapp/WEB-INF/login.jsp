<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W+C//DTD HTM 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset-UTF8">
		<title>login</title>
	</head>
	<body>
	<form action = "login" method = "post">
		User Id: <input type= "text" name = "ID"/>
		<input type = "submit" value = "find"/>
	</form>
		user details: 
		<table>
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>e-mail</th>
		</tr>
		<c:forEach item = "${user}" var="user">
		<tr>
			<td>${user.userId}</td>
			<td>${user.firstName}</td>
			<td>${user.lastName}</td>
			<td>${user.email}</td>
		</tr>
		</c:forEach>
		</table>
	</body>
</html>