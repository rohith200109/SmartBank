package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.web.multipart.MultipartFile;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class SbAccount {
	
	@SequenceGenerator(name ="sq" ,sequenceName = "smartBank",initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "sq")
	@Id
private	Integer id;
	
	@Column(length = 25)
	private	String custName;
	@Column(length = 25)
	private	String BankName="Smart Bank";
	@NonNull
	private	Long acNumber;
	private Long aadhaarNumber;
	private	Long mobileNumber;
	@Column(length = 20)
	private	String pan;
	@Column(length = 100)
	private	String address;
	@Column(length = 20)
	private	String accountType;
	@NonNull
	private	Long Amount;
	private	LocalDateTime dob;
	
	private	String panCard;
	private	String aadhar;
	
}
