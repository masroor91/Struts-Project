package controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;

public class CalController extends ActionSupport {
	
	private int fn, sn, res;

	public int getFn() {
		return fn;
	}

	@IntRangeFieldValidator(max="999999", min="1", message="first number should be between ${min} and ${max}")
	public void setFn(int fn) {
		this.fn = fn;
	}

	
	public int getSn() {
		return sn;
	}

	@IntRangeFieldValidator(max="999999", min="1", message="second number should be between ${min} and ${max}")
	public void setSn(int sn) {
		this.sn = sn;
	}
	
	public int getRes() {
		return res;
	}
	
	public void setRes(int res) {
		this.res = res;
	}
	
	public String add() throws Exception {
		res=fn+sn;
		System.out.println(res);
		return "success";
	}
	
	public String sub() throws Exception {
		res=fn-sn;
		System.out.println(res);
		return "success";
	}
	
	public String mul() throws Exception {
		res=fn*sn;
		System.out.println(res);
		return "success";
	}
	
	public String div() throws Exception {
		res=fn/sn;
		System.out.println(res);
		return "success";
	}
		

}
