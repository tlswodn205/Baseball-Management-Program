<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container">
	</br>
	<div class="d-flex justify-content-center">
		<div style="width: 300px">
			<from>
				<input id="stadiumName" class="form-control me-2" type="text" placeholder="등록할 구장 이름을 쓰시오.">
				<button id="stadiumSave" class="btn btn-primary" type="button">등록</button>
			</from>
		</div>
	</div>
</div>

<script src="/js/stadium.js">
</script>

<%@ include file="../layout/footer.jsp"%>