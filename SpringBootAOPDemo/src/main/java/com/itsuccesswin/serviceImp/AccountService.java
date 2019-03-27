package com.itsuccesswin.serviceImp;

import com.itsuccesswin.model.Account;
public interface AccountService {
	
	public Account getAccounByCustomerId(String customerId) throws Exception;

}
