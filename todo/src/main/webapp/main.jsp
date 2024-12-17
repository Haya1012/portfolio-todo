<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ page import = "java.util.List" %>
 <%@ page import="java.util.ArrayList" %>
 <%@ page import="control.TodoItem" %>
 
 <%
 ArrayList<TodoItem> todolist = (ArrayList<TodoItem>)session.getAttribute("todoList");
 request.setAttribute("todolist", todolist);
 %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>リスト表示</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<%@include file = "header-navi.jsp"%>

<h2>リスト一覧</h2>

<a href = "listsakusei.jsp" class="submit">リスト追加</a>
<p>
<form action="delete-servlet" method="post">
<table border="1">
<thead>
	<tr>
	<th width = "5%">チェック</th>
	<th width = "15%">日付</th>
	<th>内容</th>
	</tr>
	</thead>
	<tbody>

		<c:forEach var="todo" items="${todolist}" varStatus="status">
		<tr>
			<td><input type="checkbox" name = "Todos" value="${status.index}"></td>
			<td>${todo.date}</td>
			<td>${todo.task}</td>
			
		</tr>
		</c:forEach>
	</tbody>
</table>
<br>
<br>
<input type="submit" value="完了">
</form>
</body>
</html>