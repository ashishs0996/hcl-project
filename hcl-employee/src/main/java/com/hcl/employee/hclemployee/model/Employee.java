package com.hcl.employee.hclemployee.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	private @Getter @Setter String EmpID;
	private @Getter @Setter String Name;
}
