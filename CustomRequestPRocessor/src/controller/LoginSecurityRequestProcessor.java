package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.RequestProcessor;
import org.apache.struts.config.ModuleConfig;

public class LoginSecurityRequestProcessor extends RequestProcessor {

	@Override
	protected boolean processPreprocess(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("****************RequestProcessor****************");
		
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		
		if (username.equals("admin")&& password.equals("admin123"))
			return true;
		else
			return false;
	
	}

}
