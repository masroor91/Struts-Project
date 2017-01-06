<%@taglib uri="http://struts.apache.org/tags-html"  prefix="html"%>

<h1>Reg Form</h1>

<html:form action="reg" method="post" onsubmit="return validateRF(this);">
	<html:javascript formName="RF"/>
	<pre>
		ID		:<html:text property="id"/><html:errors property="id"/>
		Name		:<html:text property="name"/><html:errors property="name"/>
		Email		:<html:text property="email"/><html:errors property="email"/>
		Salary		:<html:text property="salary"/><html:errors property="salary"/>
		Credit Card	:<html:text property="creditcard"/><html:errors property="creditcard"/>
		Phone no	:<html:text property="phone"/><html:errors property="phone"/>
			<html:submit value="Register"/>
	</pre>

</html:form>