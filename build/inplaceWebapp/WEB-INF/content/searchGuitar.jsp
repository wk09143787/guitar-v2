<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>��ѯҳ��</title>
</head>
<body>
	ѡ������Ҫ�ļ�����
	<form action="search" name="search" method="post">
		<table>
			<tr>
				<td>������:</td>
				<td><input type="text" name="builder"/></td>
			</tr>
			<tr>
				<td>�ͺ�:</td>
				<td><input type="text" name="model"/></td>
			</tr>
			<tr>
				<td>���ࣺ</td>
				<td colspan="2"><input type="text" name="type"/></td>				
			</tr>	
			<tr>
				<td>��ľ:</td>
				<td><input type="text" name="backWood"/></td>
			</tr>
			<tr>
				<td>ǰľ:</td>
				<td><input type="text" name="topWood"/></td>
			</tr>
			<tr>
				<td>���:</td>
				<td><input type="text" name="numStrings"/></td>
			</tr>
			</table>
			<input type="submit" value="�ύ"/>
		</form>
</body>
</html>