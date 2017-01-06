package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static Connection con= null;
	
//	private ConnectionFactory(){
//		this.con=this.getConnection();
//	}
	
	public static Connection getConnection() {
		

		System.out.println("Lodaing Mysql Driver class");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Please provide correct link of MySQL Driver Class");
			e.printStackTrace();
		}
		
		try {
			
			String url="jdbc:mysql://localhost/Mas";
			String user="root";
			String password="root";
			
			con=DriverManager.getConnection(url, user, password);
			
			if (con!=null) {
				System.out.println("Connection to "+ con.getCatalog()+ " is successfully established");
			}
			
		} catch (SQLException e) {
			System.out.println("Connection to database failed");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
	}

}
