
// 회원가입
$("#playerSave").click(() => {
	save();
});

$("#playerUpdate").click(()=>{
	alert("클릭됨");
	update();
});




function getDeleteId(id) {

	var arr = new Array();

	$("input:checkbox[name='id']").each(function() {
		if ($(this).is(":checked") == true) {
			arr.push($(this).val());
		}
	});
	return arr;
}

$("#deletePlayers").click((id) => {
	let ids = getDeleteId(id);

	let data = {
		ids: ids
	};


	$.ajax("/player/delete", {
		type: "DELETE",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("선수 삭제 완료");
			location.reload();
		} else {
			alert("퇴출에 실패하였습니다.");
		}
	});
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