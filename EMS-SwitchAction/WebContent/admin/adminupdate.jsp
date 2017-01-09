<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<h1>Admin Success and Update</h1>

<html:form action="adminupdate">
	
	<pre>
		Old_Username: <html:text property="oldUsername"/><html:errors property="oldUsername"/>	
		New-Username: <html:text property="newUsername"/><html:errors property="newUsername"/>
		Old_Password: <html:text property="oldPassword"/><html:errors property="oldPassword"/>
		New-Password: <html:text property="newPassword"/><html:errors property="oldPassword"/>
		
			<html:submit value="Admin Update"/>
	</pre>
</html:form>