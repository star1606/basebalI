<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../layout/header.jsp"%>

 <div class="container">
 <h1>팀 목록</h1>
 
	<table border="1" class="table">
		<thead>
			<tr>
				<th>번호</th>
				<th>경기장 이름</th>
				<th>팀 이름</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="team" items="${teams}">
				<tr class="stardium-${team.id}">
					<td>${team.no}</td>
					<td>${team.stadiumName}</td>
					<td>${team.teamName}</td>
				<td><i onclick="teamDelete(${team.id},this);" class="fa fa-minus"></i></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<script src="/js/team.js"></script>
<%@include file="../layout/footer.jsp"%>