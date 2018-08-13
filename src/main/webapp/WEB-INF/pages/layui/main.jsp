<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../import.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>layui 测试</title>
</head>
<body>
	 <!-- 布局容器 -->
    <div class="layui-layout layui-layout-admin">
        <!-- 头部 -->
        <div class="layui-header">
            <div class="layui-main">
                <!-- logo -->
                <a href="/" style="color: #c2c2c2; font-size: 18px; line-height: 60px;">cms后台模板</a>
                <!-- 水平导航 -->
                <ul class="layui-nav" style="position: absolute; top: 0; right: 0; background: none;">
                    <li class="layui-nav-item">
                        <a href="javascript:;"> 进入前台</a>
                    </li>
                    <li class="layui-nav-item">
                        <a href="javascript:;"> 梦想星辰大海 </a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="javascript:;"> 个人信息</a>
                            </dd>
                            <dd>
                                <a href="javascript:;"> 修改密码</a>
                            </dd>
                            <dd>
                                <a href="javascript:;"> 退出登录</a>
                            </dd>
                        </dl>
                    </li>
                </ul>
            </div>
        </div>

        <!-- 侧边栏 -->
        <div class="layui-side layui-bg-black">
            <div class="layui-side-scroll">
                <ul class="layui-nav layui-nav-tree" lay-filter="left-nav" style="border-radius: 0;">
                </ul>
            </div>
        </div>

        <!-- 主体 -->
        <div class="layui-body">
            <!-- 顶部切换卡 -->
            <div class="layui-tab layui-tab-brief" lay-filter="top-tab" lay-allowClose="true" style="margin: 0;">
                <ul class="layui-tab-title"></ul>
                <div class="layui-tab-content"></div>
            </div>
        </div>

        <!-- 底部 -->
        <div class="layui-footer" style="text-align: center; line-height: 44px;">
            Copyright © 2017 <a href="http://www.kiscms.com" target="_blank">kiscms</a> Powered by 梦想星辰大海
        </div>
    </div>
	
 <script type="text/javascript">
        /**
         * 对layui进行全局配置
         */
        layui.config({
            base: '${pathView}/js/'
        });

        /**
         * 初始化整个cms骨架
         */
        layui.use(['cms'], function() {
            var cms = layui.cms('left-nav', 'top-tab');

            cms.addNav([
                {id: 1, pid: 0, node: '主页', url: 'main.html'},
                {id: 7, pid: 0, node: '登录', url: 'signin.html'},
                {id: 2, pid: 0, node: '搜索引擎', url: ''},
                {id: 3, pid: 2, node: '百度', url: 'https://www.baidu.com/'},
                {id: 4, pid: 2, node: '必应', url: 'http://cn.bing.com/'},
                {id: 5, pid: 2, node: '360', url: 'https://www.so.com/'},
                {id: 6, pid: 2, node: '搜狗', url: 'https://www.sogou.com/'},
            ], 0, 'id', 'pid', 'node', 'url');

            cms.bind(60 + 41 + 20 + 44); //头部高度 + 顶部切换卡标题高度 + 顶部切换卡内容padding + 底部高度

            cms.clickLI(0);
        });
    </script>
</body>
</html>