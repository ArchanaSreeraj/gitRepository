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
	Update
	<form method="post" action="/Student/UpdateData">
				<table>
					<tr>
						<td>Name</td>
						<td><input type="text" name="name" value="${student.name}"></td>
					</tr>
					<tr>
						<td>Address</td>
						<td><input type="text" name="address" value="${student.address}"></td>
					</tr>
					<tr>
						<td colspan="2">
						<input type="hidden" name="sId" value="${student.sId}">
						<input type="submit" name="submit" value="submit">
						</td>
					</tr>
				</table>
	</form>
</body>
</html>