package beans;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class Student extends ActionForm {
	private int id;
	private String name, email, address, gender, dob;
	private String [] hobbies;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors ae= new ActionErrors();
		
		if (id==0)
			ae.add("id_e", new ActionMessage("msg1"));
		if (name.equals(""))
			ae.add("name_e", new ActionMessage("msg2"));
		if (email.equals(""))
			ae.add("email_e", new ActionMessage("msg3"));
		if (address.equals(""))
			ae.add("address_e", new ActionMessage("msg4"));
		if (dob.equals(""))
			ae.add("dob_e", new ActionMessage("msg5"));
		if (gender.equals("") || gender==null)
			ae.add("gender_e", new ActionMessage("msg6"));
		if (hobbies.length<1 || gender==null)
			ae.add("hobbies_e", new ActionMessage("msg7"));
		return ae;
	}	

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		id=0;
		name="John";
		email="john@gmail.com";
		address="125, siliconvaley";
		dob="12/11/91";
//		gender="Male";
//		hobbies[0]="Criket";
//		hobbies[1]="Reading Books";
				
	}

}
