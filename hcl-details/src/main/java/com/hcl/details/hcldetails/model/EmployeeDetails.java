package com.hcl.details.hcldetails.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDetails {
	private @Getter @Setter String empname;
	private @Getter @Setter String deptname;
	private @Getter @Setter int salary;
	private @Getter @Setter String empid;	
}
