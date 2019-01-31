package com.qa.business;

import javax.inject.Inject;

import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.AccountRepository;
import com.qa.util.JSONUtil;

public class AccountBusinessImp implements AccountService {

	@Inject
	private AccountRepository repo;
	
	@Inject
	private JSONUtil util;

	public String getAllAccounts() {
		return repo.getAllAccounts();
	}

	@Override
	public String addAccount(String account) {
		Account accountObject = util.getObjectForJSON(account, Account.class);
		if (accountObject.getAccountNumber().equals("9")) {
			return "{\"message\": \"This account is blocked!\"}";
		}	
		return repo.createAccount(account);
	}

	@Override
	public String deleteAccount(Long id) {
		return repo.deleteAccount(id);
	}

	public void setRepo(AccountRepository repo) {
		this.repo = repo;
	}
}
