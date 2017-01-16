<style>
	table {
		border:2px solid black;
		table-layout: fixed;
		color: red;
		background-repeat: repeat;
		border-spacing: pt;
	}
	tr{
		border: 1px solid black;	
		
	}
	
	th, td{
		border: 1px solid black;
		text-align: center;
		border-spacing: em;
	}
	
	caption {
		text-decoration: underline;
		text-transform: uppercase;
		text-shadow: aqua;
		table-layout: auto;
		font-size: large;
		font-weight: bold;
		font-stretch: extra-expanded;
		color: black;
	}

</style>


<table>
	<caption>Class Instance</caption>
	<tr>
		<th>Name</th>
		<th>Email</th>
		<th>Address</th>
	</tr>
	<tr>
		<td>${name}</td>
		<td>${email}</td>
		<td>${address}</td>
	</tr>

</table>

<hr/>

<table>
	<caption>Request Scope</caption>
	<tr>
		<th>Name</th>
		<th>Email</th>
		<th>Address</th>
	</tr>
	<tr>
		<td>${req_name}</td>
		<td>${req_email}</td>
		<td>${req_address}</td>
	</tr>

</table>

<hr/>

<table>
	<caption>Session Scope</caption>
	<tr>
		<th>Name</th>
		<th>Email</th>
		<th>Address</th>
	</tr>
	<tr>
		<td>${session_name}</td>
		<td>${session_email}</td>
		<td>${session_address}</td>
	</tr>

</table>

<hr/>
<table>
	<caption>ServletContext Scope</caption>
	<tr>
		<th>Name</th>
		<th>Email</th>
		<th>Address</th>
	</tr>
	<tr>
		<td>${scontext_name}</td>
		<td>${scontext_email}</td>
		<td>${scontext_address}</td>
	</tr>

</table>

<hr/>

<table>
	<caption>ValueStack</caption>
	<tr>
		<th>Name</th>
		<th>Email</th>
		<th>Address</th>
	</tr>
	<tr>
		<td>${vs_name}</td>
		<td>${vs_email}</td>
		<td>${vs_address}</td>
	</tr>

</table>