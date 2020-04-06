<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="conPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${conPath}/css/common.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700;800&
family=Oswald:wght@200;300;400;500;600;700&display=swap" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

</head>
<body>

<header>
	<div id="headerWrap">
		<div class="headerLogo">
			<h1>CROWD<br>FUND</h1>
		</div>
		<div id="menuWrap">
			<ul class="util">
				<li><a href="#">LOGIN</a></li>
				<li><a href="#">JOIN</a></li>
				<!--li><a href="#">LOGOUT</a></li>
				<li><a href="#">MYPAGE</a></li-->
			</ul>
			<ul class="gnb">
				<li><a href="#">MENU1</a></li>
				<li><a href="#">MENU1</a></li>
				<li><a href="#">MENU1</a></li>
				<li><a href="#">MENU1</a></li>
				<li><a href="#">MENU1</a></li>
			</ul>
		</div>
	</div>
	
</header>
