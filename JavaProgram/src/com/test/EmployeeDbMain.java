package com.test;

import java.sql.Connection;
import com.dao.DBConnection;
import com.dao.DatabaseOperations;
import com.dao.PreparedStatmentOperation;

public class EmployeeDbMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = DBConnection.getConnection();
		/*
		 * DatabaseOperations obj = new DatabaseOperations();
		 * obj.displayEmployeeData(con); System.out.println("----------------");
		 * //obj.updateEmployee(con); //obj.deleteEmployee(con);
		 * //obj.insertEmployee(con); obj.searchData(con);
		 * //obj.displayEmployeeData(con);
		 */
		
		PreparedStatmentOperation obj = new PreparedStatmentOperation();
		obj.displayEmployee(con);
		//obj.insertEmployee(con);
		//obj.updateEmployeePre(con);
		//obj.deleteEmployeePre(con);
		obj.searchEmployeePre(con);
	}

}
