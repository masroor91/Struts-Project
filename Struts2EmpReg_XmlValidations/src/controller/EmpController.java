package controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

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
	public String execute() throws Exception {
		System.out.println(name);
		System.out.println(email);
		System.out.println(address);
		
		return "success";
	}

}
