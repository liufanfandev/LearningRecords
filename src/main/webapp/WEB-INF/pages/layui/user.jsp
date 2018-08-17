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

    <div class="btnSearch">
                   搜索姓名：
  		<div class="layui-inline">
    		<input class="layui-input" name="name" id="reloadUser" autocomplete="off">
  		</div>
  		<button class="layui-btn" data-type="reload">搜索</button>
	</div>
	<div class="layui-inline">
    		<button id="btnAddUser" class="layui-btn layui-bg-black" style="margin-top:20px;margin-left:10px">添加</button>
  	</div>
	
	<table class="layui-table" id="table_user" lay-filter="table_user"></table>
<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script>
var table;
var $;
var laypage;
var layer;
layui.use(['table','laypage','layer'], function(){
  table = layui.table;
  $ = layui.jquery;
  laypage = layui.laypage;
  layer = layui.layer;
  
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
        
       {field: 'id', title: 'ID', width:80,align:'center'}
      ,{field: 'name', title: '用户名', width:80,align:'center'}
      ,{field: 'sex', title: '性别', width:80,align:'center'}
      ,{field: 'age', title: '年龄', width:80,align:'center'} 
      ,{fixed: 'right', width:178, align:'center', toolbar: '#barDemo'}
      
    ]]
    
  });
  
  //添加用户信息
  $('#btnAddUser').on('click', function(){
	    layer.open({
	    	type:2
	    	,offset:'auto'
	    	,title:"添加用户信息"
	    	,area:['400px','260px']
	    	,id:"layerUserAdd"
	    	,content:'${path}/hello/layui/userAdd'
	    	,btn: ['确定', '取消']
	    	,btnAlign: 'c'
	    	,yes: function(index,layero){
	    		var child = layero.find("iframe")[0].contentWindow;
	    		var name = child.$("#name").val();
	    		var sex = child.$("[id='sex']:checked").val();
	    		var age = child.$("#age").val();
	    		$.ajax({
		             type: "POST",
		             url: "${path}/user",
		             data: {
		            	 name:name,
		            	 sex:sex,
		            	 age:age
		             },
		             dataType: "json",
		             success: function(result){
						if (result.code == 0) {
							layer.closeAll();
							layer.msg(result.msg);
							table.reload('table_user', {
								  url: '${path}/users/'
							});
						} else {
							layer.msg(result.msg);
						}
		             }
		         });
	    		
	    		
	        }
	        ,btn2: function(){
	          	layer.closeAll();
	        }
	        ,success:function(layero,index){
	        	
	        }
	    	
	    })
	  });
  
  	
  table.on('tool(table_user)', function(obj){
	    var data = obj.data;
	    
	    if(obj.event === 'edit'){//修改用户信息
	    	layer.open({
		    	type:2
		    	,offset:'auto'
		    	,title:"修改用户信息"
		    	,area:['400px','260px']
		    	,id:"layerUserAdd"
		    	,content:'${path}/hello/layui/userAdd'
		    	,btn: ['确定', '取消']
		    	,btnAlign: 'c'
		    	,yes: function(index,layero){
		    		var child = layero.find("iframe")[0].contentWindow;
		    		var name = child.$("#name").val();
		    		var sex = child.$("[id='sex']:checked").val();
		    		var age = child.$("#age").val();
		    		$.ajax({
			             type: "PUT",
			             url: "${path}/user",
			             data: {
			            	 id:data.id,
			            	 name:name,
			            	 sex:sex,
			            	 age:age
			             },
			             dataType: "json",
			             success: function(result){
							if (result.code == 0) {
								layer.closeAll();
								layer.msg(result.msg);
								table.reload('table_user', {
									  url: '${path}/users/'
								});
							} else {
								layer.msg(result.msg);
							}
			             }
			         })
		    		}
			         ,btn2: function(){
				          	layer.closeAll();
				        }
				        ,success:function(layero,index){
				        	var body = layer.getChildFrame('body', index);
				        	 body.find('#name').val(data.name);
				        	 body.find('#age').val(data.age);
				        	 body.find('#sex').val(data.sex);
				        }
		    	
	    	})
	    	
		  } else if(obj.event === 'del'){//删除用户信息
	      layer.confirm('真的删除行么', function(index){
	    	  
	    	  $.ajax({
		             type: "delete",
		             url: "${path}/user/"+data.id,
		             dataType: "json",
		             success: function(result){
		            	layer.closeAll();
						if (result.code == 0) {
							layer.msg(result.msg);
							table.reload('table_user', {
								  url: '${path}/users/'
							});
						} else {
							layer.msg(result.msg);
						}
		             }
		         });
	      });
	      } 
	 });
  	
  	
  	
  	
  
});
</script>
</body>
</html>