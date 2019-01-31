 package com.qa.MapTests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.AccountMapRepository;

public class AccountServiceTest {

	private AccountMapRepository repo;
	
	private static final String MOCK_DATA_ARRAY_ONE = "{\"firstName\":\"John\",\"secondName\":\"Smith\",\"accountNumber\":\"1234\"}";	
	private static final String MOCK_DATA_ARRAY_TWO = "{\"firstName\":\"Roger\",\"secondName\":\"Smith\",\"accountNumber\":\"4321\"}";
	private static final String MOCK_DATA_ARRAY_THREE = "{\"firstName\":\"Paul\",\"secondName\":\"Smith\",\"accountNumber\":\"4322\"}";
	private static final String MOCK_DATA_ARRAY_FOUR = "{\"firstName\":\"Jim\",\"secondName\":\"Smith\",\"accountNumber\":\"4323\"}";
	private static final String MOCK_DATA_ARRAY_FIVE = "{\"firstName\":\"Jim\",\"secondName\":\"Johnson\",\"accountNumber\":\"4323\"}";
	
//	@Before
//	public void setup() {
//		repo = new AccountMapRepository();
//	}
//	
//	@Test
//	public void addAccountTest() {
//		String reply = repo.createAccount(MOCK_DATA_ARRAY_THREE);
//		Assert.assertEquals(1, repo.returnSize());
//		
//	}
//	
//	@Test
//	public void add2AccountTest() {
//		String reply = repo.createAccount(MOCK_DATA_ARRAY_TWO);
//		Assert.assertEquals("Created new account with the First Name: Roger. Last Name: null. Account Number: 4321", reply);
//	}
//
//	@Test
//	public void removeAccountTest() {
//		repo.createAccount(MOCK_DATA_ARRAY_THREE);
//		repo.deleteAccount(4322L);
//		Assert.assertEquals(0 ,repo.returnSize());
//		
//	}
//	
//	@Test
//	public void remove2AccountTest() {
//		String reply = repo.deleteAccount(4321L);
//		Assert.assertEquals("Removed account with the ID: 4321.", reply);
//		
//	}
//	
//	/*@Test
//	public void updateAccount1to2() {
//		repo.createAccount(MOCK_DATA_ARRAY_ONE);
//		repo.updateAccount(1234L, MOCK_DATA_ARRAY_THREE);
//		Assert.assertEquals(MOCK_DATA_ARRAY_THREE, repo.findAccount(1234L));
//	}*/
//	
//	@Test
//	public void remove2AccountTestAnd1ThatDoesntExist() {
//		repo.createAccount(MOCK_DATA_ARRAY_ONE);
//		repo.createAccount(MOCK_DATA_ARRAY_FOUR);
//		repo.deleteAccount(1234L);
//		repo.deleteAccount(4323L);
//		repo.deleteAccount(4666L);
//		Assert.assertEquals(0, repo.returnSize());
//	}
//	
//	@Test
//	public void accountConversionToJSONTestWithEmptyMap() {
//	
//	}
//	
//	@Test
//	public void accountConversionToJSONTestEmptyMapWithConversion() {
//	
//	}
//
//	@Test
//	public void accountConversionToJSONTest() {
//		
//		
//	}
//
//	@Test
//	public void getCountForFirstNamesInAccountWhenZeroOccurances() {
//		repo.createAccount(MOCK_DATA_ARRAY_ONE);
//		Assert.assertEquals(0, repo.getAccountByName("jim"));
//	}
//	
//	@Test
//	public void getCountForFirstNamesInAccountWhenOne() {
//		repo.createAccount(MOCK_DATA_ARRAY_FOUR);
//		Assert.assertEquals(0, repo.getAccountByName("jim"));
//	}
//
//	@Test
//	public void getCountForFirstNamesInAccountWhenMult() {
//		repo.createAccount(MOCK_DATA_ARRAY_FOUR);
//		repo.createAccount(MOCK_DATA_ARRAY_FIVE);
//		Assert.assertEquals(0, repo.getAccountByName("jim"));
//	}

}
