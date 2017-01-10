package com.mas.ems.web.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.context.ConfigurableApplicationContext;

import com.mas.ems.dao.EmployeeDAO;
import com.mas.ems.model.Employee;
import com.mas.ems.web.beans.RegForm;

public class RegController extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		System.out.println("**********StrutsController***********");
		
		RegForm rf = (RegForm) form;
		
		Employee emp = new Employee();
		
		emp.setName(rf.getName());
		emp.setEmail(rf.getEmail());
		emp.setAddress(rf.getAddress());
		
		ServletContext scxt=request.getSession().getServletContext();
		
		ConfigurableApplicationContext cap= (ConfigurableApplicationContext) scxt.getAttribute("cap"); //We are calling spring container here
		
		EmployeeDAO dao=(EmployeeDAO) cap.getBean("dao");
		
		int pk= dao.save(emp);
		
		request.setAttribute("pk", pk);
		
		return mapping.findForward("success");
	}
}
