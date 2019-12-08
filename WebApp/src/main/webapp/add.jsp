<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hozzaadas</title>
	<style>
		table {
  			font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
		    text-align: center;
		    width: 40%;
		    margin-left: auto;
		    margin-right: auto;
		    border-spacing: 10px;
		    border: 1px solid white;
		}

	</style>
	
	<script>
		function added() {
  		alert("Sikeresen hozzaadva!");
	}
	</script>
</head>
<body>

		

	<h1 align="center">Uj udito hozzdadasa</h1>
	<form action="addItem">
	<table>
            <tr>
                <td><h3>Name</h3><p><input type="text" name="name" required id="name"/></p></td>
                <td><h3>Count</h3><p><input type="text" required name="count" id="count"/></p></td>
            </tr>
            <tr>
                <td colspan="2">
                    <p><input type="submit" value="Hozzaadas" onclick="added()"><p>
                </td>
            </tr>
	</table>
	</form>
	
	<p><form action="back">
  		<input type="submit" value="Vissza">
	</form></p>



</body>
</html>