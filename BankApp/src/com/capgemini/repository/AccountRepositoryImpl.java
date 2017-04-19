package com.capgemini.repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.capgemini.beans.Account;

public class AccountRepositoryImpl implements AccountRepository{
	
	Map<Integer,Object> accountDetail = new ConcurrentHashMap<Integer,Object>();
	
	@Override
	public boolean createAccount(Account account)
	{
		if(null == account)
			return false;
		else
			accountDetail.put(account.getAccountNumber(), account);
			
		return true;
	}
	
	@Override
	public boolean deleteAccount(int accountNumber){
		return true;
	}

}
