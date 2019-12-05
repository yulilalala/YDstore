function addLi(name){
	return $('<li>'+ name+'</li>');
}
function addA(name,href){
	return $('<a href='+href+'>'+ name+'</a>');
}
function addI(name){
	return $('<i>'+ name+'</i>');
}
function addSpan(name){
	return $('<span>'+ name+'</span>');
}
function addUl(name){
	return $('<ul>'+ name+'</ul>');
}
function addDiv(){
	return $('<div> </div>');
}
//轮播图开始
function lbt(){
	var index = 0;
//	left按钮
	$('.arr-l').click(function(e){
		var length=$('.page').children().length-1;
//		alert('li数量：'+length);
		if(index==0){
//			如果第一个变红
			
			index=length;
			$('.page li:eq('+index+')').addClass('current').siblings().removeClass('current');
			$('.banner li:eq('+index+')').css('display','block').siblings().css('display','none');
		}else{
			$('.page li:eq('+index+')').removeClass('current');
			index--;
//			alert(index);
			$('.page li:eq('+index+')').addClass('current');
			$('.banner li:eq('+index+')').css('display','block').siblings().css('display','none');
		}
		
	});
//	right按钮
	$('.arr-r').click(function(e){
		var length=$('.page').children().length-1;
		if(index==length){
//			如果最后一个变红
			index=0;
			$('.page li:first').addClass('current').siblings().removeClass('current');
			$('.banner li:eq('+index+')').css('display','block').siblings().css('display','none');
		}else{
			$('.page li:eq('+index+')').removeClass('current');
			index++;
			$('.page li:eq('+index+')').addClass('current').siblings().removeClass('current');
			$('.banner li:eq('+index+')').css('display','block').siblings().css('display','none');
		}
	});
	$('.page li').mouseover(function(){
//		alert('12')
		$(this).addClass('current').siblings().removeClass('current');
		index=parseInt($(this).html());
		$('.banner li:eq('+index+')').css('display','block').siblings().css('display','none');
	});
	
}
//轮播图结束
//工具栏生成返回首页开始
function creatback(){
	//	顶部工具栏
	//生成返回首页
	var myTag01=addLi('').append( addA('').append(addI('')).append(addSpan('返回首页')).attr('href','index.jsp') 	);
	//登陆 注册修改
	
    $('.w>.fl').prepend(myTag01);
    $('.w>.fl li:first').addClass('backhome');
    $('.backhome+li').css('marginLeft','80px');
}
//工具栏生成返回首页结束
//工具栏生成用户
function creatuser(u){
	var a1 = $('.fr li').eq(0);
		a1.empty();//清空登录注册
		a1.addClass('dropdown');
		a1.append(addA(''+u+'','myHome.jsp')).append(addI('') );
		var d1 = $('<div> </div>').addClass('user-slide').addClass('username-handle').append(addA('账号管理','myHome.jsp').attr('target','_blank')).append(addA('退出登录','javascript:logff();'));
		a1.append(d1);
		a1.mouseenter(function(){//鼠标进入事件
			$('.username-handle').toggle();
			a1.css('background-color','#fff');
			$('.dropdown a').css('color','#666')
		});
		a1.mouseleave(function(){
			$('.username-handle').toggle();
			a1.css('background-color','#e3e4e5');
		});
}

//退出登录功能函数
function logff(){
	//删除cookie中的user
	$.cookie('user',null);
	//页面跳转到login.html
	window.location.href="../jsp/index.jsp";
}
//拦截器
function Interceptor(){
	var user = $.cookie('user');
//	alert(user);
	if(user==undefined&&user==null){
//		window.location.href='../html/login.html';
	}
}
//鼠标悬停购物车
function sp(){
	//鼠标悬停购物车
	$('.car').mouseenter(function(){
		//加载购物车中的商品
		$('.dropdown-layer').toggle();
		$('.mycar').css('border-bottom-width','0px')
	});
	$('.car').mouseleave(function(){
		$('.dropdown-layer').toggle();
		$('.mycar').css('border-bottom-width','1px')
	})
}
function indexlist(){
	var num = 0;//0 :红 1:白
	//全部分类动态显示开始
	$('.index-list li').each(function(i,t){
		$(this).mouseover(function(){
			num = i;
			$(this).addClass('current').siblings().removeClass('current');			
//			设置第i个li的内容并显示
			$('.ng-sort-detail').css('width','789px');
		});
		$(this).mouseout(function(){
//			alert('a')
		});
	});
	
	$('.index-list li').mouseleave(function(){
//		鼠标离开li:隐藏
		$('.ng-sort-detail').css('width','0');
		$(this).removeClass('current');
	});
	$('.ng-sort-detail').mouseenter(function(){
		$('.ng-sort-detail').css('width','789px');
		$('.index-list li').eq(num).addClass('current').siblings().removeClass('current');
	});
	$('.ng-sort-detail').mouseleave(function(){
//		鼠标离开盒子隐藏
		$(this).css('width','0');
		$('.index-list li').removeClass('current');
	});
	
	
	$('.index-list li').each(function(index){
		$('.index-list li').eq(index).mouseenter(function(){
			$('.ng-sort-detail').load('../text/w'+index+'.html');
		});
	});
//全部分类动态显示结束
}
