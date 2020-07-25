<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<title>:: 최은진 - 선택과제 2 - 쿠폰발급 ::</title>
</head>

<%
// request - set Parameter
String name = request.getParameter("name");
String phoneNum = request.getParameter("phoneNum");

System.out.println(name);
System.out.println(phoneNum);
%>

<body>

  <div>
    <h1>send complite</h1>
  </div>

</body>
</html>

