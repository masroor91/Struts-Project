package controller;

import com.opensymphony.xwork2.ActionSupport;

public class EmpController extends ActionSupport{
	
	private String name, email, address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public void validate() {
		
		if (name.equals(""))
			addFieldError("name", getText("msg1"));
		if (email.equals(""))
			addFieldError("email", getText("msg2"));
		if (address.equals(""))
			addFieldError("address", getText("msg3"));
		
	//for validate there is no return but we have to configure in struts.xml file following
	//<result name="input"></result>
		
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(name);
		System.out.println(email);
		System.out.println(address);
		
		return "success";
	}

}
