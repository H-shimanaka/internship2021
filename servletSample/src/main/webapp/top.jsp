<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>名前：${name}</p>
	<p>年齢：${age}</p>
	<p>ID：${userData.userID}</p>
	
	<form action="/servletSample/SignOut">
		<input type="submit" value="SignOut">
	</form>
	
</body>
</html>