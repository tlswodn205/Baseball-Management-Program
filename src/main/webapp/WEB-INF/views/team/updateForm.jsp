<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container">
	</br>
	<div class="d-flex justify-content-center">
		<div style="width: 300px">
			<from>
				<input id="teamId" class="form-control me-2" type="hidden" value="${team.id}">
				<input id="updateName" class="form-control me-2" type="text" value="${team.teamName}">
				<button id="teamUpdate" class="btn btn-primary" type="button">수정하기</button>
			</from>
		</div>
	</div>
</div>

<script src="/js/team.js">
</script>

<%@ include file="../layout/footer.jsp"%>