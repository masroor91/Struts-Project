package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginSuccess extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		System.out.println("****************Action****************");
		
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		
		HttpSession session=request.getSession();
		session.setAttribute("username", username);
		session.setAttribute("password", password);
		return mapping.findForward("success");
	}

}
