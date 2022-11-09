package com.hcl.salary.hclsalary.resource;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.configuration.MockAnnotationProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.hcl.salary.hclsalary.model.Salary;

@WebMvcTest(SalaryController.class)
class SalaryControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@InjectMocks
	SalaryController salaryController;

	void setup() throws Exception {

		MockitoAnnotations.initMocks(this);
		Salary salary = new Salary("emp1", 10000);

	}

	@Test
	void testGetEmployeeName() throws Exception {

		mockMvc.perform(get("/salary/{empId}", 10000)).andExpect(status().isOk());

	}

}
