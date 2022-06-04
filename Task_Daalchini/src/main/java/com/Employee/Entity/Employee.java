package com.Employee.Entity;

public class Employee {
	
	private int emp_id;
	private String emp_name;
	private String emp_email;
	private String emp_location;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_email() {
		return emp_email;
	}
	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}
	public String getEmp_location() {
		return emp_location;
	}
	public void setEmp_location(String emp_location) {
		this.emp_location = emp_location;
	}
	public Employee(int emp_id, String emp_name, String emp_email, String emp_location) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_email = emp_email;
		this.emp_location = emp_location;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_email=" + emp_email + ", emp_location="
				+ emp_location + "]";
	}
	
	
}
