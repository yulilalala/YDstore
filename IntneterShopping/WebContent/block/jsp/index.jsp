<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>亿点商城(YD.COM)-正品低价、品质保障、配送及时、轻松购物！</title>
    <!--    网站说明-->
    <meta name="description" content="亿点商城-专业的综合网上购物商城,销售家电、数码通讯、电脑、家居百货、服装服饰、母婴、图书、食品等数万个品牌优质商品.便捷、诚信的服务，为您提供愉悦的网上购物体验!">
    <!--    网站关键字-->
    <meta name="Keywords" content="网上购物,网上商城,手机,笔记本,电脑,MP3,CD,VCD,DV,相机,数码,配件,手表,存储卡,亿点">
    <link rel="shortcut icon" href="../favicon.ico">
    <!--    normalize.css里面做css初始化 正对浏览器-->
    <link rel="stylesheet" href="../css/normalize.css">
    <!--    base里面只写公共样式  头部和底部样式-->
    <link rel="stylesheet" href="../css/base.css">
    <link rel="stylesheet" href="../css/index.css">
    <!--    网站首页的css 只写首页的 独有的-->
    <script type="text/javascript" src="../js/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="../js/core.js"></script>
    <script type="text/javascript" src="../js/index.js"></script>
    <script type="application/javascript" src="../js/jquery.cookie.js"></script>
