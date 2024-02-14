package com.prowings.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteFromEmployee {
	public static void main(String[] args) {
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Sanj@1008");
			Statement stmt = con.createStatement();
			
			int res = stmt.executeUpdate("delete from empl where id = 11");
			
			if(res > 0)
				System.out.println("record deleted successfully!!!!"+res+ " rows affected successfully!!!");
			else
				System.out.println("can not delete the record!!!!");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
