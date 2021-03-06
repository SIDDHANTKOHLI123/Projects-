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
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
    background-color: #D41B2C;
    color: white;
}
img{
width:15%;
height:15%;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Profile Student</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

</head>
<body>
 <c:set var="contextPath" value="${pageContext.request.contextPath}" />
<fieldset>
<legend><img src="https://upload.wikimedia.org/wikipedia/en/thumb/b/bd/Northeastern_University_seal.svg/1200px-Northeastern_University_seal.svg.png"></legend>
<a href="${contextPath}/user/student/profile.htm" class="w3-button w3-black">Profile</a>
<a href="${contextPath}/user/student/resumeupload.htm" class="w3-button w3-black">Upload Resume</a>
<a href="${contextPath}/user/student/jobs.htm"" class="w3-button w3-black">View Jobs</a>
<a href="${contextPath}/user/student/applications.htm"" class="w3-button w3-black">Applications</a>
<a href="${contextPath}/user/student/logout.htm" class="w3-button w3-black">Logout</a>

<br/><br/>
<table >
<tr>
<th>UserId</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Course Name</th>
<th>Graduated</th>
<th>LinkedinUrl</th>
<th>College ID</th>
</tr>

<tr>
<c:set var="st" value="${requestScope.student}"/>
<td>${st.id}</td>
<td>${st.fName}</td>
<td>${st.lName}</td>
<td>${st.email}</td>
<td>${st.mobile}</td>
<td>${st.courseName}</td>
<td>${st.carAvail}</td>
<td>${st.linkedinUrl}</td>
<td>${st.skypeID}</td>
</tr>

</table>
</fieldset>
</br>
</br>
<a href="${contextPath}/user/student/update.htm" class="w3-button w3-black">Update Profile</a>
</body>
</html>