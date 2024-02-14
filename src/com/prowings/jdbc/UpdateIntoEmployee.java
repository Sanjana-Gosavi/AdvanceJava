package com.prowings.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateIntoEmployee {
	
	public static void main(String[] args) {
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Sanj@1008");
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("alter table empl add column Pincode int");
//			stmt.executeQuery("alter table empl drop Pincode");
			System.out.println("Column deleted successfully!!!");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
