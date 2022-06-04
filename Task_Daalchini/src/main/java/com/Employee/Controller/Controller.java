package com.Employee.Controller;

import java.util.HashMap;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.Employee.Entity.Employee;
import com.Employee.Services.EmployeeService;


@RestController
public class Controller {
	EmployeeService emp= new EmployeeService();
	
	
	@GetMapping("/emp")
	public HashMap<Integer, Employee> showAllEmp() {
		HashMap<Integer, Employee> b=this.emp.getAllEmp();
		System.out.println(b);
		return b;
	}
	
	@GetMapping("/emp/{id}")
	public Employee getEmpById(@PathVariable ("id") int emp_id) {
		return (Employee) this.emp.getEmpById(emp_id);
		
	}
	
	@PostMapping("/save/{id}")
	public Employee postEmp(@RequestBody Employee emp1 , @PathVariable ("id") int emp_id) {
		Employee c = this.emp.addEmp(emp1 , emp_id);
		return c;
	}
	
	@PutMapping("/update/{id}")
	public void updateEmp(@RequestBody Employee emp2, @PathVariable("id")int id) {
		
		 this.emp.updateEmp(emp2, id);
		
	}
	@DeleteMapping("/delete/{id}")
	public void DeleteBooks(@PathVariable ("id") int id) {
		this.emp.deleteEmp(id);
	}
	

	

}
