
$(function(){

	// productTabs
	var tabs = $(".productTab ul li");
	tabs.bind("click", function (){ 
		$(".disnone").css("display","none");
		var idName = $(this).children("a").attr("id");
		$("div." + idName).css("display","block");

		for(var i=0; i<$(".productTab ul li a").length; i++){
			$(".productTab ul li a").eq(i).removeClass("on");
			$(".productTab ul li").css("background","url(none)");
			$(this).children("a").addClass("on");
		}
	});

	// othertabs
	var othertabs = $(".otherTab ul li");
	othertabs.bind("click", function (){ 
		$(".couponnone").css("display","none");
		var idName = $(this).children("a").attr("id");
		$("div." + idName).css("display","block");

		for(var i=0; i<$(".otherTab ul li a").length; i++){
			$(".otherTab ul li a").eq(i).removeClass("on");
			$(".otherTab ul li").css("background","url(none)");
			$(this).children("a").addClass("on");
		}
	});

	//detailtabs
	var detailtab = $(".detailTab ul li");
	detailtab.bind("click", function (){ 
		$(".disnone").css("display","none");
		var idName = $(this).children("a").attr("id");
		$("div." + idName).css("display","block");

		for(var i=0; i<$(".detailTab ul li a").length; i++){
			$(".detailTab ul li a").eq(i).removeClass("on");
			$(".detailTab ul li").css("background","url(none)");
			$(this).children("a").addClass("on");
		}
	});

	
	$.fn.extend({
		searchStyle : function(options) {
			this.each(function() {

				var currentSelected = $(this).find(':selected');
				$(this).after('<span class="searchStyleSelectBox"><span class="searchStyleSelectBoxInner">'+currentSelected.text()+'</span></span>').css({position:'absolute', opacity:0,fontSize:$(this).next().css('font-size')});
				
				var selectBoxSpan = $(this).next();
				var selectBoxWidth = parseInt($(this).width()) - parseInt(selectBoxSpan.css('padding-left'));   
				
				var selectBoxSpanInner = selectBoxSpan.find(':first-child');
				selectBoxSpan.css({display:'inline-block'});
				selectBoxSpanInner.css({width:selectBoxWidth, display:'inline'});

				var selectBoxHeight = parseInt(selectBoxSpan.height()) + parseInt(selectBoxSpan.css('padding-top')) + parseInt(selectBoxSpan.css('padding-bottom'));
				
				var selectWidth = $(this).width();
				$(this).css("width",selectWidth+40+"px");

				$(this).height(selectBoxHeight).change(function(){
					selectBoxSpanInner.text($(this).find(':selected').text()).parent().addClass('changed');
					});
				});
			
		}
	});

	$('select').searchStyle();


	// Agree
	$(".agreeWrap ul li.btn a").bind("click focusin",function(){
		$(".agreeBox").css("height","160px");
		$(this).parent().parent().siblings(".agreeBox").css("height","auto");
		return false;
	});


	// Review list
	$(".reviewBtn").click(function () {
		if( $(this).is(".hover") ){			
			$(this).removeClass("hover")
			$(".confhide").hide(300)
		}else{
			$(".confhide").hide(300)
			$(".reviewBtn").removeClass("hover")
			$(this).addClass("hover").parent().parent().siblings(".confhide").show(300);
		}

	});

	// Faq list
	$(".faqbtn").click(function () {
		if( $(this).parent().is(".hover") ){			
			$(this).parent().removeClass("hover")
			$(".faqanswer").hide(300)
		}else{
			$(".faqanswer").hide(300)
			$(".faqbtn").parent().removeClass("hover")
			$(this).siblings(".faqanswer").show(300).parent().addClass("hover");
		}
	});

	// Accordion list
	$(".accbtn").click(function () {
		if( $(this).parent().is(".hover") ){			
			$(this).parent().removeClass("hover")
			$(".hideArea").hide(300)
		}else{
			$(".hideArea").hide(300)
			$(".accbtn").parent().removeClass("hover")
			$(this).parent().addClass("hover").parent().siblings(".hideArea").show(300);
		}
	});

	// 위시리스트
	var wishnum = $('.wish ul li').size();
	var sum = Math.ceil(wishnum / 3);
	var count = 1;
	$('.sum').text(sum);
	if (wishnum < 3){$('.wish .list').css('height','auto');}
	else{$('.wish .list').css('height','264px');}

	$('.wishRight').click(function(){
		var $ani=$('.wish ul');
		if(!$ani.is(':animated')){
			var	chkTop = parseInt($('.wish ul').css('top').replace(/[^-\d\.]/g, ''))-264;
			var wbig = -264 * sum;
			if (sum > count){count = count + 1; $('.page').text(count);	}
			if( chkTop == wbig ){}else{$('.wish ul').stop().animate({'top':chkTop},300);}
		}
	});

	$('.wishLeft').click(function(){
		var $ani=$('.wish ul');
		if(!$ani.is(':animated')){
			var chkbom = parseInt($('.wish ul').css('top').replace(/[^-\d\.]/g, ''));
			if (1 < count){count = count - 1; $('.page').text(count);}
			if( chkbom == 0 ){}else{chkbom = chkbom + 264;$('.wish ul').stop().animate({'top':chkbom},300);}
		}
	});
	
	$('#quick .top a').click(function(){
		$('html').animate({scrollTop: 0}, 500);
			$('body').animate({scrollTop: 0}, 500);
	});




});