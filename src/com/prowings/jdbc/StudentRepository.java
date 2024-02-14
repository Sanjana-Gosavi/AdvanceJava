package com.prowings.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StudentRepository {
	
	private static final String url = "jdbc:mysql://localhost:3306/clg";
	private static final String username = "root";
	private static final String password = "Sanj@1008";
	
	public static void createStudent()
	{
		String insert = "insert into student values (40, 'Rohan')" ;
		
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();
			){
				stmt.executeUpdate(insert);
				System.out.println("Record inserted successfully!!!!");
			}catch (SQLException e) {
			e.printStackTrace();
			}
	}
	
	public static Collection<Student> getAllStudents()
	{
		List<Student> student = new ArrayList<Student>();
		
		 
		try (
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from student");
			){
				while(rs.next())
				{
					Student s = new Student();
					s.setId(rs.getInt(1));
					s.setName(rs.getString(2));
					System.out.println(s);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}
	public static void main(String[] args) {
		
		//createStudent();
		getAllStudents();
	}
}
