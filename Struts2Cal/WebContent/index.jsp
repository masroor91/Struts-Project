<%@taglib uri="/struts-tags" prefix="s" %>

<h1>Employee Reg Form</h1>

<s:form action="cal">
	<s:textfield name="name" label="FirstNumber"/> <!-- No need to have errors tag -->
	<s:textfield name="email" label="FirstNumber"/>
	<s:submit value="ADD" action="addcal"/>
	<s:submit value="SUB" action="subcal"/>
	<s:submit value="MUL" action="mulcal"/>
	<s:submit value="DIV" action="divcal"/>
</s:form>
