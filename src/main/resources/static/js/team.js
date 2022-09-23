
// 회원가입
$("#teamSave").click(() => {
	save();
});

$("#teamUpdate").click(()=>{
	alert("클릭됨");
	update();
});


function update(){
	
	let vid = $("#teamId").val();
	
	let data = {
		id : $("#teamId").val(),
		name : $("#updateName").val()
	};
	
	alert(vid)
	
	$.ajax("/teamUpdate", {
		type: "Put",
		dataType: "json", //응답 데이터
		data: JSON.stringify(data), //http body에 들고갈 요청 데이터
		headers: {	//http header에 들고갈 요청데이터
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("팀이름 수정완료");
			location.href= "/teamList/";
		}else{
			alert("팀이름 수정실패");
		}
	});
}

function save() {
	alert($("#teamName").val());
	let data = {
		teamName: $("#teamName").val(),
		stadiumId: $("#stadiumId").val()
	};

	$.ajax("/joinTeam", {
		type: "POST",
		dataType: "json", //응답 데이터
		data: JSON.stringify(data), //http body에 들고갈 요청 데이터
		headers: {	//http header에 들고갈 요청데이터
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			console.log(res.msg);
			location.href = "/teamList";
		} else {
			alert("팀 등록 실패!");
		}
	});
}


/**
 * 
 
 */