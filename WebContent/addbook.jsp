<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加图书</title>
</head>
<body background="tu/32.jpg" >
<br>
<br>
<br>
<br>
 <table  id="t" frome="box" align="center"  width="500" height="500"  cellspacing="0"   >

<tr height="15%">
	<td align="center"><font size="7"#660000  face="宋体"><strong>添加图书</strong></font><br></td>
</tr>
<tr><td><form action="url" method="get">
<table  border="1"bordercolor="#993300" width="400" height="400"  align="center"  valign="top" cellspacing="0"  >
<tr  align="center">
	<td>选择分类:</td>
	<td colspan="2"><select>
                        <option>计算机</option>
						<option>哲学</option>
						<option>管理</option>
						<option>教辅</option>

	</select></td>
</tr>
<tr  align="center">
	<td>图书名称:</td>
	<td colspan="2"><input type="text" /></td>
</tr>
<tr  align="center">
	<td>图书价格:</td>
	<td colspan="2"><input type="text" /></td>
</tr>
<tr  align="center">
	<td>出版社:</td>
	<td colspan="2"><input type="text" /></td>
</tr>
<tr  align="center">
	<td>状态:</td>
	<td colspan="2" id="t1"><input type="radio" checked name="1"/>未借出<input type="radio" name="1" />借出</td>
</tr>
<tr  align="center">
	<td>借书人:</td>
	<td colspan="2"><input type="text" value="无" /></td>
</tr>
<tr  align="center">
	<td colspan="2" align="center"><input type="submit" value="添加"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"/></td>
</tr>
</table>
</form></td>
</table>
</body>
</html>