</head>
<body>
<!--顶部开始-->
    <div class="J_event">
        <a href="" class="w J_event_img">
            <img src="../image/top.jpg" alt="">
        </a>
        <a href="javascript:void(0);" class="J_event_close" alt="关闭"></a>
    </div>
    <!--    顶部结束-->
    <%@ include file="../dome/shortcut.jsp" %>
   <%@ include file="../dome/header.jsp" %>
    <!--    main开始-->
    <div class="jd">
        <div class="w jd-inner">
            <div class="classification">
                <ul class="index-list">
                    <li>
                    	<i></i>
                    	<a href="#">手机</a>
                    	<span>/</span>
                    	<a href="#">运营商</a>
                    	<span>/</span>
                    	<a href="#">数码</a>
                    </li>
                    <li>
                        <a href="">电视</a>
                        <span>/</span>
                        <a href="">冰箱</a>
                        <span>/</span>
                        <a href="">空调</a>
                        <span>/</span>
                        <a href="">洗衣机</a>
                    </li>
                    <li>
                        <a href="">厨卫大电</a>
                        <span>/</span>
                        <a href="">生活家电</a>
                        <span>/</span>
                        <a href="">厨具</a>
                    </li>
                    <li>
                        <a href="">电脑办公</a>
                        <span>/</span>
                        <a href="">相机</a>
                        <span>/</span>
                        <a href="">DIY</a>
                    </li>

                    <li>
                        <a href="">家居</a>
                        <span>/</span>
                        <a href="">家具</a>
                        <span>/</span>
                        <a href="">家装</a>
                        <span>/</span>
                        <a href="">家纺</a>
                    </li>
                    <li>
                        <a href="">食品</a>
                        <span>/</span>
                        <a href="">酒水</a>
                        <span>/</span>
                        <a href="">生鲜</a>
                        <span>/</span>
                        <a href="">特产</a>
                    </li>
                    <li>
                        <a href="">美妆</a>
                        <span>/</span>
                        <a href="">个护清洁</a>
                        <span>/</span>
                        <a href="">宠物</a>
                    </li>

                    <li>
                        <a href="">母婴</a>
                        <span>/</span>
                        <a href="">玩具</a>
                        <span>/</span>
                        <a href="">车床</a>
                        <span>/</span>
                        <a href="">童装</a>
                    </li>
                    <li>
                        <a href="">运动</a>
                        <span>/</span>
                        <a href="">户外</a>
                        <span>/</span>
                        <a href="">足球</a>
                        <span>/</span>
                        <a href="">跑步机</a>
                    </li>
                    <li>
                        <a href="">男装</a>
                        <span>/</span>
                        <a href="">女装</a>
                        <span>/</span>
                        <a href="">内衣</a>
                    </li>
                    <li>
                        <a href="">鞋靴</a>
                        <span>/</span>
                        <a href="">箱包</a>
                        <span>/</span>
                        <a href="">钟表</a>
                        <span>/</span>
                        <a href="">珠宝</a>
                    </li>
                    <li>
                        <a href="">汽摩</a>
                        <span>/</span>
                        <a href="">二手车</a>
                        <span>/</span>
                        <a href="">汽车用品</a>
                    </li>
                    <li>
                        <a href="">图书</a>
                        <span>/</span>
                        <a href="">童书</a>
                        <span>/</span>
                        <a href="">教辅教材</a>
                    </li>
                    <li>
                        <a href="">理财</a>
                        <span>/</span>
                        <a href="">分期</a>
                        <span>/</span>
                        <a href="">保险</a>
                        <span>/</span>
                        <a href="">房产</a>
                    </li>
                </ul>
            </div>
            <div class="ng-sort-detail" style="width: 0;">
        		
    		</div>
            
            <!--轮播图-->
            <div class="jd-col2">
                <div class="jd-col2-hd">
                    <div class="arrow">
                        <a href="javascript:void(0)" class="arr-l"></a>
                        <a href="javascript:void(0)" class="arr-r"></a>
                    </div>

                    <ol class="page">
                        <li class="page-item current">0</li>
                        <li class="page-item">1</li>
                        <li class="page-item">2</li>
                        <li class="page-item">3</li>
                        <li class="page-item">4</li>
                        <li class="page-item">5</li>
                        <li class="page-item">6</li>
                        <li class="page-item">7</li>
                    </ol>
				<div class="banner-wrapper">
                    <ul class="banner">
                        <li style="display: block;"><a href=""><img src="../image/index/154017965225855310.jpg" alt=""></a></li>
                        <li style="display: none;"><a href=""><img src="../image/index/154017982227927837.jpg" alt=""></a></li>
                        <li style="display: none;"><a href=""><img src="../image/index/154020185124831932.jpg" alt=""></a></li>
                        <li style="display: none;"><a href=""><img src="../image/index/154028630645720765.png" alt=""></a></li>
                        <li style="display: none;"><a href=""><img src="../image/index/154034512503331456.jpg" alt=""></a></li>
                        <li style="display: none;"><a href=""><img src="../image/index/17a89d5737be44c6b06a9c3ca8da2440.jpg" alt=""></a></li>
                        <li style="display: none;"><a href=""><img src="../image/index/17a89d5737be44c6b06a9c3ca8da2440.jpg" alt=""></a></li>
                    </ul>
				</div>
                </div>
                <!--<div class="jd-col2-bd">
                    <div class="firstPic">
                        <img src="../image/pic1.jpg" alt="">
                    </div>
                    <div><img src="../image/pic2.jpg" alt=""></div>
                </div>-->
            </div>
            <div class="jd-col3">
                <div class="user">
                    <div class="user-info">
                        Hi~你好！<br />
                        <a href="../html/login.html">登录</a>
                        <a href="../html/register.html">注册</a>
                        <a href="myHome.html" class="info-img">
                            <img src="../image/no_login.jpg" alt="">
                        </a>
                    </div>
                    <div class="user-profit">
                        <a href="">新人福利</a>
                        <a href="s">PULS会员</a>
                    </div>
                </div>
                <div class="news">
                    <div class="tab-hd">
                        <a href="javascript:;" class="live cuxiao">促销</a>
                        <a href="javascript:;" class="live">公告</a>
                        <a href="#" class="more1">更多</a>
                        <div class="line"></div>
                    </div>
                    <div class="tab-bd">
                        <ul>
                            <li><a href="">抢666元笔记本神券</a></li>
                            <li><a href="">惠普星13撞色轻薄本新品首发</a></li>
                            <li><a href="">爆款好物0元试用</a></li>
                            <li><a href="">天际厨电感恩专场豪礼免费拿</a></li>
                        </ul>
                        <!--
