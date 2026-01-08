<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forget password</title>
</head>
<body>
<form action="sendOtp" method="post">
<h3>Enter your registered mail</h3>
<input type="email" name="email" required />
<input type="submit" value="Send OTP"/>
</form>

</body>
</html>