<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container">
	</br>
	<div class="d-flex justify-content-center">
		<div style="width: 300px">
			<from>
				<input id="stadiumId" class="form-control me-2" type="hidden" value="${stadium.id}">
				<label for="updateName">구장 이름 :</label>
				<input id="updateName" class="form-control me-2" type="text" value="${stadium.stadiumName}">
				<button id="stadiumUpdate" class="btn btn-primary" type="button">수정하기</button>
			</from>
		</div>
	</div>
</div>

<script src="/js/stadium.js">
</script>

<%@ include file="../layout/footer.jsp"%>