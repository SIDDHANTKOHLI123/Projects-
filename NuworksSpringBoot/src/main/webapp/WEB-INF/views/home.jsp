<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
<style>
body {font-family: Arial, Helvetica, sans-serif;
background-color:#d7dcd5;}

a {
    background-color: #D41B2C;
  color: white;
  padding: 12px 20px;
  text-decoration: none;
font-size: 14px;
margin:70px;
border-radius: 12px;
width:300px;
height:40px;
}
input[type=submit] {
    background-color: #D41B2C;
    color: white;
    padding: 12px 20px;
    border: none;
    cursor: pointer;
    border-radius: 12px;
    width:300px;
    margin-left:200px;
    height:40px;
}

img{
width:15%;
height:15%;
padding-left:40%
}



.sign-in-container {
	 position: absolute;
    top: 50%;
    left: 30%;
    margin-top: -50px;
    margin-left: -50px;

}
input {
	background-color: #eee;
	border: none;
	padding: 12px 15px;
	margin: 8px 0;
	width: 100%;
}

</style>
	<title>Home</title>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<form action="${contextPath}/user/login.htm" method="POST">
 <fieldset>
 
 <div class="image"><img src="https://upload.wikimedia.org/wikipedia/en/thumb/b/bd/Northeastern_University_seal.svg/1200px-Northeastern_University_seal.svg.png"></div>
<div class="form-container sign-in-container">
<h3>User Name <input type="text" placeholder="User Name" name="userName"/>
<h3>Password <input type="password" placeholder="Password" name="password"/>
<br/>
<br/>
<input  type="submit" name="Submit" value="Submit"/>
<br/>
 </h3>
 
 <h8><a href="${contextPath}/user/createStudent.htm">Register here (Student)</a> </h8>
 <h8><a href="${contextPath}/user/createCoop.htm">Register here (Coop Faculty)</a> </h8>
 <br><br>
 </h3>
 </div>
 </fieldset>
  </form>

</body>
</html>
