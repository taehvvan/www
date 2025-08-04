<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
	<title>Users</title>
	<meta charset="UTF-8">
</head>
<body>
    <h2>사용자 목록</h2>
    <c:forEach var="user" items="${users}">
        <p>ID: ${user.id} / Name: ${user.name}</p>
    </c:forEach>
</body>
</html>