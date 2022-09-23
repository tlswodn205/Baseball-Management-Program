<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container">
	</br>
	<div class="d-flex justify-content-center">
		<div style="width: 300px">
			<from>
				<label for="teamId">팀선택</label>
				<select id="teamId">
					<c:forEach var = "team" items="${teamList}">
						<option value="${team.id}">${team.teamName}</option>
					</c:forEach>
				</select>
				</br>
				<label for="positions">팀선택</label>
				<select id="positions">
					<option value="1루수">1루수</option>
					<option value="2루수">2루수</option>
					<option value="3루수">3루수</option>
					<option value="포수">포수</option>
					<option value="포수">좌익수</option>
					<option value="우익수">우익수</option>
					<option value="유격수">유격수</option>
				</select>
				<input id="playerName" class="form-control me-2" type="text" placeholder="등록할 선수 이름을 쓰시오.">
				<button id="playerSave" class="btn btn-primary" type="button">등록</button>
			</from>
		</div>
	</div>
</div>

<script src="/js/player.js">
</script>

<%@ include file="../layout/footer.jsp"%>