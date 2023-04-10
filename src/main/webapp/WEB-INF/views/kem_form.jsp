<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
   <form action ="/grade/total2" method="post">
            국어 : <input type="text" name="kor"> </br>
            영어 : <input type="text" name="eng"> </br>
            수학 : <input type="text" name="math"> </br>
            <button type="submit">입력</button>
            <button type="reset">취소</button>
   </form>




</body>
</html>