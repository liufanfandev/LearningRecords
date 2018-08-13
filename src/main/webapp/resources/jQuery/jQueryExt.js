function showProgress(){
	
	var loadingMessage = "正在处理，请稍后。。。";
	$("<div class=\"datagrid-mask\" style=\"position:absolute;z-index:9999;\"></div> ").css({display:"block",width:"100%",height:$(window).height()}).appendTo("body");
	$("<div class=\"datagrid-mask-msg\" style=\"position:absolute;z-index:9999;\"></div> ").html(loadingMessage).appendTo("body").css({display:"block",left : ($(document.body).outerWidth(true) - 190)/2,top: ($(window).height -45) /2});
	
}

function hideProgress(){
	$(".datagrid-mask").remove();
	$("datagrid-mask-msg").remove();
}

/**
 * 增加 formatString功能
 * 
 * 使用方法 $.formatString('字符串{0}字符串{1}','第一个变量','第二个变量');
 * 
 * @returns 格式化后的字符串
 */
$.formatString = function(str) {
	for (var i = 0; i < arguments.length - 1; i++) {
		str = str.replace("{" + i + "}", arguments[i + 1]);
	}
	return str;
}

/**
 * 在ajaxSetup方法中判断data中的responseText中是否包含登录页面代码，当包含则视为session过期，弹出alert并跳转到登录页面
 */
/*$.ajaxSetup({
	contentType:"application/x-www-form-urlencoded;charset=utf-8",
	cache:false ,
	complete:function(XMLHttpRequest,textStatus){s
		var sessionState = XMLHttpRequest.getResponseHeader("sessionState");
		//对返回的数据data做判断
		if (XMLHttpRequest.responseText.indexOf("cas/login;jsessionid") != -1){
        	top.location = "${root}/index";
			return false;
		}else if (sessionState == "timeout" || XMLHttpRequest.responseText.indexOf("id=\"loginForm\"") != -1){
			top.location  = "${root}/index";
			return false;
		}
	}
});*/