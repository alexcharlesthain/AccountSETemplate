package com.qa.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import com.qa.persistence.domain.Account;
import com.qa.util.JSONUtil;

public class AccountMapRepository implements AccountRepository{
	
	Map<Long, Account> account = new HashMap<>();
	
	private JSONUtil util = new JSONUtil();
	
	public String getAllAccounts() {
		return util.getJSONForObject(account);
	}
	
	public int returnSize() {
		return account.size();
	}

	public String createAccount(String accountData) {
		Account newAccount = util.getObjectForJSON(accountData, Account.class);
		account.put(Long.parseLong(newAccount.getAccountNumber()), newAccount);
		return "Created new account with the First Name: " + newAccount.getFirstName() + ". Last Name: " + newAccount.getSecondName()+ ". Account Number: " + newAccount.getAccountNumber();
	}

	public String deleteAccount(Long id) {
		account.remove(id);
		return "Removed account with the ID: "+id+".";
	}

	public String updateAccount(Long id, String accountData) {
		Account updAccount = util.getObjectForJSON(accountData, Account.class);
		account.replace(id, account.get(id), updAccount);
		return "Updated Account: " +id+ " with data: First Name: " + updAccount.getFirstName() + ". Last Name: " + updAccount.getSecondName()+ ". Account Number: " + updAccount.getAccountNumber();
	}
	
	public String findAccount(Long id) {
		return util.getJSONForObject(account.get(id));
	}	
	
	public int getAccountByName(String name) {
		int count = 0;
		for(Account account: account.values()) {
			if(account.getFirstName().equals(name)) {
			count++;	
			}
		}			
		return count;
	}
}