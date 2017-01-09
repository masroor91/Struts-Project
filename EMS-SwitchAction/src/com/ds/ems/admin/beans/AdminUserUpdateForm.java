package com.ds.ems.admin.beans;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AdminUserUpdateForm extends ActionForm {
	
	private String oldUsername, newUsername, oldPassword, newPassword;

	public String getOldUsername() {
		return oldUsername;
	}

	public void setOldUsername(String oldUsername) {
		this.oldUsername = oldUsername;
	}

	public String getNewUsername() {
		return newUsername;
	}

	public void setNewUsername(String newUsername) {
		this.newUsername = newUsername;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		
		ActionErrors ae = new ActionErrors();
		
		if(oldUsername.equals(""))
			ae.add("oldUsername", new ActionMessage("msg1"));
		if(newUsername.equals(""))
			ae.add("newUsername", new ActionMessage("msg2"));
		if(oldPassword.equals(""))
			ae.add("oldPassword", new ActionMessage("msg3"));
		if(newPassword.equals(""))
			ae.add("newPassword", new ActionMessage("msg4"));
		
		return super.validate(mapping, request);
	}

}
