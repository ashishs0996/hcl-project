package com.hcl.salary.hclsalary.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.salary.hclsalary.model.Salary;

@RestController
@RequestMapping("/salary")
public class SalaryController {
	
	@GetMapping("/{empid}")
	Salary getEmployeeName(@PathVariable("empid") String empid){
		return new Salary(empid, 10000);
	}
		

}
