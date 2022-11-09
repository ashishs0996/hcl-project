package com.hcl.employee.hclemployee.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.employee.hclemployee.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	//Employename based on the employeeID 
	@GetMapping("/{empid}")
	Employee getEmployeeName(@PathVariable("empid") String empid){
		return new Employee(empid, "RAM");
		
	}

}
