<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Meeting :: list</title>
</head>
<body>
<div class="container">
	<h1>Meeting List</h1>
	
	<table class="table table-condensed">
		<thead>
			<tr>
				<th>글번호</th>
				<th>회의실 번호</th>
				<th>제목</th>
				<th>등록일</th>
			</tr>
		</thead>
		<tbody>
		<c:choose>
			<c:when test="${not empty meetings }">
				<c:forEach var="meeting" items="${meetings }">
					<tr>
						<td>${meeting.no }</td>
						<td>${meeting.room }</td>
						<td><a href="detail.do?no=${meeting.no }">${meeting.title }</a></td>
						<td>${meeting.dates }</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="3">게시글이 존재하지 않습니다.</td>
				</tr>
			</c:otherwise>
		</c:choose>
		</tbody>
	</table>
	
	<div class="text-right">
		<a href="form.do" class="btn btn-primary btn-sm">Add</a>
	</div>
</div>
</body>
</html>