


function register(){
	let data = $("#frm").serialize();
	console.log(data);
	
	$.ajax({
		type: "POST",
		url: "/stadium",
		data: data,
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		dataType: "text" 
			
			
	}).done(function(resp){
		console.log(resp);
		alert("성공");
		$("#stadium").val("");
	
	}).fail(function(error){
		console.log(error);
		alert("실패");
	});
}


function stadiumDelete(id,obj){
	//해당 행 삭제
	var tr = $(obj).parent().parent();
	
	let data = {
			id : id
	}
	console.log(data);
	$.ajax({
		type: "DELETE",
		url: "/stardium",
		data: data,
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		dataType: "text" 
						
	}).done(function(resp){
		console.log(resp);
		tr.remove();
		alert("성공");
	}).fail(function(error){
		console.log(error);
		alert("실패");
	});
}

//const register 