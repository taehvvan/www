<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
	<title>User Form</title>
	<meta charset="UTF-8">
</head>
<body>
    <h2>사용자 입력</h2>
    <form:form method="POST" action="/submit" modelAttribute="user">
        ID: <form:input path="id"/><br/>
        Name: <form:input path="name"/><br/>
        <input type="submit" value="Submit"/>
    </form:form>
</body>
</html>
