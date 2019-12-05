<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>绑定管理</title>
		<link rel="import" href="public.html">
		<link rel="shortcut icon" href="../favicon.ico">
	    <!--    normalize.css里面做css初始化 正对浏览器-->
	    <link rel="stylesheet" href="../css/normalize.css">
	    <!--    base里面只写公共样式  头部和底部样式-->
	    <link rel="stylesheet" href="../css/base.css">
	    <link rel="stylesheet" href="../css/accountBind.css"/>
	    <script type="text/javascript" src="../js/jquery-1.11.1.min.js"></script>
    	<script type="text/javascript" src="../js/core.js"></script>
    	<script type="text/javascript" src="../js/accountBind.js"></script>
</head>
<body>
	<%@ include file="../dome/shortcut.jsp" %>
	<%@ include file="../dome/zy-header.jsp" %>
		<div class="w ab-mb">
			<%@ include file="../dome/mg-menu.jsp" %>
			<div class="ab-main">
				<div class="ma">
					<h3 class="ab-title">绑定管理</h3>
				</div>
				<div class="ab-com">
					<div class="ab-mc">
						<div class="content">
							<p id="weChatDiv" class="n-bind-title">
								<span class="gw">
									微信绑定账号
								</span>
								<span class="status">未绑定</span>
								<a class="toggle-btn">绑定</a>
							</p>
						</div>
						<div class="content">
							<p id="qqDiv" class="n-bind-title">
								<span class="gw">
									QQ绑定账号
								</span>
								<span class="status">已绑定</span>
								<a class="toggle-btn">解绑</a>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<%@ include file="../dome/copyright.jsp" %>
</body>
</html>