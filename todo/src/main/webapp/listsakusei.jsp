<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>リスト作成</title>
<link rel="stylesheet" href="style.css">
</head>
<body

<%@include file = "header-navi.jsp"%>

<h2>リスト作成</h2>

<form action = "receive-servlet" method = "post">


	<!-- タスク追加 -->
	<label for = "task">タスク内容<label>
	<input type = "text" id = "task" name = "task" required><br><br>

	<label for = "date">日付<label>
	<input type = "date" id = "date" name = "date" required><br><br>

	<button type="submit">追加</button>

	</form>
	<br>
	<br>
			
	<a href = "main.jsp">リスト一覧</a>		

</body>
</html>