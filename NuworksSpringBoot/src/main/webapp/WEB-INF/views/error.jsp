<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style >
body {font-family: Arial, Helvetica, sans-serif;
background-color:#d7dcd5;}
input[type=submit]  {
    background-color: #D41B2C;
  color: white;
  padding: 1em 1.5em;
  text-decoration: none;
font-size: 14px;
}</style>
<title>Error Page</title>
</head>
<style>
img{
width:80%;
height:50%;
}
</style>
<body>

<h1>Error Page</h1>
<p>${errorMessage}</p>
<form action="/" method="post">
<input type='submit' value="Go Back">
</form>
<img alt="" src="https://png.pngitem.com/pimgs/s/254-2549750_index-of-assets-minimal-404-error-logo-svg.png"/s>

</body>
</html>