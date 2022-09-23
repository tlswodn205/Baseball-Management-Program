<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br />
	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>선수이름</th>
				<th>사유</th>
				<th>등록일자</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var = "outplayer" items="${outplayerList}">
				<tr>
					<td>${outplayer.rankId}</td>
					<td>${outplayer.playerName}</td>
					<td>${outplayer.reason}</td>
					<td>${outplayer.createAt}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>


<%@ include file="../layout/footer.jsp"%>