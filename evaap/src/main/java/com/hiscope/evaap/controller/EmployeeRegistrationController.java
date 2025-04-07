package com.hiscope.evaap.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hiscope.evaap.dto.employeeregistration.EmployeeEducation;
import com.hiscope.evaap.dto.employeeregistration.EmployeeEmployment;
import com.hiscope.evaap.dto.employeeregistration.EmployeeRegistration;
import com.hiscope.evaap.service.EmployeeRegisterService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@CrossOrigin("*")
@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/employee-registration")
public class EmployeeRegistrationController {
	
	@Autowired
	private EmployeeRegisterService employeeRegisterService;
	
	@PostMapping("")
	public ResponseEntity<?> registerEmployeeRegistration(@RequestParam String firstName,
															   @RequestParam String lastName,
															   @RequestParam String email,
															   @RequestParam Long mobileNumber,
															   @RequestParam String address,
															   @RequestParam String dob,
															   @RequestBody List<EmployeeEducation> education,
															   @RequestBody List<EmployeeEmployment> employment,
															   @RequestPart MultipartFile resume){
		  try {
			  EmployeeRegistration savedEmployeeRegistration = employeeRegisterService.saveEmployeeRegistration
					  													(firstName,lastName,email,
					  													mobileNumber,address,dob,
					  													education,employment,
					  													resume);
					  																	
	            return ResponseEntity.ok( savedEmployeeRegistration);
	        } catch (Exception e) {
	        	return ResponseEntity.badRequest().body("Error registering doctor: " + e.getMessage());
	        }
	}	

}
