package com.ds.ems.main.beans;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginForm extends ActionForm {
	
	private String username, password, role;
	private List roleList;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List getRoleList() {
		List list= new ArrayList();
		list.add("admin");
		list.add("employee");
		list.add("user");
		
		return list;
	}
	public void setRoleList(List roleList) {
		this.roleList = roleList;
	}

	
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors ae = new ActionErrors();
		
		if (username.equals(""))
			ae.add("username", new ActionMessage("msg1"));
		
		if (password.equals(""))
			ae.add("password", new ActionMessage("msg2"));
		
		System.out.println(role);
		if (role.equals(""))
			ae.add("role",new ActionMessage("msg3"));
		
		return ae;
	}
	
}
