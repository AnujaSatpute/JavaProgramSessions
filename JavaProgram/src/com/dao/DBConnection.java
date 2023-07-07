package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	static String driver="com.mysql.cj.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306/employeedetails_javasession";
	static String username = "root";
	static String password ="Anuja@1098";
	
	public static Connection getConnection()
	{
		Connection con = null;
		try 
		{
			
			Class.forName(driver);
			System.out.println("Driver loaded");
			
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
	}
}
