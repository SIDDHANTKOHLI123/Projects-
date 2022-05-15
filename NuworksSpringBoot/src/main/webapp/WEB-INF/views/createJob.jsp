<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {font-family: Arial, Helvetica, sans-serif;
background-color:#d7dcd5;}

input, select, textarea {
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

input[type=submit] {
    background-color: #D41B2C;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}
a {
    background-color: #4CAF50;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
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
width:15%;
height:15%;

}
.w3-button w3-black{
background-color: #D41B2C;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jobs - Dasboard</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

</head>
<body>
 <c:set var="contextPath" value="${pageContext.request.contextPath}" />
<fieldset>
<legend><img src="https://upload.wikimedia.org/wikipedia/en/thumb/b/bd/Northeastern_University_seal.svg/1200px-Northeastern_University_seal.svg.png"></legend>
<a href="${contextPath}/user/coop/profile.htm"" class="w3-button w3-black">PROFILE</a>
<a href="${contextPath}/user/coop/jobs.htm"" class="w3-button w3-black">JOBS</a>
<a href="${contextPath}/user/coop/applications.htm"" class="w3-button w3-black">APPLICATIONS</a>
<a href="${contextPath}/user/coop/students.htm"" class="w3-button w3-black">STUDENTS</a>
<a href="${contextPath}/user/coop/stats.htm"" class="w3-button w3-black">STATISTICS</a>
<a href="${contextPath}/user/coop/logout.htm"" class="w3-button w3-black">Logout</a>


<br/> <br/> <br/>

<a href="${contextPath}/user/coop/jobs/create.htm"" class="w3-button w3-black">Create Job</a>
 	
        <form:form action="${contextPath}/user/coop/job/submit.htm" modelAttribute="job"
		method="post">
		
		<table>
		<tr>
				<td>Company Name:</td>
				<td><form:input path="companyName"  required="required" />
					<font color="red"><form:errors path="companyName" /></font></td>
		</tr>
		
		<tr>
				<td>Title:</td>
				<td><form:input path="title"  required="required" />
					<font color="red"><form:errors path="title" /></font></td>
		</tr>

		<tr>
				<td>Openings:</td>
				<td><form:input path="openings" size="30" required="required" />
					<font color="red"><form:errors path="openings" /></font></td>
		</tr>
		
		<tr>
				<td>Length:</td>
				<td><form:input path="length" size="30" required="required" />
					<font color="red"><form:errors path="length" /></font></td>
		</tr>

		<tr>
				<td>City:</td>
				<td><form:input path="city" required="required" />
					<font color="red"><form:errors path="city" /></font></td>
		</tr>
		
		<tr>
				<td>Country:</td>
				<td><form:input path="country" required="required" />
					<font color="red"><form:errors path="country" /></font></td>
		</tr>
		
		<tr>
				<td>Description:</td>
				<td><form:input path="description"  required="required" />
					<font color="red"><form:errors path="description" /></font></td>
		</tr>
		
		<tr>
				<td>Wage Type:</td>
				<td><form:input path="wageType"  required="required" />
					<font color="red"><form:errors path="wageType" /></font></td>
		</tr>
		
		<tr>
				<td>Minimum Wage:</td>
				<td><form:input path="minWage" required="required" />
					<font color="red"><form:errors path="minWage" /></font></td>
		</tr>
		
		<tr>
				<td>Maximum Wage:</td>
				<td><form:input path="maxWage"  required="required" />
					<font color="red"><form:errors path="maxWage" /></font></td>
		</tr>
	
			
		<tr>
				<td colspan="2"><input type="submit" value="Create Job" /></td>
		</tr>
			
		</table>	
			
		
		</form:form>

</fieldset>
</body>
</html>