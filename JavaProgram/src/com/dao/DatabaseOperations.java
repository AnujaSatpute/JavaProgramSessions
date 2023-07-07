package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseOperations {
	Statement stmt;
	ResultSet rs;

	public void displayEmployeeData(Connection con) {
		try {
			stmt = con.createStatement();

			rs = stmt.executeQuery("select * from employee1");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString("email")+"\t"
						+ rs.getInt("esalary") +"\t"+ rs.getInt(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateEmployee(Connection con)
	{
		try
		{
			stmt=con.createStatement();
			//int i = stmt.executeUpdate("update employee1 set esalary =60000 where eid =102" );
			int i = stmt.executeUpdate("update employee1 set esalary =esalary-(esalary*0.15) where deptid=333" );
			System.out.println("i: "+i);
			if(i !=0)
			{
				System.out.println("Record Updated ....");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void deleteEmployee(Connection con)
	{
		try {
			stmt = con.createStatement();
			int i=stmt.executeUpdate("delete from  employee1 where eid =103 " );
			System.out.println("i: "+i);
			if(i !=0)
			{
				System.out.println("Record Deleted ....");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertEmployee(Connection con)
	{
		try {
			stmt = con.createStatement();
			int i = stmt.executeUpdate("insert into employee1 values(101,'chiki','chiki1@gmail.com',60000,222)");
			if(i!=0)
			{
				System.out.println("Record inserted sucessful..!!!");
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void searchData(Connection con)
	{
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee1 where eid=101");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
