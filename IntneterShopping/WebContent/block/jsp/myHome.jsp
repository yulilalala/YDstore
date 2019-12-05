<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>我的主页</title>
		<link rel="shortcut icon" href="../favicon.ico">
	    <!--    normalize.css里面做css初始化 正对浏览器-->
	    <link rel="stylesheet" href="../css/normalize.css">
	    <!--    base里面只写公共样式  头部和底部样式-->
	    <link rel="stylesheet" href="../css/base.css">
	    <link rel="stylesheet" href="../css/myHome.css"/>
	    <script type="text/javascript" src="../js/jquery-1.11.1.min.js"></script>
    	<script type="text/javascript" src="../js/core.js"></script>
    	<script type="text/javascript" src="../js/myHome.js"></script>
</head>
<body>
	
		<%@ include file="../dome/shortcut.jsp" %>
		<!--个人信息导航开始-->
		
		<%@ include file="../dome/zy-header.jsp" %>
		<!--个人信息导航结束-->
		<!--左侧菜单开始-->
		<div class="w h-left">
			
		<%@ include file="../dome/zy-menu.jsp" %>
			<div class="zy-main">
				<div class="zy-title">
					<div class="zy-head">
						<a href="#"><img src="../image/0000000000_01.jpg" alt="" /></a>
					</div>
					<div class="zy-block">
						<div class="user-name">郭鹏程</div>
						<div class="safe">
							
						</div>
						<div class="address">
							<span><a href="address.html" target="_blank">我的收货地址 ></a></span>
						</div>
					</div>
				</div>
				<!--<div class="zy-myBag">
					<div class="mb">
						<h3>我的钱包</h3>
					</div>
					<div class="mc">
						<ul>
							<li><a href="">1</a></li>
							<li></li>
						</ul>
					</div>
				</div>-->
				<div class="zy-order">
					<div class="zy-h">
						<h3>我的订单</h3>
					</div>
					<div class="zy-mc">
						<div class="nav">
							<a href="myOrder.html" class="item item1">
								<div class="lrc-badge icon-sprite"></div>
								<span>待付款</span>
							</a>
							<a href="myOrder.html" class="item item2"><div class="lrc-badge icon-sprite"></div><span>待收货</span></a>
							<a href="myOrder.html" class="item item3"><div class="lrc-badge icon-sprite"></div><span>待评价</span></a>
							<a href="myOrder.html" class="item item4"><div class="lrc-badge icon-sprite"></div><span>退换/售后</span></a>
							<a href="myOrder.html" class="item item5"><div class="lrc-badge icon-sprite"></div><span>全部订单</span></a>
						</div>
					</div>
				</div>
				<div class="zy-list">
					<ul>
						<li class="item">
							<a href=""><img src="" alt="" /></a>
						</li>
						<li></li>
					</ul>
				</div>
			</div>
		</div>
		<%@ include file="../dome/copyright.jsp" %>
</body>
</html>