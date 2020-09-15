<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@include file="../layout/header.jsp"%>
<div class="container">
<h1>팀 등록 페이지입니다.</h1>

<form id="frm">
	야구장 이름 : 
<select name="stadiumId">
	<c:forEach var="stadium" items="${stadiums}">
		<option value="${stadium.id}">${stadium.name}</option>
	</c:forEach>
</select>
	팀 이름 : <input type="text" name="name" value=""/>
<button type="button" onclick="teamSave()">등록</button>
</form>

</div>
<script src="/js/team.js"></script>
<%@include file="../layout/footer.jsp"%>