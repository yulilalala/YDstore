<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>欢迎登陆</title>
    <link rel="shortcut icon" href="../favicon.ico">
    <!--    normalize.css里面做css初始化 正对浏览器-->
    <link rel="stylesheet" href="../css/normalize.css">
    <link rel="stylesheet" href="../css/login.css">
    <script type="text/javascript" src="../js/jquery-1.11.1.min.js"></script>
    <script type="application/javascript" src="../js/jquery.cookie.js"></script>
	<script type="text/javascript" src="../js/login.js"></script>
</head>
<body>
	<div class="w header">
        <div class="header_logo">
            <h1>
                <a href="index.jsp" alt="亿点商城">亿点商城</a>
            </h1>
        </div>
        <div class="header_describe">
            为确保您账户的安全及正常使用，依《网络安全法》相关要求，6月1日起会员账户需绑定手机。如您还未绑定，请尽快完成，感谢您的理解及支持！
        </div>
        <div class="header_opinion">

        </div>
    </div>
    <div class="mid">
        <div class="login_form">
            <div class="login_tab">
                <a href="javascript:void(0)" class="tab_item on">
                    <span>扫码登录</span>
                    <i></i>
                </a>
                <a href="javascript:void(0)" class="tab_item">
                    <span>账户登录</span>
                    <i></i>
                </a>
            </div>
<!--            扫码登陆-->
            <div class="login_scan" style="display: block">
                <div class="scan_box">
                    <div class="scan_code">
                        <img src="../image/wxdl.jpg" alt="">
                    </div>
                </div>
                <p class="open_app"><i></i> 打开微信扫码登录</p>
                <p class="free"><a href="register.jsp">免费注册 有惊喜 ></a></p>
            </div>
<!--账户登录-->
            <div class="login_pc" style="display: none;">
            	<!--账号密码登录-->
                <div class="login_username" style="display: block;">
                    <div class="msg-wrap">
                        <div class="login-warning" style="display: none;"><i></i><span>公共场所不建议自动登录！</span></div>
                        <div class="login-error" style="display:none;"><i></i><span>账户名与密码不匹配，请重新输入</span></div>
                        <!--<div class="login-blank" style="line-height: 40px; display: block;">&nbsp;</div>-->
                    </div>
                    <s:form action="user_login.action" method="post">
                    
                    
                    <div class="username_box">
                    
                        <div class="input_box" id="showErrorUsernameDiv">
                            <input name="user_phone" id="user_phone" value="" placeholder="用户名/手机/邮箱/门店会员卡号" tabindex="1" type="text">
                            <label style="display: none;">用户名/手机/邮箱/门店会员卡号</label>
                            <i class="icon username_icon"></i>
                            <i class="clear"></i>
                        </div>
                        <div class="email_list hide"></div>
                    </div>
                    <div class="password_box">
                        <div class="input_box" id="showErrorPwdDiv">
                            <input name="user_password" id="user_password" placeholder="密码" tabindex="2" type="password">
                            <label style="display: none;">密码</label>
                            <i class="icon password_icon"></i>
                            <i class="clear"></i>
                        </div>
                    </div>
                    <div class="login_help clearfix">
                        <a class="login_switch" href="javascript:void(0)">
                            <i></i>短信验证码登录</a>
                        <a id="FORGET_PWD" href="javascript:void(0);" onclick="javascript:forgetPwdClick(); return false;" name="Logon_index_denglu001" class="forget_password">忘记密码？</a>
                    </div>
                    <s:submit id="submit1" type="submit" class="login_submit" value=""></s:submit>
                    
             </s:form>
                </div>



				<!--短信验证码登录-->
                <div class="phone_login" style="display: none;">
                    <div class="msg-wrap">
                        <div class="login-warning" style="display: none;"><i></i><span>公共场所不建议自动登录！</span></div>
                        <div class="login-error" style="display:none;"><i></i><span></span></div>
                        <div class="login-blank" style="line-height: 40px; display: block;">&nbsp;</div>
                    </div>
                    <div class="phone_box">
                        <div class="input_box" id="showErrorPhoneNumberDiv">
                            <input id="phoneNumber" type="text" placeholder="手机号码" autocomplete="off" tabindex="1" maxlength="11">
