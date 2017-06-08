<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
		<li><a href="userInfo_allUserInfo.action">用户管理</a></li>
		<li><a href="loginfo.jsp">年度</a></li>
		<li><a href="loginfo.jsp">日志管理</a></li>
</ul>
<s:form method="post" action="userInfo_registerUserInfo">
	<s:textfield label="name" name="ui.UserName"></s:textfield>
	<s:textfield label="密码" name="ui.PassWord"></s:textfield>
	<s:radio list="#{'1':'男','2':'女'}" name="ui.Sex" value="1"/>
	<s:textfield label="PhoneNumber" name="ui.PhoneNumber"></s:textfield>
	<s:textfield label="Email" name="ui.Email"></s:textfield>
	<s:textfield label="Address" name="ui.Address"></s:textfield>
	<s:radio list="#{'11':'担当','12':'管理员'}" name="ui.Authority" value="11"/>
	<s:submit value="注册"></s:submit>

</s:form>

</body>
</html>