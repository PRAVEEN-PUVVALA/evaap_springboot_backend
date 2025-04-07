package com.hiscope.evaap.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Repository;

import com.hiscope.evaap.dto.EmployeeLogin;
import com.hiscope.evaap.repository.EmployeeRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;




@Setter
@Getter
@AllArgsConstructor
public class EmployeeLoginDto {

	private String email;
	private String password;
	

}
