package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ExceptionHandler;
import org.apache.struts.config.ExceptionConfig;

public class ArithMeticExceptionHandler extends ExceptionHandler {
	
	@Override
	public ActionForward execute(Exception e, ExceptionConfig ec, ActionMapping am, ActionForm af,
			HttpServletRequest req, HttpServletResponse resp) throws ServletException {

		int fn=Integer.parseInt(req.getParameter("fn"));
		int sn=Integer.parseInt(req.getParameter("sn"));
		
		if (sn==0) {
			req.setAttribute("res", fn);
		}
		else{
			req.setAttribute("res", fn/sn);
		}
		
		return am.findForward("success");
	}

}
