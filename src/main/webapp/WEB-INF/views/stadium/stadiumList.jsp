<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../layout/header.jsp"%>

 <div class="container">
 <h1>경기장 목록.</h1>
 
	<table border="1" class="table">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
<%-- 			<c:forEach var="stadium" items="${stadiums}"> --%>
<%-- 				<tr class="stardium-${stardium.id}"> --%>
<%-- 					<td>${stardium.no}</td> --%>
<%-- 					<td>${stardium.name}</td> --%>
<!-- 				</tr> -->
<%-- 			</c:forEach> --%>
		</tbody>
	</table>
</div>
<script src="/js/stardium.js"></script>
<%@include file="../layout/footer.jsp"%>