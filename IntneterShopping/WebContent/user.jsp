<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta charset="UTF-8">
<title>用户查询</title>
</head>
<body>
	<s:form action="/user/userAction_findById" method="post">
	<s:textfield name="user_id" label="ID"/>
	<s:submit value="查询"/>
	</s:form>
</body>
</html>