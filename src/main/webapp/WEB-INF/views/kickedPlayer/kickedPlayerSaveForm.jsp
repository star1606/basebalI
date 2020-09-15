<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@include file="../layout/header.jsp"%>
<div class="container">
<h1>퇴출사유 등록 </h1>

<form id="frm">
선수 이름 : 
<select name=playerId>
	<c:forEach var="player" items="${players}">
		<option value="${player.id}">${player.name}</option>
	</c:forEach>
</select>
퇴출 사유 : <input type="text" name="reason" value=""/>
<button type="button" onclick="kickedPlayerSave()">등록</button>
</form>
</div>


<script src="/js/kickedPlayer.js"></script>
<%@include file="../layout/footer.jsp"%>