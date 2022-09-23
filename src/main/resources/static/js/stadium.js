/**
 * 
 */
$("#stadiumSave").click(()=>{
	save();
});

$("#stadiumUpdate").click(()=>{
	alert("클릭됨");
	update();
});
	
$("#StadiumDelete").click(()=>{
	alert("클릭됨");
	remove();
});

function save() {
	let data = {
		stadiumName : $("#stadiumName").val()
	};
		
	$.ajax("/stadiumSave", {
		type: "POST",
		dataType: "json",  //응답 데이터
		data: JSON.stringify(data), //http body에 들고갈 요청 데이터
		headers: {	//http header에 들고갈 요청데이터
			"Content-Type": "application/json"
		}
	}).done((res) => {
		if(res.code ==1) {
			location.href="/stadiumList";
		}
	});
}


function update(){
	
	let vid = $("#stadiumId").val();
	
	let data = {
		id : $("#stadiumId").val(),
		name : $("#updateName").val()
	};
	
	alert(vid)
	
	$.ajax("/stadiumUpdate", {
		type: "Put",
		dataType: "json", //응답 데이터
		data: JSON.stringify(data), //http body에 들고갈 요청 데이터
		headers: {	//http header에 들고갈 요청데이터
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("구장이름 수정완료");
			location.href= "/stadiumList/";
		}else{
			alert("구장이름 수정실패");
		}
	});
}
	
function remove(){
	
	let id = $("#id").val();
	
	$.ajax("/stadium/"+id +"/delete", {
		type: "delete",
		dataType: "json", //응답 데이터
	}).done((res) => {
		if (res.code == 1) {
			alert("구장삭제완료");
			location.href= "/stadiumList";
		}else{
			alert("구장삭제실패");
		}
	});
}


