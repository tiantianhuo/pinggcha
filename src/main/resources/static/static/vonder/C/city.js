$(function(){$('.container').show();
	$('body').on('click','.city-list p',function(){
	
});
$('body').on('click','.letter a',function(){
	var tops = $('.city').scrollTop();
	var s=$(this).html();
	var h=$(".city").scrollTop(tops + $('#'+s+'1').offset().top -150);
	$("#showLetter span").html(s);
	$("#showLetter").show().delay(500).hide(0);
});
$('body').on('onMouse','.showLetter span',function(){$("#showLetter").show().delay(500).hide(0);});})