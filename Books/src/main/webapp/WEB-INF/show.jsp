<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show</title>
</head>
<body>
	<h1>${book.title}</h1>
	
	<h3>Description: ${book.description} </h3>
	<h3>language: ${book.language} </h3>
	<h3>Pages: ${book.numberOfPages} </h3>
	

</body>
</html>