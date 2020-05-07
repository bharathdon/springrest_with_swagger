package com.virtusa.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@RestController
public class EmployeeService {

	@GetMapping(path = "/employee",produces = "application/json")
	public List<Employee> findAllEmployee() {
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(new Employee(1, "abc"));
		arrayList.add(new Employee(2, "def"));
		arrayList.add(new Employee(3, "ghi"));
		return arrayList;
		
		
	}
	
}
