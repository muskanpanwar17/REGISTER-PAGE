<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>REGISTERATION FORM</title>
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
	<form action="regform" method="post" >
	<h2 align="center">Registration Form</h2>
		Name : <input type="text" name="name1"/> <br/> <br/>
		Email : <input type="text" name="email1"/> <br/> <br/>
		Password : <input type="password" name="pass1"/> <br/> <br/>
		Gender : <input type="radio" name="gen1" value="male"/> MALE <input type="radio" name="gen1" value ="female"/> FEMALE <br/> <br/>
		City :<select name="city1">
			<option>Select city </option>
			<option>Delhi</option>
			<option>mumbai</option>
			<option>jammu</option>
			<option>pune</option>
			<option>harayana</option>
			<option>uttar pradesh</option>
			<option>rajasthan</option>
		</select> <br/> <br/>
		<input type="submit" value="register"/>
	</form>
	</div>

</body>
</html>