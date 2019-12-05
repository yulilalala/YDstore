
$(function(){
	//隐藏与打开顶部广告功能
	$('.J_event_close').click(function(){
		$('.J_event').hide();
	});
	//轮播图
	lbt();
	
	indexlist();
	//我的主页下拉菜单
	$('.fr li').eq(2).mouseenter(function(){
		$('.myHome-handle').toggle();
		$('.fr li').eq(2).css('background-color','#fff');
	});
	$('.fr li').eq(2).mouseleave(function(){
		$('.myHome-handle').toggle();
		$('.fr li').eq(2).css('background-color','#e3e4e5');
	});
		
	//如果cooike中有user则显示出来
	var user = $.cookie('user');
	if(user!=null){
		//
		creatuser(user);
	}
	//鼠标悬停购物车
	sp();
})







