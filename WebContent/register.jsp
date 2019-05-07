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
<title>注册</title>
</head>
<body background="tu/1.jpg">
<c:if test="${!(empty msg) }">
   <script>
       alert("${msg}");
   </script>
   <c:remove var="msg" scope="session"/>
</c:if>
<form action="AdminServlet?action=register" method="post" align='center'>

		<p>
			姓&nbsp;&nbsp;&nbsp;名：<input type="text" name="name" />
		</p>

		<p>
			手&nbsp;&nbsp;&nbsp;机：<input type="text" name="phone" />
		</p>

		<p>
			用户名：<input type="text" name="username" />
		</p>

		<p>
			密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password" />
		</p>

		<p>
			<input type="submit" value="注册" />
		</p>
		<p>是管理员，请点击<a href="test.jsp">登录</a></p>
	</form>
</body>
</html>