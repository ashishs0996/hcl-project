package com.hcl.details.hcldetails.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hcl.details.hcldetails.model.Employee;
import com.hcl.details.hcldetails.model.EmployeeDetails;
import com.hcl.details.hcldetails.model.Salary;

@RestController
@RequestMapping("/details")
public class DetailsController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/{empid}")
	EmployeeDetails getEmployeeDetails(@PathVariable("empid") String empid){
		
		
		Salary salary = restTemplate.getForObject("http://hcl-salary-service/salary/"+empid, Salary.class);		
		Employee employee = restTemplate.getForObject("http://hcl-employee-service/employee/"+empid, Employee.class);
		
		
		return new EmployeeDetails(employee.getName(), "dept", salary.getSalary(), empid);
		
	}

}
