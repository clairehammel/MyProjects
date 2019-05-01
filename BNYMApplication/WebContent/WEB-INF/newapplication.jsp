<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Admission Form</title>
		
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" 	href="./styles/main.css">
		
		<link href="https://fonts.googleapis.com/css?family=Mandali" rel="stylesheet"> 
		
		<style>
		.errormsg{
		font-size: .8rem;
		color: red;
		}
		</style>
		
	</head>

<body>
	<section>

	<h1>Welcome to BNY!</h1>
	<p>Please provide the following information to complete your
		application.</p>

	<!-- to use taglib with prefix -->
	<form:form action="/BNYMApplication/saveApplication" method="POST" modelAttribute="applicant">
		<table>
		<tr>
			<td class="left"><label>ID:</label></td>
			<td class="right"><form:input type="number" path="id" placeholder="Enter your ID" />
			</td>
			
		</tr>
		<tr>
			<td class="left"><label>Name:</label></td>
			<td class="right"><form:input type="text" path="sName" placeholder="Enter your Name" />
			<form:errors path="sName" cssClass="errormsg"/></td>
			
		</tr>
		
		<tr>
			<td><label>Course Name:</label></td>
			<td><form:input type="text" path="sCourse"  placeholder="Enter your Course Name" />
			<form:errors path="sCourse" cssClass="errormsg"/></td>
		</tr>

		<tr>
			<td><label>Phone:</label></td>
			<td><form:input type="text" path="sMobile"  placeholder="Enter your phone: 111-111-1111" />
			<form:errors path="sMobile" cssClass="errormsg"/>
			</td>
		</tr>

		<tr>
			<td><label>DOB</label></td>
			<td><form:input type="date" path="sDOB" placeholder="Enter Date of Birth" />
			<form:errors path="sDOB" cssClass="errormsg"/>
			</td>
		</tr>
		
		<tr>
			<td><label>Skills</label></td>
			<td><select name="sSkills" multiple>
				<option value="HTML">HTML</option>
				<option value="CSS">CSS</option>
				<option value="Java">Java</option>
			</select></td>
		</tr>
		
		<tr>
			<td><label>Address:</label></td>
			<td></td>
		</tr>
	</table>
	<table>
		  <tr>
		    <td><form:input type="text" path="sAddress.street"  placeholder="Enter your Street Name" /><br>
			<form:errors path="sAddress.street" cssClass="errormsg"/>
			</td>
		    <td><form:input type="text" path="sAddress.city"  placeholder="Enter your City" />
		    <form:errors path="sAddress.city" cssClass="errormsg"/>
		    </td>
		   </tr>
		   <tr>
		    <td><form:input type="text" path="sAddress.state"  placeholder="Enter your State" />
		    <form:errors path="sAddress.state" cssClass="errormsg"/>
		    </td>
		    <td><form:input type="text" path="sAddress.zip"  placeholder="Enter your Zipcode"/>
		    <form:errors path="sAddress.zip" cssClass="errormsg"/>
		    </td>
		  </tr>
		  
		</table>
		 <input id="btn" type="submit"  value="Apply"/>
	</form:form>
	</section>

</body>
</html>