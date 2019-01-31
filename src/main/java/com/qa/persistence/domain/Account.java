package com.qa.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	
	//private Long id; 
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(length=20) private String firstName;
	@Column(length=20) private String lastName;
	@Column(length=6) private String accountNumber;

	public Account() {

	}

	public Account(String firstName, String secondName, String accountNumber) {
		this.firstName = firstName;
		this.lastName = secondName;
		this.accountNumber = accountNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return lastName;
	}

	public void setSecondName(String secondName) {
		this.lastName = secondName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/*public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}*/

}