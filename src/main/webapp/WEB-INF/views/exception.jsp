<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Error Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5 text-center">
    <div class="alert alert-danger shadow p-4">
        <h2 class="text-danger">Oops! An Error Occurred</h2>
        <p class="mt-3"><strong>${msg}</strong></p>
        <p>If this continues, please contact support or try again later.</p>
        <a href="/" class="btn btn-primary mt-3">Go Back to Home</a>
    </div>
</div>

</body>
</html>
