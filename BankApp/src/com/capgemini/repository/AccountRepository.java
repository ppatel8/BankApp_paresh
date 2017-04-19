package com.capgemini.repository;

import com.capgemini.beans.Account;

public interface AccountRepository {
	
	public boolean createAccount(Account account);
	public boolean deleteAccount(int  accountNumber);

}
