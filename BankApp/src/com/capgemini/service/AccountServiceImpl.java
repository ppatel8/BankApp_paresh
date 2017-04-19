package com.capgemini.service;

import com.capgemini.beans.Account;
import com.capgemini.exceptions.InsufficientInitialAmountException;
import com.capgemini.exceptions.InvalidAccountNumberException;
import com.capgemini.repository.AccountRepository;
import com.capgemini.repository.AccountRepositoryImpl;

public class AccountServiceImpl implements AccountService {

	
	AccountRepository accountRepository;
	@Override
	public Account createAccount(int accountNumber, int amount) throws InsufficientInitialAmountException {
		
		if(amount <500)
		{
			throw new InsufficientInitialAmountException();
		}
		
		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setAmount(amount);
		accountRepository= new AccountRepositoryImpl();
		
		accountRepository.createAccount(account);
		return account;
	}

	@Override
	public int withdrowAmount(int accountNumber, int amount) throws InvalidAccountNumberException {
		// TODO Auto-generated method stub
		
		
		
		//if account number not valid 
		if(accountNumber == 000000){
			throw new InvalidAccountNumberException();
		}
		
		// amount is greater then than zero 
		//if(amount)
			
			
		//in sufficient balance	
		
		
			//success
		
		
		
		return 0;
	}

	@Override
	public Account depositAmount(int accountNumber, int amount) {
		// TODO Auto-generated method stub
		return null;
	}

}
