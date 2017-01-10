<%@taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<table>
	<tr>
		<th>
			<tiles:insert attribute="menu"/>
		</th>
		
		<th>
			<tiles:insert attribute="head"/>
			<tiles:insert attribute="body"/>
			<tiles:insert attribute="foot"/>
		</th>
	</tr>
</table>