package com.prowings.jdbc;

public class Employee {

	private int id;
	private String name;
	private String role;
	private int avgSalary;
	private String country;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, String role, int avgSalary, String country) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.avgSalary = avgSalary;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getAvgSalary() {
		return avgSalary;
	}

	public void setAvgSalary(int avgSalary) {
		this.avgSalary = avgSalary;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", avgSalary=" + avgSalary + ", country="
				+ country + "]";
	}
	
	
	
}
