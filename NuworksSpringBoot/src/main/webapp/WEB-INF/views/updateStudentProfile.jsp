<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student Profile</title>
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
    padding: 10px 1px;
    width:20%;
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
</head>

<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<legend><img src="https://upload.wikimedia.org/wikipedia/en/thumb/b/bd/Northeastern_University_seal.svg/1200px-Northeastern_University_seal.svg.png"></legend>	
		<c:set var="st" value="${requestScope.student}"/>
		
		<form:form action="${contextPath}/user/student/updateprofile.htm" method="post">
		<table>
			<tr>
				<td>First Name:</td>
				<td><input name="fName" value="${st.getfName()}" type="text"/>
					<font color="red"><form:errors path="fName" /></font></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input name="lName" value="${st.getlName()}" type="text"/>
					<font color="red"><form:errors path="lName" /></font></td>
			</tr>
			<tr>
				<td>Mobile Number:</td>
				<td><input name="mobile" value="${st.getMobile()}" type="tel"/>
					<font color="red"><form:errors path="mobile" /></font></td>
			</tr>
			
			<tr>
				<td>Email Id:</td>
				<td><input name="email" value="${st.getEmail()}" type="tel"/>
					<font color="red"><form:errors path="email" /></font></td>
			</tr>
			
	</table>
	<td colspan="2"><input type="submit" value="Update Profile" />

</form:form>
<br/>
<br/>
<a href="${contextPath}/user/student/profile.htm" class="w3-button w3-black">Back</a>

</body>
</html>