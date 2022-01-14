$(function(){
	$(".menu li").hover(
		function(){
			$(this).css("background-color","lime");
		},
		function(){
			$(this).css("background-color","green");
		});
})

$(function(){
	$("#menu1").hover(
		function(){
			$("#sub1").slideDown("hidden");
		},
		function(){
			$("#sub1").slideUp("hidden");
		});
})

$(function(){
	$("#menu2").hover(
		function(){
			$("#sub2").slideDown("hidden");
		},
		function(){
			$("#sub2").slideUp("hidden")
		});
})

$(function(){
	$("#menu3").hover(
		function(){
			$("#sub3").slideDown("hidden");
		},
		function(){
			$("#sub3").slideUp("hidden")
		});
})

const images=["img/Curry.jpg","img/Doncic.jpg","img/Giannis.jpg","img/Harden.jpg","img/Lebron.jpg"];

$(function(){
	$("#slide ul li").hide();
	$("#slide ul li:first").addClass("active").show();
	
	setInterval(function(){
		let active = $("#slide ul li.active");
		let next = active.next("li").length?active.next("li"):$("#slide ul li:first");
		active.fadeOut(1000).removeClass("active");
		next.fadeIn(1000).addClass("active");
		},3000);
	
})