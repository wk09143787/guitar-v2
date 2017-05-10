<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>查询结果</title>
</head>
<body>
<h3>查询结果：</h3>
<table width="640" border="1">
		<tr>
			<td>builder</td>
			<td>model</td>
			<td>type</td>
			<td>backWood</td>
			<td>topWood</td>
			<td>numStrings</td>			
		</tr>
		<tr>
			<td>${requestScope.guitar.builder}</td>
			<td>${requestScope.guitar.model}</td>
			<td>${requestScope.guitar.type}</td>
			<td>${requestScope.guitar.backWood}</td>
			<td>${requestScope.guitar.topWood}</td>
			<td>${requestScope.guitar.numStrings}</td>		
		</tr>
</table>
</body>
</html>