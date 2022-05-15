<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
     "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {font-family: Arial, Helvetica, sans-serif;
background-color:#d7dcd5;}
img{
width:15%;
height:15%;
}
input{
background-color:#D41B2C
color:white;}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring Boot Hibernate File Upload to Database Demo</title>
</head>
<body>
 <c:set var="contextPath" value="${pageContext.request.contextPath}" />
<legend><img src="https://upload.wikimedia.org/wikipedia/en/thumb/b/bd/Northeastern_University_seal.svg/1200px-Northeastern_University_seal.svg.png"></legend>
    <div align="center">
        <h1>Upload Your Resume </h1>
        <a href="${contextPath}/uploadedpdfs/${sessionScope.student.getResumeFilePath()}" class="w3-button w3-black">Download Latest Resume</a>
        <form method="post" action="${contextPath}/user/student/doUpload.htm" enctype="multipart/form-data">
            <table border="0">
                <tr>
                    <td>Pick file #1:</td>
                    <td><input type="file" name="fileUpload" size="50" /></td>
                </tr>

                    <td colspan="2" align="center"><input type="submit" value="Upload" /></td>
                </tr>
            </table>
        </form>
        <a href="${contextPath}/user/student/profile.htm" class="w3-button w3-black">Go Back</a>
        
    </div>
</body>
</html>