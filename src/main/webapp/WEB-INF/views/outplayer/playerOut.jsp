<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container">
	</br>
	<div class="d-flex justify-content">
		<div style="width: 300px">
			<from>
				<label for="playerId">선수선택</label>
				
				<select id="playerId">
					<c:forEach var = "player" items="${playerList}">
						<option value="${player.id}">${player.playerName}</option>
					</c:forEach>
				</select>
				</br>
				</br>
						퇴출사유
						<input id="reason" type="text" style="width: 600px">	
				</br>
				<button id="playerOut" class="btn btn-primary" type="button">퇴출하기</button>
			</from>
		</div>
	</div>
</div>

<script src="/js/outplayer.js">
</script>

<%@ include file="../layout/footer.jsp"%>