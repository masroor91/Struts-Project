<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<div style="border-color:maroon; color: red; font-size: 50" >
	<center><bean:message key="title"/></center>
</div>

<html:form action="empcrudSave">
	<%request.setAttribute("fname", "index");%>
	<pre>
		<bean:message key="id"/>	<html:text property="id"/>
		<bean:message key="name"/>	<html:text property="name"/>
		<bean:message key="email"/>	<html:text property="email"/>
		<bean:message key="address"/>	<html:textarea property="address"/>
		<html:submit property="submit"><bean:message key="save"/></html:submit>			
		<a href="./changeLang.do?lang=hi&fname=index" style="border-style: dashed">Hindi</a>
		<a href="./changeLang.do?lang=en&fname=index" style="border-style: dashed">English</a>
		
	</pre>
</html:form>