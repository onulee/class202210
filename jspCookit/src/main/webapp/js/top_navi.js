$(window).resize(function(){ 

	var winWidth = $(window).width();
	if(winWidth > 767){
		$("ul[id^=topSubm]").css("display","block");
		$("ul[id^=topSubm]").css("visibility","hidden");
	}else{
		$("ul[id^=topSubm]").css("display","none");
		$("ul[id^=topSubm]").css("visibility","visible");
	}

});


function depth2Search(dep1, dep2){
	depth2HideAll();

	var depId = dep1;
	var dep2Id = dep2 - 1;
	if(dep1 !=0){	
		$("#topNavi"+depId).addClass("hover");
		
		var winWidth = $(window).width();
		if (winWidth < 768){
			$("#topSubm"+depId).find("li:eq("+dep2Id+") a").addClass("hover").parent().parent("ul").css("display","block");
		}else{
			$("#topSubm"+depId).find("li:eq("+dep2Id+") a").addClass("hover").parent().parent("ul").css("visibility","visible");
		}

	}
}

function depth2HideAll(d1n){
	$("a[id^=topNavi]").each(function() {
		$(this).removeClass("hover");
		
		var winWidth = $(window).width();
		if (winWidth < 768){
			$(this).siblings("ul").css("display","none");
		}else{
			$(this).siblings("ul").css("visibility","hidden");
		}
	});
}


function depth2View(){
	var depId = this.id;
	var depClass = depId.substr(0,7);
	var depNum = depId.substr(7,8);

	depth2HideAll();
	
	if (depClass == "topNavi") {
		targetDiv = $(this);
		var winWidth = $(window).width();
		if (winWidth < 768){
			targetDiv.addClass("hover").siblings("ul").css("display","block");
		}else{
			targetDiv.addClass("hover").siblings("ul").css("visibility","visible");
		}

	} else if (depClass == "topSubm") {
		targetDiv = $(this).siblings();
		var winWidth = $(window).width();
		if (winWidth < 768){
			targetDiv.addClass("hover").siblings("ul").css("display","block");
		}else{
			targetDiv.addClass("hover").siblings("ul").css("visibility","visible");
		}
	}
}




function initTopMenu(dep1, dep2) {

	if (dep1 !=0)
	{depth2Search(dep1, dep2);}

	$("a[id^=topNavi]").each(function() {
		$(this).mouseover(depth2View)
		       .focus(depth2View)
		       .mouseout(function() {
		    	   depth2Search(dep1, dep2);
		       });
	});

	$("ul[id^=topSubm]").each(function() {
		$(this).mouseover(depth2View)
		       .focus(depth2View)
		       .mouseout(function() {
		    	   depth2Search(dep1, dep2);
		       });
	});

}
