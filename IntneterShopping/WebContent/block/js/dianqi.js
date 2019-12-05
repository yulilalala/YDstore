$(function(){
	creatback();
//  header栏
	
	var con = '大屏电视';
	$('.search>input').attr('placeholder',''+con+'');
//	navitems栏
	$('.navitems').empty();//清空数据
	//添加navitems数据
	var navitemul = addUl('');
	$.getJSON("../json/dianqi.json",function(data){
		$.each(data.navitems, function(index,value) {
//	        alert(index+":"+ value);
	        var navitemcon = navitemul.append(addLi('').append(addA(value)) );
	        $('.navitems').append(navitemcon);
	    })
		
	})
	$('.header>.inner').append($('.ng_sort'));
	//轮播图
	lbt();
	
	//	商品展示tab功能实现
	$('.tab-nav4 ul li').mouseover(function(){
		//鼠标移入代码
		$(this).addClass('cur').siblings().removeClass('cur');
		var index = $(this).index();
		$(this).parent('.pro-tab').children('.tab-content4:eq('+index+')').css('display','block').siblings().css('display','none');
	});
	//鼠标悬停购物车
	sp();
//	全部商品分类下拉
	$('.ng_sort').hover(function(){
		$('.index-list li').removeClass('current');
		$('.ng_sort').css('z-index','7');
		$('.classification').slideToggle();
	});
	indexlist();
})
