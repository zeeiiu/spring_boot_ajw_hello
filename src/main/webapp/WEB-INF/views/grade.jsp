<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	합계 : ${grade.getTotal()} <br>
	평균 : ${grade.getAvg()} <br>
	학점 : ${grade.getGrade()} <br>
	toString : ${grade.toString()} <br>
	
	<hr>
	또는
	
	합계 : ${grade.total} <br>
	평균 : ${grade.avg} <br>
	학점 : ${grade.grade} <br>
	
</body>
</html>