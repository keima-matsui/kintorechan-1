<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/normalize.css">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<link rel="stylesheet" type="text/css" href="./css/button.css">


<title>KINTORE CHAN</title>
</head>
<body>
<div id="wrapper">
<div id="formBox">
<img src="images/regist.png">
<form class="form-signin" action="user" method="post"> 
<input type="hidden" name="control" value="signup" />    
<input type="text" class="form-control" name="username" placeholder="Username" required="" autofocus="" />
<br>
<input type="password" class="form-control" name="password" placeholder="Password" required=""/>      
<input type="image" src="images/apply.png" class="buttonMargin">

</form>

</div>

</div>
</body>
</html>