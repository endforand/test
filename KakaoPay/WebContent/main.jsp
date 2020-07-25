<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <title>:: 최은진 - 선택과제 2 - 쿠폰발급 ::</title>
	<style type="text/css">
	   	body{background-color : #FFC81E;}
		div{margin : 20px;}
	</style>
</head>

<body>
<br>
<h3>쿠폰 조회 / 발행 </h3><br>
	<form action="/KakaoPay/main/result.jsp" method="get">
		<h5>쿠폰 발급</h5>
		<div>   이름 : <input type="text" name="name" id="name" value="">   핸드폰 : <input type="text" name="phoneNum" id="phoneNum" value=""> <button type="submit">발급</button></div>
	</form>
    
    <form action="/KakaoPay/main/result2.jsp" method="get">
    	<h5>쿠폰 조회</h5>
    	<div>   쿠폰번호 : <input type="text" name="name" id="name" value=""> <button type="submit">조회</button></div>
	</form>
    
</body>
</html>