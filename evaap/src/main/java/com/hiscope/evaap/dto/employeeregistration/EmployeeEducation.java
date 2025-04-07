package com.hiscope.evaap.dto.employeeregistration;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmployeeEducation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
		
	 @Column(nullable = false)
	  private String institution;
	  
	 @Column(nullable = false)
	  private String graduationYear;
	  
	 @Column(nullable = false)
	  private String fieldStudy;
	  
	 @Column(nullable = false)
	  private String cgpa;
	

}
