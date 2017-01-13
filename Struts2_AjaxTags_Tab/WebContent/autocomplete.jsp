<%@taglib uri="/struts-dojo-tags" prefix="sajax"%>

<sajax:head/>

<sajax:tabbedpanel id="main">

<sajax:div label="Registeration">
<table>
	<tr>
		<td>
		<sajax:autocompleter label="Select State" list="{'Andhra Pradesh','Telangana','Goa','Maharashtra','Uttar Pradesh'}" name="state"></sajax:autocompleter>
		</td>
	</tr>
	<tr>
		<td>	
		<sajax:datetimepicker label="DATE" displayFormat="dd-MMM-yyyy"/>
		</td>
	</tr>
</table>
</sajax:div>

<sajax:div label="Address">
	<sajax:textarea labelposition="center"/>

</sajax:div>
</sajax:tabbedpanel>