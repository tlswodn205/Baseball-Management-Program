<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br />
	<table class="table table-striped">
		<thead>
			<tr>
				<th>팀</th>
				<th>1루수</th>
				<th>2루수</th>
				<th>3루수</th>
				<th>포수</th>
				<th>좌익수</th>
				<th>우익수</th>
				<th>유격수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var = "player" items="${playerList}">
				<tr>
					<td>${player.teamName}</td>
					<td>${player.firstBasemane}</td>
					<td>${player.secondBasemane}</td>
					<td>${player.thirdBasemane}</td>
					<td>${player.catcher}</td>
					<td>${player.leftFielder}</td>
					<td>${player.rightFielder}</td>
					<td>${player.shortstop}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>


<%@ include file="../layout/footer.jsp"%>