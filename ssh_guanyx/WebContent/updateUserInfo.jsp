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
<s:form method="post" action="userInfo_updateUserInfo2">
	<s:textfield label="Id" name="ui.UserId" value="%{ulist.get(0).UserId}" readonly="true"></s:textfield>
	<s:textfield label="name" name="ui.UserName" value="%{ulist.get(0).UserName}"></s:textfield>
	<s:textfield label="密码" name="ui.PassWord" value="%{ulist.get(0).PassWord}"></s:textfield>
	<s:radio list="#{'1':'男','2':'女'}" name="ui.Sex" value="%{ulist.get(0).Sex}"/>
	<s:textfield label="PhoneNumber" name="ui.PhoneNumber" value="%{ulist.get(0).PhoneNumber}"></s:textfield>
	<s:textfield label="Email" name="ui.Email" value="%{ulist.get(0).Email}"></s:textfield>
	<s:textfield label="Address" name="ui.Address" value="%{ulist.get(0).Address}"></s:textfield>
	<s:radio list="#{'11':'担当','12':'管理员'}" name="ui.Authority" value="%{ulist.get(0).Authority}"/>
	<s:submit value="更改"></s:submit>

</s:form>
<a href="userInfo_allUserInfo.action">返回</a>
<s:debug></s:debug>
</body>
</html>