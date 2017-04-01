package com.jarvis.apps.model;


public class MusicClassAccount extends Account {
	
	private static enum AccountType {
		FEES("fees"),
		PAYABLE("payable"),
		RECEIVABLE("receivable"),
		OTHERS("others");
		
		private String type;
		
		private AccountType(String type){
			this.type = type;
		}
		
		public String getType(){
			return this.type;
		}
	}
	
	private AccountType accountType;

	public MusicClassAccount(AccountType accountType) {
		super();
		this.accountType = accountType;
	}
	
	public AccountType getAccountType() {
		return accountType;
	}

}
