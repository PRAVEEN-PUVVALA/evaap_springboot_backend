package com.hiscope.evaap.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hiscope.evaap.dto.employeeregistration.EmployeeEducation;
import com.hiscope.evaap.dto.employeeregistration.EmployeeEmployment;
import com.hiscope.evaap.dto.employeeregistration.EmployeeRegistration;
import com.hiscope.evaap.repository.EmployeeRegisterRepository;

import jakarta.transaction.Transactional;


@Service
public class EmployeeRegisterService {
	
	
	@Autowired
	private EmployeeRegisterRepository employeeRegisterRepository;
	
	@Transactional
	public EmployeeRegistration saveEmployeeRegistration(String firstName,
											String lastName,
											String email,
											Long mobileNumber,
											String address,
											String dob,
											List<EmployeeEducation> education,
											List<EmployeeEmployment> employment,
											MultipartFile resume
		
														){
		
		try {
		EmployeeRegistration employeeRegistration = new EmployeeRegistration();
		
		employeeRegistration.setFirstName(firstName);
		employeeRegistration.setLastName(lastName);
		employeeRegistration.setEmail(email);
		employeeRegistration.setAddress(address);
		employeeRegistration.setMobileNumber(mobileNumber);
		employeeRegistration.setDob(dob);
		employeeRegistration.setEducation(education);
		employeeRegistration.setEmployment(employment);
		employeeRegistration.setResumeFileName(resume.getBytes());
		
		EmployeeRegistration employeeRegistration2 = employeeRegisterRepository.save(employeeRegistration);
		return employeeRegistration2;
		}
		catch(IOException e) {
			 throw new RuntimeException("File processing error: " + e.getMessage());
		}
		
		
		
	}

}
