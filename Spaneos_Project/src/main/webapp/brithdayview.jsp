<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Biethday</title>
<link rel="stylesheet"
	href="../css/bootstrap.min.css">
	<link rel="stylesheet"
	href="../css/bootstrap.css">

<script
	src="../js/bootstrap.min.js"></script>
	<script type="text/javascript"src="../js/jquery.1.9.1.js"></script>
	
	<style type="text/css">
	h1{
	color: #43A2CB;;
	
	}
	#div{
	background-color: rgb(0, 13, 113);
	color: white;
	
	}
	
	</style>
</head>
<body>
 <div class="container">
 <div class="row">
 <div class="col-md-2"></div>
 <div class="col-md-6">
 <h1>Today's BrithDay</h1>
 <c:forEach items="${birthday }" var="b">
 <div id="div">
 <center>
 <c:out  value="${b.getName() }"></c:out><br>
 <c:out value="${b.getWhat() }"></c:out><br>
 </center>
 </div>
 
 </c:forEach>
 <h1>Many Many Happy rutrun Of The Day </h1>
 <img alt="" src="../images/birthday.jpg">
 </div>
 
 
 </div>
 
 </div>
</body>
</html>