
// 회원가입
$("#playerOut").click(() => {
	playerOut();
});

$("#playerUpdate").click(()=>{
	alert("클릭됨");
	update();
});


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

function playerOut() {
	alert("클릭됨");
	let data = {
		playerId: $("#playerId").val(),
		reason: $("#reason").val()
	};

	$.ajax("/outplayer/insert", {
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