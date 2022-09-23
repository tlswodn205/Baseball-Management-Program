<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container">
	</br>
	<div class="d-flex justify-content-center">
		<div style="width: 300px">
			<from>
				<label for="stadiumList">구장선택</label>
				<select id="stadiumId">
					<c:forEach var = "stadium" items="${stadiumList}">
						<option value="${stadium.id}">${stadium.stadiumName}</option>
					</c:forEach>
				</select>
				<input id="teamName" class="form-control me-2" type="text" placeholder="등록할 팀 이름을 쓰시오.">
				<button id="teamSave" class="btn btn-primary" type="button">등록</button>
			</from>
		</div>
	</div>
</div>

<script src="/js/team.js">
</script>

<%@ include file="../layout/footer.jsp"%>