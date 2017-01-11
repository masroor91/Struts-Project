<%@taglib uri="/struts-tags" prefix="s" %>

<h1>Employee Reg Form</h1>

<s:form action="reg">
	<s:textfield name="name" label="Name" style="color:red;"/> <!-- No need to have errors tag -->
	<s:textfield name="email" label="Email" style="color:red;"/>
	<s:textfield name="address" label="Address" style="color:red;"/>
	
	<s:submit value="Register"/>
</s:form>
