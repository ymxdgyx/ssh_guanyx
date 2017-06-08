<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="login_login.action">
用户ID:<input type="text" name=UserId></br>
密&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="password" name=UserPassword><br/>
${fieldErrors.get("E000001") }
${fieldErrors.get("E000002") }
${fieldErrors.get("E000003") }</br>
<input type="submit" value="登陆">
</form>

</body>
</html>