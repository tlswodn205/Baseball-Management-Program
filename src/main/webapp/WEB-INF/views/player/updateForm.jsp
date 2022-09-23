<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container">
	</br>
	<div class="d-flex justify-content-center">
		<div style="width: 300px">
			<from>
				<input id="playerId" class="form-control me-2" type="hidden" value="${player.id}">
				<input id="updateName" class="form-control me-2" type="text" value="${player.playerName}">
				<select id="updatePosition">
					<option value="1루수">1루수</option>
					<option value="2루수">2루수</option>
					<option value="3루수">3루수</option>
					<option value="포수">포수</option>
					<option value="포수">좌익수</option>
					<option value="우익수">우익수</option>
					<option value="유격수">유격수</option>
				</select>
				</br>
				<button id="playerUpdate" class="btn btn-primary" type="button">수정하기</button>
			</from>
		</div>
	</div>
</div>

<script src="/js/player.js">
</script>

<%@ include file="../layout/footer.jsp"%>