<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login Form</title>
		<link rel="stylesheet" href="./styles/login.css">
		<link href="https://fonts.googleapis.com/css?family=Mandali" rel="stylesheet">	
	</head>

	<body>
	
		<header> </header>
	
		<!-- outer green box -->
		<main id="main_container">
		<div id="grey_container">
			<div id="icon">
				<img
					src="http://pixsector.com/cache/94bed8d5/av3cbfdc7ee86dab9a41d.png" />
			</div>
			<h1>User Login</h1>
			<!-- icon box -->
	
	
			<form action="/BNYMApplication/submitlogin" method="POST"
				id="form_container">

				<input class="inputtext" type="text" name="email" placeholder="Email"
					required /><br> 
				<input class="inputtext" type="password"
					name="password" placeholder="Password" required/><br> 
				<input
					class="inputtext" id="submit_button" type="submit"
					name="buttonsubmit" value="LOGIN" /><br> 
				<input
					class="inputtext" id="create_button" type="button" name="newuser"
					onclick="window.location.href='${pageContext.request.contextPath}/newUser';"
					value="CREATE NEW USER" />
	
			</form>
			<!--  a href="#">Create new user?</a>-->
			<h3>${msg}</h3>
		</div>
		</main>
	
	</body>
</html>