package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Account;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class AccountDBRepository implements AccountRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	@Inject
	private JSONUtil util;

	@Override
	public String getAllAccounts() {
		Query query = em.createQuery("Select a FROM Account a");
		Collection<Account> accounts = (Collection<Account>) query.getResultList();
		return util.getJSONForObject(accounts);
	}
	
	@Override
	public String findAccount(Long id) {
		Query query = em.createQuery("Select a FROM Account a WHERE id = "+id+"");
		Collection<Account> accounts = (Collection<Account>) query.getResultList();
		return util.getJSONForObject(accounts);
	}
	
	@Override
	@Transactional(REQUIRED)
	public String updateAccount(Long id, String account) {
		String accountInDB = findAccount(id);
		if (accountInDB != null) {
			em.remove(accountInDB);
			Account anAccount = util.getObjectForJSON(account, Account.class);
			em.persist(anAccount);
			return "{\"message\": \"account sucessfully updated\"}";
		}
		return "{\"message\": \"account not found\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String createAccount(String account) {
		Account anAccount = util.getObjectForJSON(account, Account.class);
		em.persist(anAccount);
		return "{\"message\": \"account has been sucessfully added\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String deleteAccount(Long id) {
		String accountInDB = findAccount(id);
		if (accountInDB != null) {
			em.remove(accountInDB);
		}
		return "{\"message\": \"account sucessfully deleted\"}";
	}
	
	public void setUtil(JSONUtil util) {
		this.util = util;
	}
}



