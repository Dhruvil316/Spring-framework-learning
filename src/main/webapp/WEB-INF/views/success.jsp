<%--
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Success</title>
</head>
<body>
    <h2>Authorization Successful!</h2>

    <%
        // Getting the email from the request scope
        String email = (String) request.getAttribute("email");
    %>

    <h3>Welcome, <%= email %>!</h3>
</body>
</html>
--%>



<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Success</title>
</head>
<body>
    <h2>Authorization Successful!</h2>
    <h3>Welcome ${user.email}!</h3>
</body>
</html>

