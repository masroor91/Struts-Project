package com.mas.ems.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.mas.ems.model.Employee;

public class EmployeeDAO {
	
	private HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	
	public int save(Employee emp) {
		int pk=(Integer) ht.save(emp);
		System.out.println("DAO Save Method Executing"+ pk);
		return pk;
	
	}

}
