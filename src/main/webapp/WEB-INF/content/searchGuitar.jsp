<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>查询页面</title>
</head>
<body>
	选择你想要的吉他！
	<form action="search" name="search" method="post">
		<table>
			<tr>
				<td>生产商:</td>
				<td><input type="text" name="builder"/></td>
			</tr>
			<tr>
				<td>型号:</td>
				<td><input type="text" name="model"/></td>
			</tr>
			<tr>
				<td>种类：</td>
				<td colspan="2"><input type="text" name="type"/></td>				
			</tr>	
			<tr>
				<td>后木:</td>
				<td><input type="text" name="backWord"/></td>
			</tr>
			<tr>
				<td>前木:</td>
				<td><input type="text" name="topWood"/></td>
			</tr>
			<tr>
				<td>编号:</td>
				<td><input type="text" name="numStrings"/></td>
			</tr>
			</table>
			<input type="submit" value="提交"/>
		</form>
</body>
</html>