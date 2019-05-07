<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看分类</title>
</head>
<body background="tu/32.jpg" >
<br>
<br>
<br>
<br>
<table id="t" frome="box" align="center"  width="900" height="500"  cellspacing="0" >

<tr height="13%">
	<td align="center"><font size="6" color="#660000" face="宋体"><strong>查看所有分类</strong></font><br></td>
</tr>
<tr><td><form action="url" method="get">
<table align="center" width="800px" height="400px" cellspacing="0"
			border="1">
			<h1 align="center">查看所有分类</h1>
			
				<tr align="center">
					<td>编号</td>
					<td>分类名称</td>
					<td>删除</td>
					<td>修改</td>
				</tr>
				<c:forEach items="${list }" var="fl">
				<tr align="center">
					<td>${fl.id }</td>
					<td>${fl.name }</td>
					<td><input type="button" value="删除" /></td>
					<td><a href="xiugai.jsp" target="right"><input
							type="button" value="修改" /></a></td>
				</tr>
			</c:forEach>
		</table>
		<p align="center">
			没有您要的分类？您可以点击这里<a href="addfl.jsp" />添加分类</a>
		</p>
</form></td>	
</table>
</body>

</html>