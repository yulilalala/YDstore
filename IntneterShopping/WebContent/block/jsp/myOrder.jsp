<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>我的订单</title>
		<link rel="shortcut icon" href="../favicon.ico">
		<!--    normalize.css里面做css初始化 正对浏览器-->
		<link rel="stylesheet" href="../css/normalize.css">
		<!--    base里面只写公共样式  头部和底部样式-->
		<link rel="stylesheet" href="../css/base.css">
		<link rel="stylesheet" href="../css/myOrder.css" />
		<script type="text/javascript" src="../js/jquery-1.11.1.min.js"></script>
		<script type="text/javascript" src="../js/core.js"></script>
		<script type="text/javascript" src="../js/myOrder.js"></script>
	</head>

	<body>
		
		<%@ include file="../dome/shortcut.jsp" %>
		<!--个人信息导航开始-->
		
		<%@ include file="../dome/zy-header.jsp" %>
		<div class="w mo-main">
			
			<%@ include file="../dome/zy-menu.jsp" %>
			<div class="mo-fr">
				<!--标题-->
				<div class="mo-title">
					<h3>我的订单</h3>
				</div>

				<div class="ma">
					<div class="mt">
						<ul>
							<li><a class="cur" href=""><span>全部订单</span></a></li>
							<li><a href=""><span>待付款</span></a></li>
							<li><a href=""><span>待收货</span></a></li>
							<li><a href=""><span>待评价</span></a></li>
						</ul>
					</div>
					<div class="mc">
						<table border="0" cellspacing="" 0 cellpadding="0" class="td-void order-tb">
							<colgroup>
								<col class="number-col">
								<col class="consignee-col">
								<col class="amount-col">
								<col class="status-col">
								<col class="operate-col">
							</colgroup>
							<thead>
								<tr>
									<th>
										<div class="ordertime-cont">
											<div class="time-txt">近三个月订单<b></b><span class="blank"></span></div>
											<div class="time-list">
												<ul>
													<li><a href="#none" _val="1&amp;s=4096" clstag="click|keycount|orderlist|zuijinsangeyue"><b></b>近三个月订单</a></li>
													<li><a href="#none" _val="2&amp;s=4096" clstag="click|keycount|orderlist|jinniannei"><b></b>今年内订单</a></li>
													<li><a href="#none" _val="2017&amp;s=4096" clstag="click|keycount|orderlist|2017"><b></b>2017年订单</a></li>
													<li><a href="#none" _val="2016&amp;s=4096" clstag="click|keycount|orderlist|2016"><b></b>2016年订单</a></li>
													<li><a href="#none" _val="2015&amp;s=4096" clstag="click|keycount|orderlist|2015"><b></b>2015年订单</a></li>
													<li><a href="#none" _val="2014&amp;s=4096" clstag="click|keycount|orderlist|2014"><b></b>2014年订单</a></li>
													<li><a href="#none" _val="3&amp;s=4096" clstag="click|keycount|orderlist|before_2014"><b></b>2014年以前订单</a></li>
												</ul>
											</div>
										</div>
										<div class="order-detail-txt ac">订单详情</div>
									</th>
									<th>收货人</th>
									<th>金额</th>
									<th>
										<div class="deal-state-cont" id="orderState">
											<div class="state-txt">全部状态<b></b><span class="blank"></span></div>
											<div class="state-list">
												<ul>
													<li value="4096">
														<a href="#none" clstag="click|keycount|orderlist|quanbuzhuangtai" class="curr"><b></b>全部状态</a>
													</li>
													<li value="1">
														<a href="#none" clstag="click|keycount|orderlist|dengdaifukuan"><b></b>等待付款</a>
													</li>
													<li value="128" clstag="click|keycount|orderlist|dengdaishouhuo">
														<a href="#none"><b></b>等待收货</a>
													</li>
													<li value="1024">
														<a href="#none" clstag="click|keycount|orderlist|yiwancheng"><b></b>已完成</a>
													</li>
													<li value="-1">
														<a href="#none" clstag="click|keycount|orderlist|yiquxiao"><b></b>已取消</a>
													</li>
												</ul>
											</div>
										</div>
									</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody id="tb-81540826054">
								<tr class="sep-row">
									<td colspan="5"></td>
								</tr>
								<tr class="tr-th">
									<td colspan="5">
										<span class="gap"></span>
										<span class="dealtime" title="2018-10-31 11:08:13">2018-10-31 11:08:13</span>
										<input type="hidden" id="datasubmit-81540826054" value="2018-10-31 11:08:13">

										<span class="number">
               		                	订单号：
                	                	<a name="orderIdLinks" id="idUrl81540826054" target="_blank" href="//details.jd.com/normal/item.action?orderid=81540826054&amp;PassKey=2BAC1A8184D5E541B735C094C088DD3F" clstag="click|keycount|orderinfo|order_num">81540826054</a>
	                           			                </span>
										<div class="tr-operate">
											<span class="order-shop">
                            <a href="//mall.jd.com/index-205060.html" target="_blank" class="shop-txt venderName213704" clstag="click|keycount|orderlist|vender" title="匹克领投专卖店">匹克领投专卖店</a>
                            <a class="btn-im venderChat213704" href="//chat.jd.com/index.action?venderId=213704" target="_blank" title="联系卖家" clstag="click|keycount|orderinfo|chatim"></a>
                        </span>

											<span class="tel">
                            <i class="tel-icon venderTel213704" style="display: none;"></i>
                        </span>

											<a href="#none" clstag="click|keycount|orderlist|dingdanshanchu" class="order-del" _orderid="81540826054" _passkey="44AE03C3B826D6B64FF89E2D6CC7E08A" title="删除" style="display: none;"></a>

										</div>
									</td>
								</tr>

								<tr class="tr-bd" id="track81540826054" oty="22,4,70" cxl="0">
									<td>
										<div class="goods-item p-19924830079">
											<div class="p-img">
												<a href="//item.jd.com/19924830079.html" clstag="click|keycount|orderinfo|order_product" target="_blank">
													<img class="" src="//img10.360buyimg.com/N6/s60x60_jfs/t26695/349/2451356096/416694/f53a3c1a/5c01eb35Nbbeb76db.jpg" title="匹克男鞋运动鞋男2018轻便秋冬季跑步鞋子男士旅游休闲透气一体飞织学生慢跑鞋 1161 黑色/深灰 41" data-lazy-img="done" width="60" height="60">

												</a>
											</div>
											<div class="p-msg">
												<div class="p-name"><a href="//item.jd.com/19924830079.html" class="a-link" clstag="click|keycount|orderinfo|order_product" target="_blank" title="匹克男鞋运动鞋男2018轻便秋冬季跑步鞋子男士旅游休闲透气一体飞织学生慢跑鞋 1161 黑色/深灰 41">匹克男鞋运动鞋男2018轻便秋冬季跑步鞋子男士旅游休闲透气一体飞织学生慢跑鞋 1161 黑色/深灰 41</a></div>
												<div class="p-extra">
													<ul class="o-info">
														<li><span class="o-match J-o-match" data-sku="19924830079"><i></i><em>找搭配</em></span></li>
													</ul>
												</div>
											</div>
										</div>
										<div class="goods-number">
											x1
										</div>

										<div class="goods-repair">
											<a href="//myjd.jd.com/repair/ordersearchlist.action?searchString=81540826054" target="_blank" clstag="click|keycount|orderinfo|order_repair">
															申请售后
													 </a>
										</div>
										<div class="clr"></div>
									</td>

									<td rowspan="1">
										<div class="consignee tooltip">
											<span class="txt">郭鹏程</span><b></b>
											<div class="prompt-01 prompt-02" style="display: none;">
												<div class="pc">
													<strong>郭鹏程</strong>
													<p>江西萍乡市安源区城郊管委会萍安北大道211萍乡学院</p>
													<p>187****0015</p>
												</div>
												<div class="p-arrow p-arrow-left"></div>
											</div>
										</div>
									</td>
									<td rowspan="1">
										<div class="amount">
											<span>总额 ¥129.00</span> <br>
											<span class="ftx-13">在线支付</span>
										</div>
									</td>
									<td rowspan="1">
										<div class="status">
											<span class="order-status ftx-03">
                                            
            	已完成
            
                                        </span><br><a target="_blank" href="//vip.jd.com/myJingbean.html" class="ftx-01 bean-tips" data-tips="<div class='bean-tips-cont'>已返<span class='ftx-01'>12</span>京豆</div>"><i class="bean-icon"></i>+12</a>
											<br>

											<a href="//details.jd.com/normal/item.action?orderid=81540826054&amp;PassKey=2BAC1A8184D5E541B735C094C088DD3F" clstag="click|keycount|orderlist|dingdanxiangqing" target="_blank">订单详情</a>
										</div>
									</td>
									<td rowspan="1" id="operate81540826054">
										<div class="operate">

											<div id="pay-button-81540826054" _baina="0"></div>

											<a class="" target="_blank" href="//club.jd.com/JdVote/TradeComment.aspx?ruleid=81540826054&amp;ot=22&amp;payid=4&amp;shipmentid=70" clstag="click|keycount|orderinfo|product_comment">评价</a>|<a class="" clstag="click|keycount|orderinfo|product_show"
												href="//club.jd.com/mycomments.aspx?sort=1" target="_blank">晒单</a><br><a href="//cart.jd.com/reBuyForOrderCenter.action?wids=19924830079&amp;nums=1&amp;rid=1543731872900" class="btn-again btn-again-show" target="_blank" clstag="click|keycount|orderlist|buy"><b></b>
																									立即购买
																			</a><br>

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