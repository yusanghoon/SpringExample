<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 입력</title>
</head>
<body>

	<form method="post" action="/jsp/user/add">
		<label>이름</label> <input type="text" name="name">
		<label>생년월일</label> <input type="text" name="birthday">
		<label>이메일</label> <input type= "text" name="email">
		<label>자기소개</label><br>
		<textarea rows="5" cols="50" name="introduce"></textarea>
		<button type="submit"></button>
	</form>

</body>
</html>