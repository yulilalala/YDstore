$(function(){
	//	点击扫码登录
	$('.login_tab a:eq(0)').click(function(){
		//切换模块
		$('.login_scan').css('display','block');
		$('.login_pc').css('display','none');
		$('.login_tab a:first').addClass('on');
		$('.login_tab a:last-child').removeClass('on');
	});
	//	点击账号登录
	$('.login_tab a:eq(1)').click(function(){
		//切换模块
		$('.login_scan').css('display','none');
		$('.login_pc').css('display','block');
		$('.login_tab a:first').removeClass('on');
		$('.login_tab a:last-child').addClass('on');
	});
	//login_switch点击操作
	$('.login_switch').click(function(){
		$('.login_username').toggle();
		$('.phone_login').toggle();
	});
	//	登录功能
	$('#submit1').click(function(){
		/*var user_phone=$('#user_phone').val();//获取用户名
		var user_password=$('#user_password').val();//获取密码
		var json = {"user_phone":user_phone,"user_password":user_password}*/
		var user_id=$('#user_id').val();
		var json={"user_id":user_id}
		$.ajax({
			url:'../../user/userAction_delete',
			type:'post',
			data:json,
			success:function(res){
				var message=eval("("+res+")");
				alert(message.result);
				/*if(res==SUCCESS){
//					如果返回SUCCESS
					//跳转到index.html
					window.location.href = "../html/index.html";
					
				}else{
					//用户名或密码错误
					$('.login-error').show();
				}*/
			},dataType:'html'
		})
		
	});

})
function prepareLoginSubmit(){
	
}
