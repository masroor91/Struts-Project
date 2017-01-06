package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import org.apache.struts.actions.EventDispatchAction;

import beans.Employee;
import dao.EmpDao;

public class EmpController extends EventDispatchAction {
	
	//execute() mthod will read the parameter id
	//through parameter we have to supply all submit button parameters name using commas separator
	//By making that comma separated String into multiple substrings then using each substring it will compare submit button id
	//if match it will redirect the request to method with same name
	
	EmpDao dao = new EmpDao();
	
	public ActionForward save(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse resp)
			throws Exception {
		
		Employee e= (Employee) af;
		int i= dao.save(e.getId(), e.getName(), e.getEmail(), e.getAddress());
		if (i!=0) {
			return am.findForward("save");
		}
		else{
			return am.findForward("failure");
		}
		
	}
	
	public ActionForward update(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse resp)
			throws Exception {
		
		Employee e= (Employee) af;
		
		boolean f= dao.update(e.getId(), e.getName(), e.getEmail(), e.getAddress());
		if (f==true){
				return am.findForward("update");
		}
		else{
			return am.findForward("failure");
		}
	}
	
	public ActionForward delete(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse resp)
			throws Exception {
		
		Employee e= (Employee)af;
		
		boolean f= dao.delete(e.getId());
		
		if (f==true) {
			return am.findForward("delete");
		}
		else{
			return am.findForward("failure");
		}
		
		
	}
	
	public ActionForward find(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse resp)
			throws Exception {
		Employee e= (Employee) af;
		
		List list= dao.find(e.getId());
		req.setAttribute("list", list);
		return am.findForward("find");
	}
	
	public ActionForward findAll(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse resp)
			throws Exception {
		
		List list=dao.findAll();
		req.setAttribute("list", list);
		return am.findForward("findAll");
	}

}
