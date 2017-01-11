<%@taglib uri="/struts-tags" prefix="s" %>

<h1>Employee Reg Form</h1>

<s:form action="reg">
	<s:textfield name="name" label="Name"/> <!-- No need to have errors tag -->
	<s:textfield name="email" label="Email"/>
	<s:textfield name="address" label="Address"/>
	
	<s:submit value="Register"/>
</s:form>
