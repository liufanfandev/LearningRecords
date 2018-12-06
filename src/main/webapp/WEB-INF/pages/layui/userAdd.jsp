<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../import.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加用户</title>
</head>
<body>

<form class="layui-form " action="" style="margin-top:20px">
	<div class="layui-inline" style="vertical-align:middle;">
    	<label class="layui-form-label">用户姓名</label>
    	<div class="layui-input-inline">
      		<input type="text" name="name" id="name" autocomplete="off" placeholder="请输入用户姓名" class="layui-input">
    	</div>
    </div>
    <div class="layui-form-item" style="vertical-align:middle;">
    	<label class="layui-form-label">性别</label>
    	<div class="layui-input-block">
      		<input type="radio" name="sex" id="sex" value="男" title="男" checked="">
      		<input type="radio" name="sex" id="sex" value="女" title="女">
    	</div>
    </div>
    <div class="layui-inline" style="vertical-align:middle;">
      <label class="layui-form-label">年龄</label>
      <div class="layui-input-inline">
        <input type="text" name="age" id="age" autocomplete="off" placeholder="请输入用户姓名"  class="layui-input">
      </div>
    </div>
    <!-- <div class="layui-inline" style="vertical-align:middle;">
      <label class="layui-form-label">出生年月</label>
      <div class="layui-input-inline">
        <input type="text" name="date" id="birthDate"  placeholder="yyyy-MM-dd"  lay-verify="date" autocomplete="off" class="layui-input">
      </div>
    </div> -->
    
</form>
<script>

    var form;
    var $;
	layui.use(['form','laydate'],function(){
		form = layui.form;
		$ = layui.jquery;
		
	})
</script>
</body>
</html>