
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br />
	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>선수이름</th>
				<th>포지션</th>
				<th>팀이름</th>
				<th>등록일자</th>
				<th>수정</th>
				<th> <button id="deletePlayers" type="button"><i id="playerDelete" class="fa-solid fa-trash">방출하기</i></button>
			</tr>
		</thead>
		<tbody id="bodies">
			<c:forEach var = "player" items="${playerList}">
				<tr>
					<td>${player.rankId}</td>
					<td>${player.playerName}</td>
					<td>${player.positions}</td>
					<td>${player.teamName}</td>
					<td>${player.createAt}</td>
					<td><a href="/player/${player.id}/update"><i id="playerNameUpdate" class="fa-solid fa-wrench"></i></a></td>
					<td><input name="checkPlayer" type="checkbox" value="${player.id}"></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<script src="/js/player.js">
</script>


<%@ include file="../layout/footer.jsp"%>