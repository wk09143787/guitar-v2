<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>��ѯ���</title>
</head>
<body>
<h3>��ѯ�����</h3>
<table>
		    		<tr>
		    			<td>
		    				  <label for="builder">������:</label>
		    			</td>
		    			<td>
					    	 ${request.map[0].builder}
		    			</td>
		    			<td>
			                  <label for="type">&emsp;�ͺ�:</label>
		    			</td>
		    			<td>
					    	  ${request.map[0].model}
		    			</td>
		    		</tr>
		    		<tr>
		    			<td>
		    	  			<label for="backWood">��ľ:</label>
		    			</td>
		    			<td>
		    				${request.map[0].backWood}
		    			</td>
		    			<td>
		    				<label for="topWood">&emsp;ǰľ:</label>
		    			</td>
		    			<td>
		    				${request.map[0].topWood}
		    			</td>
		    		</tr>
		    		<tr>
			    		<td>
			    			<label for="model">����:&emsp;</label>
			    		</td>
		    			<td>
					        ${request.map[0].type}
		    			</td>
		    			<td>
		    				<label for="numStrings">&emsp;���:</label>
			    		</td>
		    			<td>
					        ${request.map[0].numStrings}
		    			</td>
		    			
			    	</tr>
			    	<tr>
			    		<td>
		    				<label for="price">&emsp;�۸�:</label>
			    		</td>
		    			<td>
					        ${request.map[0].price}
		    			</td>
		    		</tr>
		    		
		    	</table>
</body>
</html>