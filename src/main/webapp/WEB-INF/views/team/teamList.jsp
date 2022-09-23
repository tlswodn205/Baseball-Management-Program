<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br />
	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>팀이름</th>
				<th>구장이름</th>
				<th>등록일자</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var = "team" items="${teamList}">
				<tr>
					<td>${team.rankId}</td>
					<td>${team.teamName}</td>
					<td>${team.stadiumName}</td>
					<td>${team.createAt}</td>
					<td><a href="/team/${team.id}/update"><i id="TeamNameUpdate" class="fa-solid fa-wrench"></i></a></td>
					<td><a href="/team/${team.id}/delete"><i id="TeamDelete" class="fa-solid fa-trash"></i></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>


<%@ include file="../layout/footer.jsp"%>