<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>查询结果</title>
</head>
<body>
<h3>查询结果：</h3>
<table>
		    		<tr>
		    			<td>
		    				  <label for="builder">生产商:</label>
		    			</td>
		    			<td>
					    	 ${request.map[0].builder}
		    			</td>
		    			<td>
			                  <label for="type">&emsp;型号:</label>
		    			</td>
		    			<td>
					    	  ${request.map[0].model}
		    			</td>
		    		</tr>
		    		<tr>
		    			<td>
		    	  			<label for="backWood">后木:</label>
		    			</td>
		    			<td>
		    				${request.map[0].backWood}
		    			</td>
		    			<td>
		    				<label for="topWood">&emsp;前木:</label>
		    			</td>
		    			<td>
		    				${request.map[0].topWood}
		    			</td>
		    		</tr>
		    		<tr>
			    		<td>
			    			<label for="model">种类:&emsp;</label>
			    		</td>
		    			<td>
					        ${request.map[0].type}
		    			</td>
		    			<td>
		    				<label for="numStrings">&emsp;编号:</label>
			    		</td>
		    			<td>
					        ${request.map[0].numStrings}
		    			</td>
		    			
			    	</tr>
			    	<tr>
			    		<td>
		    				<label for="price">&emsp;价格:</label>
			    		</td>
		    			<td>
					        ${request.map[0].price}
		    			</td>
		    		</tr>
		    		
		    	</table>
</body>
</html>