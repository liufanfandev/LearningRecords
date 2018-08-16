<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../import.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息列表</title>
<style>
.layui-table-cell .layui-form-checkbox[lay-skin="primary"]{
     top: 50%;
     transform: translateY(-50%);
}

</style>
</head>
<body>

    <div class="demoTable">
                   搜索ID：
  		<div class="layui-inline">
    		<input class="layui-input" name="name" id="reloadUser" autocomplete="off">
  		</div>
  		<button class="layui-btn" data-type="reload">搜索</button>
	</div>
	<div class="layui-inline">
    		<button id="btnAddUser" class="layui-btn layui-bg-black" style="margin-top:20px;margin-left:10px">添加</button>
  		</div>
	
	<table class="layui-table" id="table_user" "></table>
<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script>
var table;
var $;
var laypage;
layui.use(['table','laypage'], function(){
  table = layui.table;
  $ = layui.jquery;
  laypage = layui.laypage;
  
  //第一个实例
  table.render({
    elem: '#table_user'
    ,url: '${path}/users/' //数据接口
    ,async : true
    ,page: true
    ,initSort: {
        field: 'id' //排序字段，对应 cols 设定的各字段名
        ,type: 'desc' //排序方式  asc: 升序、desc: 降序、null: 默认排序
      }
    ,cols: [[ //表头
       {type:'checkbox'}
      ,{field: 'id', title: 'ID', width:80,align:'center'}
      ,{field: 'name', title: '用户名', width:80,align:'center'}
      ,{field: 'sex', title: '性别', width:80,align:'center'}
      ,{field: 'age', title: '年龄', width:80,align:'center'} 
      ,{fixed: 'right', width:178, align:'center', toolbar: '#barDemo'}
      
    ]]
    
  });
  
  
});
</script>
</body>
</html>