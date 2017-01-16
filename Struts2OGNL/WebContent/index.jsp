<%@taglib uri="/struts-tags" prefix="s"%>

<h1>Registeration Form</h1>

<s:form action="reg">
	<s:textfield name="name" label="Name"/>
	<s:textfield name="email" label="Email"/>
	<s:textfield name="address" label="Address"/>
	
	<s:submit value="Register"/>

</s:form>