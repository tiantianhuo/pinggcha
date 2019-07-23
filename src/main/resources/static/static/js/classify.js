 // 验证用户名
    function checkName(){
    	var $name=$('#name').val();
    	var $divID=$('#DivName');
    	$divID.html("");
    	var reg=/^[a-zA-Z][a-zA-Z0-9]{5,13}$/;
    	if (reg.test($name)==false) {
    		$divID.html("用户名由英文字母和数字组成，字母开头为6-12个字符");
    		return false;
    	}
    	return true;
    }

$(document).ready(function(){
	$('#name').blur(checkName);
    $('#myform').submit(function(){
      	var flag=true;
      	if (!checkName()) flag=false;
      	return false;
      })
})
