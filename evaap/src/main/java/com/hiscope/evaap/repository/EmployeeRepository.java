package com.hiscope.evaap.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiscope.evaap.dto.EmployeeLogin;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeLogin, Long>{
	Optional<EmployeeLogin> findByEmail(String email);

	boolean existsByEmail(String email);


}
