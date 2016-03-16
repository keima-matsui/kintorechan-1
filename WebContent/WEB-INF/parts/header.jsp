<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/normalize.css">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<link rel="stylesheet" type="text/css" href="./css/button.css">
<link rel="stylesheet" type="text/css" href="./css/select.css">

<script src="./js/changeSelect.js"></script>
<script src="select.js"></script>

<title>KINTORE CHAN</title>


</head>
<body>
<div id="wrapper">

	<div id="main">
		
		<div id="main_top">
			<ul>
				<li><a href="home">HOME</a></li>
				<li><a href="mypage">MY STATICS</a></li>
				<li>F.A.Q</li>
			
			</ul>
		
		<div class="site_massage">
			<span><%=session.getAttribute("username")%>さん</span>
		</div>
		
		</div>
		
		<div id="main_top2">
			<div class="title_box"><img src="./images/title.png"></div>
			
		
		
		</div>