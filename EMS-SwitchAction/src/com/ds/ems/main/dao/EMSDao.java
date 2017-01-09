package com.ds.ems.main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EMSDao {
	
	Connection con = ConnectionFactory.getConnection();
	
	public int authorize(String user, String password, String role){
		int status=0;
		
		try {
			PreparedStatement stmtcomp=	con.prepareStatement("Select * from Login where username=? and password=? and role=?");
			stmtcomp.setString(1, user);
			stmtcomp.setString(2, password);
			stmtcomp.setString(3, role);
			
			ResultSet rs=stmtcomp.executeQuery();
			
			if(rs.next()){
				status=1;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return status=0;
			
		}
		
		
		return status;
		
	}
}
