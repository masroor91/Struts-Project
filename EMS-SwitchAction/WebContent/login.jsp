<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<h1>Login Form</h1>

<html:form action="login">

	<pre>
		
		Username: <html:text property="username"/><html:errors property="username"/>
		Password: <html:text property="password"/><html:errors property="password"/>
		Role: 	  <html:select property="role" name="LF"><html:errors property="role"/>
					<html:option value="">--Select Role--</html:option>
    				<html:options  name="LF" property="roleList"/>
	 		  	  </html:select>
			<html:submit value="Login"/>
	</pre>
	
	<html:link action="adminforward" module="/admin">Click to Redirect Admin</html:link>

</html:form>