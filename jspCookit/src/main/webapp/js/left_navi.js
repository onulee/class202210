function leftSearch(dep1, dep2){

	var depId = dep1;
	var dep2Id = dep2 - 1;

	if(dep1 !=0){

		$("#leftNavi"+depId).addClass("hover");
		if(dep2 !=0){
			$("#leftSubm"+depId).css("display","block");
			$("#leftSubm"+depId+"> li:eq("+dep2Id+") a").addClass("hover");
		}

	}

}


function initSubmenu(dep1, dep2) {

	if (dep1 !=0)
	{leftSearch(dep1, dep2);}

}