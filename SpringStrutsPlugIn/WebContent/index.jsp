<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html:form action="reg">
	<pre>
		Name:	<html:text property="name"/> <html:errors property="name"/>
		Email:	<html:text property="email"/><html:errors property="email"/>
		Address:<html:textarea property="address"/><html:errors property="address"/>
				<html:submit value="Register"/>
	
	</pre>

</html:form>