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
<br>
	<!-- form action="/KakaoPay/main/result.jsp" method="get" -->
	<form action="/KakaoPay/KakaoPaytest/" method="post">
		<h5>New Coupon</h5>
		<div>   
		name : <input type="text" name="name" id="name" value="">   
		phone no : <input type="text" name="phoneNum" id="phoneNum" value=""> 
		<button type="submit">submit</button></div>
	</form>
    
    <form action="/KakaoPay/KakaoPaytest/" method="get">
    	<h5>Search coupon</h5>
    	<div>   
		name : <input type="text" name="name" id="name" value="">   
		phone no : <input type="text" name="phoneNum" id="phoneNum" value="">  
    	<button type="submit">search</button></div>
	</form>
    
</body>
</html>