package com.itsuccesswin.model;

public class Account {
	
	private String accountNumber;
	private String name_Ac;
	
	public Account(String accountNumber, String name_Ac) {
		super();
		this.accountNumber = accountNumber;
		this.name_Ac = name_Ac;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getName_Ac() {
		return name_Ac;
	}
	

	@Override
	public String toString() {
		return "accountNumber=" + accountNumber + ", name_Ac=" + name_Ac + "";
	}


}
