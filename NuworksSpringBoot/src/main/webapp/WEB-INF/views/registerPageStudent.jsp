<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {font-family: Arial, Helvetica, sans-serif;
background-color:#d7dcd5;}
h2{
color: #D41B2C;
}

input, select, textarea{
    line-height: 10px;
    width: 100%;
    padding: 3px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    margin-top: 3px;
    margin-bottom: 3px;
    resize: vertical;
}

input[type="radio"]{
width:10%}

input[type=submit] {
    background-color: #D41B2C;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}
a {
border-radius: 4px;
    background-color: #D41B2C;
  color: white;
  padding: 2px;
  text-decoration: none;
font-size: 14px;
} 


input[type=submit]:hover {
    background-color: #45a049;
}

.container {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}
img{
width:10%;
height:10%;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Student</title>
</head>
<body>
  <c:set var="contextPath" value="${pageContext.request.contextPath}" />
<legend><img src="https://upload.wikimedia.org/wikipedia/en/thumb/b/bd/Northeastern_University_seal.svg/1200px-Northeastern_University_seal.svg.png"></legend>	
	<div class="container">
	<form:form action="${contextPath}/user/register1" modelAttribute="user"
		method="post">
<fieldset>
<legend><h2>Registration Student</h2></legend>
<!-- Select Role
 <select name="role1" id="role1" >
  <option value="student">Student</option>
  <option value="coopFaculty">Coop Faculty</option>
</select>  -->
	
		<table>
			<tr>
				<td>First Name:</td>
				<td><form:input path="fName"  name = "fName" required="required" type="text" />
					<font color="red"><form:errors path="fName" /></font></td>
			</tr>

			<tr>
				<td>Last Name:</td>
				<td><form:input path="lName" name = "lsName" required="required" type="text" />
					<font color="red"><form:errors path="lName" /></font></td>
			</tr>


			<tr>
				<td>User Name:</td>
				<td><form:input path="userName" name = "uName" required="required" />
					<font color="red"><form:errors path="userName" /></font></td>
			</tr>

			<tr>
				<td>Password:</td>
				<td><form:password path="password" 
						name ="password" required="required" /> <font color="red"><form:errors
							path="password" /></font></td>
			</tr>
			
			<tr>
				<td>Email:</td>
				<td><form:input name = "email" path="email"  type="email"
						required="required" /> <font color="red"><form:errors
							path="email" /></font></td>
			</tr>
			
			<tr>
				<td>Mobile:</td>
				<td><form:input name = "mobile" path="mobile"  type="tel" placeholder=""
						required="required" /> <font color="red"><form:errors
							path="mobile" /></font></td>
			</tr>
			
		</table>	
<div id='student'>
		<table>
			<tr>
				<td>Course:</td>
				<td><form:select path="courseName">
            <form:option value="Engineering Management" label="Engineering Management" />
            <form:option value="Information Systems" label="Information Systems" />
            <font color="red"><form:errors path="courseName" /></font>
			</form:select>
			
			</td>
			</tr>
			
				<tr>
				<td>Graduated:</td>
				<td>
				<form:radiobutton path="carAvail" name="avail" value="Yes" label="Yes" />
            <form:radiobutton path="carAvail" name="avail" value="No" label="No" />
            
				<font color="red"><form:errors path="carAvail" /></font>
							</td>
			</tr>

			
						<tr>
				<td>Linkedin URL:</td>
				<td><form:input name = "linkedinUrl" path="linkedinUrl" 
						required="required" /> <font color="red"><form:errors
							path="linkedinUrl" /></font></td>
			</tr>
			
									<tr>
				<td>College ID:</td>
				<td><form:input name = "skypeID" path="skypeID" 
						required="required" /> <font color="red"><form:errors
							path="skypeID" /></font></td>
			</tr>
</table>
			</div>
<table>
		<%-- 	<tr>
				<td>Email Id:</td>
				<td><form:input path="email.emailAddress" size="30"
						type="email" required="required" /> <font color="red"><form:errors
							path="email.emailAddress" /></font></td>
			</tr> --%>
	<tr>
				<td colspan="2"><input type="submit" value="Register Student" /> <a href="/" >Go Back</a><br/></td>
				
			</tr>
			
		</table>
		</fieldset>
	</form:form>
	</div>





</body>
</html>