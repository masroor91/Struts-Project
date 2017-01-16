<%@taglib uri="/struts-tags" prefix="s"%>

<h1>HELLO WITH INTERCEPTOR</h1>

<s:form action="hello">
	<s:textfield name="name" label="Name"/>
	<s:submit value="Hello"/>
</s:form>