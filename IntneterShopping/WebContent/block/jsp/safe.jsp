<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<title>安全设置</title>
	<link rel="import" href="public.html">
	<link rel="shortcut icon" href="../favicon.ico">
	<!--    normalize.css里面做css初始化 正对浏览器-->
	<link rel="stylesheet" href="../css/normalize.css">
	<!--    base里面只写公共样式  头部和底部样式-->
	<link rel="stylesheet" href="../css/base.css">
	<link rel="stylesheet" href="../css/safe.css"/>
	<script type="text/javascript" src="../js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="../js/core.js"></script>
	<script type="text/javascript" src="../js/safe.js"></script>
</head>

<body>
	<%@ include file="../dome/shortcut.jsp" %>
	<div class="wrap s-header">

			<span>
				账号安全
			</span>
		</div>
		<div class="wrap">
			<div class="top-cont">
				<img class="icon-img" src="https://image.suning.cn/uimg/cmf/cust_headpic/0000000000_01_120x120.jpg">
				<div class="info-cont">
					<p class="para-one"><em>guopengcheng...</em></p>
					<p>绑定手机：<span>187****15</span></p>
					<p>绑定邮箱：<span class="color-red">未绑定</span></p>
				</div>
				<div class="login-info">
				</div>
			</div>
		</div>
		<div class="wrap-cont">
			<div class="wrap">
				<div class="main-wrap min-h600">
					<div class="main-cont clearfix">
						<ul class="entryList entryList2">
							<li>
								<i class="icon-basic icon-lock"></i>
								<p class="bold">忘记密码</p>
								<p class="btn-p">
									<span class="fl">若长时间未登录导致密码忘记，可验证身份后，重置密码。</span>
									<a name="asc_toolservice_forgetpsd" href="/asc/forgetpsw.do" class="entry-btn fr">立即申请</a>
								</p>
							</li>
							<li>
								<i class="icon-basic icon-pen"></i>
								<p class="bold">修改密码</p>
								<p class="btn-p">
									<span class="fl">定期更换登录密码，并保持密码强度为高，更有利于账号安全。</span>
									<a href="javascript:void 0" onclick="shouldPopLogin('/password/check.do')" name="asc_toolservice_changepsd" class="entry-btn fr">立即申请</a>
								</p>
							</li>
							<li>
								<i class="icon-basic icon-b-phone"></i>
								<p class="bold">修改手机号</p>
								<p class="btn-p">
									<span class="fl">绑定手机可用于手机登录、找回密码、货到付款、礼品卡绑定等服务。</span>
									<a href="javascript:void 0" onclick="shouldPopLogin('/mobile/check.do')" name="asc_toolservice_managemobile" class="entry-btn fr">立即申请</a>
								</p>
							</li>
							<li>
								<i class="icon-basic icon-b-mail"></i>
								<p class="bold">修改邮箱</p>
								<p class="btn-p">
									<span class="fl">绑定邮箱可用于邮箱登录、找回密码、优惠通知、消费信息订阅等服务。</span>
									<a href="javascript:void 0" onclick="shouldPopLogin('/email/check.do')" name="asc_toolservice_manageemail" class="entry-btn fr">立即申请</a>
								</p>
							</li>
							<li>
								<i class="icon-basic icon-b-question"></i>
								<p class="bold">设置安保问题</p>
								<p class="btn-p">
									<span class="fl">通过回答自己设置的问题来进行身份验证，从而保护您的账号安全。</span>
									<a href="javascript:void 0" onclick="shouldPopLogin('/securityquestion/check.do')" name="asc_toolservice_setseq" class="entry-btn fr">立即申请</a>
								</p>
							</li>
							<li>
								<i class="icon-basic icon-b-man"></i>
								<p class="bold">提交人工审核</p>
								<p class="btn-p">
									<span class="fl">手机、邮箱已停用，无法修改，可提交人工审核解决。</span>
									<a href="/asc/selfService/show.do" name="asc_toolservice_selfservice" class="entry-btn fr">提交审核</a>
								</p>
							</li>
							<!-- add by 17110387  20171208 -->
							<li>
								<i class="icon-basic icon-b-man" style="background: url(../image/logout-log.png) no-repeat;"></i>
								<p class="bold">注销账户</p>
								<p class="btn-p">
									<span class="fl">一旦注销成功，将无法找回，客官请慎重考虑。</span>
									<a name="asc_toolservice_logout" href="/asc/cancellation/cancellationreason.do" class="entry-btn fr">注销申请</a>
								</p>
							</li>
						</ul>

					</div>
				</div>
			</div>
		</div>
	
	
	
	<%@ include file="../dome/copyright.jsp" %>
</body>

</html>
