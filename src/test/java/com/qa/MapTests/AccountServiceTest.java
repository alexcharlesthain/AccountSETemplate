package com.qa.MapTests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.AccountMapRepository;

public class AccountServiceTest {

	private AccountMapRepository repo = new AccountMapRepository();
	
	
	private static final String MOCK_DATA_ARRAY_ONE = "{\"firstName\":\"John\",\"secondName\":\"Smith\",\"accountNumber\":\"1234\"}";
	
	private static final String MOCK_DATA_ARRAY_TWO = "{\"firstName\":\"Roger\",\"secondName\":\"Smith\",\"accountNumber\":\"4321\"}";
	
	private static final String MOCK_DATA_ARRAY_THREE = "{\"firstName\":\"Paul\",\"secondName\":\"Smith\",\"accountNumber\":\"4322\"}";

	
	
	@Before
	public void setup() {
		repo.createAccount(MOCK_DATA_ARRAY_ONE);
		repo.createAccount(MOCK_DATA_ARRAY_TWO);
	}
	
	@Test
	public void addAccountTest() {
		String reply = repo.createAccount(MOCK_DATA_ARRAY_THREE);
		Assert.assertEquals(MOCK_DATA_ARRAY_THREE, repo.findAccount(4322L));
		
	}
	
	@Test
	public void add2AccountTest() {
		String reply = repo.createAccount(MOCK_DATA_ARRAY_TWO);
		Assert.assertEquals("Created new account with the First Name: Roger. Last Name: null. Account Number: 4321", reply);
	}

	@Test
	public void removeAccountTest() {
		String reply = repo.deleteAccount(1234L);
		Assert.assertEquals("null", repo.findAccount(1234L));
		
	}
	
	@Test
	public void remove2AccountTest() {
		String reply = repo.deleteAccount(4321L);
		Assert.assertEquals("Removed account with the ID: 4321.", reply);
		
	}
	
	@Test
	public void remove2AccountTestAnd1ThatDoesntExist() {
		repo.createAccount(MOCK_DATA_ARRAY_ONE);
		repo.updateAccount(1234L, MOCK_DATA_ARRAY_THREE);
		Assert.assertEquals(MOCK_DATA_ARRAY_THREE, repo.findAccount(1234L));
	}
	
	@Test
	public void accountConversionToJSONTestWithEmptyMap() {
	
	}
	
	@Test
	public void accountConversionToJSONTestEmptyMapWithConversion() {
	
	}

	@Test
	public void accountConversionToJSONTest() {
		
		
	}

	@Test
	public void getCountForFirstNamesInAccountWhenZeroOccurances() {
		
	}
	
	@Test
	public void getCountForFirstNamesInAccountWhenOne() {
		
	}

	@Test
	public void getCountForFirstNamesInAccountWhenMult() {
		
	}

}
