package controller;

import com.opensymphony.xwork2.ActionSupport;

public class CalController extends ActionSupport {
	
	private int fn, sn, tn;

	public int getFn() {
		return fn;
	}

	public void setFn(int fn) {
		this.fn = fn;
	}

	public int getSn() {
		return sn;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}
	
	
	
	public int getTn() {
		return tn;
	}

	public void setTn(int tn) {
		this.tn = tn;
	}

	@Override
	public String execute() throws Exception {
		
		tn= fn/sn;
		
		return "success";
	}

}
