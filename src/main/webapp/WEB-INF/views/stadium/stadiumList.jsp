<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br />
	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>구장이름</th>
				<th>등록일자</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var = "stadium" items="${stadiumList}">
				<tr>
					<input id="" type="hidden">
					<td>${stadium.rankId}</td>
					<td>${stadium.stadiumName}</td>
					<td>${stadium.createAt}</td>
					<td><a href="/stadium/${stadium.id}/update"><i id="StadiumNameUpdate" class="fa-solid fa-wrench"></i></a></td>
					<td><a href="/stadium/${stadium.id}/delete"><i id="StadiumDelete" class="fa-solid fa-trash"></i></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>


<%@ include file="../layout/footer.jsp"%>