package controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.logging.LoggerFactory;

public class MyLogInInterceptor implements Interceptor {

	

	@Override
	public void init() {
		System.out.println("init");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		Log l=LogFactory.getLog(HelloController.class);
		l.info("**************in time***********");
		
			String res=ai.invoke();
			
		l.info("**************out time**************");
		return res;
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy");

	}

}
