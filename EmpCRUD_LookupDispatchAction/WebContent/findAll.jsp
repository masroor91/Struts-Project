<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html>
	<head>
		<title></title>
		
		<style type="text/css">
			table,th,td{
				border: 2px red solid;
			}
		
		</style>
	
	</head>
	<body>
		<h1>Employee</h1>
		
		<table>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Address</th>
			</tr>
			
			<logic:iterate name="list" id="listId">
				<tr>
					<td><bean:write name="listId" property="id"/></td>
					<td><bean:write name="listId" property="name"/></td>
					<td><bean:write name="listId" property="email"/></td>
					<td><bean:write name="listId" property="address"/></td>
					
				</tr>
			</logic:iterate>
		
		</table>
	
	</body>
</html>