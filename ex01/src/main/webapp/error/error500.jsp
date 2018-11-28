<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>심각한 오류 발생!!!</h4>
	<p>관리자에게 문의하세요</p>
	<P><%=exception.toString() %></P>
</body>
</html>