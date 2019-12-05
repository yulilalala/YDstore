<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>我的购物车</title>
		<link rel="import" href="index.html">
		<link rel="shortcut icon" href="../favicon.ico">
		<!--    normalize.css里面做css初始化 正对浏览器-->
		<link rel="stylesheet" href="../css/normalize.css">
		<!--    base里面只写公共样式  头部和底部样式-->
		<link rel="stylesheet" href="../css/base.css">
		<link rel="stylesheet" href="../css/myCart.css" />
		<script type="text/javascript" src="../js/jquery-1.11.1.min.js"></script>
		<script type="text/javascript" src="../js/core.js"></script>
		<script type="text/javascript" src="../js/myCart.js"></script>
</head>
<body>
	
		<%@ include file="../dome/shortcut.jsp" %>
		<div class="w cart-table-header">
			<div class="inner-box c6">
				<div class="th th-chk form th-chk-chkd">
					<div class="cart-checkbox cart-checkbox-checked">
						<input type="checkbox" id="chooseAllCheckBox" class="J-AllCheckBox" name="icart1_goods_all01">
						<label for="chooseAllCheckBox"></label>
					</div>全选
				</div>
				<div class="th th-item">商品信息</div>
				<div class="th th-specs">规格</div>
				<div class="th th-price">单价（元）</div>
				<div class="th th-amount">数量</div>
				<div class="th th-sum">小计（元）</div>
				<div class="th th-op">操作</div>
			</div>
		</div>
		<!--购物车商品展示-->
		<div class="w m-cart-body">
			<!--sku为store-0070176272商品展示-->
			<div class="m-store" id="store-0070176272">
				<div class="cart-list">
					<div class="item item-checked item-last item-specs-can">
						<div class="item-main clearfix">
							<div class="td td-chk form">
								<div class="cart-checkbox">
									<input type="checkbox" name="icart1_goods_sel" id="570425695596820200" value="" />
									<label for="570425695596820200"></label>
								</div>
							</div>
							<div class="td td-item">
								<div class="item-pic">
									<a href="//imgservice.suning.cn/uimg1/b2c/image/BRcL5VObGPmhZWOOb6d0WA==.jpg_100w_100h_4e" class="item-img-box tax-introduce tip-common-hover-fn-btn" name="icart1_goods_pic">
										<img src="//imgservice3.suning.cn/uimg1/b2c/image/2T5K6L_VKPOe_3I9Mtynww==.jpg_220w_220h_4e" alt="希捷(SEAGATE)酷鱼2.5英寸 1TB 5400转128M缓存7mm笔记本硬盘(ST1000LM048)">
									</a>
									<div class="hide" id="tax-tip-person570425695596820200">
										<div class="tax-tip">
											<img src="" alt="希捷(SEAGATE)酷鱼2.5英寸 1TB 5400转128M缓存7mm笔记本硬盘(ST1000LM048)">
										</div>
									</div>
								</div>
								<div class="item-info">
									<a href="//product.suning.com/0070176272/10512545015.html" target="_blank" class="item-title" name="icart1_goods_name">
                希捷(SEAGATE)酷鱼2.5英寸 1TB 5400转128M缓存7mm笔记本硬盘(ST1000LM048)</a>
								</div>
							</div>
							<div class="td td-specs">
								<div class="specs-line">
									<p title="【酷鱼】7mm笔记本硬盘">版本：【酷鱼】7mm笔记本硬盘</p>
								</div>
								<div class="specs-line">
									<p title="1T">容量：1T</p>
								</div>
								<div id="editSelect-000000010512545015-0070176272" class="hide">
									<div class="edit-select">
										<dl class="proinfo-buytype clearfix">
											<dt><span>版本</span></dt>
											<dd>
												<ul>
													<li name="icart1_prod_spggxl" title="【酷玩】7mm混合硬盘" cid="10002"><a href="javascript:void(0);">【酷玩】7mm混合硬盘<i></i></a></li>
													<li name="icart1_prod_spggxl" title="【酷鱼】7mm笔记本硬盘" class="selected" cid="10001"><a href="javascript:void(0);">【酷鱼】7mm笔记本硬盘<i></i></a></li>
												</ul>
											</dd>
										</dl>
										<dl class="proinfo-buytype clearfix">
											<dt><span>容量</span></dt>
											<dd>
												<ul>
													<li name="icart1_prod_spggxl" title="2T" cid="20003"><a href="javascript:void(0);">2T<i></i></a></li>
													<li name="icart1_prod_spggxl" title="1T" class="selected" cid="20002"><a href="javascript:void(0);">1T<i></i></a></li>
													<li name="icart1_prod_spggxl" title="500G" cid="20001"><a href="javascript:void(0);">500G<i></i></a></li>
												</ul>
											</dd>
										</dl>
										<div class="edit-btn">
											<a href="javascript:void(0);" itemno="570425695596820200" cmmdtycode="000000010512545015" shopcode="0070176272" class="edit-post edit-confirm" name="icart1_prod_change_confirm">确定</a>
											<a href="javascript:void(0);" class="edit-cancel" name="icart1_prod_change_cancel">取消</a>
										</div>
									</div>
								</div>
								<!--<div class="edit-box" style="height: 110px;"><a name="icart1_prod_change" href="javascript:void(0);" class="modify" data-placement="bottom" data-node="#editSelect">修改</a></div>-->
							</div>
							<div class="td td-price">
						        <div class="price-line">
						            <span class="price-now sn-price">
						                <i>¥</i>
						                <em>279.00</em>
						            </span>
						        </div>
    						</div>
							<div class="td td-amount">
						        <div class="item-amount">
						            <a href="javascript:;" class="minus no-minus" name="icart1_goods_numd">-</a>
						            <input type="text" name="icart1_goods_num_sr" class="ui-text text-amount" autocomplete="off" data-max="99" data-min="1" limitqtytype="1" itemno="570425695596820200" activitytype="01" value="1" id="570425695596820200-text-amount" maxlength="2">
						            <a href="javascript:;" class="plus" name="icart1_goods_numi">+</a>
						        </div>
						    </div>
							<div class="td td-sum">
						        <b class="sn-price">
						            <i>¥</i>
						            <em>279.00</em>
						        </b>
						    </div>
							<div class="td td-op" id="0000000105125450150070176272" >
						        <a href="javascript:;" class="add-fav tip-common-click-fn-btn" name="icart1_goods_col" >移入收藏</a>
						        <a href="javascript:;" class="del tip-common-click-fn-btn" data-tip-type="delOne" name="icart1_goods_delate">删除</a>
						        <p href="javascript:;" class="tip-look-alike " data-placement="bottom" id="alike-570425695596820200" data-clonenode="#alikePro-570425695596820200" style="display: none;">查找相似<i class="alike-arr"></i></p>
						        <div id="alikePro-570425695596820200" class="hide">
						            <div class="alike-container">
						                <div class="alike-prolist J-alike-pro">
						                    <a class="prev" href="javascript:void(0);"></a>
						                    <a class="next" href="javascript:void(0);"></a>
						                    <div class="list-container">
						                        <ul class="list-box">
						                        </ul>
						                    </div>
						                </div>
						            </div>
						        </div>
						    </div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--结算-->
		<div class="w cart-toolbar-box">
			<div class="cart-toolbar rel clearfix">
				<div class="l-column l form rel" id="cart-toolbar-opt">
				   <div class="cart-checkbox cart-checkbox-checked">
						<input name="icart1_ope_all" type="checkbox" id="chooseAllCheckBox2" class="J-AllCheckBox">
						<label for="chooseAllCheckBox2" class="mr10 clearfix"><i class="icon l"></i><span class="l">全选</span></label>
					</div>
					 <a href="javascript:;" class="del-selected ml20 tip-common-click-fn-btn" data-placement="top" data-tip-type="delSelect" data-wrapper=".l-column" name="icart1_jsl_scxzsp_click">删除选中商品</a>
		            <a href="javascript:;" class="del-fail ml20 tip-common-click-fn-btn" data-placement="top" data-tip-type="delFail" data-wrapper=".l-column" name="icart1_jsl_scsxsp_click" style="display: none;">删除失效商品</a>
				</div>
				<!--右侧-->
			<div class="r-column r  clearfix">
		        <div class="cart-collect fl">
		            <!-- 1115 dom结构变化  -->
		            <!-- 总价 -->
		            <div class="cart-total-price clearfix">
		                <div class="split"></div>
		                <div class="sn-sum-price rel">
		                    <p class="cart-sum-price"><span id="totalName">总价（含运费）：</span><b class="sn-price price-color"><i>¥</i><em id="cart1PayAmount">308.90</em></b></p>
		                    <p class="cart-extra-price hide">
		                        <span>运费<em class="plus">+</em>税费<span>（以结算页为准）</span>：</span>
		                        <span class="sn-price"><i>¥</i><em>0.00</em></span>
		                        <em class="plus">+</em>
		                        <span class="sn-price"><i>¥</i><em>0.00</em></span>
		                    </p>
		                    <p class="cart-extra-price">
		                        运费（以结算页为准）：<span class="sn-price"><i>¥</i><em>0.00</em></span>
		                    </p>
		                </div>
		            </div>
		            <!-- 已选优惠模块 -->
		            <div class="save-ship">
		                <!-- 已选商品 为您节省-->
		                <div class="selected-prods clearfix">
		                    <!-- 为您节省-->
		                    <p class="cart-sub-total fr mr20">已享满减：<span class="sn-price"><i>-¥</i><em>0.00</em></span></p>
		                    <div class="alchose rel">
		                        <a name="icart1_yxsp_change_cancel" href="javascript:void(0);" class="now-select-goods" data-placement="top" data-node="#selected-pro" data-wrapper=".alchose">已选商品 <b class="c-f70 ff-tahoma price-color">2</b>件<span class="alchose-span alchose-up"></span></a>
		                        <div id="selected-pro" class="hide">
		                            <div class="had-buy">
		                                <div class="ui-had-buy J-selected-pro">
		                                    <a class="prev" href="javascript:void(0);"></a>
		                                    <a class="next" href="javascript:void(0);"></a>
		                                    <div class="list-container">
		                                        <ul class="list-box">
		                                            <li class="list">
		                                                <a href="//product.suning.com/0070176272/10512545015.html" target="_blank">
		                                                    <img src="//imgservice.suning.cn/uimg1/b2c/image/BRcL5VObGPmhZWOOb6d0WA==.jpg_160w_160h_4e" alt="希捷(SEAGATE)酷鱼2.5英寸 1TB 5400转128M缓存7mm笔记本硬盘(ST1000LM048)">
		                                                    <span class="num">1件</span>
		                                                </a>
		                                            </li>
		                                            <li class="list">
		                                                <a href="//product.suning.com/0070068915/125907191.html" target="_blank">
		                                                    <img src="//imgservice.suning.cn/uimg1/b2c/image/4eTs9Sx3AKoQXMSs4_59kg==.jpg_160w_160h_4e" alt="【南国食品_香脆椰子片360g】海南特产 办公室零食碳烤椰肉片食品休闲小吃">
		                                                    <span class="num">1件</span>
		                                                </a>
		                                            </li>
		                                        </ul>
		                                    </div>
		                                </div>
		                            </div>
		                        </div>
		                    </div>
		                </div>
		                <!--  车一自动用券  919 -->
		                <div class="coupon-autouse rel hide" style="display: none;">
		                    <span class="front">
		                        （</span><a href="javascript:void(0);" class="now-select-coupon" data-placement="top" data-node="#autouse" data-wrapper=".coupon-autouse">
		                        <span class="mr5 c-f60 discount-detail hide" title="" id="bestNum_auto"></span>
		                        <span class="sn-price hide" title="" id="coupTotal_auto">-<i>¥</i><em></em></span>
		                        <span class="mr5 hide" id="tipMsg_auto"></span>
		                        <span class="alchose-span alchose-up"></span>
		                    </a> <span class="back">)</span>
		                    <div id="autouse" class="hide">
		                        <div class="coupon-autouse-list">
		                            <div class="content-box">
		                                <div class="content-box-inner">
		
		                                    <!--  可用券-->
		                                    <!-- 不可用券列表（互斥券，不可用券）-->
		                                    <div class="content-box-unavailable">
		                                        <div class="content-title c3">不可用优惠券
		                                        </div>
		                                        <div class="item ">
		                                            <span class="sn-price">
		                                                <i>¥</i><em>60</em>
		                                            </span>
		                                            <div class="coupon-info">
		                                                <p class="coupon-use"><em title="满199用60">满199用60</em>
		                                                </p>
		                                                <p class="coupon-date">有效期至：11-12 23:59</p>
		                                                <p class="pro-not-in">
		                                                    该券将于2018-11-10 00:00生效
		                                                </p>
		                                            </div>
		                                            <div class="coupon-rule" title="限平台服饰百货品类部分商品使用">
		                                                <span class="c-f60">[易券]</span>限平台服饰百货品类部分商品使用
		                                            </div>
		
		                                        </div>
		                                        <div class="item ">
		                                            <span class="sn-price">
		                                                <i>¥</i><em>20</em>
		                                            </span>
		                                            <div class="coupon-info">
		                                                <p class="coupon-use"><em title="满1000用20">满1000用20</em>
		                                                    <span class="coupon-flag coupon-flag-lastday">即将过期</span>
		                                                </p>
		                                                <p class="coupon-date">有效期至：11-11 23:59</p>
		                                                <p class="pro-not-in">
		                                                    所选商品不在优惠券使用范围
		                                                </p>
		                                            </div>
		                                            <div class="coupon-rule" title="限自营黑电品类部分商品使用">
		                                                <span class="c-f60">[云券]</span>限自营黑电品类部分商品使用
		                                            </div>
		
		                                        </div>
		                                    </div>
		                                    <!-- 不可用券列表（互斥券，不可用券） 结束-->
		                                </div>
		                            </div>
		                        </div>
		                    </div>
		                </div>
		            </div>
		        </div>
		        <div class="cart-checkout l">
		            <a class="checkout cart-btn checkout-disable-tip" href="javascript:void(0)" name="icart1_ope_buy01"><b></b>去结算</a>
		        </div>
		    </div>
			</div>
			
		</div>
		<%@ include  file="../dome/copyright.jsp" %>
</body>
</html>