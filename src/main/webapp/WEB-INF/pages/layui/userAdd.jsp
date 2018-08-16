<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../import.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加用户</title>
</head>
<body>

<form class="layui-form" action="">
	<div class="layui-form-item">
    	<label class="layui-form-label">用户姓名</label>
    	<div class="layui-input-block">
      		<input type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请用户姓名" class="layui-input">
    	</div>
    </div>
    <div class="layui-form-item">
    	<label class="layui-form-label">性别</label>
    	<div class="layui-input-block">
      		<input type="radio" name="sex" value="男" title="男" checked="">
      		<input type="radio" name="sex" value="女" title="女">
    	</div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">出生年月</label>
      <div class="layui-input-inline">
        <input type="text" name="date" id="date" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
      </div>
    </div>
    
</form>

</body>
</html>