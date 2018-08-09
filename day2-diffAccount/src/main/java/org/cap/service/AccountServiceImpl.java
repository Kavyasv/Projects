package org.cap.service;

import org.cap.model.Account;
import org.cap.model.Customer;
import org.cap.util.AccountUtil;

public class AccountServiceImpl implements IAccountService {
	Account account=null;
	@Override
	public Account createAccount(Customer customer, double amount) {
		if(customer!=null)
		{ 
			account=new Account();
			account.setCustomer(customer);
			if(amount>0)
			{
				if(amount==1000)
				{
					account.setAccountType("savings");
				account.setOpeningBalance(1000);
				}
				else if(amount==10000) {
				account.setAccountType("current");
				account.setOpeningBalance(10000);
			}
				
				else if(amount==100) {
				account.setAccountType("rd");
				account.setOpeningBalance(100);
			}
				else if(amount==500) {
				account.setAccountType("fd");
				account.setOpeningBalance(500);
			}
				account.setAccNo(AccountUtil.generateAccountNo());
				
				}
		}
		return account;
	}

}
