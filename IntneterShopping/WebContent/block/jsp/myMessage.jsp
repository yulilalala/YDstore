<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<!--<link rel="import" href="index.html">-->
		<link rel="import" href="public.html">
		<title>账户信息</title>
	    <link rel="shortcut icon" href="../favicon.ico">
	    <!--    normalize.css里面做css初始化 正对浏览器-->
	    <link rel="stylesheet" href="../css/normalize.css">
	    <!--    base里面只写公共样式  头部和底部样式-->
	    <link rel="stylesheet" href="../css/base.css">
	    <link rel="stylesheet" type="text/css" href="../css/myMessage.css"/>
	    <script type="text/javascript" src="../js/jquery-1.11.1.min.js"></script>
	    <script type="text/javascript" src="../js/core.js"></script>
	    <script type="text/javascript" src="../js/myMessage.js"></script>
</head>
<body>
	
		<%@ include file="../dome/shortcut.jsp" %>
		<%@ include file="../dome/zy-header.jsp" %>
		<div class="w mg-b">
			<%@ include file="../dome/mg-menu.jsp" %>
		<div class="mg-main">
			<div class="mg-title">
				<h3>个人信息</h3>
			</div>
			<div class="mg-com">
				<div class="user-profile">
					<div class="user-profile-wrap">
						
					</div>
				</div>
				<div class="form-list">
					<!--<form action="">-->
						<div class="control-group inp">
							<label for='name'><em>*</em>真实姓名：</label>
							<input type="text" name="" id="name" value="" maxlength="12"  />
							<!--姓名报错位-->
							<div class="nameErr" style="display: none;">
								<i class="error"></i>
								<span>请输入2-12个数字或英文</span>
							</div>
						</div>
						<div class="control-group inp">
							<label for="nickname">昵称：</label>
							<input type="text" name="" id="nickname" value="" maxlength="20"/>
							<div class="nicknameError" style="display: none;">
								<i class="error"></i>
								<!--昵称由中文、英文、数字、-和_组成-->
								<span>请输入正确的昵称</span>
							</div>
						</div>
						<div class="control-group clearfix">
							<label><em>*</em>性别：</label>
							<div class="controls" id="gender">
								<div class="sex-label">
									<input type="radio" name="sex" checked="checked" />
									<span>男</span>
								</div>
								<div class="sex-label"><input type="radio" name="sex"  /><span>女</span></div>
								<div class="sex-label"><input type="radio" name="sex" /><span>保密</span></div>
							</div>
						</div>
						<div class="control-group">
							<label>手机：</label>
							<div class="phone">
								<sapn>187******15</sapn>
								<a href="#">修改</a>
							</div>
						</div>
						<div class="control-group">
							<label>邮箱：</label>
							<div class="mail">
								<span>您还没有绑定邮箱</span>
								<a href="#" >立即绑定</a>
							</div>
						</div>
						<div class="control-group inp">
							<label>出生日期：</label>
							<div class="brithday">
								<input type="text" class="" name="" id="birthdate" value="请选择" />
								<i class="date-icons"></i>
								<i>-</i>
								<input id="constellation" type="text" class="text constellation" readonly="readonly" value="星座">
							</div>
							<div class="brithday-error" style="display: none;">
								<i></i>
								<span>准确完善您的生日有惊喜哦~</span>
							</div>
						</div>
						<div class="control-group">
							<label>
								<em>*</em>
								<span>居住地址：</span>
							</label>
							<div class="address">
								<div id="zhen" class="citySelect">
									<a href="javascript:void(0);" class="cityboxbtn">
										
									</a>
								</div>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">&nbsp;</label>
							<a href="#" class="mg-stand-btn1" >保存</a>
						</div>
					<!--</form>-->
				</div>
			</div>
		</div>
		</div>
		
		<%@ include file="../dome/copyright.jsp" %>
</body>
</html>