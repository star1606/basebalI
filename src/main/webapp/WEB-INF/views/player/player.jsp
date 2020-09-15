<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../layout/header.jsp"%>

 <div class="container">
 <h1>선수 목록.</h1>
	<table border="1" class="table">
		<thead>
			<tr>
				<th>번호</th>
				<th>팀 이름</th>
				<th>포지션</th>
				<th>선수 이름</th>
				<th>등록일</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="player" items="${players}">
				<tr class="player-${player.id}">
					<td>${player.no}</td>
					<td>${player.teamName}</td>
					<td>${player.position}</td>
					<td>${player.playerName}</td>
					<td><i onclick="playerDelete(${player.id},this);" class="fa fa-minus"></i></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<script src="/js/player.js"></script>
<%@include file="../layout/footer.jsp"%>