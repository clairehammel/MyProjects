<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Create New User</title>
		<link rel="stylesheet" href="./styles/login.css">
		<link href="https://fonts.googleapis.com/css?family=Mandali" rel="stylesheet">	
	
	</head>
	
	<body>
	
		<header>
		
		</header>
		
	<!-- outer green box -->
		<main id="main_container">
			<div id="grey_container">
				<div id="icon">
				<img src="http://pixsector.com/cache/94bed8d5/av3cbfdc7ee86dab9a41d.png"/>
					</div>
				<h1>Create New User</h1>
			<!-- icon box -->


				<form id="form_container" action="/BNYMApplication/validatenew" method="POST">	
			
				
					<input class="inputtext" type="text" name="email" placeholder="Email" required/><br>
					<input class="inputtext" type="password" name="password" placeholder="Password" required/><br>
					<input class="inputtext" type="password" name="confPassword" placeholder="Confirm Password" required/><br>
					
					<input class="inputtext" id="submit_button" type="submit" name="buttonsubmit" value="Submit"/><br>
					
				</form>
				<br>
			<p>${msg}</p>
			</div>
		</main>
	
	</body>
</html>		