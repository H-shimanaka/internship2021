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
				<td><input type="text" name="id" pattern="[0-9A-Za-z]{1,50}" title="半角英数字で５０桁までの入力が可能です" required></td>
			</tr>
			
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" pattern="[0-9A-Za-z]{1,100}" title="半角英数字で１００桁までの入力が可能です" required></td>
			</tr>
			
			<tr>
				<td>User Name</td>
				<td><input type="text" name="userName" pattern="{0,100}" title="１００桁まで入力可能です"></td>
			</tr>
			
			<tr>
				<td>Age</td>
				<td><input type="text" name="age" pattern="[0-9]{0,3}" title="半角数字で３桁まで入力可能です"></td>
			</tr>
			
			<tr>
				<td></td>
				<td align="right"><input type="submit" value="新規登録"></td>
			</tr>
		
		</table>
	</form>
	
</body>
</html> 