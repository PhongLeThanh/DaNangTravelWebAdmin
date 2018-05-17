$(document).ready(function() {
	$("#frmNews").validate({
		rules:{
			"name_news":{
				required: true,
			},
			"preview_text":{
				required: true,
			},

		},
		messages:{
			"name_news":{
				required:  "<span style=\"color: red\">Nhập tên tin</span>",
			},
			"preview_text":{
				required:  "<span style=\"color: red\">Nhập mô tả tin</span>",
			},
			
		},
	});
	$('#addNews').click(function() {
		checkTextArea();
	});	
	
	/*$("#name").keyup(function(){		
		checkTextArea();
	});*/
	
	/*$("#preview_text").keyup(function(){		
		checkTextArea();
	});*/
	
	$("#detail_text").keyup(function(){		
			checkTextArea();
	});
});
function checkTextArea(){
	/*if ($.trim($("#name").val()).length == 0 ) {			
		$("#err_name").text("Vui lĂ²ng nháº­p mĂ´ táº£ tin");
	}	
	else {
		$("#err_name").text("");
	}
	if ($.trim($("#preview_text").val()).length == 0 ) {			
		$("#err_preview_text").text("Vui lĂ²ng nháº­p mĂ´ táº£ tin");
	}	
	else {
		$("#err_preview_text").text("");
	}*/
	if ($.trim($("#detail_text").val()).length == 0 ) {			
		$("#err_detail_text").text("Nhập chi tiết tin");
	}	
	else {
		$("#err_detail_text").text("");
	}
}

