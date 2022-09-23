
// 회원가입
$("#playerSave").click(() => {
	save();
});

$("#playerUpdate").click(()=>{
	alert("클릭됨");
	update();
});



$("#deletePlayers").click(()=>{
	remove();
});

function remove(){
	let checkPlayer = document.listForm.checkPlayer
	alert(checkPlayer);
	
/*	let data = {
		id : $("#playerId").val(),
		playerName : $("#updateName").val(),
		positions : $("#updatePosition").val()
	};
	
	$.ajax("/playerUpdate", {
		type: "Put",
		dataType: "json", //응답 데이터
		data: JSON.stringify(data), //http body에 들고갈 요청 데이터
		headers: {	//http header에 들고갈 요청데이터
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("플레이어 이름 수정완료");
			location.href= "/playerList/";
		}else{
			alert("플레이어 이름 수정실패");
		} 
	});*/
}

function update(){
	alert($("#updatePosition").val());
	
	let data = {
		id : $("#playerId").val(),
		playerName : $("#updateName").val(),
		positions : $("#updatePosition").val()
	};
	
	$.ajax("/playerUpdate", {
		type: "Put",
		dataType: "json", //응답 데이터
		data: JSON.stringify(data), //http body에 들고갈 요청 데이터
		headers: {	//http header에 들고갈 요청데이터
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("플레이어 이름 수정완료");
			location.href= "/playerList/";
		}else{
			alert("플레이어 이름 수정실패");
		} 
	});
}

function save() {
	let data = {
		playerName: $("#playerName").val(),
		positions : $("#positions").val(),
		teamId: $("#teamId").val()
	};

	$.ajax("/joinPlayer", {
		type: "POST",
		dataType: "json", //응답 데이터
		data: JSON.stringify(data), //http body에 들고갈 요청 데이터
		headers: {	//http header에 들고갈 요청데이터
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			console.log(res.msg);
			location.href = "/playerList";
		} else {
			alert("선수 등록 실패!");
		}
	});
}


/**
 * 
 
 */