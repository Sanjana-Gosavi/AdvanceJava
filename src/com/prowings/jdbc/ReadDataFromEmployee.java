package com.prowings.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDataFromEmployee {

	public static void main(String[] args) {

		Connection con = null;

		try {
			// Step1: Register the driver class
		//	Class.forName("com.mySql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Sanj@1008");

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from empl");
			while(rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setRole(rs.getString(3));
				e.setAvgSalary(rs.getInt(4));
				e.setCountry(rs.getString(5));
				System.out.println(e);
				System.out.println("--------------------------------------------------");
			}
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		} 
		finally {
			try {
				con.close();
				System.out.println("Connection Closed Successfully!!!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
