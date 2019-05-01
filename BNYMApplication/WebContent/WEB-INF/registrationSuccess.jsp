<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Registration Success</title>
			<link href="https://fonts.googleapis.com/css?family=Mandali" rel="stylesheet"> 
		
		<style>
			body {
			text-align: center;
			font-family: 'Mandali', sans-serif;
			background: #a0beef;
			color: #416591;
			}
			input {
			padding: 5px 25px;
			background: dodgerblue;
			font-size: 1.5rem;
			}
		</style>
		
	</head>
	
	<body>
		<h1>Welcome!</h1>
		<h2>Your credentials have been accepted.</h2>
		
		<form action="/BNYMApplication/apply" method="POST"
				id="form_container">
			<input type="submit" value="Apply">
		</form>
	</body>
</html>