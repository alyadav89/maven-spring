<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="spring-form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <style>
body {
    background-image: url("img/login-back.jpg");
}
.no-background {
    background-image: url("images/blank.jpg");
}
</style> -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
 <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

	<h2 class="no-background">This is Login page</h2>
	<form action="/submit" method="post">
	<div>
		<!-- <img alt="" src="img/login-back.jpg"> -->
		 <%-- <img src="${pageContext.request.contextPath}/login-back.jpg"> --%>
		 <table>
		 	<tr>
		 		<td>
		 			<span>User :</span>
		 		</td>
		 		<td>
		 			<input type="text" name="userId">
		 		</td>
		 	</tr>
		 	<tr>
		 		<th>&nbsp</th>
		 	</tr>
		 	<tr>
		 		<td>
		 			<span>Password :</span>
		 		</td>
		 		<td>
		 			<input type="password" name="password_">
		 		</td>
		 	</tr>
		 	<tr>
		 		<th>&nbsp</th>
		 	</tr>
		 </table>
		 
	</div>
	<dir style="">
		<button class="btn btn-lg btn-primary"  type="submit" >submit</button>
	</dir>
	</form>
</body>
</html>