<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>评价晒单</title>
	<link rel="shortcut icon" href="../favicon.ico">
	<!--    normalize.css里面做css初始化 正对浏览器-->
	<link rel="stylesheet" href="../css/normalize.css">
	<!--    base里面只写公共样式  头部和底部样式-->
	<link rel="stylesheet" href="../css/base.css">
	<link rel="stylesheet" href="../css/evaluate.css"/>
	<script type="text/javascript" src="../js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="../js/core.js"></script>
	<script type="text/javascript" src="../js/evaluate.js"></script>
</head>
<body>
		<%@ include file="../dome/shortcut.jsp" %>
		<!--个人信息导航开始-->
		<%@ include file="../dome/zy-header.jsp" %>
		
		<div class="w ev-b">
			<%@ include file="../dome/zy-menu.jsp" %>
			<div class="ev-fr">
				<div class="ev-a">
					<div class="ev-title">
						<span>评价晒单</span>
					</div>
				</div>
				<div class="ev-c">
					<div class="ev-mc">
						<div class="m-tab">
								<ul class="tab-trigger">
									<li clstag="pageclick|keycount|201611254|3" class="trig-item trig-curr"><a class="text" href="?sort=0">待评价订单</a>
	                                        <b class="sup">10</b>
									</li>
									<li clstag="pageclick|keycount|201611254|4" class="trig-item"><a href="?sort=1" class="text">待晒单</a>
									</li>
									<li clstag="pageclick|keycount|201611254|5" class="trig-item"><a href="?sort=3" class="text">待追评</a>
									</li>
	                                <li clstag="pageclick|keycount|fuwupingjia_201703297|1" class="trig-item"><a href="?sort=4" class="text">服务评价</a>
	                                        <b class="sup">10</b>
	                                </li>
									<li clstag="pageclick|keycount|201611254|6" class="trig-item"><a href="?sort=2" class="text">已评价</a>
									</li>
								</ul>
						</div>
					</div>
					<div class="ev-mt">
						<table class="td-void order-tb" border="0" cellspacing="0" cellpadding="0">
							<colgroup>
								<col class="number-col">
								<col class="consignee-col">
								<col class="amount-col">
								<col class="operate-col">
							</colgroup>
							<thead>
								<tr>
									<th>订单详情</th>
									<th>收货人</th>
									<th>金额</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<tr class="sep-row"><td colspan="4"></td></tr>
								<tr class="tr-th">
									<td colspan="4">
										<span class="gap"></span>
										<span class="dealtime" title="2015-1-19 10:30:42">2018-10-31 11:08:13</span>
										<span class="number">订单号：<a href="//details.jd.com/normal/item.action?orderid=81540826054&amp;PassKey=2BAC1A8184D5E541B735C094C088DD3F" target="_blank">81540826054</a></span>
										<div class="tr-operate">
											<a href="#none" class="order-del">删除</a>
										</div>
									</td>
								</tr>
						
						
								<tr class="tr-bd">
									<td>
										<div class="goods-item">
											<div class="p-img">
												<a target="_blank" href="//item.jd.com/19924830079.html">
													<img src="//img30.360buyimg.com/N6/s60x60_jfs/t11461/287/1897266539/449828/fe2ad5a8/5a0b0bc3N054561c8.jpg" alt="">
												</a>
											</div>
											<div class="p-msg">
												<div class="p-name">
													<a target="_blank" href="//item.jd.com/19924830079.html">匹克男鞋运动鞋男2018轻便秋冬季跑步鞋子男士旅游休闲透气一体飞织学生慢跑鞋 1161 黑色/深灰 41</a>
												</div>
											</div>
										</div>
										<div class="goods-number">
												x1
										</div>
										<div class="clr"></div>
									</td>
									<td rowspan="1">
										<div class="consignee">
											<span class="txt">郭鹏程</span><b></b>
										</div>
									</td>
									<td rowspan="1">
										<div class="amount">
										<span>
												支付金额 ￥129.00
										</span>
										</div>
									</td>
									<td rowspan="1">
										<div class="operate">
											<a href="//details.jd.com/normal/item.action?orderid=81540826054&amp;PassKey=2BAC1A8184D5E541B735C094C088DD3F" target="_blank" class="a-link">订单详情</a><br>
											<a clstag="pageclick|keycount|daipingjia_pingjia_201605191|1" href="//club.jd.com/myJdcomments/orderVoucher.action?ruleid=81540826054" target="_blank" class="btn-def">评价</a>
										</div>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
		<%@ include file="../dome/copyright.jsp" %>
</body>
</html>