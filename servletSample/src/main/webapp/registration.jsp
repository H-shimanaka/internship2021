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
	<form action="/servletSample/RegistrationController" method="POST">
		<table>
			<tr>
				<td>ID</td>
				<td><input type="text" name="id" required></td>
			</tr>
			
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" required></td>
			</tr>
			
			<tr>
				<td>User Name</td>
				<td><input type="text" name="userName"></td>
			</tr>
			
			<tr>
				<td>Age</td>
				<td><input type="text" name="age"></td>
			</tr>
			
			<tr>
				<td></td>
				<td align="right"><input type="submit" value="新規登録"></td>
			</tr>
		
		</table>
	</form>
	
</body>
</html> 