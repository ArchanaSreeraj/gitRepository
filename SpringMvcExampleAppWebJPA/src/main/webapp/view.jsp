<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${not empty studentList}">
		<table>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Address</th>
				<th colspan="2">Actions</th>
			</tr>
			<c:forEach items="${studentList}" var="student">
				<tr>
					<td>${student.sId}</td>
					<td>${student.name}</td>
					<td>${student.address}</td>
					<td><a href="/Student/Update/${student.sId}">Update</a></td>
					<td><a href="">Delete</a></td>
				</tr>
			</c:forEach>
		</table>

	</c:if>
</body>
</html>