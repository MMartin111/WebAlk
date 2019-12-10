<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W+C//DTD HTM 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset-UTF8">
		<title>Register user</title>
	</head>
	<body>
		<h2>User Register</h2>
		
		<form action="registerUser" method="post">
			<pre>
				ID: <input type="text" name="ID"/>
				First Name: <input type="text" name="firstName"/>
				Last Name: <input type="text" name="lastName"/>
				Email Name: <input type="text" name="email"/>
				<input type="submit" value="register"/>
			</pre>
		</form> 
	</body>
</html>