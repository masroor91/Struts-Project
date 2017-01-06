package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.LookupDispatchAction;

import beans.Employee;
import dao.EmpDao;

public class EmpController extends LookupDispatchAction{
	
	//execute method responsibilty
	//1. uysing parameter it will read button value
	//2. for that value it will find proper key from properties file
	//3. It will call getKeyMethodMap and will return value Map Object
	//4. From that map it will expect Method Values using Button Keys
	
	protected Map getKeyMethodMap() {
		
		Map m= new HashMap();
	 
	 		m.put("save", "empSave");
	 		m.put("update", "empUpdate");
	 		m.put("delete", "empDelete");
	 		m.put("find", "empFind");
	 		m.put("findall", "empFindAll");
	 	 
	 	return m;
			
	}
	
	EmpDao dao = new EmpDao();
	
	public ActionForward empSave(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse resp)
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
	
	public ActionForward empUpdate(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse resp)
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
	
	public ActionForward empDelete(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse resp)
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
	
	public ActionForward empFind(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse resp)
			throws Exception {
		Employee e= (Employee) af;
		
		List list= dao.find(e.getId());
		req.setAttribute("list", list);
		return am.findForward("find");
	}
	
	public ActionForward empFindAll(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse resp)
			throws Exception {
		
		List list=dao.findAll();
		req.setAttribute("list", list);
		return am.findForward("findAll");
	}

}
