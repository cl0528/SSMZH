<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看管理员</title>
</head>
<body  align="center" background="tu/32.jpg">
  <br>
  <br>
  <br>
  <br>
  <caption><font size="7" face="宋体">查看管理员</font></caption>
  <hr  size="5px"   width="600px" color="#cc6600">
  <br/>
        <table bordercolor="#993300"  border="1" align="center" width="500px" height="300px" cellspacing="0">
	        <tr align="center"><td>编号：</td><td>${admin1.id }</td></tr>
            <tr align="center"><td>姓名：</td><td>${admin1.name }</td></tr>
            <tr align="center"><td>账号：</td><td>${admin1.username }</td></tr>
			<tr align="center"><td>密码：</td><td><input type="password" value="${admin1.password }" disabled="disabled"/></td></tr>
			<tr align="center"><td>手机：</td><td>${admin1.phone }</td></tr>
		</table>
  </body>
</html>