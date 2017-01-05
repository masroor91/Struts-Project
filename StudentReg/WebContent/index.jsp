<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<h1>REGISTERATION FORM</h1>

<html:form action="reg" method="post">
	<table>
		<tr>
			<td>Id</td>
			<td><html:text property="id"/></td>
			<td><html:errors property="id_e"/></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><html:text property="name"/></td>
			<td><html:errors property="name_e"/></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><html:text property="email"/></td>
			<td><html:errors property="email_e"/></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><html:textarea property="address"/></td>
			<td><html:errors property="address_e"/></td>
		</tr>
		<tr>
			<td>DOB</td>
			<td><html:text property="dob"/></td>
			<td><html:errors property="dob_e"/></td>
		</tr>
		<tr>
			<td>Gender:</td>
			<td><html:radio property="gender" value="male"/>Male</td>
			<td><html:errors property="gender_e"/></td>
		</tr>
		<tr>
			<td></td>
			<td><html:radio property="gender" value="female"/>Female</td>
			<td></td>
		</tr>
		<tr>
			<td>Hobbies:</td>
			<td><html:checkbox property="hobbies" value="Cricket"/>Watching Cricket</td>
			<td><html:errors property="hobbies_e"/></td>
		</tr>
		<tr>
			<td></td>
			<td><html:checkbox property="hobbies" value="Reading Books"/>Reading Books</td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td><html:submit value="regsiter"/></td>
			<td></td>
		</tr>
	</table>
</html:form>
