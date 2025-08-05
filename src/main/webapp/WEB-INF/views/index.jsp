<%@ page contentType="text/html;charset=ISO-8859-1" language="java" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Spring MVC Website</title>
</head>

<body>
    <h2>Hello World!</h2>
    <h2>INDEX</h2>

    <%
        String name = (String) request.getAttribute("name");
        List<String> arr = (ArrayList<String>) request.getAttribute("list");
    %>

    <h1>Name is <%= name %></h1>

    <ul>
    <%
        if (arr != null) {
            for (String s : arr) {
    %>
                <li><%= s %></li>

    <%
            }
        } else {
    %>
        <li>No items found</li>
    <%
        }
    %>
    </ul>
</body>
</html>
