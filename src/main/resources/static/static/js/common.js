$(function () {
    setMinHeight();
    /*progress();*/
	 
});

//设置wrapper的最小高度
function setMinHeight() {
    var h1=$(window).height();
	var h2=$("header").height();
	var h3=$("footer").height();
	
	var h=h1-h2;
	var hc=h-h3;
	$(".wrapper").css("height",h)
	$(".content").css("height",hc);
}

/*function progress(){
	
	 var $step = $("#step");
     var $index = $("#index");

	$step.step({
		index: 0,
		time: 500,
		title: ["检察文书上传", "量刑情节分析", "量刑结果分析"]
	});

	$index.text($step.getIndex());

	$(".next").on("click", function() {
		$step.nextStep();
		$index.text($step.getIndex());
	});	
	$(".btn1").on("click", function() {
				$step.toStep(1);
				$index.text($step.getIndex());
			});

	$(".btn2").on("click", function() {
				$step.toStep(2);
				$index.text($step.getIndex());
	});		
}*/













