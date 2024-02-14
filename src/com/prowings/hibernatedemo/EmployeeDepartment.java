package com.prowings.hibernatedemo;

public class EmployeeDepartment
{
	private int deptId;
	private String deptName;
	
	public EmployeeDepartment() {
		super();
	}

	public EmployeeDepartment(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "EmployeeDepartment [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	

}
