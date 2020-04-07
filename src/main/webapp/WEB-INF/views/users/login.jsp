<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="conPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>USER LOGIN</title>
</head>
<body>
	<jsp:include page="../main/header.jsp" />
	<section id="userWrap">
		<h2>LOG-IN</h2>
		<form action="" mehtod="post">
			<table>
				<tr>
					<td><input type="text" name="id" placeholder="아이디를 입려하세요"></td>
				</tr>
				<tr>
					<td><input type="text" name="id" placeholder="아이디를 입려하세요"></td>
				</tr>
			</table>
		</form>
	</section>
	<jsp:include page="../main/footer.jsp" />
</body>
</html>