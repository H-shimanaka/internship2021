<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>${errorMsg}</p>
	<form action="/servletSample/SignIn" method="POST">
		
		<table>
			<tr>
				<td>ID</td>
				<td><input type="text" name="id"></td>
			</tr>
			
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			
			<tr>
				<td></td>
				<td align="right"><input type="submit" value="SignIn"></td>
			</tr>
		</table>
		
	</form>
	
	<a href="/servletSample/RegistrationController">新規登録はこちら</a>
	
</body>
</html>