package com.hcl.details.hcldetails.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Salary {
	private @Getter @Setter String empID;
	private @Getter @Setter int Salary;
}
