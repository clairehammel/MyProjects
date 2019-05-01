<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Application Success</title>

	  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <link href="https://fonts.googleapis.com/css?family=EB+Garamond" rel="stylesheet">
   
<style>
	body {
	width: 80%;
	margin: auto;
	color: #37383a;
	}
	h1{
	font-size: 2em;
	}
	
</style>
</head>
<body>
<div class="row">
<div class="col-md-6 offset-3">
	<h3>Congratulations! Your application has been processed!</h3>
	<h4>Application Information:</h4>
	<table class="table table-sm">
	  <tr>
	    <td>Name:</td>
	    <td>${applicant.sName}</td>
	  </tr>

	  <tr>
	    <td>Course:</td>
	    <td>${applicant.sCourse}</td>
	  </tr>

	  <tr>
	    <td>Phone:</td>
	    <td>${applicant.sMobile}</td>
	  </tr>
	  
	   <tr>
	    <td>Date of Birth:</td>
	    <td>${applicant.sDOB }</td>
	    <!-- td><fmt:formatDate value="${applicant.sDOB}" pattern="MM/dd/yyyy"/></td> -->
	  </tr>
	  
	  <tr>
	    <td>Skills:</td>
	    <td>${applicant.sSkills}</td>
	  </tr>
	  
</table >
<h4>Address:</h4>
<table class="table table-sm">
  <tr>
    <td>Street:</td>
    <td>${applicant.sAddress.street }</td>
  </tr>
  
  <tr>
    <td>City:</td>
    <td>${applicant.sAddress.city}</td>
  </tr>
  
   <tr>
    <td>State:</td>
    <td>${applicant.sAddress.state}</td>
  </tr>
  
   <tr>
    <td>Zipcode:</td>
    <td>${applicant.sAddress.zip}</td>
  </tr>
</table>

</div>
</div>
</body>
</html>