package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


import beans.Student;

public class StudentRegController extends Action {
		
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Student st= (Student) form;
		System.out.println(st.getName());
		System.out.println(st.getEmail());
		System.out.println(st.getAddress());
		System.out.println(st.getGender());
		String[] hob= st.getHobbies();
		for (int i = 0; i <hob.length ; i++) {
			System.out.println(hob[i]);	
		}
		
		form.reset(mapping, request);
		return mapping.findForward("success");
	}
}
