function addLi(name){
	return $('<li>'+ name+'</li>');
}
function addA(name){
	return $('<a>'+ name+'</a>');
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
$(function(){
//	顶部工具栏
	var myTag01=addLi('').append( addA('').append(addI('')).append(addSpan('返回首页')).attr('href','../index.html') );
    $('.w>.fl').prepend(myTag01);
    $('.w>.fl li:first').addClass('backhome');
    $('.backhome+li').css('marginLeft','80px')
//  header栏
	var header = $('.header');
	$('.logo>h1>a').attr('href','../index.html');
	var con = '大屏电视';
	$('.search>input').attr('placeholder',''+con+'');
//	navitems栏
	$('.navitems').empty();//清空数据
	//添加数据
	var navitemul = addUl('');
	$.getJSON("../json/dianqi.json",function(data){
		$.each(data.navitems, function(index,value) {
//	        alert(index+":"+ value);
	        var navitemcon = navitemul.append(addLi('').append(addA(value)) );
	        $('.navitems').append(navitemcon);
	    })
		
	})
	$('.header>.inner').append($('.ng_sort'));
	
})
