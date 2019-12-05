<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script type="text/javascript" src="../js/public.js"></script>
</head>
<body>
	 <!--个人信息导航栏开始-->
    <div class="zy-header">
			<div class="w">
			<div class="zy-logo">
				<h1>
					<a href="index.jsp"></a>
				</h1>
			</div>
			<div class="zy-nav">
				<ul>
					<li class="selected">
						<a href="myHome.jsp">首页</a>
						<i></i>
					</li>
					<li class="nav-manage">
						<a href="#">账户管理</a>
						<i class="nav-a"></i>
					</li>
					<li>
						<a href="">消息</a>
						<i></i>
					</li>
				</ul>
			</div>
				<div class="list-nav" style="display: none;">
					<!--<i class="nav-arrow"></i>-->
					<ul class="list-nav-ul">
						<li><a href="myMessage.jsp"><span>个人信息</span></a></li>
						<li><a href="">账号安全</a></li>
						<li><a href="address.jsp">收货地址</a></li>
						<li><a href="">账号绑定</a></li>
						<li><a href="">我的尺码</a></li>
	<!--								<li><a href=""></a></li>-->
					</ul>
				</div>
			</div>
		</div>
    <!--个人信息导航栏结束-->
</body>
</html>