<!--                            <label>手机号码</label>-->
                            <i class="icon username_icon"></i>
                            <i class="clear"></i>
                        </div>
                    </div>
<!--
<div class="verify_box clearfix showErrorVerifyCodeDiv" style="display:none;">
    <div class="input_box">
        <input class="validate" placeholder="手机验证码" type="text" maxlength="4" autocomplete="off" tabindex="2">
        <label>验证码</label>
        <i class="icon verify_icon"></i>
        <i class="clear"></i>
        <i class="ok" style="display: none;"></i>
        <i class="error" style="display: none;"></i>
    </div>
    <a name="Logon_index_denglu035" href="javascript:void(0)" class="verify_code">
        <img id="imageCode2" src="https://vcs.suning.com/vcs/imageCode.htm?uuid=4f97f74a-6610-4a5f-aff4-9d4f28b15d85&amp;sceneId=logonImg&amp;yys=1539074830082" alt="图形验证码">
        <span>换一张</span>
    </a>
</div>
<div id="Logon_index_denglu040" class="siller-box sillerVerifyCode" style="display:none;">
    <div id="siller2" class=" dt_parent float dt_parent float dt_parent float dt_parent float dt_parent float dt_parent float dt_parent float dt_parent float" style="display: block;">
        <div class="dt_child_content" id="siller2_dt_child_content_containor">
            <div class="dt_slide_bar"></div>
            <div class="dt_notice" id="dt_notice">请按住滑块拖到最右边</div>
            <div class="dt_child_content_knob"></div>
        </div>
    </div>
</div>
-->
                    <div class="sms_box clearfix">
                        <div class="input_box" id="showErrorSmsCodeDiv">
                            <input id="smsCode" type="text" placeholder="手机验证码" autocomplete="off" tabindex="3" maxlength="6">
<!--                            <label>手机验证码</label>-->
                            <i class="icon password_icon"></i>
                            <i class="clear"></i>
                        </div>
                        <a name="Logon_index_denglu033" href="javascript:void(0)" class="send_sms">获取验证码</a>
                    </div>
                    <div style="padding-top:2px;padding-bottom:4px;">
                        <p class="sms_sent" style="display: none;">验证码已发送到您的手机，<em>5</em>分钟内有效</p>
                        <div class="voice_verify clearfix" style="display: none;">
                            <span>如果您收不到验证码？</span>
                            <a name="Logon_index_denglu034" href="javascript:void(0)" class="send-voice">获取语音验证码</a>
                        </div>
                        <div class="voice_sent clearfix" style="display: none;">
                            <span>电话拨打中</span>
                            <i></i>
                        </div>
                        <div class="blank">&nbsp;</div>
                    </div>

                    <div class="login_help clearfix">
                        <a class="login_switch" href="javascript:void(0)"><i></i>账号密码登录</a>
                        <a id="FORGET_PWD" href="javascript:void(0);" onclick="javascript:forgetPwdClick(); return false;" name="Logon_index_denglu001" class="forget_password">忘记密码？</a>
                    </div>
                    <a id="submit" href="javascript:void(0)" onclick="javascript:prepareLoginSubmit();return false;" name="Logon_index_denglu002" class="login_submit">登 录</a>
                </div>









            </div>
            <div class="login_bottom">
                <span class="title">使用以下账号登录</span>
                <div class="login_qq">
                    <a href="">
                        <i></i>QQ
                    </a>
                </div>
                <div class="login_weix">
                    <a href="">
                        <i></i>微信
                    </a>
                </div>
            </div>
        </div>
    </div>
    <%@ include file="../dome/footer.jsp" %>
</body>
</html>