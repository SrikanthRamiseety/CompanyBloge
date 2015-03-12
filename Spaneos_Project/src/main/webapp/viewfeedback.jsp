 
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View Bikes</title>
 <link rel="stylesheet"
	href="../css/bootstrap.min.css">
	<link rel="stylesheet"
	href="../css/bootstrap.css">

<script
	src="../js/bootstrap.min.js"></script>
	<script type="text/javascript"src="../js/jquery.1.9.1.js"></script>
 
<style type="text/css">
.bike {
	border-left-style: solid;
	border-left-width: thin;
	border-bottom-style: solid;
	border-bottom-width: 3px;
	border-bottom-color: silver;
	border-right-style: solid;
	border-right-width: 3px;
	border-right-color: silver;
	border-top-style: solid;
	border-top-width: thin;
	margin-top: 2px;
	width: 500px;
	margin-left: 150px;
	border-style: outset;
	background-color:blue;
	color: white;
}

#pagination {
	margin-left: 280px;
	margin-top: 40px;
	
}

.page {
	text-decoration: underline;
	color: #337AB7;
	background-color: transparent;
	box-sizing: border-box;
	font-family: "Open Sans",sans-serif;
	font-size: 14px;
	line-height: 1.42857;
}

.image {
	float: left;
	width: 20%;
}

.data {
	float: right;
	width: 70%;
}
</style>
</head>
<body>

	<br>
	<br>
	<div class="container pull-center" id="bikes">
		<c:forEach items="${flist }" var="i">
			<div id="${i.getName() }" class="bike">
				<fieldset>

					<div class="image">
						<img alt="loading..." src="images/${ i.getName() }.jpg"
							height="100px" width="100px">
					</div>
					<div class="data">
						<c:out value="${i.getName() }"></c:out>
						<br> 
						<c:out value="${i.getEmail() }"></c:out>
						<br>
						<c:out value="${i.getMessage() }"></c:out>
						 <br>
						 <c:out value="${i.getWorkfor() }"></c:out>
					</div>

				</fieldset>
			</div>
			<%-- <c:out value="${bike.getBikeId() }"></c:out> --%>


		</c:forEach>
	</div>
	 

</body>
</html>