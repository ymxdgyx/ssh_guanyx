<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
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

	<table border="1">
		<tr>
			<th>Userid</th>
			<th>UserName</th>
			<th>Sex</th>
			<th>PhoneNumber</th>
			<th>Email</th>
		</tr>
		<s:iterator value="ulist" status="stat" id="sd">

			<tr>
				<td><s:property value="#sd.UserId" /></td>
				<td><s:property value="#sd.UserName" /></td>
				<td><s:property value="#sd.Sex" /></td>
				<td><s:property value="#sd.PhoneNumber" /></td>
				<td><s:property value="#sd.Email" /></td>
				<td>
<!-- 		    <a href="userInfo_updateUserInfo?UserInfoId=#sd.UserId" >编辑用户</a> -->
					<a href="<s:url action="userInfo_updateUserInfo1.action"><s:param name="UserInfoId" value="#sd.UserId"/></s:url>">编辑用户</a>
				</td>
				<td><a href="<s:url action="createUserIdelectUserInfo.action"><s:param name="UserInfoId" value="#sd.UserId"/></s:url>">删除用户</a></td>
			</tr>
		</s:iterator>
	</table>
	<a href="register.jsp">增加用户</a>
	<a href="userInfo_daochu.action" target="_blank">下载</a>
	<s:debug></s:debug>
</body>
</html>