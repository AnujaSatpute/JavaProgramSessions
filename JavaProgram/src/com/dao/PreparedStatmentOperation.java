package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatmentOperation {

	PreparedStatement psmt;
	Scanner sc = new Scanner(System.in);

	 public void displayEmployee(Connection con) {
		 
		
		 try {
				psmt = con.prepareStatement("select * from employee1");

				ResultSet rs = psmt.executeQuery();

				while (rs.next()) {
					
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString("email")+"\t"
							+ rs.getInt("esalary") +"\t"+ rs.getInt(5));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 public void insertEmployee(Connection con)
	 {
		 System.out.println("Enter eid ,ename ,email, salary, deptid : ");
		 int id = sc.nextInt();
		 String ename = sc.next();
		 String email=sc.next();
		 int salary = sc.nextInt();
		 int deptid = sc.nextInt();
		 
		 try {
				psmt = con.prepareStatement("insert into employee1 values(?,?,?,?,?)");
				psmt.setInt(1, id);
				psmt.setString(2, ename);
				psmt.setString(3,email);
				psmt.setInt(4, salary);
				psmt.setInt(5, deptid);
				int i = psmt.executeUpdate();
				
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
	 public void updateEmployeePre(Connection con)
	 {
		 System.out.println("Enter the id witch is updated : ");
		 int id = sc.nextInt();
		 System.out.println("1.Update Salary :");
		 System.out.println("2.Update emai : ");
		 System.out.println("Enter your choice (1/2) :");
		 int ch = sc.nextInt();
		 
		 if(ch==1)
		 {
			 try {
				 System.out.println("Enter salary : ");
				 int salary = sc.nextInt();
				psmt = con.prepareStatement("update employee1 set esalary= ? where eid = ?");
				psmt.setInt(1, salary);
				psmt.setInt(2, id);
                int i = psmt.executeUpdate();
				
				if(i!=0)
				{
					System.out.println("Record Updated sucessful..!!!");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 
		 if(ch==2)
		 {
			 try {
				 System.out.println("Enter salary : ");
				 String email = sc.next();
				psmt = con.prepareStatement("update employee1 set email= ? where eid = ?");
				psmt.setString(1, email);
				psmt.setInt(2, id);
                int i = psmt.executeUpdate();
				
				if(i!=0)
				{
					System.out.println("Record Updated sucessful..!!!");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
	 public void deleteEmployeePre(Connection con)
	 {
		 System.out.println("Enter id : ");
		 int id= sc.nextInt();
		 try {
			psmt= con.prepareStatement("delete from employee1 where eid = ?");
			psmt.setInt(1, id);
			int i= psmt.executeUpdate();
			if(i!=0)
			{
				System.out.println("Record deleted sucessful..!!!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 public void searchEmployeePre(Connection con)
	 {
		 System.out.println("Enter id : ");
		 int id = sc.nextInt();
		 
		 try {
			psmt = con.prepareStatement("Select * from employee1 where eid =? ");
			psmt.setInt(1, id);
			ResultSet rs= psmt.executeQuery();
			while (rs.next()) {
				
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString("email")+"\t"
						+ rs.getInt("esalary") +"\t"+ rs.getInt(5));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	 }
}
