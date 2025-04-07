package com.hiscope.evaap.service;

import com.hiscope.evaap.utill.*;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hiscope.evaap.dao.EmployeeLoginDto;
import com.hiscope.evaap.dto.EmployeeLogin;
import com.hiscope.evaap.repository.EmployeeRepository;



@Service
public class EmployeeService {
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeLogin registerEmployee(EmployeeLogin employeeLogin){
		
		if(employeeRepository.existsByEmail(employeeLogin.getEmail()))
		{
			throw new RuntimeException("Email is Already Taken! Please use a different Email");
		}
		employeeLogin.setPassword(passwordEncoder.encode(employeeLogin.getPassword()));
		
		return employeeRepository.save(employeeLogin);
	}

	public String loginEmployee(EmployeeLoginDto employeeLoginDto) {
		EmployeeLogin employeeLogin=employeeRepository.findByEmail(employeeLoginDto.getEmail()).orElseThrow(()->new RuntimeException("User Not Found"));
		
		if(passwordEncoder.matches(employeeLoginDto.getPassword(),  employeeLogin.getPassword())) {
			return "Login Success with "+ employeeLoginDto.getEmail();
		}
		
		return "Login Failed with " + employeeLoginDto.getEmail();
	}


	

}
