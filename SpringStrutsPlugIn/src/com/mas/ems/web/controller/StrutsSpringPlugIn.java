package com.mas.ems.web.controller;

import javax.servlet.ServletException;

import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StrutsSpringPlugIn implements PlugIn {

	ConfigurableApplicationContext cap=null;

	@Override
	public void init(ActionServlet as, ModuleConfig mc) throws ServletException {
		cap = new ClassPathXmlApplicationContext("resources/spring.xml");
		as.getServletContext().setAttribute("cap", cap);
		
		System.out.println("**************struts spring plugin*********************");
	}
	
	@Override
	public void destroy() {
		cap.close();

	}

}
