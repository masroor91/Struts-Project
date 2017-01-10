package com.ds.ems.main.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.ds.ems.main.beans.LoginForm;
import com.ds.ems.main.dao.EMSDao;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		EMSDao dao = new EMSDao();
		LoginForm lf = (LoginForm) form;
		String user= lf.getUsername();
		String password= lf.getPassword();
		String role= lf.getRole();
		
		ActionForward af= new ActionForward();
		int status=dao.authorize(user, password, role);
		System.out.println(status);
		if(status==1){
			if (role.equals("admin"))
				af= mapping.findForward("adminsuccess");
			if (role.equals("employee"))
				af=mapping.findForward("employeesuccess");
			if (role.equals("user"))
				af= mapping.findForward("usersuccess");
		}
		else{
			ActionMessages am = new ActionMessages();
			am.add("username", new ActionMessage("msg4"));
			am.add("password", new ActionMessage("msg5"));
			addErrors(request, am); //This adding errors after we get errors from database validations
			af= mapping.findForward("samepage");
		}
		
		return af;
		
	}
}
