<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<title>Termékek</title>

	<style>
		table {
  			font-family: arial, sans-serif;
 			border-collapse: collapse;
  			width: 60%;
  			margin-left:auto; 
    		margin-right:auto;
		}

		td, th {
  			border: 1px solid #dddddd;
  			text-align: center;
 			padding: 8px;
		}

		tr:nth-child(even) {
  			background-color: #dddddd;
		}
	</style>

</head>
<body>

	<h2 align="center">A videókártyák listája</h2>

	<table>
		<c:forEach var="stock" items="${items}">
      
  		<tr>
    		<th>Azonosító</th>
    		<th>Típus</th>
  		</tr>
  		
  		<tr>
    		<td>${stock.id}</td>
    		<td>${stock.name}</td>
  		</tr>
		</c:forEach>
	</table>

    
    
    <p><form action = "selected">
		Raktárkészlet lekérdézése: <input type="text" name="id">
		<input type="submit" value="OK">
	</form></p>
	
	<p><form action="back">
  		<input type="submit" value="Vissza">
	</form></p>

</body>
</html>