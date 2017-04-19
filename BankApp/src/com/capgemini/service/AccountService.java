package com.capgemini.service;

import com.capgemini.beans.Account;
import com.capgemini.exceptions.InsufficientInitialAmountException;
import com.capgemini.exceptions.InvalidAccountNumberException;

public interface AccountService   {
	
	
	public Account createAccount(int accountNumber, int amount)  throws InsufficientInitialAmountException;
	public Account depositAmount(int accountNumber, int amount);
	public int withdrowAmount(int accountNumber, int amount) throws InvalidAccountNumberException ;

}
