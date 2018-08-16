<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!-- springEL -->
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%
	String path = request.getContextPath();
	StringBuffer url = request.getRequestURL();
	String basePath = url.delete(url.length() - request.getRequestURI().length(), url.length()).append("/")
			.toString();
	String pathView = path + "/resources";
	//项目路径
	request.setAttribute("path", path);
	//全路径
	request.setAttribute("basePath", basePath);
	//资源文件路径
	request.setAttribute("pathView", pathView);
%>
<link type="text/css" rel="stylesheet" href="${pathView}/layui/css/layui.css" media="all"/>
<script type="text/javascript" src="${pathView}/layui/layui.js"></script>
<%-- <script type="text/javascript" src="${pathView}/jQuery/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="${pathView}/jQuery/jquery.json.min.js"></script>
<script type="text/javascript" src="${pathView}/jQuery/jQueryExt.js"></script> --%>
