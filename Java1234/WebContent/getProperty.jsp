<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>get property</title>
</head>
<body>
<jsp:useBean id="User1" class="org.studyeasy.User1" scope="session"></jsp:useBean>
First name:<jsp:getProperty property="firstName" name="User1"/>
last Name:<jsp:getProperty property="lastName" name="User1"/>

</body>
</html>