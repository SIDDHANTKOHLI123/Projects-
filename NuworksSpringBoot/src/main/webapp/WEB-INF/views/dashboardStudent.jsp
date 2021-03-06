<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dashboard Student</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

</head>
<style>
body {font-family: Arial, Helvetica, sans-serif;
background-color:#d7dcd5;}
img{
width:15%;
height:15%;

}

</style>
<body>
 <c:set var="contextPath" value="${pageContext.request.contextPath}" />
<fieldset>
<legend><img src="https://upload.wikimedia.org/wikipedia/en/thumb/b/bd/Northeastern_University_seal.svg/1200px-Northeastern_University_seal.svg.png"></legend>
<a href="${contextPath}/user/student/profile.htm" class="w3-button w3-black">Profile</a>
<a href="${contextPath}/user/student/resumeupload.htm" class="w3-button w3-black">Upload Resume</a>
<a href="${contextPath}/user/student/jobs.htm"" class="w3-button w3-black">View Jobs</a>
<a href="${contextPath}/user/student/applications.htm"" class="w3-button w3-black">Applications</a>
<a href="${contextPath}/user/student/logout.htm"" class="w3-button w3-black">Logout</a>

</fieldset>
</body>
</html>