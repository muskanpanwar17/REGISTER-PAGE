<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN PAGE</title>
<style>
    .form-container {
        width: 400px;
        margin: 50px auto;   /* center horizontally */
        padding: 20px;
        border: 2px solid black;
        border-radius: 10px;
        text-align: left;
        background-color: rgb(164, 225, 255);
    }
    </style>
</head>
<body>
<div class="form-container">
	<form action="loginForm" method= "post">
	<h2 align="center">LOGIN PAGE</h2>
		Email :<input type= "text" name= "email1" /><br/><br/>
		Password :<input type= "password" name= "pass1" /><br/><br/>
		<input type= "submit" name= "login" value= "LOGIN" />
		<a href = "forget.jsp"> Forget Password</a>
	</form>
	</div>

</body>
</html>