<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>placement</title>
<link rel="stylesheet"
	href="../css/bootstrap.min.css">
	<link rel="stylesheet"
	href="../css/bootstrap.css">

<script
	src="../js/bootstrap.min.js"></script>
	<script type="text/javascript"src="../js/jquery.1.9.1.js"></script>
</head>
<body>
<br>
<div class="container">
 <div class="row">
 
 
  	
<c:forEach items="${placementlist }" var="placement">

 <div class="col-md-3">
<img alt="" src="../images/${placement.getCompanyName()}.jpg" height="100px" width="200px"><br>
 CompanyName: <c:out value="${placement.getCompanyName() }"></c:out><br>
 InterviewDate: <c:out value="${placement.getDate() }"></c:out><br>
 Time:<c:out value="${placement.getTime() }"></c:out><br>
 Vanue: <c:out value="${placement.getVenue() }"></c:out><br>
 Exp:<c:out value="${placement.getExp() }"></c:out><br>
 Queification: <c:out value="${placement.getReq() }"></c:out><br>
 Domain: <c:out value="${placement.getDomain() }"></c:out><br>
 Designation: <c:out value="${placement.getDesignation() }"></c:out><br>
 
 </div>
</c:forEach>
  
 
 
  
 <div class="col-md-3">
 </div>
 </div>
 </div>
</body>
</html>