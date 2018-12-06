<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../import.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>layui 测试</title>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">力控华康</div>
    
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
          小太爷
        </a>
        <dl class="layui-nav-child">
          <dd><a href="">基本资料</a></dd>
          <dd><a href="">安全设置</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a href="">退了</a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="left-tree">
        <li class="layui-nav-item">
          <a  href="javascript:;">搜索引擎</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:;" data-id="6" data-url="https://www.baidu.com/" data-title="百度">百度</a></dd>
            <dd><a href="javascript:;" data-id="7" data-url="http://cn.bing.com/" data-title="必应">必应</a></dd>
            <dd><a href="javascript:;" data-id="8" data-url="https://www.so.com/" data-title="360">360</a></dd>
            <dd><a href="javascript:;" data-id="9" data-url="https://www.sogou.com/" data-title="搜狗">搜狗</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item">
        	<a href="javascript:;" data-id="10" data-url="${path}/hello/layui/user" data-title="用户信息">用户信息</a>
        </li>
      </ul>
    </div>
  </div>
  
  <div class="layui-body">
    <!-- 内容主体区域 -->
    <div class="layui-tab" lay-filter="main_tab" lay-allowclose="true" >
                <ul class="layui-tab-title">
                </ul>
                <ul class="rightmenu" style="display: none;position: absolute;">
                    <li data-type="closethis">关闭当前</li>
                    <li data-type="closeall">关闭所有</li>
                </ul>
                <div class="layui-tab-content">
                </div>
     </div>
  </div>
  
  <div class="layui-footer">
    <!-- 底部固定区域 -->
     © 版权所有 © 2017 liufanfandev@163.com
  </div>
</div>
<script>
var element;
var $;

layui.use('element', function(){
  element = layui.element;
  $ = layui.jquery;
  
  element.on('nav(left-tree)', function(elem){
	  var dataid = $(elem);
	  var str = dataid.attr("data-url");
	  if ($(".layui-tab-title li[lay-id]").length <= 0) {
          //如果比零小，则直接打开新的tab项
          if(dataid.attr("data-url") !== undefined && dataid.attr("data-url") !== null){
        	  active.tabAdd(dataid.attr("data-url"), dataid.attr("data-id"),dataid.attr("data-title")); 
          }
         
      } else {
          //否则判断该tab项是否以及存在

          var isData = false; //初始化一个标志，为false说明未打开该tab项 为true则说明已有
          $.each($(".layui-tab-title li[lay-id]"), function () {
              //如果点击左侧菜单栏所传入的id 在右侧tab项中的lay-id属性可以找到，则说明该tab项已经打开
              if ($(this).attr("lay-id") == dataid.attr("data-id")) {
                  isData = true;
              }
          })
          if (isData == false) {
              //标志为false 新增一个tab项
              if(dataid.attr("data-url") !== undefined && dataid.attr("data-url") !== null){
              	active.tabAdd(dataid.attr("data-url"), dataid.attr("data-id"),dataid.attr("data-title"));
              }
          }
      }
      //最后不管是否新增tab，最后都转到要打开的选项页面上
      active.tabChange(dataid.attr("data-id"));
	});
  
  var active = {
	      //在这里给active绑定几项事件，后面可通过active调用这些事件
	      tabAdd: function(url,id,name) {
	          //新增一个Tab项 传入三个参数，分别对应其标题，tab页面的地址，还有一个规定的id，是标签中data-id的属性值
	          //关于tabAdd的方法所传入的参数可看layui的开发文档中基础方法部分
	          element.tabAdd('main_tab', {
	              title: name,
	              content: '<iframe data-frameid="'+id+'" scrolling="auto" frameborder="0" src="'+url+'" style="width:100%;height:99%;"></iframe>',
	              id: id //规定好的id
	          })
	           FrameWH();  //计算ifram层的大小
	      },
	      tabChange: function(id) {
	          //切换到指定Tab项
	          element.tabChange('main_tab', id); //根据传入的id传入到指定的tab项
	      }, 
	      tabDelete: function (id) {
	      element.tabDelete("main_tab", id);//删除
	      }
	      , tabDeleteAll: function (ids) {//删除所有
	          $.each(ids, function (i,item) {
	              element.tabDelete("main_tab", item); //ids是一个数组，里面存放了多个id，调用tabDelete方法分别删除
	          })
	      }
	  };
  
  
  function FrameWH() {
      var h = $(window).height() -41- 10 - 60 -10-44 -10;
      $("iframe").css("height",h+"px");
  }

  $(window).resize(function () {
      FrameWH();
  })
  
});
</script>
</body>
</html>