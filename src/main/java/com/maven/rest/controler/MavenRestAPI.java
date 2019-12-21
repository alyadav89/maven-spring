package com.maven.rest.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maven.rest.model.Employee;

@RestController
public class MavenRestAPI {
	@RequestMapping(value = "/getAPI/response/", method = RequestMethod.GET)
	public String getData() {
		String s = "Rest Api Response";
		return s;
	}
	
	@RequestMapping(value = "/getAPI/employee/", method = RequestMethod.GET)
	public Employee getEmployee() {
		String s = "Rest Api Response";
		Employee employee = new Employee(1l, "Hemanth1", "USA", "TCS", 9098990009l);
		return employee;
	}
}
