package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableResultSetExamples {

	static Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	void resultsetType() throws SQLException
	{
		stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		rs=stmt.executeQuery("select * from employee1");
	}
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		conn = DBConnection.getConnection();
		ScrollableResultSetExamples obj= new ScrollableResultSetExamples();
		obj.resultsetType();
	}

}
