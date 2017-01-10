<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<div style="border-color:maroon; color: red; font-size: 50" >
	<center><bean:message key="title"/></center>
</div>

<html:form action="reg">
	<pre>
		<bean:message key="id"/>	<html:text property="id"/>
		<bean:message key="name"/>	<html:text property="name"/>
		<bean:message key="email"/>	<html:text property="email"/>
		<bean:message key="address"/>	<html:textarea property="address"/>
				<html:submit><bean:message key="submit"/></html:submit>
				
		<a href="./changeLang.do?lang=hi" style="border-style: dashed">Hindi</a>
		<a href="./changeLang.do?lang=en" style="border-style: dashed">English</a>
		
	</pre>


</html:form>