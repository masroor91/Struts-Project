package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class RegController extends ActionSupport {
	
	private String name, email, address;

	public String getName() {
		return name;
	}

	@RequiredStringValidator(message="Name is required")
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	
	@RequiredStringValidator(message="Email is required")
	@EmailValidator(message="Email is invalid")
	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	@RequiredStringValidator(message="Address is required")
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String execute() throws Exception {

		HttpServletRequest request= ServletActionContext.getRequest();
		request.setAttribute("req_name", name);
		request.setAttribute("req_email", email);
		request.setAttribute("req_address", address);
		
		HttpSession session= request.getSession();
		session.setAttribute("session_name", name);
		session.setAttribute("session_email", email);
		session.setAttribute("session_address", address);
		
		ServletContext scontext= ServletActionContext.getServletContext();
		scontext.setAttribute("scontext_name", name);
		scontext.setAttribute("scontext_email", email);
		scontext.setAttribute("scontext_address", address);
		
		ValueStack vs = ServletActionContext.getValueStack(request);
		Map m= new HashMap();
		
		m.put("vs_name", name);
		m.put("vs_email", email);
		m.put("vs_address", address);
		
		vs.push(m);
	
		return "success";
	}
	
	

}
