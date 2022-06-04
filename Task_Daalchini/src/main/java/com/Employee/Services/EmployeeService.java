package com.Employee.Services;

import java.util.HashMap;
import java.util.Set;

import com.Employee.Entity.Employee;

public class EmployeeService {
	private static HashMap<Integer, Employee> emp = new HashMap<>();

	static {
		emp.put(12, new Employee(12, "Parag patil", "parag@gmail.com", "pune"));
		emp.put(13, new Employee(13, "Chninmay Surve", "chinu@gmail.com", "Mumbai"));
		emp.put(14, new Employee(14, "Rani patil", "Rani@gmail.com", "Delhi"));
	}

	public HashMap<Integer, Employee> getAllEmp() {
		return emp;
	}

	public Employee getEmpById(int emp_id) {

		if (emp.containsKey(emp_id)) {
			Employee emp1=emp.get(emp_id);
			System.out.println(emp1);
			return emp1;
		}

		return null;

	}


	public Employee addEmp(Employee emp1, int emp_id) {
		Employee a=emp.put(emp_id, emp1);
		return a;
	}

	public void updateEmp(Employee emp2, int id) {
		if (emp.containsKey(id)) {
			emp.replace(id, emp2);
		}
		
	}

	public void deleteEmp(int id) {
		if (emp.containsKey(id)) {
			emp.remove(id);
		}
		
	}
	
	
}
