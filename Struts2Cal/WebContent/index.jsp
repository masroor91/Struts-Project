<%@taglib uri="/struts-tags" prefix="s" %>

<h1>Employee Reg Form</h1>

<s:form action="cal">
	<s:textfield name="fn" label="FirstNumber"/> <!-- No need to have errors tag -->
	<s:textfield name="sn" label="SecondNumber"/>
	<s:submit value="ADD" action="addcal"/>
	<s:submit value="SUB" action="subcal"/>
	<s:submit value="MUL" action="mulcal"/>
	<s:submit value="DIV" action="divcal"/>
</s:form>
