$(function(){
	$('.submit_btn').click(function(){
		//获取手机号、验证码、密码
		var user_phone = $('#user_phone').val();
		var code = $('#code').val();
		var user_password = $('#user_password').val();
		var json = {"user_phone":user_phone,"code":code,"user_password":user_password}
		$.ajax({
			type:"post",
			url:"../../register",
			async:true,
			data:json,
			dataType:'JSON',
			success:function(res){
				if(res=="exist"){
					alert("exist");
				}else if(res!=null){
					alert("!null")
				}
				
			}
		});
	})
})
