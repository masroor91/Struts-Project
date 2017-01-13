package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.opensymphony.xwork2.ActionSupport;

public class AjaxAutoCompleteHelper extends ActionSupport{
	
	private String data="Andhra Pradesh, Telangana, Uttar Pradesh, Madhya Pradesh, Goa, Kerala, Tamil Nadu, Haryana, Bihar";
	private List states;
	private String state;
	
	
	@Override
	public String execute() throws Exception {
		states= new ArrayList();
		
		StringTokenizer st= new StringTokenizer(data, ",");
		
		while (st.hasMoreTokens()) {
			states.add(st.nextToken().trim());
			
		}
		
		return "success";
	}


	public List getStates() {
		return states;
	}


	public void setStates(List states) {
		this.states = states;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	
	
}
