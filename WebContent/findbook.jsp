<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看图书</title>
</head>
<body background="tu/32.jpg" > 
  <table  id="t" frome="box" align="center"  width="1100" height="800"  cellspacing="0" >
    <tr><td>
	<p align="center"><font size="7" color="#660000" face="宋体">查看图书</font></p>
    <p align="center">高级搜索&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;选择分类：
		<select>
	  <option>计算机</option>
	  <option>哲学</option>
	  <option>管理</option>
	  <option>教辅</option>
	    </select>
		&nbsp;&nbsp;&nbsp;&nbsp;书名<input type="text"/>&nbsp;&nbsp;作者<input type="text"/>&nbsp;&nbsp;借书人<input type="text"/>
    </p>
	<p align="center">状态<input type="text"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button"value="搜索图书">
	</p>
	</td>
	 </tr>
  
   <tr><td>
   <form>
      <table align="center"  border="1" bordercolor="#993300"  width="1000px" height="600px"  cellspacing="0" >
		<tr align="center">		 
	<td>图书编号</td><td>分类名称</td><td>图书名称</td><td>图书价格</td><td>图书出版社</td><td>状态</td><td>借书人</td><td>删除</td><td>修改</td>
		</tr>
		<tr align="center">		 
	<td>1</td><td>计算机</td><td>Java</td><td>55.0</td><td>北大出版社</td><td>借出</td><td>张三</td><td><input type="button"value="删除"></td><td><a href="xiugaiBook.jsp"><input type="button"value="修改"></td>
		</tr>
		<tr align="center">		 
	<td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
		</tr>
		<tr align="center">		 
	<td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
		</tr>
		<tr align="center">		 
	<td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
		</tr>
		<tr align="center">		 
	<td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
		</tr>
		<tr align="center">		 
	<td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
		</tr>
		<tr align="center">		 
	<td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
		</tr>
		<tr align="center">		 
	<td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
		</tr>
	  </table>
	  </form>
	  </td>
	 </tr>
	   <tr><td><p align="center">没有您要的图书？点击这里<a href="addbook.jsp">添加图书</p></td></tr>

	   </table>
  </body>
</html>