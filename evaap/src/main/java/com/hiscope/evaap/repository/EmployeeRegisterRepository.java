package com.hiscope.evaap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiscope.evaap.dto.employeeregistration.EmployeeRegistration;

@Repository
public interface EmployeeRegisterRepository extends JpaRepository<EmployeeRegistration, Long>{

}
