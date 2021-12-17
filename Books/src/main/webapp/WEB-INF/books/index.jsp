<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<h1>All Books</h1>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Language</th>
				<th>Number of Pages</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var ="book" items="${books}">
				<tr>
					<th>${book.id}</th>
					<th>${book.title}</th>
					<th>${book.language}</th>
					<th>${book.numberOfPages}</th>
				</tr>
			
			</c:forEach>
		</tbody>
	</table>
</body>
</html>