  
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@include file="../layout/header.jsp"%>
<div class="container">
<h1>경기장 등록</h1>

<form id="frm" method="post">
경기장 <br>

<input type="text" name="name" id="stadium"/>
<button type="button" onclick="register()">등록</button>
</form>
</div>

<script src="/js/stadium.js"></script>
<%@include file="../layout/footer.jsp"%>