<ul>
    <li><a href="">抢666元笔记本神券</a></li>
    <li><a href="">惠普星13撞色轻薄本新品首发</a></li>
    <li><a href="">爆款好物0元试用</a></li>
    <li><a href="">天际厨电感恩专场豪礼免费拿</a></li>
</ul>
-->
                    </div>
                </div>
                <div class="jd-service">
                    <ul>
                        <li><a href=""><i></i>
                                <p>话费</p>
                            </a></li>
                        <li><a href=""></a></li>
                        <li><a href=""></a></li>
                        <li><a href=""></a></li>
                        <li><a href=""></a></li>
                        <li><a href=""></a></li>
                        <li><a href=""></a></li>
                        <li><a href=""></a></li>
                        <li><a href=""></a></li>
                        <li><a href=""></a></li>
                        <li><a href=""></a></li>
                        <li><a href=""></a></li>
                    </ul>
                </div>
            </div>

        </div>
        <!--        广告结束-->
        <div class="ad">
            <a href="#"></a>
        </div>
    </div>
    <!--    main结束-->
    <!--中部商品显示-->
    <!--一体楼层-->
    <!--
		  @author: guo
		  @name: index
		  @date: home
		  @description: 一楼
		-->
	<div class="w floor com-floor floorTwo">
			<div class="floor-l left-floor g-floor g-floor2" style="border-color: #3299cc">
				<div class="title" style="background:#eff7fb;">
					<div class="title-name" style="background: #3299cc;">
						<p class="name">智能数码</p>
						<!--<div class="code-wrapper">
							<div class="code">
								<span></span>
								<img src="//res.suning.cn/public/v3/images/blank.gif" class="lazy-loading">
							</div>
						</div>-->
					</div>
					<!--<div class="keyword clearfix">
						<a href="https://list.suning.com/0-420086-0-0-0-0-0-0-0-0-12121a1296940.html#search-path-box" name="index3_homepage1_99355913098_word01" cms-name="index3_homepage1_99355913098_word01" target="_blank">平衡车</a>
						<a href="https://list.suning.com/0-20064-0-0-0-0.html" name="index3_homepage1_99355913098_word02" cms-name="index3_homepage1_99355913098_word02" target="_blank">单反相机</a>
						<a href="https://pindao.suning.com/city/zhinengshuma.html" name="index3_homepage1_99355913098_word03" cms-name="index3_homepage1_99355913098_word03" target="_blank">智能频道</a>
						<a href="https://pindao.suning.com/city/shuma.htm" name="index3_homepage1_99355913098_word04" cms-name="index3_homepage1_99355913098_word04" target="_blank">相机频道</a>
					</div>-->
				</div>
				<div class="content">
					<div class="left-img">
						<img alt="智能狂欢" class="lazy-loading" src="//image5.suning.cn/uimg/cms/img/154115044928835039.jpg">
						<div class="cover" style="background: #3299cc;"></div>
						<p class="img-name">智能狂欢</p>
						<p class="img-desc">爆款直降1000</p>
						<a href="https://pindao.suning.com/city/zhinengshuma.html" target="_blank" name="index3_homepage1_99355913099_pic01" cms-name="index3_homepage1_99355913099_pic01"></a>
					</div>
					<ul class="img-list clearfix">
						<li style="display: list-item;">
							<a href="https://cuxiao.suning.com/sm181102xj.html" target="_blank" name="index3_homepage1_99355913100_pic01" cms-name="index3_homepage1_99355913100_pic01">
								<p class="img-name">相机狂欢</p>
								<p class="img-desc" style="color: #3299cc;">定金1元抵200元</p>
								<img src="//image5.suning.cn/uimg/cms/img/154115788605988278.png" class="lazy-loading">
							</a>
						</li>
						<li style="display: list-item;">
							<a href="https://cuxiao.suning.com/sm181102zn.html" target="_blank" name="index3_homepage1_99355913100_pic02" cms-name="index3_homepage1_99355913100_pic02">
								<p class="img-name">智能盛典</p>
								<p class="img-desc" style="color: #3299cc;">2件8折 3件7折</p>
								<img src="//image1.suning.cn/uimg/cms/img/154115794087032217.jpg" class="lazy-loading">
							</a>
						</li>
						<li style="display: list-item;">
							<a href="https://cuxiao.suning.com/sm181019yy.html" target="_blank" name="index3_homepage1_99355913100_pic03" cms-name="index3_homepage1_99355913100_pic03">
								<p class="img-name">音乐狂欢节</p>
								<p class="img-desc" style="color: #3299cc;">疯抢1111神券</p>
								<img src="//image1.suning.cn/uimg/cms/img/154115799146447816.jpg" class="lazy-loading">
							</a>
						</li>
						<li style="display: list-item;">
							<a href="https://cuxiao.suning.com/sm002021.html" target="_blank" name="index3_homepage1_99355913100_pic04" cms-name="index3_homepage1_99355913100_pic04">
								<p class="img-name">尼康钜惠</p>
								<p class="img-desc" style="color: #3299cc;">领券减199元</p>
								<img src="//image3.suning.cn/uimg/cms/img/154115807246418656.jpg" class="lazy-loading">
							</a>
						</li>
					</ul>
				</div>
				<div class="bottom-list">
					<ul>
						<li class="first" style="display: list-item;">
							<a href="https://djsmzyd.suning.com/" target="_blank" name="index3_homepage1_99355913101_pic01" cms-name="index3_homepage1_99355913101_pic01">
								<p class="img-name">金秋出游</p>
								<p class="img-desc" style="color: #3299cc;">满999减100</p>
								<img src="//image1.suning.cn/uimg/cms/img/153965723690072894.jpg" class="lazy-loading">
							</a>
						</li>
						<li style="display: list-item;">
							<a href="https://crazybaby.suning.com/" target="_blank" name="index3_homepage1_99355913101_pic02" cms-name="index3_homepage1_99355913101_pic02">
								<p class="img-name">crazybaby</p>
								<p class="img-desc" style="color: #3299cc;">低至6.2折</p>
								<img src="//image3.suning.cn/uimg/cms/img/153675391918037494.jpg" class="lazy-loading">
							</a>
						</li>
						<li style="display: list-item;">
							<a href="https://cuxiao.suning.com/sm001921.html" target="_blank" name="index3_homepage1_99355913101_pic03" cms-name="index3_homepage1_99355913101_pic03">
								<p class="img-name">3C配件</p>
								<p class="img-desc" style="color: #3299cc;">满百减十</p>
								<img src="//image1.suning.cn/uimg/cms/img/153421569489812748.jpg" class="lazy-loading">
							</a>
						</li>
					</ul>
				</div>
				<div class="brand-logo">
					<ul>
						<li>
							<a href="https://cuxiao.suning.com/sm001999.html" name="index3_homepage1_99355913102_pic01" target="_blank" cms-name="index3_homepage1_99355913102_pic01">
								<img src="//image1.suning.cn/uimg/cms/img/153084315106366417.jpg" class="lazy-loading">
							</a>
						</li>
						<li>
							<a href="https://cuxiao.suning.com/sm002021.html" name="index3_homepage1_99355913102_pic02" target="_blank" cms-name="index3_homepage1_99355913102_pic02">
								<img src="//image1.suning.cn/uimg/cms/img/153084321582078658.jpg" class="lazy-loading">
							</a>
						</li>
						<li>
							<a href="https://shop.suning.com/30001081/index.html" name="index3_homepage1_99355913102_pic03" target="_blank" cms-name="index3_homepage1_99355913102_pic03">
								<img src="//image3.suning.cn/uimg/cms/img/153084332343146811.jpg" class="lazy-loading">
							</a>
						</li>
						<li>
							<a href="https://cuxiao.suning.com/sm18080.html" name="index3_homepage1_99355913102_pic04" target="_blank" cms-name="index3_homepage1_99355913102_pic04">
								<img src="//image2.suning.cn/uimg/cms/img/153084339484911561.jpg" class="lazy-loading">
							</a>
						</li>
						<li>
							<a href="https://360mall.suning.com/" name="index3_homepage1_99355913102_pic05" target="_blank" cms-name="index3_homepage1_99355913102_pic05">
								<img src="//image1.suning.cn/uimg/cms/img/153294123129304565.jpg" class="lazy-loading">
							</a>
						</li>
						<li>
							<a href="https://cuxiao.suning.com/sm180209.html" name="index3_homepage1_99355913102_pic06" target="_blank" cms-name="index3_homepage1_99355913102_pic06">
								<img src="//image2.suning.cn/uimg/cms/img/153260651506487536.jpg" class="lazy-loading">
							</a>
						</li>
					</ul>
				</div>
			</div>

			<div class="floor-l right-floor g-floor g-floor2" style="border-color: #558ccf">
				<div class="title" style="background:#edf1f7;">
					<div class="title-name" style="background: #558ccf;">
						<p class="name">汽车用品</p>
						<!--<div class="code-wrapper">
							<div class="code">
								<span></span>
								<img lazy-src="//image2.suning.cn/uimg/cms/img/153129423841927576.png" src="//res.suning.cn/public/v3/images/blank.gif" cms-name="index3_homepage1_99355913104_pic01" class="lazy-loading">
								<p>手机苏宁扫一扫</p>
							</div>
						</div>-->
					</div>
					<!--<div class="keyword clearfix">
						<a href="https://car.suning.com/myCar.html" name="index3_homepage1_99355913105_word01" target="_blank" cms-name="index3_homepage1_99355913105_word01">车管家</a>
						<a href="https://car.suning.com/qcypnew.html" name="index3_homepage1_99355913105_word02" target="_blank" cms-name="index3_homepage1_99355913105_word02">汽车用品</a>
						<a href="https://car.suning.com/seccar.html" name="index3_homepage1_99355913105_word03" target="_blank" cms-name="index3_homepage1_99355913105_word03">品质二手车</a>
						<a href="https://car.suning.com/newCar.html" name="index3_homepage1_99355913105_word04" target="_blank" cms-name="index3_homepage1_99355913105_word04">特价新车</a>
						<a href="https://car.suning.com" name="index3_homepage1_99355913105_word05" target="_blank" cms-name="index3_homepage1_99355913105_word05">苏宁汽车</a>
					</div>-->
				</div>
				<div class="content">
					<div class="left-img">
						<img alt="车品狂欢" class="lazy-loading" src="//image1.suning.cn/uimg/cms/img/154107194463562666.jpg">
						<div class="cover" style="background: #558ccf;"></div>
						<p class="img-name">车品狂欢</p>
						<p class="img-desc">抢199减120元券</p>
						<a href="https://car.suning.com/qcypnew.html" target="_blank" name="index3_homepage1_99355913106_pic01" cms-name="index3_homepage1_99355913106_pic01"></a>
					</div>
					<ul class="img-list clearfix">
						<li style="display: list-item;">
							<a href="https://car.suning.com/newCar.html" target="_blank" name="index3_homepage1_99355913107_pic01" cms-name="index3_homepage1_99355913107_pic01">
								<p class="img-name">特价新车</p>
								<p class="img-desc" style="color: #558ccf;">购新能源车享三重好礼</p>
								<img src="//image3.suning.cn/uimg/cms/img/153568652575582629.jpg" class="lazy-loading">
							</a>
						</li>
						<li style="display: list-item;">
							<a href="https://car.suning.com/seccar.html" target="_blank" name="index3_homepage1_99355913107_pic02" cms-name="index3_homepage1_99355913107_pic02">
								<p class="img-name">品质二手车</p>
								<p class="img-desc" style="color: #558ccf;">悦享四重好礼</p>
								<img src="//image4.suning.cn/uimg/cms/img/153258767323781233.jpg" class="lazy-loading">
							</a>
						</li>
						<li style="display: list-item;">
							<a href="https://cuxiao.suning.com/qcjr181025.html" target="_blank" name="index3_homepage1_99355913107_pic03" cms-name="index3_homepage1_99355913107_pic03">
								<p class="img-name">分期购车趴</p>
								<p class="img-desc" style="color: #558ccf;">低至0首付</p>
								<img src="//image1.suning.cn/uimg/cms/img/153898440570851541.jpg" class="lazy-loading">
							</a>
						</li>
						<li style="display: list-item;">
							<a href="https://cuxiao.suning.com/dmdacushuang11.html" target="_blank" name="index3_homepage1_99355913107_pic04" cms-name="index3_homepage1_99355913107_pic04">
								<p class="img-name">骑行生活节</p>
								<p class="img-desc" style="color: #558ccf;">爆款每满1000减100</p>
								<img src="//image3.suning.cn/uimg/cms/img/154038001085498324.jpg" class="lazy-loading">
							</a>
						</li>
					</ul>
				</div>
				<div class="bottom-list">
					<ul>
						<li class="first" style="display: list-item;">
							<a href="https://cuxiao.suning.com/qc0220.html" target="_blank" name="index3_homepage1_99355913108_pic01" cms-name="index3_homepage1_99355913108_pic01">
								<p class="img-name">电子争霸</p>
								<p class="img-desc" style="color: #558ccf;">满99减10</p>
								<img src="//image5.suning.cn/uimg/cms/img/154122684103466262.jpg" class="lazy-loading">
							</a>
						</li>
						<li style="display: list-item;">
							<a href="https://shop.suning.com/30001435/index.html" target="_blank" name="index3_homepage1_99355913108_pic02" cms-name="index3_homepage1_99355913108_pic02">
								<p class="img-name">美孚</p>
								<p class="img-desc" style="color: #558ccf;">爆款75元起</p>
								<img src="//image1.suning.cn/uimg/cms/img/154112652355473126.jpg" class="lazy-loading">
							</a>
						</li>
						<li style="display: list-item;">
							<a href="https://shop.suning.com/30000815/index.html" target="_blank" name="index3_homepage1_99355913108_pic03" cms-name="index3_homepage1_99355913108_pic03">
								<p class="img-name">壳牌</p>
								<p class="img-desc" style="color: #558ccf;">满399减50</p>
								<img src="//image5.suning.cn/uimg/cms/img/154038021943369196.jpg" class="lazy-loading">
							</a>
						</li>
					</ul>
				</div>
				<div class="brand-logo">
					<ul>
						<li>
							<a href="https://shop.suning.com/30001435/index.html" name="index3_homepage1_99355913109_pic01" target="_blank" cms-name="index3_homepage1_99355913109_pic01">
								<img src="//image5.suning.cn/uimg/cms/img/153121682599711588.jpg" class="lazy-loading">
							</a>
						</li>
						<li>
							<a href="https://shop.suning.com/30001126/index.html" name="index3_homepage1_99355913109_pic02" target="_blank" cms-name="index3_homepage1_99355913109_pic02">
								<img src="//image1.suning.cn/uimg/cms/img/154055321228484342.jpg" class="lazy-loading">
							</a>
						</li>
						<li>
							<a href="https://shop.suning.com/30001077/index.html" name="index3_homepage1_99355913109_pic03" target="_blank" cms-name="index3_homepage1_99355913109_pic03">
								<img src="//image5.suning.cn/uimg/cms/img/154038124668479412.jpg" class="lazy-loading">
							</a>
						</li>
						<li>
							<a href="https://shop.suning.com/30001431/index.html" name="index3_homepage1_99355913109_pic04" target="_blank" cms-name="index3_homepage1_99355913109_pic04">
								<img src="//image3.suning.cn/uimg/cms/img/153995065229987856.jpg" class="lazy-loading">
							</a>
						</li>
						<li>
							<a href="https://yilichina.suning.com/" name="index3_homepage1_99355913109_pic05" target="_blank" cms-name="index3_homepage1_99355913109_pic05">
								<img src="//image5.suning.cn/uimg/cms/img/154038128234705843.jpg" class="lazy-loading">
							</a>
						</li>
						<li>
							<a href="https://shop.suning.com/30000826/index.html" name="index3_homepage1_99355913109_pic06" target="_blank" cms-name="index3_homepage1_99355913109_pic06">
								<img src="//image1.suning.cn/uimg/cms/img/154038137331349172.jpg" class="lazy-loading">
							</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
    <!--
		  @author: guo
		  @name: index
		  @date: home
		  @description: 二楼
		-->
    <div class="w floor com-floor floorOne J-floor3">
    		<div class="title" style="background: #eff0f8;">
    			<div class="title-name" style="background: #5f6cb7;">
	    			<p class="name">家用电器</p>
    			</div>
    		</div>
    		<div class="left-img">
    			<img src="../image/index/154002725853937481.jpg" class="lazy-loading">
    			<div class="cover" style="background: #5f6cb7;"></div>
    			<a href="dianqi.html" name="index3_homepage1_99346713091_pic01"></a>
    		</div>
    		<ul class="img-list clearfix">
				<li style="display: list-item;">
					<a href="#" name="index3_homepage1_99346713092_pic01">
						<p class="img-name">黑电家影</p>
						<p class="img-desc" style="color: #5f6cb7;">爆款直降千元</p>
						<img src="../image/index/153969521099722141.jpg" class="lazy-loading">
					</a>
				</li>
				<li style="display: list-item;">
					<a href="#" name="index3_homepage1_99346713092_pic01">
						<p class="img-name">黑电家影</p>
						<p class="img-desc" style="color: #5f6cb7;">爆款直降千元</p>
						<img src="../image/index/153969521099722141.jpg" class="lazy-loading">
					</a>
				</li>
				<li style="display: list-item;">
					<a href="#" name="index3_homepage1_99346713092_pic01">
						<p class="img-name">黑电家影</p>
						<p class="img-desc" style="color: #5f6cb7;">爆款直降千元</p>
						<img src="../image/index/153969521099722141.jpg" class="lazy-loading">
					</a>
				</li>
				<li style="display: list-item;">
					<a href="#" name="index3_homepage1_99346713092_pic01">
						<p class="img-name">黑电家影</p>
						<p class="img-desc" style="color: #5f6cb7;">爆款直降千元</p>
						<img src="../image/index/153969521099722141.jpg" class="lazy-loading">
					</a>
				</li>
			</ul>
			<a href="#"name="index3_homepage1_99346713094_pic01" class="middle-img">
					<p class="img-name" style="color: #5f6cb7;">冰箱洗衣机  狂欢购</p>
					<p class="img-desc" style="color: #5f6cb7;">每满1000减100</p>
				<img src="//image5.suning.cn/uimg/cms/img/154087070692039074.jpg" class="lazy-loading">
			</a>
			<ul class="img-list clearfix">
				<li style="display: list-item;">
					<a href="#" name="index3_homepage1_99346713092_pic01">
						<p class="img-name">黑电家影</p>
						<p class="img-desc" style="color: #5f6cb7;">爆款直降千元</p>
						<img src="../image/index/153969521099722141.jpg" class="lazy-loading">
					</a>
				</li>
				<li style="display: list-item;">
					<a href="#" name="index3_homepage1_99346713092_pic01">
						<p class="img-name">黑电家影</p>
						<p class="img-desc" style="color: #5f6cb7;">爆款直降千元</p>
						<img src="../image/index/153969521099722141.jpg" class="lazy-loading">
					</a>
				</li>
				<li style="display: list-item;">
					<a href="#" name="index3_homepage1_99346713092_pic01">
						<p class="img-name">黑电家影</p>
						<p class="img-desc" style="color: #5f6cb7;">爆款直降千元</p>
						<img src="../image/index/153969521099722141.jpg" class="lazy-loading">
					</a>
				</li>
				<li style="display: list-item;">
					<a href="#" name="index3_homepage1_99346713092_pic01">
						<p class="img-name">黑电家影</p>
						<p class="img-desc" style="color: #5f6cb7;">爆款直降千元</p>
						<img src="../image/index/153969521099722141.jpg" class="lazy-loading">
					</a>
				</li>
			</ul>
    	</div>
    
    	
    <%@ include file="../dome/footer.jsp" %>
</body>
</html>