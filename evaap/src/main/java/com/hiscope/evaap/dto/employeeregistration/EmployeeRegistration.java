package com.hiscope.evaap.dto.employeeregistration;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name  = "employee_registration")
public class EmployeeRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String firstName;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(unique = true, nullable = false)
	private String email;
	
	@Column(unique = true, nullable = false)
	private Long mobileNumber;
	
	@Column(nullable = false)
	private String address;
	
	@Column(nullable = false)
	private String dob;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<EmployeeEducation> education;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<EmployeeEmployment> employment;

	@Lob
	private byte[] resumeFileName;

}
