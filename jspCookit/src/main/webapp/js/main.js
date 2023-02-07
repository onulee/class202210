$(function(){
	
	$(window).resize(function(){ 

		var winWidth = $(window).width();

		gnbcheck();
		if (winWidth > 767){$("#mnaviOpen").css("display","none")}else{$("#mnaviOpen").css("display","block")}
		$("#mnaviClose").css("display","none");

	});
	
	
	$("#mnaviOpen").click(function(){
		$("#gnb").show("fast");
		$("#mnaviClose").css("display","block");
		$(this).css("display","block");
	});

	$("#mnaviClose").click(function(){
		$("#gnb").hide("fast");
		$("#mnaviOpen").css("display","block");
		$(this).css("display","none");
	});

	function gnbcheck(){
		var winWidth = $(window).width();
		if(winWidth < 767){
			$("#gnb").css("display","none");
		}else{
			$("#gnb").css("display","block");
		}
	}

	gnbcheck();
	
});