<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="../css/bootstrap.min.css" rel="stylesheet">
<title>Irp-information</title>
<style type="text/css">
#table{
background-color: blue;
color: white;
}
#table1{
background-color:navy;
color: white;
}
h1{
color: maroon;
}
</style>
</head>
<body>
<div class="container">
<div class="row">
<div class="col-md-2">
</div>
<div class="col-md-7">
		<table class="table table-condensed">
			<caption><center><h1>Irp-Information</h1></center></caption>
			<thead>
				<tr  >
					<th id="table">IrpBatch</th>
					<th id="table">Status</th>
					<th id="table">Remarks</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${lObjects}" var="IrpInformation">
					<tr >

						<td id="table1"><c:out value="${IrpInformation.getIrpBatch()}"></c:out>&nbsp;</td>
						<td id="table1"><c:out value="${IrpInformation.getStatus()}"></c:out>&nbsp;</td>
						<td id="table1"><c:out value="${IrpInformation.getRemarks()}"></c:out>&nbsp;</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
		</div>
		</div>
</body>
</html>