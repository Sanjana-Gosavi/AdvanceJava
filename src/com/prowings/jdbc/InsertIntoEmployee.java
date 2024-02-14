package com.prowings.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertIntoEmployee {
	public static void main(String[] args) throws SQLException {
	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Sanj@1008");
		Statement stmt = con.createStatement();
		
		int res = stmt.executeUpdate("insert into empl values (12, 'Jacob Harry', 'Senior Dev', 1400, 'USA')");
		
		if(res > 0)
			System.out.println("Record inserted successfully!!"+res+" rows affected!!");
		else 
			System.out.println("Error while adding record!!!");
	}
}
