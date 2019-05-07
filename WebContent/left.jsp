<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>左侧</title>
</head>
<body bgcolor="#ffffff">
<table  align="center"  width="180" height="600">
<tr>
	<td><font size="" color="#cc6600"><b>&raquo;分类管理</b></font></td>
</tr>
<tr>
	<td>
	<table width="160" height="50" align="center" >
	<tr>
		<th><a href="addfl.jsp" target="right"><font size="3" color="#cc9900">添加分类</font></a></th>
	</tr>
	<tr>
		<th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="FenLeiServlet?action=showFenlei" target="right"><font size="3" color="#cc9900">查看所有分类</font></a></th>
	</tr>
	<tr>
		<th><a href="xiugaifl.jsp" target="right"><font size="3" color="#cc9900">修改分类</font></a></th>
	</tr>
	</table>
	</td>
</tr>
<tr>
	<td><font size="" color="#cc6600"><b>&raquo;图书馆理</b></font></td>
</tr>
<tr>
	<td>
	<table width="160" height="50" align="center" >
	<tr>
		<th><a href="addbook.jsp" target="right"><font size="3" color="#cc9900">添加图书</font></a></th>
	</tr>
	<tr>
		<th><a href="findbook.jsp" target="right"><font size="3" color="#cc9900">查看图书</font></a></th>
	</tr>
	<tr>
		<th><a href="xiugaibook.jsp" target="right"><font size="3" color="#cc9900">修改图书</font></a></th>
	</tr>
	</table>
	</td>
</tr>
<tr>
	<td><font size="" color="#cc6600"><b>&raquo;用户管理</b></font></td>
</tr>
<tr>
	<td><table width="160" height="50" align="center" >
	<tr>
		<th><a href="adduers.jsp" target="right"><font size="3" color="#cc9900">添加用户</font></a></th>
	</tr>
	<tr>
		<th><a href="finduers.jsp" target="right"><font size="3" color="#cc9900">查看用户</font></a></th>
	</tr>
	<tr>
		<th><a href="xiugaiuers.jsp" target="right"><font size="3" color="#cc9900">修改用户</font></a></th>
	</tr>
	</table></td>
</tr>
<tr>
	<td><font size="" color="#cc6600"><b>&raquo;管理员信息管理</b></font></td>
</tr>
<tr><td>
	<table  width="160" height="50" align="center" >
	<tr>
		<th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="AdminServlet?action=showAdmin"target="right"><font size="3" color="#cc9900">查看管理员信息</font></a></th>
	
	
	</tr>
	<tr>
		<th><a href="xiugaimm.jsp"  target="right"><font size="3" color="#cc9900" target="right">修改密码</font></a></th>
	</tr>
	<tr>
		<th><a href="AdminServlet?action=exit"  target="_parent"><font size="3" color="#cc9900" target="right">退出系统</font></a></th>
	</tr>
	
</tr>
</table>
</body>

</html>