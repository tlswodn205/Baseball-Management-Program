<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>야구 관리 프로그램</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
<link href ="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" rel="stylesheet">
<link href = "/css/style.css" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="/">야구 관리 프로그램</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
				data-bs-target="#collapsibleNavbar">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="collapsibleNavbar">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" href="/stadiumSaveForm">야구장 등록 페이지</a></li>
					<li class="nav-item"><a class="nav-link" href="/teamSaveForm  ">팀등록 페이지</a></li>
					<li class="nav-item"><a class="nav-link" href="/playerSaveForm">선수 등록 페이지 </a></li>
					<li class="nav-item"><a class="nav-link" href="/stadiumList">야구장 목록 보기</a></li>
					<li class="nav-item"><a class="nav-link" href="/teamList">야구팀 목록 보기</a></li>
					<li class="nav-item"><a class="nav-link" href="/playerList ">선수 목록 보기</a></li>
					<li class="nav-item"><a class="nav-link" href="/positionList ">포지션별 야구 선수 보기</a></li>
					<li class="nav-item"><a class="nav-link" href="/playerOut ">선수 퇴출 하기</a></li>
					<li class="nav-item"><a class="nav-link" href="/outplayerList ">퇴출선수 목록 보기</a></li>
				</ul>
			</div>
		</div>
	</nav>