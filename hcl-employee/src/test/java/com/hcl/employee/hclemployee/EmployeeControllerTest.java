package com.hcl.employee.hclemployee;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import com.hcl.employee.hclemployee.model.Employee;
import com.hcl.employee.hclemployee.resource.EmployeeController;


class EmployeeControllerTest {
	
	@Autowired
	private MockMvc mockMvc;

	@InjectMocks
	EmployeeController employeeController;
	
	void setup() throws Exception {

		MockitoAnnotations.initMocks(this);
		Employee employee = new Employee("emp1", "RAM");

	}

	@Test
	void test() throws Exception {
		mockMvc.perform(get("/employee/{empId}", "RAM")).andExpect(status().isOk());
	}

}
