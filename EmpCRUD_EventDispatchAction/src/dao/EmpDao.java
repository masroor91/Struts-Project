package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Employee;

public class EmpDao {
	
	Connection con = ConnectionFactory.getConnection();
	
	public int save(int id, String name, String email, String address) {
		int status=0;
		
		try {
			
			PreparedStatement saveStmt=	con.prepareStatement("insert into Employee value(?,?,?,?)");
			saveStmt.setInt(1, id);
			saveStmt.setString(2, name);
			saveStmt.setString(3, email);
			saveStmt.setString(4, address);
			
			status= saveStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return status;
	}
	
	public boolean update(int id, String name, String email, String address) {
		int status=0;
		boolean flag=false;
		try {
			
			PreparedStatement updateStmt=	con.prepareStatement("update Employee set name=?"
					+ ",email=?, address=? where id=?");
			updateStmt.setInt(4, id);
			updateStmt.setString(1, name);
			updateStmt.setString(2, email);
			updateStmt.setString(3, address);
			
			status= updateStmt.executeUpdate();
			
			if (status>1) {
				flag= true;
			}
			else{
				flag= false;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	
	}
	
	public boolean delete(int id) {
		boolean flag=false;
		
		try {
			
			PreparedStatement deleteStmt= con.prepareStatement("Delete from Employee where id=?");
			deleteStmt.setInt(1, id);
			
			flag= deleteStmt.execute();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
		
		
	}
	
	public List find(int id) {
		
		List<Employee> list = new ArrayList<Employee>();
		
		try {
			
			PreparedStatement findStmt = con.prepareStatement("Select * from Employee where id=?");
			
			findStmt.setInt(1, id);
			
			ResultSet rs= findStmt.executeQuery();
			Employee e=null;
			
			if (rs.next()){
				e= new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setAddress(rs.getString(4));
				list.add(e);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	public List findAll() {
		List<Employee> list = new ArrayList<Employee>();
		
		try {
			
			PreparedStatement findStmt = con.prepareStatement("Select * from Employee");
			
			ResultSet rs= findStmt.executeQuery();
			Employee e=null;
			
			while (rs.next()){
				e= new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setAddress(rs.getString(4));
				list.add(e);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}

}
