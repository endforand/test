<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <title>TEST</title>
</head>
<body>

  <div>
    <h1>Form</h1>
  </div>
  <form action="result.jsp" method="get">
    <div>
      <label>이메일</label>
      <input name="email" type="email" />
    </div>
    <div>
      <label>비밀번호</label>
      <input name="password" type="password" />
    </div>
    <button type="submit">전송</button>
  </form>
</body>
</html>