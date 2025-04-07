package com.hiscope.evaap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiscope.evaap.dao.EmployeeLoginDto;
import com.hiscope.evaap.dto.EmployeeLogin;
import com.hiscope.evaap.service.EmployeeService;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@CrossOrigin("*")
@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/register")
	public EmployeeLogin registerDoctor(@RequestBody EmployeeLogin employeeLogin) {
		return employeeService.registerEmployee(employeeLogin);
	}
	
	
	@PostMapping("/login")
	public String loginDoctor(@RequestBody EmployeeLoginDto employeeLoginDto) {
		return employeeService.loginEmployee(employeeLoginDto);
	}

}
