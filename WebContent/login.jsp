<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
body {
	margin-top: 200px;
	margin-left: 200px;
}
</style>
<script>
<% 
  String msg = (String) session.getAttribute("msg");

	if (msg!= null) {
%>
    alert("<%=msg%>");
    <%
     session.removeAttribute("msg");
			}
	%>
	
</script>
<title>登录</title>
</head>
<body background="tu/1.jpg">


	<form action="AdminServlet?action=login" method="post" align='center'>
		<p>
			用户名：<input type="text" name="username" />
		</p>
		<p>
			密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password" />
		</p>
		<p>
			<input type="submit" value="登录" />
		</p>
		<p>
			还不是管理员，立即注册<a href="register.jsp">注册</a>
		</p>
	</form>
</body>
</html>