<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<title>send Data</title>
</head>

<%
// request - set Parameter
String email = request.getParameter("email");
String password = request.getParameter("password");

System.out.println(email);
System.out.println(password);
%>

<body>

  <div>
    <h1>send complite</h1>
  </div>

</body>
</html>

