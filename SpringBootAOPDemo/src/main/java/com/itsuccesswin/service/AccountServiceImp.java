package com.itsuccesswin.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.itsuccesswin.model.Account;
@Service("accountServiceImp")
public class AccountServiceImp {

	 private static Map<String, Account> map = null;
	 
	 static{
		 map=new HashMap<>();
		 map.put("CID20269835", new Account("86204658936","Hasnain"));
		 map.put("CID20269838", new Account("86204658996","Guddo"));
		 map.put("CID20269986", new Account("86204658869","Ladla"));
	 }
	
	
	public Account getAccounByCustomerId(String customerId) throws Exception  {
		if(customerId == null){
			throw new Exception("Customer ID is invalid ! please try agin with Valid ID");
		}
		Account account = null;
		Set<Entry<String ,Account>>  entrySet= map.entrySet();
	for (Entry<String, Account> entry : entrySet) {
		if (entry.getKey().equals(customerId)){
			account=entry.getValue();
		}
		
	}
		return account;
	}

	
	
}
