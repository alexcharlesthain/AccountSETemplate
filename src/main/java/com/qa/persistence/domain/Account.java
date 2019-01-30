package com.qa.persistence.domain;

public class Account {
	
	//private Long id; 
	
	private String firstName;
	
	private String lastName;
	
	private String accountNumber;

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